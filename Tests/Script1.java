
import resources.Script1Helper;
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
public class Script1 extends Script1Helper
{
	/**
	 * Script Name   : <b>Script1</b>
	 * Generated     : <b>Oct 14, 2018 8:52:25 PM</b>
	 * Description   : Functional Test Script
	 * Original Host : WinNT Version 10.0  Build 17134 ()
	 * 
	 * @since  2018/10/14
	 * @author noiseyRandomness
	 */
	public void testMain(Object[] args) 
	{
		startApp("ParkingProgram1");
		
		// Window: java.exe: 
		//sunAwtFramewindow().move(atPoint(222,77));
		//sunAwtFramewindow().drag(atPoint(445,69), atPoint(437,79));
		//sunAwtFramewindow().move(atPoint(1183,39));
		//sunAwtFramewindow().click(atPoint(417,100));
		
		// Window: java.exe: Input
		inputwindow().doubleClick(atPoint(105,71));
		inputwindow().inputChars("120");
		inputwindow().click(atPoint(142,102));
		
		// Window: java.exe: 
		sunAwtFramewindow().click(atPoint(158,284));
		sunAwtFramewindow().click(atPoint(340,284));
		sunAwtFramewindow().click(atPoint(318,277));
		sunAwtFramewindow().click(atPoint(413,300));
		
		// Window: eclipse.exe: Eclipse SDK
		garageTxtpageTabList().click(atName("garage.txt"), atPoint(57,7));
		texttext().click(atPoint(18,47));
		
		// Window: java.exe: 
		sunAwtFramewindow().inputChars("1654333");
		sunAwtFramewindow().click(atPoint(336,163));
		sunAwtFramewindow().click(atPoint(324,270));
		sunAwtFramewindow().click(atPoint(246,271));
		sunAwtFramewindow().click(atPoint(325,276));
	}
}

