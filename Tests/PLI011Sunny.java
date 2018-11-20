
import resources.PLI011SunnyHelper;
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
 * Description:  This class contains three sunny case scenarios
 * System Tests: PLI011-STSunny001, PLI011-STSunny002, PLI011-STSunny003
 * @author       Rodolfo Marrero
 */
public class PLI011Sunny extends PLI011SunnyHelper
{
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
		
		sleep(2.0);
	}
	
	/**
	 * Test Case IDs  : PLI011-STSunny001, PLI011-STSunny002, PLI011-STSunny003
	 * Purposes       : 
	 * 					PLI011-STSunny001
	 * 					To test if the system displays readable directions to Michelle Solano.
	 * 				    
	 * 					PLI011-STSunny002
	 * 					To test if the system displays readable directions to Abraham Cruz.
	 * 				    
	 * 					PLI011-STSunny003
	 * 					To test if the system displays readable directions to Nick Caceres.
	 * Preconditions  : 
	 * 					PLI011-STSunny001
	 * 					The database is setup according to the tables displayed in 5.1.2. 
	 * 					Michelle Solano is located in the North garage.
	 * 					Michelle Solano scanned the ID 2233432.
	 * 					The system assigned the parking spot 312 for Michelle Solano.
	 *                 
	 *                  PLI011-STSunny002
	 *                  The database is setup according to the tables displayed in 5.1.2. 
	 *                  Abraham Cruz is located in the South garage.
	 *                  Abraham Cruz scanned the ID 1663314.
	 *                  The system assigned the parking spot 312 for Abraham Cruz.
	 *                 
	 *                  PLI011-STSunny003
	 *                  The database is setup according to the tables displayed in 5.1.2. 
	 *                  Nick Caceres is located in the West garage.
	 *                  Nick Caceres scanned the ID 1654333.
	 *                  The system assigned the parking spot 120 for Nick Caceres.

	 *	
	 * Input          : 
	 * 					PLI011-STSunny001
	 * 					Michelle Solano clicks “Finish”.
	 *                  
	 *                  PLI011-STSunny002
	 *                  Abraham Cruz clicks “Finish”.
	 *                  
	 *                  PLI011-STSunny003
	 *                  Nick Caceres clicks “Finish”.
	 *
	 * Expected Output: 
	 * 					PLI011-STSunny001
	 * 					1. Go to floor #3
	 * 					2. Head to the North part.
	 * 					3. Park on Student spot labeled #312.
	 * 					The system displays the welcome screen with the text “PantherLot Interactive”, “Please Enter ID”.
	 * 
	 * 					PLI011-STSunny002
	 * 					“1. Go to floor #1
	 * 					2. Head to the South part.
	 * 					3. Park on Faculty spot labeled #101.”
	 * 					The system displays the welcome screen with the text “PantherLot Interactive”, “Please Enter ID”.
	 * 					
	 * 					PLI011-STSunny003
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
		ParkingMainDisplay().click(atPoint(46,5));
		ParkingMainIDScanner().inputChars( userID );
		ParkingMainIDScannerNext().click();
		// User clicks next
		next().click();
		next2().click();
		
		//Text verification
		DirectionsScreen().performTest( userDirectionsVP() );
		
		finish().click();
		
		tearDown( userID );
	}
	
	/**
	 * The teardown function. Resets the environment.
	 */
	public void tearDown( String userID )
	{
		//Cleanup
		jTextField().click();
		spotDisplayFrame().inputChars( userID );
		scanID().click();
		leave().click();
		spotDisplayFrame().close();
		ParkingMainIDScanner(ANY,MAY_EXIT).close();
		securityDisplayFrame(ANY,MAY_EXIT).close();
		sleep(5);
	}
}

