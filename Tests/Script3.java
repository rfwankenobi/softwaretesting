
import resources.Script3Helper;
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
public class Script3 extends Script3Helper
{
	/**
	 * Script Name   : <b>Script3</b>
	 * Generated     : <b>Oct 14, 2018 11:57:17 PM</b>
	 * Description   : Functional Test Script
	 * Original Host : WinNT Version 10.0  Build 17134 ()
	 * 
	 * @since  2018/10/14
	 * @author noiseyRandomness
	 */
	public void testMain(Object[] args) 
	{
		startApp("PantherLot_Main");
		startApp("PantherLot Security");
		
		// 
		ok().click();
		startApp("PantherLot Spot");
		
		// 
		
		pleaseEnterTheParkingSpotNumbe().click(atPoint(48,7));
		input().inputChars("139");
		jOptionPane().click(atPoint(50,68));
		ok2().click();
		
		// Frame: 
		guest().click();
		
		// Frame: 
		next().click();
		
		// Frame: 
		handicap().click();
		
		// Frame: 
		next().click();
		
		// Frame: 
		welcomeDisplay().inputChars("2223432");
		scanID().click();
		
		// Frame: 
		next().click();
		
		// Frame: 
		welcomeDisplay(ANY,MAY_EXIT).close();
	}
}

