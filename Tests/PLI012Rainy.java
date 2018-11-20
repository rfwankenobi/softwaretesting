
import resources.PLI012RainyHelper;
import com.rational.test.ft.*;
import com.rational.test.ft.object.interfaces.*;
import com.rational.test.ft.object.interfaces.SAP.*;
import com.rational.test.ft.object.interfaces.WPF.*;
import com.rational.test.ft.object.interfaces.dojo.*;
import com.rational.test.ft.object.interfaces.siebel.*;
import com.rational.test.ft.object.interfaces.flex.*;
import com.rational.test.ft.object.interfaces.generichtmlsubdomain.*;
import com.rational.test.ft.script.*;
import com.rational.test.ft.value.*;
import com.rational.test.ft.vp.*;

import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.BufferedReader;
import java.io.File;

import com.ibm.rational.test.ft.object.interfaces.sapwebportal.*;
/**
 * Description:  This class contains three rainy case scenarios
 * System Tests: PLI012-STRainy001, PLI012-STRainy002, PLI012-STRainy003
 * @author       Rodolfo Marrero
 */
public class PLI012Rainy extends PLI012RainyHelper
{
	private String filePath = "C:\\Users\\Rodolfo\\Documents\\School\\Soft Testing\\CEN4072-ProjectArtifacts\\ProjectArtifacts\\Source Code\\PantherLot Security\\Log.txt";

	/**
	 * The setup method. Creates the environment.
	 * Starts PantherLot Main, PantherLot Security.
	 */
	public void setUp()
	{
		wipeLog();
		startApp("PantherLot_Main");
		sleep(2.0);
		startApp("PantherLot_Security");
		sleep(2.0);
		
		//Move the window: 
		securityDisplayFrame().click(atPoint(544,73));
		securityDisplayFrame().move(atPoint(611,16));
	}
	
	/**
	 * The following method wipes out the Log file.
	 */
	public void wipeLog()
	{
		try
		{
			FileOutputStream out = new FileOutputStream( new File(this.filePath), false);
			out.write(0);
			out.flush();
			out.close();
		}
		catch ( Exception e )
		{
			//
		}
	}
	
	/**
	 * This method opens a Parking Terminal.
	 * 
	 * @param spotId - The ID of the parking spot being opened
	 */
	public void openParkingTerminal( String spotId )
	{
		startApp("PantherLot_Spot");
		sleep(2.0);
		pleaseEnterTheParkingSpotNumbe().click(atPoint(104,12));
		ParkingTerminalInput().inputChars(spotId);
		ok().click();
		
		sleep(2.0);
	}
	
	/**
	 * Test Case IDs  : PLI012-STRainy001, PLI012-STRainy002, PLI012-STRainy003
	 * Purposes       : 
	 * 					PLI012-STRainy001
	 * 					To test if Michelle Solano doesn’t park correctly and the system notifies “Wrong Spot” and the number of Michelle Solano’s correct spot.
	 * 				    
	 * 					PLI012-STRainy002
	 * 					To test if Abraham Cruz doesn’t park correctly and Will Smith (a security officer) is notified.
	 * 				    
	 * 					PLI012-STRainy003
	 * 					To test if Nick Caceres doesn’t park correctly and Will Smith (a security officer) is notified.
	 * Preconditions  : 
	 * 					PLI012-STRainy001
	 * 					The database is setup according to the tables displayed in 5.1.2. 
	 *                  Michelle Solano is located in the North garage.
	 *                  Michelle Solano scanned the ID 2233432.
	 *                  The system identified an available parking spot for Michelle Solano.
	 *                  The system displayed “1. Go to floor #3
	 *                  2. Head to the North part.
	 *                  3. Park on Student spot labeled #312.”
	 *                  Michelle Solano inputs “Finish”.
	 *                  Michelle Solano parks in the spot 315.
	 *                 
	 *                  PLI012-STRainy002
	 *                  The database is setup according to the tables displayed in 5.1.2. 
	 *                  Abraham Cruz is located in the South garage.
	 *                  Abraham Cruz scanned the ID 1663314.
	 *                  The system identified an available parking spot for Abraham Cruz.
	 *                  The system displayed “1. Go to floor #1
	 *                  2. Head to the South part.
	 *                  3. Park on Faculty spot labeled #101.”
	 *                  Abraham Cruz inputs “Finish”.
	 *                  Abraham Cruz parks in the spot 102.
	 *                 
	 *                  PLI012-STRainy003
	 *                  The database is setup according to the tables displayed in 5.1.2. 
	 *                  Nick Caceres is located in the South garage.
	 *                  Nick Caceres scanned the ID 1654333.
	 *                  The system identified an available parking spot for Nick Caceres.
	 *                  The system displayed “1. Go to floor #1
	 *                  2. Head to the West part.
	 *                  3. Park on Handicapped spot labeled #120.”
	 *                  Nick Caceres inputs “Finish”.
	 *                  Nick Caceres parks in the spot 120.
	 * Input          : 
	 * 					PLI012-STRainy001
	 * 					Michelle Solano scans the ID 2233432 in the parking spot located in Garage North, Floor 3, Spot 315.
	 *                  
	 *                  PLI012-STRainy002
	 *                  Abraham Cruz scans the ID 1663314 in the parking spot located in Garage South, Floor 1, Spot 102.
	 *                  
	 *                  PLI012-STRainy003
	 *                  Nick Caceres hits the “X” button on the parking spot located in Garage West, Floor 1, Spot 120. 
	 * Expected Output: 
	 * 					PLI012-STRainy001
	 * 					The system outputs “Wrong Spot”, “Please park at Garage South, Floor 5, Spot 315”.
	 * 
	 * 					PLI012-STRainy002
	 * 					The system outputs “Wrong Spot”, “Please park at Garage South, Floor 5, Spot 315”.
	 * 					The system tells Abraham Cruz he is on a wrong spot.
	 *					The Notifications database now contains the entry:
	 *					“Wrong user detected on parking spot #102”
	 * 					
	 * 					PLI012-STRainy003
	 * 					The parking spot terminal closes.
	 * @author Rodolfo
	 */
	public void testMain(Object[] args) 
	{
		//Inputs
		String spotID = dpString("spotID");
		String userID = dpString("userID");
		
		setUp();
		openParkingTerminal( spotID );
	
		// User Enters ID
		ParkingMainIDScanner().inputChars( userID );
		// User clicks next
		ParkingMainIDScannerNext().click();
		// User clicks next
		next().click();
		next2().click();
		finish().click();
		
		//Close the assigned parking terminal
		spotDisplayFrame().close();
		
		//Open the terminal that will be mistaken
		openParkingTerminal( dpString("wrongSpotID") );
		
		//Go to the parking spot
		jTextField().click();
		spotDisplayFrame().inputChars( userID );
		
		//Last exceptional rainy case
		if ( userID.equals("1654333") )
		{
			spotDisplayFrame().close();
			//Close the rest
			ParkingMainIDScanner(ANY,MAY_EXIT).close();
			securityDisplayFrame(ANY,MAY_EXIT).close();
			sleep(5);
		}
		else
		{
			//Regular rainy cases
			scanID().click();
			
			//Verifications
			if ( userID.equals("2233432") )
			{
				wrongParkingSpot().performTest( WrongParkingSpotMichelleVP() );
			}
			else if ( userID.equals("1663314") )
			{
				assert(verifyContains("Wrong user detected on parking spot #102"));
			}

			tearDown( userID );
		}
	}
	
	/**
	 * The teardown function. Resets the environment.
	 */
	public void tearDown( String userID )
	{
		//Cleanup
		leave().click();
		WarningNotificationOK().click();
		spotDisplayFrame().close();
		ParkingMainIDScanner(ANY,MAY_EXIT).close();
		securityDisplayFrame(ANY,MAY_EXIT).close();
		sleep(5);
	}
	
	/**
	 * Verify contains. This method returns true if the
	 * log contains the text passed.
	 * 
	 * @param text - The text to look for in the log
	 * @return boolean - Whether the log contained the text
	 */
	public boolean verifyContains( String text )
	{
		BufferedReader input;
		
		try
        {
            String line;
            input = new BufferedReader(new FileReader(this.filePath));
            while ( (line = input.readLine()) != null )
        	{
        		if ( line.contains(text) )
        		{
        			input.close();
        			return true;
        		}
        	}
        }
        catch ( Exception e )
        {
        	//
        }
		
		return false;
	}
}

