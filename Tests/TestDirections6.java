
import resources.TestDirections6Helper;
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
public class TestDirections6 extends TestDirections6Helper
{
	/**
	 * Script Name   : <b>TestDirections6</b>
	 * Generated     : <b>Oct 15, 2018 1:29:34 AM</b>
	 * Description   : Functional Test Script
	 * Original Host : WinNT Version 10.0  Build 17134 ()
	 * 
	 * @since  2018/10/15
	 * @author noiseyRandomness
	 */
	public void testMain(Object[] args) 
	{
		startApp("PantherLot_Main");
		startApp("PantherLot_Security");
		
		// Frame: 
		securityDisplayFrame().move(atPoint(693,20));
		startApp("PantherLot_Spot");
		
		// 
		pleaseEnterTheParkingSpotNumbe().click();
		pleaseEnterTheParkingSpotNumbe2().click(atPoint(67,3));
		input().inputChars("139");
		ok().click();
		
		// Frame: 
		welcomeDisplay().click(atPoint(296,204));
		guest().click();
		
		// Frame: 
		next().click();
		
		// Frame: 
		cancel().click();
		
		//Close
		spotDisplayFrame(ANY,MAY_EXIT).close();
		welcomeDisplay(ANY,MAY_EXIT).close();
		securityDisplayFrame(ANY,MAY_EXIT).close();
		sleep(5);
	}
}

