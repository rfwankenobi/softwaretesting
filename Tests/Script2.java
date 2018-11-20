
import resources.Script2Helper;
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
public class Script2 extends Script2Helper
{
	/**
	 * Script Name   : <b>Script2</b>
	 * Generated     : <b>Oct 14, 2018 11:01:37 PM</b>
	 * Description   : Functional Test Script
	 * Original Host : WinNT Version 10.0  Build 17134 ()
	 * 
	 * @since  2018/10/14
	 * @author noiseyRandomness
	 */
	public void testMain(Object[] args) 
	{
		startApp("ParkingProgram");
		
		// Window: java.exe: 
		sunAwtFramewindow().click(atPoint(445,92));
		
		// Window: java.exe: Input
		inputwindow().click(atPoint(214,67));
		inputwindow().inputChars("120");
		inputwindow().click(atPoint(128,99));
		
		// Window: java.exe: 
		sunAwtFramewindow().click(atPoint(251,324));
		sunAwtFramewindow().click(atPoint(218,287));
		sunAwtFramewindow().click(atPoint(301,276));
		sunAwtFramewindow().click(atPoint(314,266));
		sunAwtFramewindow().click(atPoint(402,299));
	}
}

