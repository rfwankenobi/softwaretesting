
import resources.Implementation003Helper;
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
 * System Tests: I-ST040-Rainy001, I-ST041-Rainy001 
 * @author Rodolfo
 */
public class Implementation003 extends Implementation003Helper
{
	/**
	 * Test Case IDs  : I-ST040-Rainy001, I-ST041-Rainy001 
	 * Purposes       : I-ST040-Rainy001 
	 * 					To test the system when the ParkingLot Spot opens before PantherLot Main. PantherLot Spot should fail to connect.
	 * 
	 * 					I-ST041-Rainy001
	 * 					To test the close behavior when Will Smith hits Cancel on the PantherLot Spot setup interface. 
	 * 				    
	 * Preconditions  : 
	 * 					I-ST040-Rainy001, I-ST041-Rainy001 
	 * 					The database is setup according to the tables displayed in 5.1.2.  
	 *                  PantherLot Main and PantherLot Security are NOT running or operational. PantherLot Spot is open, 
	 *                  but not connected to a specific spot. Will Smith is in front of a PantherLot Spot open terminal. 
	 *                  The PantherLot spots 101 is disconnected/unregistered.
	 *	
	 * Input          : I-ST040-Rainy001
	 * 					Will Smith types “101” in the open 101 PantherLot Spot terminal.
	 * 
	 * 					I-ST041-Rainy001
	 * 					Will Smith hits "Cancel"
	 *
	 * Expected Output: I-ST040-Rainy001 
	 * 					The spot 101 should display "Could not connect to localhost on port #3738"
	 * 					
	 * 					I-ST041-Rainy001
	 * 					The spot 101 closes/terminates. 
	 * 
	 * @author Rodolfo
	 */
	public void testMain(Object[] args) 
	{
		startApp("PantherLot_Spot");
		pleaseEnterTheParkingSpotNumbe().click(atPoint(104,12));
		
		String userID = dpString("userID");
		ParkingTerminalInput().inputChars( userID );
		
		//First test causes a failure. The second test cancels before failing.
		if ( userID.equalsIgnoreCase( dpString("compareID") ) )
		{
			ok().click();
			couldNotConnectToLocalhostOnPo().performTest( vpManual("manualvp2", dpString("expectedMessage")) );
			ok2().click();
		}
		else
		{
			cancel().click();
		}
		
		sleep(2);
	}
	
}

