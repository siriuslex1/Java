import javax.swing.*;
import java.awt.*;
import java.awt.FlowLayout;
import java.awt.event.*;
import javax.swing.border.Border;
import java.awt.BorderLayout;
import javax.swing.BorderFactory;
import javax.swing.JOptionPane;
import java.awt.Color;
/**
 * Title: MyFrame.java
 * This class creates the first interface the user is going to see.
 * This interface provide allows user to 
 * input their information and code. 
 * Also, user can enter the second interface through
 * the the 'Next Step' button provided.
 * @author Sirui Li
 * @version 1.0
 */
public class MyFrame extends JFrame implements ActionListener{
	/**
	 *The main frame.
	 */
	private JFrame newFrame; 
	/**
	 *The main panel.
	 */
	private JPanel newPanel;
	/**
	 *The button which allows user to go to next step.
	 */
	private JButton NextStep; 
	/**
	 *The button which clears all the input information.
	 */
	private JButton Clear;
	/**
	 *The button which exits the programme.
	 */
	private JButton Exit;
	/**
	 *The first name of user.
	 */
	private JTextField newFirstName;
	/**
	 *The surname of user.
	 */
	private JTextField newSurname;
	/**
	 *The first check box.
	 */
	private JCheckBox newCheckBox1;
	/**
	 *The second check box.
	 */
	private JCheckBox newCheckBox2;
	/**
	 *The JTextField for booking reference code.
	 */
	private JTextField newCode; 
	/**
	 *The JTextField for email.
	 */
	private JTextField newEmail;
	/**
	 *The JTextField for phone number.
	 */
	private JTextField newNumber;  
	/**
	 *The JComboBox for birth of month, birth of year, programme and grade. 
	 */
	private JComboBox<String> newComboBox1, newComboBox2, newComboBox3, newComboBox4, referenceCode;
	/**
	 *The string used for storing the information of user.
	 */
	private String[] information = new String[9];
	/**
	 *The panel of text.
	 */
	private JPanel panelOfText;
	/**
	 *Create a line border in red.
	 */
	private Border borderOne = BorderFactory.createLineBorder(Color.red);
	/**
	 *Create a line border in gray.
	 */
	private Border borderTwo = BorderFactory.createLineBorder(Color.gray);
	/**
	 *Create a panel of programme.
	 */
	JPanel panelOfProgramme; 
	/**
	 *Create a panel of date.
	 */
	JPanel panelOfDate;
/**
 *This is the default constructor of MyFrame.
 */
	public MyFrame(){}
/**
 *This is another constructor of MyFrame.
 *@param title The title of the frame created.
 */
	public MyFrame(String title){
		newFrame = new JFrame();//instantiate frame.
		newFrame.setTitle(title);//set the title of the frame.
		newFrame.setSize(500,800);//set the size of the frame.
		newFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		newFrame.setVisible(true);//set the frame visible.
	}
/**
 *This method set the layout of panel to gridlayout.
 *Then the new panel is added to the frame.
 */
	public void layoutSetting(){
		newPanel = new JPanel();//instantiate the panel
		newPanel.setLayout(new GridLayout(9,1));//set the layout of the panel to gridlayout.
		newFrame.add(newPanel);//add the panel to the frame.
	}
/**
 *This method adds a label into the panel.
 *@param words The words shown on the label.
 */
	public void addLabel(String words){
		JLabel newLabel = new JLabel(words,JLabel.CENTER);// Create a JLabel and set it to the center.
		newLabel.setFont(new Font("", Font.BOLD,18));//Set the font of the label.
		newPanel.add(newLabel);
	}
/**
 *This method creates a JTextField named newFirstName which
 *contains a JTextField of length 8 and then set the border of this JTextField.
 *@param words The words added to the title of border.
 *@return The JTextField use for entering the first name of user.
 */	
	public JTextField newFirstName(String words){
		newFirstName = new JTextField(8);
		Border titleBorder = BorderFactory.createTitledBorder(words);//Set the border.
		newFirstName.setBorder(titleBorder);
		newFirstName.setVisible(true);
		return newFirstName;
	}
/**
 *This method creates a JTextField named newSurname which
 *contains a JTextField of length 8 and then set the border of this JTextField.
 *@param words The words added to the title of border.
 *@return The JTextField use for entering the surname of user.
 */
	public JTextField newSurname(String words){
		newSurname = new JTextField(8);
		Border titleBorder = BorderFactory.createTitledBorder(words);//Set the border.
		newSurname.setBorder(titleBorder);
		newSurname.setVisible(true);
		return newSurname;
	}
/**
 *This method adds two JTextField to the panel
 *and set the textfields into proper format.
 */
	public void addTextField(){
		panelOfText = new JPanel();
		panelOfText.setLayout(new FlowLayout());//add first name and surname into flowlayout.
		panelOfText.add(this.newFirstName("First Name"));
		panelOfText.add(this.newSurname("Surname"));
		Border titleBorder = BorderFactory.createTitledBorder("Name");//Set the border.
		panelOfText.setBorder(titleBorder);
		panelOfText.setVisible(true);
		newPanel.add(panelOfText);
		newPanel.setVisible(true);
	}	
/**
 *This method creates a JComboBox that contains the month of user's birthday.
 *@param words The title of this JComboBox.
 *@return The JComboBox which contains month.
 */
	public JComboBox setMonth(String words){
		newComboBox1 = new JComboBox<>();//Create a combobox with provided options.
		String[] Month = {"January","February","March","April","May","June","July","August","September","October","November","December"};
		for(int i=0;i<Month.length;i++){
			newComboBox1.addItem(Month[i]);
		}
		Border titleBorder = BorderFactory.createTitledBorder(words);//Set the border.
		newComboBox1.setBorder(titleBorder);
		newComboBox1.setSelectedIndex(-1);//Set the comboBox to the state of not been selected.
		return newComboBox1;
	}
/**
 *This method creates a JComboBox that contains the year of user's birthday.
 *@param words The title of this JComboBox.
 *@return The JComboBox which contains year.
 */
	public JComboBox setYear(String words){
		newComboBox2 = new JComboBox<>();//Create a combobox with provided options.
		String[] Year = {"1998","1999","2000","2001","2002","2003","2004","2005"};
		for(int i=0;i<Year.length;i++){
			newComboBox2.addItem(Year[i]);
		}
		Border titleBorder = BorderFactory.createTitledBorder(words);//Set the border.
		newComboBox2.setBorder(titleBorder);
		newComboBox2.setSelectedIndex(-1);//Set the comboBox to the state of not been selected.
		return newComboBox2;
	}	
/**
 *This method add the JComboBoxes containing the year and month to the panel .
 *This method also set the title of the border to "Date of Birth".
 */	
	public void setDateOfBirth(){
		panelOfDate = new JPanel();
		JPanel panel = new JPanel();
		panel.setBorder(BorderFactory.createLoweredBevelBorder());
		panelOfDate.setLayout(new FlowLayout());
		panelOfDate.add(panel.add(this.setMonth("Month")));
		panelOfDate.add(panel.add(this.setYear("Year")));
		Border titleBorder = BorderFactory.createTitledBorder("Date of Birth");
		panelOfDate.setBorder(titleBorder);
		newPanel.add(panelOfDate);
	}
/**
 *This method creates a JComboBox comtaining the programmes avaliable. 
 *@return The JComboBox which comtains all the programmes.
 */
	public JComboBox setProgramme(){
		newComboBox3 = new JComboBox<>();//Create a combobox with provided options.
		String[] Programme = {"e-Commerce Engineering with Law","Telecommunications Engineering with Management","Internet of Things Engineering"};
		for(int i=0;i<Programme.length;i++){
			newComboBox3.addItem(Programme[i]);
		}
		newComboBox3.setSelectedIndex(-1);//Set the comboBox to the state of not been selected.
		newComboBox3.setBorder(BorderFactory.createLoweredBevelBorder());
		return newComboBox3;
	}
/**
 *This method creates a JComboBox comtaining the grade of user. 
 *@return The JComboBox which comtains all the grades.
 */
	public JComboBox setGrade(){
		newComboBox4 = new JComboBox<>();//Create a combobox with provided options.
		String[] Year = {"1","2","3","4"};
		for(int i=0;i<Year.length;i++){
			newComboBox4.addItem(Year[i]);
		}
		newComboBox4.setSelectedIndex(-1);//Set the comboBox to the state of not been selected.
		newComboBox4.setBorder(BorderFactory.createLoweredBevelBorder());
		return newComboBox4;
	}
/**
 *This method add the JComboBoxes containing the programme and the grades to the panel .
 *This method also set the title of the border to "Programme".
 */	

	public void newProgramme(){
		panelOfProgramme = new JPanel();
		JPanel panel = new JPanel();
		panel.setBorder(BorderFactory.createLoweredBevelBorder());
		panelOfProgramme.setLayout(new FlowLayout());//add programme and year into flowlayout.
		panelOfProgramme.add(panel.add(this.setProgramme()));
		panelOfProgramme.add(panel.add(this.setGrade()));
		Border titleBorder = BorderFactory.createTitledBorder("Programme");
		panelOfProgramme.setBorder(titleBorder);//Set the border.
		newPanel.add(panelOfProgramme);
	}	
/**
 *This method creates a JTextField for getting information of email and adds it to the panel.
 *The length of JTextField is set to 20
 *This method also set the title of the border to "Email".
 */
	public void newEmail(){
		newEmail = new JTextField(20);
		JPanel panelOfEmail = new JPanel();
		panelOfEmail.setLayout(new FlowLayout());
		panelOfEmail.add(newEmail);
		newPanel.add(panelOfEmail);
		Border titleBorder = BorderFactory.createTitledBorder("Email");//Set the border.
		panelOfEmail.setBorder(titleBorder);
	}
/**
 *This method creates a JTextField for getting information of phone number and adds it to the panel.
 *The length of JTextField is set to 20
 *This method also set the title of the border to "Phone number".
 */
	public void newNumber(){
		newNumber = new JTextField(20);
		JPanel panelOfNumber = new JPanel();
		panelOfNumber.setLayout(new FlowLayout());
		panelOfNumber.add(newNumber);
		newPanel.add(panelOfNumber);
		Border titleBorder = BorderFactory.createTitledBorder("Phone number");//Set the border.
		panelOfNumber.setBorder(titleBorder);
	}
/**
 *This method creates a JTextField for getting information of booking reference code and adds it to the panel.
 *The length of JTextField is set to 10
 *This method also set the title of the border to "Booking reference code".
 */
	public void newCode(){
		newCode = new JTextField(10);
		JPanel panelOfCode = new JPanel();
		panelOfCode.setLayout(new FlowLayout());
		panelOfCode.add(newCode);
		newPanel.add(panelOfCode);	
		Border titleBorder = BorderFactory.createTitledBorder("Booking reference code");//Set the border.
		panelOfCode.setBorder(titleBorder);
		}
/**
 *This method creates two CheckBoxes. 
 *First CheckBox makes sure that user have read and agree to the terms and conditions.
 *Second CheckBox makes sure that user have confirmed the imformation provided is correct.
 *The two CheckBoxes are added to the panel.
 */
	public void checkBox(){
		newCheckBox1= new JCheckBox("I have read and agree to the terms and conditions.");
		newCheckBox2 = new JCheckBox("I confirm that the information provided is correct.");
		JPanel panelOfBox = new JPanel();
		panelOfBox.setLayout(new FlowLayout());//add the two checkbox into the panel.
		panelOfBox.add(newCheckBox1);
		panelOfBox.add(newCheckBox2);
		newPanel.add(panelOfBox);
	}	
/**
 *This method creates three buttons. 
 *First button "Next Step" allows user comfirm their informarion and go to next step.
 *Second button "Clear" can clear all the information user have typed in.
 *Third button "Exit" allows user to exit the programme. 
 *Also, an action listener is added to each button.
 */
	public void newButton(){	
		NextStep = new JButton("Next step");//Create three buttons.
		Clear = new JButton("Clear");
		Exit = new JButton("Exit");
		JPanel panelOfButton = new JPanel();
		panelOfButton.setLayout(new FlowLayout());//Set the layout to flowlayout and add the buttons.
		panelOfButton.add(NextStep);
		panelOfButton.add(Clear);
		panelOfButton.add(Exit);
		newPanel.add(panelOfButton);
		newFrame.setContentPane(newPanel);
		NextStep.addActionListener(this);//add action listener to all the buttons.
		Clear.addActionListener(this);
		Exit.addActionListener(this);
		panelOfButton.setBorder(BorderFactory.createLoweredBevelBorder());
	}

/**
 *This method contains the action when each button is clicked.
 *Also, when nothing is entered by the user, the missing blank will go red.
 *Then when the user comfirm, go to the second interface. 
 */
	public void actionPerformed(ActionEvent e){
		if(e.getSource() == NextStep){
			/*
			 *See if user have provide all the needed information and point out missing information.
			 */
			if(newFirstName.getText().equals("") || newSurname.getText().equals("") || newEmail.getText().equals("") || newNumber.getText().equals("") || newCheckBox1.isSelected() == false || newCheckBox2.isSelected() == false || newCode.getText().equals("") || newComboBox4.getSelectedIndex() == -1||newComboBox3.getSelectedIndex() == -1||newComboBox2.getSelectedIndex() == -1||newComboBox1.getSelectedIndex() == -1){
				JOptionPane.showMessageDialog(newPanel, "Please fill in missing information.", "Missing information",JOptionPane.WARNING_MESSAGE);  
				//If the information of a session is not provided by the user, highlight it by red.
				if(newNumber.getText().equals("")){//Reminding user if phone number was not typed in.
					newNumber.setBorder(BorderFactory.createTitledBorder(borderOne, "Phone Number"));	

				}
				else{
					newNumber.setBorder(BorderFactory.createLineBorder(Color.black));
				}
				if(newFirstName.getText().equals("")){//Reminding user if first name was not typed in.
					newFirstName.setBorder(borderOne);
					newFirstName.setBorder(BorderFactory.createTitledBorder(borderOne, "First Name"));
					panelOfText.add(newFirstName);
				}
				else{
					newFirstName.setBorder(borderTwo);
					newFirstName.setBorder(BorderFactory.createTitledBorder(borderTwo, "First Name"));
					panelOfText.add(newFirstName);
				}
				if(newComboBox1.getSelectedIndex() == -1){//Reminding user if birth of  month was not selected.
					newComboBox1.setBorder(borderOne);
					newComboBox1.setBorder(BorderFactory.createTitledBorder(borderOne, "Month"));
					panelOfDate.add(newComboBox1);
				}
				else{
					newComboBox1.setBorder(borderTwo);
					newComboBox1.setBorder(BorderFactory.createTitledBorder(borderTwo, "Month"));
					panelOfDate.add(newComboBox1);
				}
				if(newComboBox2.getSelectedIndex() == -1){//Reminding user if birth of  year was not selected.
					newComboBox2.setBorder(borderOne);
					newComboBox2.setBorder(BorderFactory.createTitledBorder(borderOne, "Year"));
					panelOfDate.add(newComboBox2);
				}
				else{
					newComboBox2.setBorder(borderTwo);
					newComboBox2.setBorder(BorderFactory.createTitledBorder(borderTwo, "Year"));
					panelOfDate.add(newComboBox2);
				}
				if(newComboBox3.getSelectedIndex() == -1){//Reminding user if programme was not selected.
					newComboBox3.setBorder(borderOne);
					panelOfDate.add(newComboBox2);
				}
				else{
					newComboBox3.setBorder(borderTwo);
					panelOfDate.add(newComboBox2);
				}
				if(newComboBox4.getSelectedIndex() == -1){//Reminding user if grade was not selected.
					newComboBox4.setBorder(borderOne);
					panelOfDate.add(newComboBox2);
				}
				else{
					newComboBox4.setBorder(borderTwo);
					panelOfDate.add(newComboBox2);
				}
				if(newSurname.getText().equals("")){//Reminding user if surname was not typed in.
					newSurname.setBorder(BorderFactory.createLineBorder(Color.red));	
					newSurname.setBorder(BorderFactory.createTitledBorder(borderOne, "Surname"));
					panelOfText.add(newSurname);
				}
				else{
					newSurname.setBorder(borderTwo);	
					newSurname.setBorder(BorderFactory.createTitledBorder(borderTwo, "Surname"));
					panelOfText.add(newSurname);
				}
				if(newEmail.getText().equals("")){//Reminding user if email was not typed in.
					newEmail.setBorder(BorderFactory.createTitledBorder(borderOne, "Email"));	
				}	
				else{
					newEmail.setBorder(BorderFactory.createLineBorder(null));
				}	
				if(newCode.getText().equals("")){//Reminding user if booking reference code was not typed in.
					newCode.setBorder(BorderFactory.createTitledBorder(borderOne, "Code"));	
				}
				else{
					newCode.setBorder(BorderFactory.createLineBorder(null));
				}
				if(newCheckBox2.isSelected() == false){//Reminding user if checkbox was not selected.
					newCheckBox2.setForeground(Color.red);
				}
				else{
					newCheckBox2.setForeground(null);
				}
				if(newCheckBox1.isSelected() == false){//Reminding user if checkbox was not selected.
					newCheckBox1.setForeground(Color.red);
				}
				else{
					newCheckBox1.setForeground(null);
				}
			}
			else{
				/*
				 *Ask user to confirm that they have checked all the information correct.
				 *Show the "Check in complete" interface. 
				 */
				int optionPane = JOptionPane.showConfirmDialog(null, "Have you checked all the information is correct? You can't change the information once the information is submitted.", "Confirm check in",JOptionPane.WARNING_MESSAGE);
				if(optionPane == 0){
			//Set the color of all sessions to the origional ones.
					newNumber.setBorder(BorderFactory.createLineBorder(null));
					newFirstName.setBorder(borderTwo);
					newFirstName.setBorder(BorderFactory.createTitledBorder(borderTwo, "First Name"));
					panelOfText.add(newFirstName);
					newComboBox1.setBorder(borderTwo);
					newComboBox1.setBorder(BorderFactory.createTitledBorder(borderTwo, "Month"));
					panelOfDate.add(newComboBox1);
					newComboBox2.setBorder(borderTwo);
					newComboBox2.setBorder(BorderFactory.createTitledBorder(borderTwo, "Year"));
					panelOfDate.add(newComboBox2);
					newComboBox3.setBorder(borderTwo);
					panelOfProgramme.add(newComboBox3);
					newComboBox4.setBorder(borderTwo);
					panelOfProgramme.add(newComboBox4);
					newSurname.setBorder(borderTwo);	
					newSurname.setBorder(BorderFactory.createTitledBorder(borderTwo, "Surname"));
					panelOfText.add(newSurname);
					newEmail.setBorder(BorderFactory.createLineBorder(null));
					newCode.setBorder(BorderFactory.createLineBorder(null));
					newCheckBox2.setForeground(null);
					newCheckBox1.setForeground(null);
			//Store all the information of the user.
					information[0] = newFirstName.getText();
					information[1] = newSurname.getText();
					information[2] = newComboBox1.getSelectedItem().toString();
					information[3] = newComboBox2.getSelectedItem().toString();
					information[4] = newComboBox3.getSelectedItem().toString();
					information[5] = newComboBox4.getSelectedItem().toString();
					information[6] = newEmail.getText();
					information[7] = newNumber.getText();
					information[8] = newCode.getText();
					AnotherFrame anotherFrame = new AnotherFrame(information);//Create an object of AnotherFrame.
					anotherFrame.setTitle("Check in complete!");//Set the format.
					anotherFrame.setSize(500,350);
					anotherFrame.setVisible(true);
					newFirstName.setEditable(false);
					newSurname.setEditable(false);
					newComboBox1.setEditable(false);//After the user confirmed, the information cannot be changed.
					newComboBox2.setEditable(false);
					newComboBox3.setEditable(false);
					newComboBox4.setEditable(false);
					newEmail.setEditable(false);
					newNumber.setEditable(false);
					newCode.setEditable(false);
				}
				else{}
			}
		}
		if(e.getSource() == Clear){
			/*
			 *Clear all the information user have typed in.
			 */
			newCode.setText("");
			newNumber.setText("");
			newEmail.setText("");
			newFirstName.setText("");
			newSurname.setText("");
			newCheckBox1.setSelected(false);
			newCheckBox2.setSelected(false);
			newComboBox4.setSelectedIndex(-1);
			newComboBox3.setSelectedIndex(-1);
			newComboBox2.setSelectedIndex(-1);
			newComboBox1.setSelectedIndex(-1);
	//Set the color of all sessions to the origional ones.
			newNumber.setBorder(BorderFactory.createLineBorder(Color.black));
			newFirstName.setBorder(borderTwo);
			newFirstName.setBorder(BorderFactory.createTitledBorder(borderTwo, "First Name"));
			panelOfText.add(newFirstName);
			newComboBox1.setBorder(borderTwo);
			newComboBox1.setBorder(BorderFactory.createTitledBorder(borderTwo, "Month"));
			panelOfDate.add(newComboBox1);
			newComboBox2.setBorder(borderTwo);
			newComboBox2.setBorder(BorderFactory.createTitledBorder(borderTwo, "Year"));
			panelOfDate.add(newComboBox2);
			newComboBox3.setBorder(borderTwo);
			panelOfProgramme.add(newComboBox3);
			newComboBox4.setBorder(borderTwo);
			panelOfProgramme.add(newComboBox4);	
			newSurname.setBorder(borderTwo);	
			newSurname.setBorder(BorderFactory.createTitledBorder(borderTwo, "Surname"));
			panelOfText.add(newSurname);
			newEmail.setBorder(BorderFactory.createLineBorder(null));
			newCode.setBorder(BorderFactory.createLineBorder(null));
			newCheckBox2.setForeground(null);
			newCheckBox1.setForeground(null);
			}
		if (e.getSource() == Exit){
			/*
			 *Exit the programme.
			 */
			System.exit(0);
		}
	}
}