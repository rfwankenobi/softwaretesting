
import resources.TestDirections2Helper;
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
public class TestDirections2 extends TestDirections2Helper
{
	/**
	 * Script Name   : <b>TestHandicap8</b>
	 * Generated     : <b>Oct 15, 2018 1:09:39 AM</b>
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
		securityDisplayFrame().move(atPoint(693,24));
		startApp("PantherLot_Spot");
		sleep(2);
		// 
		pleaseEnterTheParkingSpotNumbe().click(atPoint(24,11));
		input().inputChars("226");
		ok().click();
		
		// Frame: 
		welcomeDisplay().click(atPoint(275,188));
		jTextField().click(atPoint(41,12));
		welcomeDisplay().inputChars("1663314");
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

