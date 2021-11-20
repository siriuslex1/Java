import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.border.Border;
import java.awt.BorderLayout;
import javax.swing.BorderFactory;

/**
* Title: CheckIn.java
* This creates the user interface of the check in programme.
* @author Sirui Li
* @version 1.0
*/
public class CheckIn{
	/**
	 *This is the entry point to the Java application.
	 *@param args This is the default.
	 */
	public static void main(String[] args){
		MyFrame checkIn = new MyFrame("Workshop Check In");        //Instantiate a MyFrame object named checkIn and set the title "Workshop Check In".
		checkIn.layoutSetting();                                                                  //Call layoutSetting method in checkIn.
		checkIn.addLabel("PLease complete the information below:");  //call addLabel method in checkIn and set the label.
		checkIn.addTextField();				     //call addTextField method and add textfield.
		checkIn.setDateOfBirth();				     //call setDateOfBirth method. 
		checkIn.newProgramme();				     //call newProgramme method.
		checkIn.newEmail(); 				     //call newEmail method.
		checkIn.newNumber();				     //call newNumber method.
		checkIn.newCode();					     //call newCode method.
		checkIn.checkBox();  				     //call checkBox method.
		checkIn.newButton();				     //call newButton method.
	}
}