
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
import java.io.*;

/**
 * Description   : Runs all system tests from a single place
 * @author Rodolfo
 */
public class RunAll extends RunAllHelper
{
	/**
	 * Script Name   : <b>RunAll</b>
	 * Generated     : <b>Nov 14, 2018 6:31:53 PM</b>
	 * Description   : Runs all system tests from a single place
	 * 
	 * @since  2018/11/14
	 * @author Rodolfo
	 */
	public void testMain(Object[] args) 
	{
		String path = "C:\\Users\\Rodolfo\\Documents\\School\\Soft Testing\\CEN4072-ProjectArtifacts\\ProjectArtifacts\\Source Code\\";
		
		//Delete cobertura files
		File file = new File( path + "PantherLot Main\\cobertura.ser");
		File file2 = new File( path + "PantherLot Security\\cobertura.ser");
		File file3 = new File( path + "PantherLot Spot\\cobertura.ser");

		file.delete();
		file2.delete();
		file3.delete();
		
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
		//callScript("Implementation001");
		//callScript("Implementation002");
		//callScript("Implementation003");
	}
}

