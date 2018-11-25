
import resources.TestHandicap1Helper;
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
public class TestHandicap1 extends TestHandicap1Helper
{
	/**
	 * Script Name   : <b>TestHandicap1</b>
	 * Generated     : <b>Oct 15, 2018 12:23:38 AM</b>
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
		securityDisplayFrame().move(atPoint(686,23));
		startApp("PantherLot_Spot");
		sleep(2);
		// 
		pleaseEnterTheParkingSpotNumbe().click(atPoint(65,9));
		input().inputChars("120");
		ok().click();
		
		// Frame: 
		welcomeDisplay().click(atPoint(260,207));
		handicap().click();
		
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

