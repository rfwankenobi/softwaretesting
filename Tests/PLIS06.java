
import resources.PLIS06Helper;
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
public class PLIS06 extends PLIS06Helper
{
	/**
	 * Script Name   : <b>PLIS06</b>
	 * Generated     : <b>Oct 13, 2018 12:16:58 AM</b>
	 * Description   : Functional Test Script
	 * Original Host : WinNT Version 10.0  Build 17134 ()
	 * 
	 * @since  2018/10/13
	 * @author RexAevum
	 */
	public void testMain(Object[] args) 
	{
		// Declare variables for multiple tests
		String userID = "1654333";
		String spotRight = "120";
		String spotWrong = "121";
		
		String wrongSpot = "Wrong user detected on parking spot #" + spotWrong;
		
		startApp("PantherLot_Main");
		startApp("PantherLot_Security");
		
		// Frame: 
		securityDisplayFrame().move(atPoint(2,375));
		startApp("PantherLot_Spot");
		
		// 
		input().move(atPoint(669,377));
		pleaseEnterTheParkingSpotNumbe().drag(atPoint(218,6), atPoint(218,5));
		input().inputKeys(spotRight);
		ok().click();
		
		
		// Frame: 
		jTextField().click(atPoint(56,12));
		welcomeDisplay().inputChars(userID);
		scanID().click();
		
		// Frame: 
		next().click();
		
		// Frame: 
		next2().click();
		
		// Frame: 
		finish().click();
		
		// Frame: Close old instance of spotDisplayFrame
		spotDisplayFrame(ANY,MAY_EXIT).close();
		
		startApp("PantherLot_Spot");

		
		// 
		input().move(atPoint(668,375));
		pleaseEnterTheParkingSpotNumbe().click(atPoint(57,11));
		input().inputChars(spotWrong);
		ok().click();
		
		// Frame: 
		//spotDisplayFrame().move(atPoint(654,383));
		//jTextField2().drag(atPoint(16,12), atPoint(16,11));
		
		
		// Frame: 
		spotDisplayFrame().move(atPoint(626,14));
		jTextField2().click(atPoint(40,6));
		sleep(1);
		spotDisplayFrame().inputChars(userID);
		scanID2().click();
		
		// Verify the notification
		sleep(1);
		thisMessageWillBeStoredInLogFi().performTest(wrongParkingVP());
		sleep(1);
		String spotDetected = (String)wrongUserDetectedOnParkingSpot().getProperty("text");
		
		// Test to see that  the needed spot gets printed
		if (spotDetected.equals(wrongSpot))
			logTestResult("Spot number " + spotWrong + " on the warrning message \"" + spotDetected + "\" is displayed correctly", true);
		else
			logTestResult("Spot number " + spotWrong + " on the warrning message " + spotDetected + " is displayed incorrectly", false);
		
		ok2().click();
		
		// Frame: 
		leave().click();
		
		// Frame: 
		spotDisplayFrame(ANY,MAY_EXIT).close();
		securityDisplayFrame(ANY,MAY_EXIT).close();
		welcomeDisplay(ANY,MAY_EXIT).close();
		sleep(5);
	}
}

