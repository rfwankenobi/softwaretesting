
import resources.RunAllHelper;
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
 * @author Rodolfo
 */
public class RunAll extends RunAllHelper
{
	/**
	 * Script Name   : <b>RunAll</b>
	 * Generated     : <b>Nov 14, 2018 6:31:53 PM</b>
	 * Description   : Functional Test Script
	 * Original Host : WinNT Version 10.0  Build 17134 ()
	 * 
	 * @since  2018/11/14
	 * @author Rodolfo
	 */
	public void testMain(Object[] args) 
	{
		// TODO Insert code here
		callScript("PLI011Sunny");
		callScript("PLI011Rainy");
		callScript("PLI012Sunny");
		callScript("PLI012Rainy");
		callScript("PLIS05");
		callScript("PLIS06");
		callScript("TestDirections1");
		callScript("TestDirections2");
		callScript("TestDirections3");
		callScript("TestDirections4");
		callScript("TestDirections5");
		callScript("TestDirections6");
		callScript("TestHandicap1");
		callScript("TestHandicap2");
		callScript("TestHandicap3");
		callScript("TestHandicap4");
		callScript("TestHandicap5");
		callScript("TestHandicap6");
	}
}

