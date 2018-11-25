
import resources.Implementation002Helper;
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
 * Description:  This class contains one system test described below.
 * System Tests: I-ST038-Rainy001, I-ST039-Rainy001
 * @author Rodolfo
 */
public class Implementation002 extends Implementation002Helper
{
	/**
	 * Test Case IDs  : I-ST038-Rainy001,I-ST039-Rainy001 
	 * Purposes       : 
	 * 					I-ST038-Rainy001
	 * 					To test that the system will notify Will Smith when we opens two ParkingLot Spot
	 * 					instances with the same Spot ID.
	 * 
	 * 					I-ST039-Rainy001
	 * 					To test that the system will fail to open a ParkingLot Spot when the string
	 * 					"no id" is inputted by Will Smith. 
	 * 					
	 * 				    
	 * Preconditions  : 
	 * 					I-ST038-Rainy001, I-ST039-Rainy001
	 * 					The database is setup according to the tables displayed in 5.1.2.  
	 *                  PantherLot Main and PantherLot Security are running and operational. PantherLot Spot is open, 
	 *                  but not connected to a specific spot. Will Smith is in front of a PantherLot Spot open terminal. 
	 *                  The PantherLot spots 101 is disconnected/unregistered. The PantherLot spots 102 is disconnected/unregistered.
	 *	
	 * Input          : 
	 * 					I-ST038-Rainy001
	 * 					Will Smith types “101” in the open 101 PantherLot Spot terminal.
	 * 					Will Smith types "101" in the open 102 PantherLot Spot terminal.
	 * 
	 *  				I-ST039-Rainy001
	 *  				Will Smith types “no id” in the open 101 PantherLot Spot terminal.
	 *
	 * Expected Output: 
	 * 					I-ST038-Rainy001
	 * 					The spot 101 should display “Parking Spot #101”.
	 * 					After inputting 101 in the terminal 102, this terminal will display
	 * 					"Another display is already connected to  spot #101"
	 * 
	 * 					I-ST039-Rainy001
	 * 					The 101 terminal should shut down.
	 * 
	 * @author Rodolfo
	 */
	public void testMain(Object[] args) 
	{
		// TODO Insert code here
		setUp();
		openParkingTerminal(dpString("userID"));
		openParkingTerminal(dpString("userID"));
		
		/**
		 * Verify the correct message is shown. Since I'm using datapools, there
		 * is another value created that compares the userID with the expected,
		 * compareID to force the IF condition into TRUE or FLASE
		 */
		
		if ( dpString("userID").equalsIgnoreCase( dpString("compareID") ) )
		{
			anotherDisplayIsAlreadyConnect().performTest( vpManual("ver1", dpString("expectedMessage")) );
			anotherDisplayWindow().close();
			
			//Close Spots
			parkingSpot101().click();
			getScreen().getActiveWindow().close();
		}
		else
		{
			//Nothing to check, the Parking Lot Spots close by themselves
		}
		
		tearDown();
	}
	
	/**
	 * The setup method. Creates the environment.
	 * Starts PantherLot Main, PantherLot Security.
	 */
	public void setUp()
	{
		startApp("PantherLot_Main");
		sleep(2.0);
		startApp("PantherLot_Security");
		sleep(2.0);
		
		//Move the window: 
		securityDisplayFrame().click(atPoint(544,73));
		securityDisplayFrame().move(atPoint(611,16));
	}
	
	/**
	 * This method opens a Parking Terminal.
	 * 
	 * @param spotId - The ID of the parking spot being opened
	 */
	public void openParkingTerminal( String spotId )
	{
		startApp("PantherLot_Spot");
		sleep(2.0);
		pleaseEnterTheParkingSpotNumbe().click(atPoint(104,12));
		ParkingTerminalInput().inputChars(spotId);
		ok().click();
	}
	
	/**
	 * The teardown function. Resets the environment.
	 */
	public void tearDown()
	{
		//Cleanup
		ParkingMainIDScanner(ANY,MAY_EXIT).close();
		securityDisplayFrame(ANY,MAY_EXIT).close();
		sleep(5);
	}
}

