
import resources.Implementation001Helper;
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
import java.io.*;

/**
 * Description:  This class contains one system test described below.
 * System Tests: I-ST037-Sunny001
 * @author Rodolfo
 */
public class Implementation001 extends Implementation001Helper
{
	/**
	 * Test Case IDs  : I-ST037-Sunny001
	 * Purposes       : To test that the system will open all parking spots indicated in the database all.txt when Will Smith types “all” in the PantherLot Spot screen.
	 * 				    
	 * Preconditions  : 
	 * 					The database is setup according to the tables displayed in 5.1.2.  
	 *                  PantherLot Main and PantherLot Security are running and operational. PantherLot Spot is open, 
	 *                  but not connected to a specific spot. Will Smith is in front of the PantherLot Spot open terminal. 
	 *                  The PantherLot spots 101, 312, 120, 139 are disconnected/unregistered.
	 *	
	 * Input          : Will Smith types “all” in the PantherLot Spot open terminal.
	 *
	 * Expected Output: 
	 * 					PantherLot Spot 101, 312, 120, 139 terminals connect to PantherLot Main.
	 * 					The spot 101 should display “Parking Spot #101”.
	 * 					The spot 120 should display “Parking Spot #120”.
	 * 					The spot 139 should display “Parking Spot #139”.
	 * 					The spot 312 should display “Parking Spot #312”.
	 * 
	 * @author Rodolfo
	 */
	public void testMain(Object[] args) 
	{
		setUp();
		openParkingTerminal(dpString("userID"));
		parkingSpot101().performTest( vpManual("manualvp101", dpString("message1")) );
		parkingSpot120().performTest( vpManual("manualvp120", dpString("message2")) );
		parkingSpot139().performTest( vpManual("manualvp139", dpString("message3")) );
		parkingSpot312().performTest( vpManual("manualvp312", dpString("message4")) );
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
		//Close Spots
		parkingSpot101().click();
		getScreen().getActiveWindow().close();
		
		//Close the rest
		ParkingMainIDScanner(ANY,MAY_EXIT).close();
		securityDisplayFrame(ANY,MAY_EXIT).close();
		sleep(5);
	}
}

