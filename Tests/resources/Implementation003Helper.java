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
 * Script Name   : <b>Implementation003</b><br>
 * Generated     : <b>2018/11/24 11:34:12 PM</b><br>
 * Description   : Helper class for script<br>
 * Original Host : Windows 10 amd64 10.0 <br>
 * 
 * @since  November 24, 2018
 * @author Rodolfo
 */
public abstract class Implementation003Helper extends RationalTestScript
{
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
	 * Cancel: with default state.
	 *		.class : javax.swing.JButton
	 * 		accessibleContext.accessibleName : Cancel
	 * 		name : OptionPane.button
	 * 		.classIndex : 1
	 */
	protected GuiTestObject cancel() 
	{
		return new GuiTestObject(
                        getMappedTestObject("cancel"));
	}
	/**
	 * Cancel: with specific test context and state.
	 *		.class : javax.swing.JButton
	 * 		accessibleContext.accessibleName : Cancel
	 * 		name : OptionPane.button
	 * 		.classIndex : 1
	 */
	protected GuiTestObject cancel(TestObject anchor, long flags) 
	{
		return new GuiTestObject(
                        getMappedTestObject("cancel"), anchor, flags);
	}
	
	/**
	 * CouldNotConnectToLocalhostOnPort3738: with default state.
	 *		text : Could not connect to localhost on port #3738
	 * 		.class : javax.swing.JLabel
	 * 		accessibleContext.accessibleName : Could not connect to localhost on port #3738
	 * 		name : OptionPane.label
	 * 		.classIndex : 0
	 */
	protected GuiTestObject couldNotConnectToLocalhostOnPo() 
	{
		return new GuiTestObject(
                        getMappedTestObject("couldNotConnectToLocalhostOnPo"));
	}
	/**
	 * CouldNotConnectToLocalhostOnPort3738: with specific test context and state.
	 *		text : Could not connect to localhost on port #3738
	 * 		.class : javax.swing.JLabel
	 * 		accessibleContext.accessibleName : Could not connect to localhost on port #3738
	 * 		name : OptionPane.label
	 * 		.classIndex : 0
	 */
	protected GuiTestObject couldNotConnectToLocalhostOnPo(TestObject anchor, long flags) 
	{
		return new GuiTestObject(
                        getMappedTestObject("couldNotConnectToLocalhostOnPo"), anchor, flags);
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
	 * OK: with default state.
	 *		.class : javax.swing.JButton
	 * 		accessibleContext.accessibleName : OK
	 * 		name : OptionPane.button
	 * 		.classIndex : 0
	 */
	protected GuiTestObject ok2() 
	{
		return new GuiTestObject(
                        getMappedTestObject("ok2"));
	}
	/**
	 * OK: with specific test context and state.
	 *		.class : javax.swing.JButton
	 * 		accessibleContext.accessibleName : OK
	 * 		name : OptionPane.button
	 * 		.classIndex : 0
	 */
	protected GuiTestObject ok2(TestObject anchor, long flags) 
	{
		return new GuiTestObject(
                        getMappedTestObject("ok2"), anchor, flags);
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
	 * Locate and return the verification point CouldNotConnectToLocalhostOnPo_text object in the SUT.
	 */
	protected IFtVerificationPoint CouldNotConnectToLocalhostOnPo_textVP() 
	{
		return vp("CouldNotConnectToLocalhostOnPo_text");
	}
	protected IFtVerificationPoint CouldNotConnectToLocalhostOnPo_textVP(TestObject anchor)
	{
		return vp("CouldNotConnectToLocalhostOnPo_text", anchor);
	}
	
	

	protected Implementation003Helper()
	{
		setScriptName("Implementation003");
	}
	
}

