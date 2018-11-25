
import resources.TestDirections5Helper;
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
public class TestDirections5 extends TestDirections5Helper
{
	/**
	 * Script Name   : <b>TestDirections5</b>
	 * Generated     : <b>Oct 15, 2018 1:23:36 AM</b>
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
		securityDisplayFrame().move(atPoint(664,16));
		startApp("PantherLot_Spot");
		sleep(2);
		// 
		input().inputChars("139");
		input().move(atPoint(796,408));
		ok().click();
		
		// Frame: 
		guest().click();
		
		// Frame: 
		next().click();
		
		// Frame: 
		next2().click();
		
		// Frame: 
		finish().click();
		spotDisplayFrame(ANY,MAY_EXIT).close();
		startApp("PantherLot_Spot");
		
		// 
		input().inputChars("666");
		ok().click();
		
		// Frame: 
		spotDisplayFrame().move(atPoint(459,497));
		
		// Frame: 
		guest().click();
		
		// Frame: 
		next().click();
		
		// Frame: 
		next2().click();
		
		// Frame: 
		finish().click();
		
		// Frame: 
		welcomeDisplay().click(atPoint(279,202));
		guest().click();
		
		//Close
		spotDisplayFrame(ANY,MAY_EXIT).close();
		parkingNotification(ANY,MAY_EXIT).close();
		securityDisplayFrame(ANY,MAY_EXIT).close();
		sleep(5);
	}
}

