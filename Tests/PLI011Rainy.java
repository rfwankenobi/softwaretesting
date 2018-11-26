
import resources.PLI011RainyHelper;
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
import com.ibm.rational.test.ft.object.interfaces.sapwebportal.*;
/**
 * Description:  This class contains three rainy case scenarios
 * System Tests: PLI011-STRainy001, PLI011-STRainy002, PLI011-STRainy003
 * @author       Rodolfo Marrero
 */
public class PLI011Rainy extends PLI011RainyHelper
{

	/**
	 * Test Case IDs  : PLI011-STRainy001, PLI011-STRainy002, PLI011-STRainy003
	 * Purposes       : 
	 * 					PLI011-STRainy001
	 * 					To test the behavior of the system when Michelle Solano presses “Cancel” after reading directions.
	 * 				    
	 * 					PLI011-STRainy002
	 * 					To test the behavior of the system when Abraham Cruz presses “X” after reading directions.
	 * 				    
	 * 					PLI011-STRainy003
	 * 					To test the behavior of the system when Nick Caceres presses “Cancel” after reading directions.
	 * Preconditions  : 
	 * 					PLI011-STRainy001
	 * 					The database is setup according to the tables displayed in 5.1.2.  
	 *                  Michelle Solano is located in the North garage.
	 *                  Michelle Solano scanned the ID 2233432.
	 *                  The system identified an available parking spot for Michelle Solano.
	 *                 
	 *                  PLI011-STRainy002
	 *                  The database is setup according to the tables displayed in 5.1.2. 
	 *                  Abraham Cruz is located in the South garage.
	 *                  Abraham Cruz scanned the ID 1663314.
	 *                  The system assigned the parking spot 101 for Abraham Cruz.
	 *                 
	 *                  PLI011-STRainy003
	 *                  The database is setup according to the tables displayed in 5.1.2. 
	 *                  Nick Caceres is located in the West garage.
	 *                  Nick Caceres scanned the ID 1654333.
	 *                  The system assigned the parking spot 120 for Nick Caceres.
	 *	
	 * Input          : 
	 * 					PLI011-STRainy001
	 * 					Michelle Solano inputs “Cancel”.
	 *                  
	 *                  PLI011-STRainy002
	 *                  Abraham Cruz selects the  “X” button.
	 *                  
	 *                  PLI011-STRainy003
	 *                  Nick Caceres hits the “Maximize” button.
	 *                  Nick Caceres hits the “Cancel” button.
	 *
	 * Expected Output: 
	 * 					PLI011-STRainy001
	 * 					“1. Go to floor #3
	 * 					2. Head to the North part.
	 * 					3. Park on Student spot labeled #312.”
	 * 					The system displays the welcome screen with the text “PantherLot Interactive”, “Please Enter ID”.
	 * 
	 * 					PLI011-STRainy002
	 * 					“1. Go to floor #1
	 * 					2. Head to the South part.
	 * 					3. Park on Faculty spot labeled #101.”
	 * 					The main display is closed.
	 * 					
	 * 					PLI011-STRainy003
	 * 					“1. Go to floor #1
	 * 					2. Head to the West part.
	 * 					3. Park on Handicapped spot labeled #120.”
	 * 					The system displays the welcome screen with the text “PantherLot Interactive”, “Please Enter ID”.
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
		ParkingMainIDScanner().click(atPoint(46,5));
		ParkingMainIDScanner().inputChars( userID );
		ParkingMainIDScannerNext().click();
		// User clicks next
		next().click();
		next2().click();
		
		if ( userID.equals(dpString("firstRunVar")) )
		{
			cancel().click();
			pantherLotInteractive().performTest( vpManual("pli011manualvp1", dpString("expectedMessage1")) );
			pleaseEnterID().performTest( vpManual("pli011manualvp2", dpString("expectedMessage2")) );
		}
		else if ( userID.equals(dpString("secondRunVar")) )
		{
			resetMainTerminal();
		}
		else
		{
			//Click the maximize button
			displayDirections().click(atPoint(510,25));
			
			//Click the cancel button
			cancel().click();
			pantherLotInteractive().performTest( vpManual("pli011manualvp3", dpString("expectedMessage1")) );
			pleaseEnterID().performTest( vpManual("pli011manualvp4", dpString("expectedMessage2")) );
		}
		
		tearDown();
	}
	
	/**
	 * The setup method. Creates the environment.
	 * Starts PantherLot Main, PantherLot Security.
	 */
	public void setUp()
	{
		startApp("PantherLot_Main");
		sleep(2.0);
		startApp("PantherLot_Security");
		sleep(2.0);
		
		//Move the window: 
		securityDisplayFrame().click(atPoint(544,73));
		securityDisplayFrame().move(atPoint(611,16));
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
	}
	
	/**
	 * The teardown function. Resets the environment.
	 */
	public void tearDown()
	{
		//Cleanup
		spotDisplayFrame().click(atPoint(196,32));
		spotDisplayFrame(ANY,MAY_EXIT).close();
		ParkingMainIDScanner(ANY,MAY_EXIT).close();
		securityDisplayFrame(ANY,MAY_EXIT).close();
		sleep(5);
	}
	
	/**
	 * This method resets the main terminal
	 */
	public void resetMainTerminal()
	{
		//From the display direction section.
		displayDirections().click(atPoint(337,14));
		displayDirections(ANY,MAY_EXIT).close();
		
		sleep(3.0);
		startApp("PantherLot_Main");
		sleep(3.0);
	}
}

