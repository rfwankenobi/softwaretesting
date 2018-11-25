
import resources.TestDirections3Helper;
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
public class TestDirections3 extends TestDirections3Helper
{
	/**
	 * Script Name   : <b>TestHandicap9</b>
	 * Generated     : <b>Oct 15, 2018 1:14:15 AM</b>
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
		securityDisplayFrame().move(atPoint(705,19));
		startApp("PantherLot_Spot");
		sleep(2);
		// 
		pleaseEnterTheParkingSpotNumbe().dragToScreenPoint(
                                        atPoint(25,11), jOptionPane().getScreenPoint(atPoint(77,51)));
		jOptionPane().click(atPoint(77,51));
		input().inputChars("666");
		pleaseEnterTheParkingSpotNumbe().dragToScreenPoint(
                                        atPoint(55,5), optionPaneIconLabel().getScreenPoint(atPoint(27,25)));
		ok().click();
		
		// Frame: 
		welcomeDisplay().click(atPoint(266,205));
		guest().click();
		
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

