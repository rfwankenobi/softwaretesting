
import resources.TestDirections1Helper;
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
 * @author noiseyRandomness
 */
public class TestDirections1 extends TestDirections1Helper
{
	/**
	 * Script Name   : <b>TestHandicap7</b>
	 * Generated     : <b>Oct 15, 2018 1:05:18 AM</b>
	 * Description   : Functional Test Script
	 * Original Host : WinNT Version 10.0  Build 17134 ()
	 * 
	 * @since  2018/10/15
	 * @author noiseyRandomness
	 */
	public void testMain(Object[] args) 
	{
		startApp("PantherLot_Main");
		sleep(2);
		startApp("PantherLot_Security");
		sleep(2);
		// Frame: 
		securityDisplayFrame().move(atPoint(714,54));
		startApp("PantherLot_Spot");
		sleep(2);
		// 
		pleaseEnterTheParkingSpotNumbe().click(atPoint(143,6));
		input().inputChars("315");
		ok().click();
		
		// Frame: 
		jTextField().doubleClick(atPoint(38,3));
		welcomeDisplay().inputChars("2223432");
		welcomeDisplay().click(atPoint(328,175));
		scanID().click();
		
		// Frame: 
		next().click();
		
		// Frame: 
		next2().click();
		
		finish().click();
		
		//Close
		spotDisplayFrame(ANY,MAY_EXIT).close(); 
		welcomeDisplay(ANY,MAY_EXIT).close();
		securityDisplayFrame(ANY,MAY_EXIT).close();
		sleep(5);
	}
}

