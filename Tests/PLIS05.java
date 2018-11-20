
import resources.PLIS05Helper;
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
 * Description   : Functional Test Script
 * @author RexAevum
 */
public class PLIS05 extends PLIS05Helper
{
	/**
	 * Script Name   : <b>PLIS05_STSunny001</b>
	 * Generated     : <b>Oct 12, 2018 7:02:46 PM</b>
	 * Description   : Functional Test Script
	 * Original Host : WinNT Version 10.0  Build 17134 ()
	 * 
	 * @since  2018/10/12
	 * @author RexAevum
	 */
	public void testMain(Object[] args) 
	{
		//To reuse script for multiple test runs
		String parkNr = "315";
		String userID = "2223432";
		boolean sunny = false;
		
		// Opening the app
		startApp("PantherLot_Main");
		sleep(2);
		startApp("PantherLot_Security");
		sleep(2);
		
		// Frame: Wait for the Security display to open
		securityDisplayFrame().waitForExistence(
                                        60.0, 1.0);
		securityDisplayFrame().move(atPoint(4,374));
		startApp("PantherLot_Spot");
		
		// Selecting spot for testing
		pleaseEnterTheParkingSpotNumbe().drag(atPoint(21,8), atPoint(21,7));
		input().inputChars(parkNr);
		ok().click();
		
		// Frame: 
		spotDisplayFrame().move(atPoint(697,387));
		
		// Frame: Park user first time
		jTextField().click(atPoint(58,2));
		welcomeDisplay().inputChars(userID);
		scanID().click();
		
		// Frame:
		next().click();
		
		// Frame: 
		next2().click();
		
		// Frame: 
		finish().click();
		
		// Frame: At parking spot
		jTextField2().click(atPoint(34,6));
		spotDisplayFrame().inputChars(userID);
		scanID2().click();
		
		// Frame: Scan in duplicate ID
		jTextField().click(atPoint(44,0));
		welcomeDisplay().inputChars(userID);
		scanID().click();
		
		// Frame: Check if it notifying the user of a duplicate ID and if they want to contact security.
		
		// Frame: 
		parkingNotification().waitForExistence(
                                        10.0, 0.2);
		sleep(1);
		parkingNotification().performTest(duplicateIDVP());
		
		sleep(1);
		
		if (sunny)
		{
		
			// Frame: Sunny day scenario
			next().drag();
			
			// Not needed for current test case
			sleep(1);
			duplicateIDNotification().performTest(securityCallVP());
			ok2().click();
		}
		else
		{
			// Frame: Rainy day scenario
			cancel().click();
			
			
			// Frame: 
			sleep(1);
			welcomeDisplay().performTest(securityNotCallVP());
		}
		
		// Frame: Free parking spot
		leave().click();
		
		// Frame: Close all windows
		spotDisplayFrame(ANY,MAY_EXIT).close();
		securityDisplayFrame(ANY,MAY_EXIT).close();
		welcomeDisplay(ANY,MAY_EXIT).close();
		sleep(5);
	}
}

