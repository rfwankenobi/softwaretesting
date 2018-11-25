
import resources.TestHandicap4Helper;
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
public class TestHandicap4 extends TestHandicap4Helper
{
	/**
	 * Script Name   : <b>TestHandicap4</b>
	 * Generated     : <b>Oct 15, 2018 12:57:43 AM</b>
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
		securityDisplayFrame().move(atPoint(637,15));
		startApp("PantherLot_Spot");
		sleep(2);
		// 
		pleaseEnterTheParkingSpotNumbe().click(atPoint(80,5));
		input().inputChars("120");
		ok().click();
		
		// Frame: 
		welcomeDisplay().click(atPoint(225,214));
		jTextField().click(atPoint(39,20));
		guest().click();
		
		// Frame: 
		next().click();
		spotDisplayFrame(ANY,MAY_EXIT).close();
		startApp("PantherLot_Spot");
		
		// 
		jOptionPane().click(atPoint(87,28));
		input().inputChars("139");
		ok().click();
		
		// Frame: 
		spotDisplayFrame().move(atPoint(445,496));
		
		// Frame: 
		welcomeDisplay().click(atPoint(293,220));
		guest().click();
		
		// Frame: 
		next().click();
		
		// Frame: 
		next2().click();
		
		// Frame: 
		finish().click();
		
		//Close
		spotDisplayFrame(ANY,MAY_EXIT).close();
		welcomeDisplay(ANY,MAY_EXIT).close();
		securityDisplayFrame(ANY,MAY_EXIT).close();
		sleep(5);
	}
}

