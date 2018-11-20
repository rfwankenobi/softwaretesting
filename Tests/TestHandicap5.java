
import resources.TestHandicap5Helper;
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
public class TestHandicap5 extends TestHandicap5Helper
{
	/**
	 * Script Name   : <b>TestHandicap4</b>
	 * Generated     : <b>Oct 15, 2018 12:51:14 AM</b>
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
		securityDisplayFrame().move(atPoint(660,48));
		startApp("PantherLot_Spot");
		
		// 
		pleaseEnterTheParkingSpotNumbe().click(atPoint(63,2));
		input().inputChars("120");
		ok().click();
		
		// Frame: 
		handicap().click();
		
		// Frame: 
		next().click();
		
		// Frame: 
		spotNumberDisplay().click(atPoint(321,294));
		next2().click();
		
		// Frame: 
		finish().click();
		spotDisplayFrame(ANY,MAY_EXIT).close();
		startApp("PantherLot_Spot");
		
		// 
		input().inputChars("121");
		ok().click();
		
		// Frame: 
		handicap().click();
		
		// Frame: 
		next().click();
		
		// Frame: 
		next2().click();
		
		// Frame: 
		finish().click();
		
		// Frame: 
		handicap().click();
		
		// Frame: 
		next().click();
		
		//Close
		spotDisplayFrame(ANY,MAY_EXIT).close();
		welcomeDisplay(ANY,MAY_EXIT).close();
		securityDisplayFrame(ANY,MAY_EXIT).close();
		sleep(5);
	}
}

