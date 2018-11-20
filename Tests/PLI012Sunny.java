
import resources.PLI012SunnyHelper;
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
 * System Tests: PLI012-STSunny001, PLI012-STSunny002, PLI012-STSunny003
 * @author       Rodolfo Marrero
 */
public class PLI012Sunny extends PLI012SunnyHelper
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
	 * Test Case IDs  : PLI012-STSunny001, PLI011-STSunny002, PLI011-STSunny003
	 * Purposes       : 
	 * 					PLI012-STSunny001
	 * 					To test if Michelle Solano parks correctly and the system displays “Parked”.
	 * 				    
	 * 					PLI012-STSunny002
	 * 					To test if Abraham Cruz parks correctly and the system displays “Parked”.
	 * 				    
	 * 					PLI012-STSunny003
	 * 					To test if Nick Caceres parks correctly and the system displays “Parked”.
	 * Preconditions  : 
	 * 					PLI012-STSunny001
	 * 					The database is setup according to the tables displayed in 5.1.2. 
	 *                  Michelle Solano is located in the North garage.
	 *                  Michelle Solano scanned the ID 2233432.
	 *                  The system identified an available parking spot for Michelle Solano.
	 *                  The system displayed “1. Go to floor #3
	 *                  2. Head to the North part.
	 *                  3. Park on Student spot labeled #312.”
	 *                  Michelle Solano inputs “Finish”.
	 *                  Michelle Solano parks in the designated spot.
	 *                 
	 *                  PLI012-STSunny002
	 *                  The database is setup according to the tables displayed in 5.1.2. 
	 *                  Abraham Cruz is located in the South garage.
	 *                  Abraham Cruz scanned the ID 1663314.
	 *                  The system identified an available parking spot for Abraham Cruz.
	 *                  The system displayed “1. Go to floor #1
	 *                  2. Head to the South part.
	 *                  3. Park on Faculty spot labeled #101.”
	 *                  Abraham Cruz inputs “Finish”.
	 *                  Abraham Cruz parks in the designated spot.
	 *                 
	 *                  PLI012-STSunny003
	 *                  The database is setup according to the tables displayed in 5.1.2. 
	 *                  Nick Caceres is located in the West garage.
	 *                  Nick Caceres scanned the ID 1654333.
	 *                  The system identified an available parking spot for Nick Caceres.
	 *                  The system displayed “1. Go to floor #1
	 *                  2. Head to the West part.
	 *                  3. Park on Handicapped spot labeled #120.”
	 *                  Nick Caceres inputs “Finish”.
	 *                  Nick Caceres parks in the designated spot.
	 *	
	 * Input          : 
	 * 					PLI012-STSunny001
	 * 					Michelle Solano scans the ID 2233432 in her parking spot.
	 * 					Michelle Solano hits the “Scan ID” button
	 *                  
	 *                  PLI012-STSunny002
	 *                  Abraham Cruz scans the ID 1663314 in her parking spot.
	 * 					Abraham Cruz hits the “Scan ID” button
	 *                  
	 *                  PLI012-STSunny003
	 *                  Nick Caceres scans the ID 1654333 in her parking spot.
	 * 					Nick Caceres hits the “Scan ID” button
	 *
	 * Expected Output: 
	 * 					PLI012-STSunny001
	 * 					The system displays “Parked”.
	 * 
	 * 					PLI012-STSunny002
	 * 					The system displays “Parked”.
	 * 					
	 * 					PLI012-STSunny003
	 * 					The system displays “Parked”.
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
		
		//Go to the parking spot
		jTextField().click();
		spotDisplayFrame().inputChars( userID );
		scanID().click();
		ParkingSpotMessage().performTest( ParkingSpotExpectedMessageVP() );

		tearDown( userID );
	}
	
	/**
	 * The teardown function. Resets the environment.
	 */
	public void tearDown( String userID )
	{
		//Cleanup
		leave().click();
		spotDisplayFrame().close();
		ParkingMainIDScanner(ANY,MAY_EXIT).close();
		securityDisplayFrame(ANY,MAY_EXIT).close();
		sleep(5);
	}
}

