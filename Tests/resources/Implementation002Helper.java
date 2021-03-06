// DO NOT EDIT: This file is automatically generated.
//
// Only the associated template file should be edited directly.
// Helper class files are automatically regenerated from the template
// files at various times, including record actions and test object
// insertion actions.  Any changes made directly to a helper class
// file will be lost when automatically updated.

package resources;

import com.rational.test.ft.object.interfaces.*;
import com.rational.test.ft.object.interfaces.SAP.*;
import com.rational.test.ft.object.interfaces.WPF.*;
import com.rational.test.ft.object.interfaces.siebel.*;
import com.rational.test.ft.object.interfaces.flex.*;
import com.rational.test.ft.object.interfaces.dojo.*;
import com.rational.test.ft.object.interfaces.generichtmlsubdomain.*;
import com.rational.test.ft.script.*;
import com.rational.test.ft.vp.IFtVerificationPoint;
import com.ibm.rational.test.ft.object.interfaces.sapwebportal.*;
/**
 * Script Name   : <b>Implementation002</b><br>
 * Generated     : <b>2018/11/25 11:29:35 AM</b><br>
 * Description   : Helper class for script<br>
 * Original Host : Windows 10 amd64 10.0 <br>
 * 
 * @since  November 25, 2018
 * @author Rodolfo
 */
public abstract class Implementation002Helper extends RationalTestScript
{
	/**
	 * WelcomeDisplay: with default state.
	 *		.captionText : 
	 * 		.class : client.maindisplay.WelcomeDisplay
	 * 		accessibleContext.accessibleName : 
	 * 		.processName : javaw.exe
	 */
	protected TopLevelTestObject ParkingMainIDScanner() 
	{
		return new TopLevelTestObject(
                        getMappedTestObject("ParkingMainIDScanner"));
	}
	/**
	 * WelcomeDisplay: with specific test context and state.
	 *		.captionText : 
	 * 		.class : client.maindisplay.WelcomeDisplay
	 * 		accessibleContext.accessibleName : 
	 * 		.processName : javaw.exe
	 */
	protected TopLevelTestObject ParkingMainIDScanner(TestObject anchor, long flags) 
	{
		return new TopLevelTestObject(
                        getMappedTestObject("ParkingMainIDScanner"), anchor, flags);
	}
	
	/**
	 * Input: with default state.
	 *		.captionText : Input
	 * 		.class : javax.swing.JDialog
	 * 		.processName : javaw.exe
	 */
	protected TopLevelTestObject ParkingTerminalInput() 
	{
		return new TopLevelTestObject(
                        getMappedTestObject("ParkingTerminalInput"));
	}
	/**
	 * Input: with specific test context and state.
	 *		.captionText : Input
	 * 		.class : javax.swing.JDialog
	 * 		.processName : javaw.exe
	 */
	protected TopLevelTestObject ParkingTerminalInput(TestObject anchor, long flags) 
	{
		return new TopLevelTestObject(
                        getMappedTestObject("ParkingTerminalInput"), anchor, flags);
	}
	
	/**
	 * AnotherDisplayIsAlreadyConnectedToSpot101: with default state.
	 *		text : Another display is already connected to  spot #101
	 * 		.class : javax.swing.JLabel
	 * 		accessibleContext.accessibleName : Another display is already connected to  spot #101
	 * 		name : OptionPane.label
	 * 		.classIndex : 0
	 */
	protected GuiTestObject anotherDisplayIsAlreadyConnect() 
	{
		return new GuiTestObject(
                        getMappedTestObject("anotherDisplayIsAlreadyConnect"));
	}
	/**
	 * AnotherDisplayIsAlreadyConnectedToSpot101: with specific test context and state.
	 *		text : Another display is already connected to  spot #101
	 * 		.class : javax.swing.JLabel
	 * 		accessibleContext.accessibleName : Another display is already connected to  spot #101
	 * 		name : OptionPane.label
	 * 		.classIndex : 0
	 */
	protected GuiTestObject anotherDisplayIsAlreadyConnect(TestObject anchor, long flags) 
	{
		return new GuiTestObject(
                        getMappedTestObject("anotherDisplayIsAlreadyConnect"), anchor, flags);
	}
	
	/**
	 * Message: with default state.
	 *		.captionText : Message
	 * 		.class : javax.swing.JDialog
	 * 		.processName : javaw.exe
	 */
	protected TopLevelTestObject anotherDisplayWindow() 
	{
		return new TopLevelTestObject(
                        getMappedTestObject("anotherDisplayWindow"));
	}
	/**
	 * Message: with specific test context and state.
	 *		.captionText : Message
	 * 		.class : javax.swing.JDialog
	 * 		.processName : javaw.exe
	 */
	protected TopLevelTestObject anotherDisplayWindow(TestObject anchor, long flags) 
	{
		return new TopLevelTestObject(
                        getMappedTestObject("anotherDisplayWindow"), anchor, flags);
	}
	
	/**
	 * OK: with default state.
	 *		.class : javax.swing.JButton
	 * 		accessibleContext.accessibleName : OK
	 * 		name : OptionPane.button
	 * 		.classIndex : 0
	 */
	protected GuiTestObject ok() 
	{
		return new GuiTestObject(
                        getMappedTestObject("ok"));
	}
	/**
	 * OK: with specific test context and state.
	 *		.class : javax.swing.JButton
	 * 		accessibleContext.accessibleName : OK
	 * 		name : OptionPane.button
	 * 		.classIndex : 0
	 */
	protected GuiTestObject ok(TestObject anchor, long flags) 
	{
		return new GuiTestObject(
                        getMappedTestObject("ok"), anchor, flags);
	}
	
	/**
	 * ParkingSpot101: with default state.
	 *		text : Parking Spot #101 
	 * 		.class : javax.swing.JLabel
	 * 		accessibleContext.accessibleName : Parking Spot #101 
	 * 		.classIndex : 0
	 */
	protected GuiTestObject parkingSpot101() 
	{
		return new GuiTestObject(
                        getMappedTestObject("parkingSpot101"));
	}
	/**
	 * ParkingSpot101: with specific test context and state.
	 *		text : Parking Spot #101 
	 * 		.class : javax.swing.JLabel
	 * 		accessibleContext.accessibleName : Parking Spot #101 
	 * 		.classIndex : 0
	 */
	protected GuiTestObject parkingSpot101(TestObject anchor, long flags) 
	{
		return new GuiTestObject(
                        getMappedTestObject("parkingSpot101"), anchor, flags);
	}
	
	/**
	 * PleaseEnterTheParkingSpotNumberOfTheDisplay: with default state.
	 *		.class : javax.swing.plaf.basic.BasicOptionPaneUI$MultiplexingTextField
	 * 		.priorLabel : Please enter the parking spot number of the display
	 * 		name : OptionPane.textField
	 * 		.classIndex : 0
	 */
	protected TextGuiSubitemTestObject pleaseEnterTheParkingSpotNumbe() 
	{
		return new TextGuiSubitemTestObject(
                        getMappedTestObject("pleaseEnterTheParkingSpotNumbe"));
	}
	/**
	 * PleaseEnterTheParkingSpotNumberOfTheDisplay: with specific test context and state.
	 *		.class : javax.swing.plaf.basic.BasicOptionPaneUI$MultiplexingTextField
	 * 		.priorLabel : Please enter the parking spot number of the display
	 * 		name : OptionPane.textField
	 * 		.classIndex : 0
	 */
	protected TextGuiSubitemTestObject pleaseEnterTheParkingSpotNumbe(TestObject anchor, long flags) 
	{
		return new TextGuiSubitemTestObject(
                        getMappedTestObject("pleaseEnterTheParkingSpotNumbe"), anchor, flags);
	}
	
	/**
	 * SecurityDisplayFrame: with default state.
	 *		.captionText : 
	 * 		.class : client.security.SecurityDisplayFrame
	 * 		accessibleContext.accessibleName : 
	 * 		.processName : javaw.exe
	 */
	protected TopLevelTestObject securityDisplayFrame() 
	{
		return new TopLevelTestObject(
                        getMappedTestObject("securityDisplayFrame"));
	}
	/**
	 * SecurityDisplayFrame: with specific test context and state.
	 *		.captionText : 
	 * 		.class : client.security.SecurityDisplayFrame
	 * 		accessibleContext.accessibleName : 
	 * 		.processName : javaw.exe
	 */
	protected TopLevelTestObject securityDisplayFrame(TestObject anchor, long flags) 
	{
		return new TopLevelTestObject(
                        getMappedTestObject("securityDisplayFrame"), anchor, flags);
	}
	
	

	protected Implementation002Helper()
	{
		setScriptName("Implementation002");
	}
	
}

