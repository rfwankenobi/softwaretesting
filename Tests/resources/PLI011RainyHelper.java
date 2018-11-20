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
 * Script Name   : <b>PLI011Rainy</b><br>
 * Generated     : <b>2018/11/18 6:57:52 PM</b><br>
 * Description   : Helper class for script<br>
 * Original Host : Windows 10 amd64 10.0 <br>
 * 
 * @since  November 18, 2018
 * @author Rodolfo
 */
public abstract class PLI011RainyHelper extends RationalTestScript
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
	 * ScanID: with default state.
	 *		.class : javax.swing.JButton
	 * 		accessibleContext.accessibleName : Scan ID
	 * 		.classIndex : 0
	 */
	protected GuiTestObject ParkingMainIDScannerNext() 
	{
		return new GuiTestObject(
                        getMappedTestObject("ParkingMainIDScannerNext"));
	}
	/**
	 * ScanID: with specific test context and state.
	 *		.class : javax.swing.JButton
	 * 		accessibleContext.accessibleName : Scan ID
	 * 		.classIndex : 0
	 */
	protected GuiTestObject ParkingMainIDScannerNext(TestObject anchor, long flags) 
	{
		return new GuiTestObject(
                        getMappedTestObject("ParkingMainIDScannerNext"), anchor, flags);
	}
	
	/**
	 * WelcomeToFIU: with default state.
	 *		text : Welcome to FIU!
	 * 		.class : javax.swing.JLabel
	 * 		accessibleContext.accessibleName : Welcome to FIU!
	 * 		.classIndex : 1
	 */
	protected GuiTestObject ParkingSpotMessage() 
	{
		return new GuiTestObject(
                        getMappedTestObject("ParkingSpotMessage"));
	}
	/**
	 * WelcomeToFIU: with specific test context and state.
	 *		text : Welcome to FIU!
	 * 		.class : javax.swing.JLabel
	 * 		accessibleContext.accessibleName : Welcome to FIU!
	 * 		.classIndex : 1
	 */
	protected GuiTestObject ParkingSpotMessage(TestObject anchor, long flags) 
	{
		return new GuiTestObject(
                        getMappedTestObject("ParkingSpotMessage"), anchor, flags);
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
	 * Cancel: with default state.
	 *		.class : javax.swing.JButton
	 * 		accessibleContext.accessibleName : Cancel
	 * 		.classIndex : 0
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
	 * 		.classIndex : 0
	 */
	protected GuiTestObject cancel(TestObject anchor, long flags) 
	{
		return new GuiTestObject(
                        getMappedTestObject("cancel"), anchor, flags);
	}
	
	/**
	 * DisplayDirections: with default state.
	 *		.captionText : 
	 * 		.class : client.maindisplay.DisplayDirections
	 * 		accessibleContext.accessibleName : 
	 * 		.processName : javaw.exe
	 */
	protected TopLevelTestObject displayDirections() 
	{
		return new TopLevelTestObject(
                        getMappedTestObject("displayDirections"));
	}
	/**
	 * DisplayDirections: with specific test context and state.
	 *		.captionText : 
	 * 		.class : client.maindisplay.DisplayDirections
	 * 		accessibleContext.accessibleName : 
	 * 		.processName : javaw.exe
	 */
	protected TopLevelTestObject displayDirections(TestObject anchor, long flags) 
	{
		return new TopLevelTestObject(
                        getMappedTestObject("displayDirections"), anchor, flags);
	}
	
	/**
	 * Finish: with default state.
	 *		.class : javax.swing.JButton
	 * 		accessibleContext.accessibleName : Finish
	 * 		.classIndex : 1
	 */
	protected GuiTestObject finish() 
	{
		return new GuiTestObject(
                        getMappedTestObject("finish"));
	}
	/**
	 * Finish: with specific test context and state.
	 *		.class : javax.swing.JButton
	 * 		accessibleContext.accessibleName : Finish
	 * 		.classIndex : 1
	 */
	protected GuiTestObject finish(TestObject anchor, long flags) 
	{
		return new GuiTestObject(
                        getMappedTestObject("finish"), anchor, flags);
	}
	
	/**
	 * JTextField: with default state.
	 *		.class : javax.swing.JTextField
	 * 		.classIndex : 0
	 */
	protected TextGuiSubitemTestObject jTextField() 
	{
		return new TextGuiSubitemTestObject(
                        getMappedTestObject("jTextField"));
	}
	/**
	 * JTextField: with specific test context and state.
	 *		.class : javax.swing.JTextField
	 * 		.classIndex : 0
	 */
	protected TextGuiSubitemTestObject jTextField(TestObject anchor, long flags) 
	{
		return new TextGuiSubitemTestObject(
                        getMappedTestObject("jTextField"), anchor, flags);
	}
	
	/**
	 * Next: with default state.
	 *		.class : javax.swing.JButton
	 * 		accessibleContext.accessibleName : Next
	 * 		.classIndex : 1
	 */
	protected GuiTestObject next() 
	{
		return new GuiTestObject(
                        getMappedTestObject("next"));
	}
	/**
	 * Next: with specific test context and state.
	 *		.class : javax.swing.JButton
	 * 		accessibleContext.accessibleName : Next
	 * 		.classIndex : 1
	 */
	protected GuiTestObject next(TestObject anchor, long flags) 
	{
		return new GuiTestObject(
                        getMappedTestObject("next"), anchor, flags);
	}
	
	/**
	 * Next: with default state.
	 *		.class : javax.swing.JButton
	 * 		accessibleContext.accessibleName : Next
	 * 		.classIndex : 1
	 */
	protected GuiTestObject next2() 
	{
		return new GuiTestObject(
                        getMappedTestObject("next2"));
	}
	/**
	 * Next: with specific test context and state.
	 *		.class : javax.swing.JButton
	 * 		accessibleContext.accessibleName : Next
	 * 		.classIndex : 1
	 */
	protected GuiTestObject next2(TestObject anchor, long flags) 
	{
		return new GuiTestObject(
                        getMappedTestObject("next2"), anchor, flags);
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
	 * PantherLotInteractive: with default state.
	 *		text : PantherLot Interactive
	 * 		.class : javax.swing.JLabel
	 * 		accessibleContext.accessibleName : PantherLot Interactive
	 * 		.classIndex : 0
	 */
	protected GuiTestObject pantherLotInteractive() 
	{
		return new GuiTestObject(
                        getMappedTestObject("pantherLotInteractive"));
	}
	/**
	 * PantherLotInteractive: with specific test context and state.
	 *		text : PantherLot Interactive
	 * 		.class : javax.swing.JLabel
	 * 		accessibleContext.accessibleName : PantherLot Interactive
	 * 		.classIndex : 0
	 */
	protected GuiTestObject pantherLotInteractive(TestObject anchor, long flags) 
	{
		return new GuiTestObject(
                        getMappedTestObject("pantherLotInteractive"), anchor, flags);
	}
	
	/**
	 * PleaseEnterID: with default state.
	 *		text : Please Enter ID
	 * 		.class : javax.swing.JLabel
	 * 		accessibleContext.accessibleName : Please Enter ID
	 * 		.classIndex : 1
	 */
	protected GuiTestObject pleaseEnterID() 
	{
		return new GuiTestObject(
                        getMappedTestObject("pleaseEnterID"));
	}
	/**
	 * PleaseEnterID: with specific test context and state.
	 *		text : Please Enter ID
	 * 		.class : javax.swing.JLabel
	 * 		accessibleContext.accessibleName : Please Enter ID
	 * 		.classIndex : 1
	 */
	protected GuiTestObject pleaseEnterID(TestObject anchor, long flags) 
	{
		return new GuiTestObject(
                        getMappedTestObject("pleaseEnterID"), anchor, flags);
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
	 * ScanID: with default state.
	 *		.class : javax.swing.JButton
	 * 		.priorLabel : Parking Spot Status: Unassigned
	 * 		accessibleContext.accessibleName : Scan ID
	 * 		.classIndex : 0
	 */
	protected GuiTestObject scanID() 
	{
		return new GuiTestObject(
                        getMappedTestObject("scanID"));
	}
	/**
	 * ScanID: with specific test context and state.
	 *		.class : javax.swing.JButton
	 * 		.priorLabel : Parking Spot Status: Unassigned
	 * 		accessibleContext.accessibleName : Scan ID
	 * 		.classIndex : 0
	 */
	protected GuiTestObject scanID(TestObject anchor, long flags) 
	{
		return new GuiTestObject(
                        getMappedTestObject("scanID"), anchor, flags);
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
	
	/**
	 * SpotDisplayFrame: with default state.
	 *		.captionText : 
	 * 		.class : client.parkingdisplay.SpotDisplayFrame
	 * 		accessibleContext.accessibleName : 
	 * 		.processName : javaw.exe
	 */
	protected TopLevelTestObject spotDisplayFrame() 
	{
		return new TopLevelTestObject(
                        getMappedTestObject("spotDisplayFrame"));
	}
	/**
	 * SpotDisplayFrame: with specific test context and state.
	 *		.captionText : 
	 * 		.class : client.parkingdisplay.SpotDisplayFrame
	 * 		accessibleContext.accessibleName : 
	 * 		.processName : javaw.exe
	 */
	protected TopLevelTestObject spotDisplayFrame(TestObject anchor, long flags) 
	{
		return new TopLevelTestObject(
                        getMappedTestObject("spotDisplayFrame"), anchor, flags);
	}
	
	/**
	 * Locate and return the verification point HomeScreenSecondText object in the SUT.
	 */
	protected IFtVerificationPoint HomeScreenSecondTextVP() 
	{
		return vp("HomeScreenSecondText");
	}
	protected IFtVerificationPoint HomeScreenSecondTextVP(TestObject anchor)
	{
		return vp("HomeScreenSecondText", anchor);
	}
	
	/**
	 * Locate and return the verification point HomeScreenText object in the SUT.
	 */
	protected IFtVerificationPoint HomeScreenTextVP() 
	{
		return vp("HomeScreenText");
	}
	protected IFtVerificationPoint HomeScreenTextVP(TestObject anchor)
	{
		return vp("HomeScreenText", anchor);
	}
	
	/**
	 * Locate and return the verification point ParkingSpotExpectedMessageVP object in the SUT.
	 */
	protected IFtVerificationPoint ParkingSpotExpectedMessageVPVP() 
	{
		return vp("ParkingSpotExpectedMessageVP");
	}
	protected IFtVerificationPoint ParkingSpotExpectedMessageVPVP(TestObject anchor)
	{
		return vp("ParkingSpotExpectedMessageVP", anchor);
	}
	
	

	protected PLI011RainyHelper()
	{
		setScriptName("PLI011Rainy");
	}
	
}

