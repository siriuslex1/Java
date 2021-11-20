import javax.swing.*;
import java.awt.*;
import java.awt.FlowLayout;
import java.awt.event.*;
import javax.swing.border.Border;
import java.awt.BorderLayout;
import javax.swing.BorderFactory;

/**
* Title: AnotherFrame.java
* This creates the check in complete interface for the user and allows them to exit the programme.
* @author Sirui Li
* @version 1.0
*/
public class AnotherFrame extends JFrame implements ActionListener{
	/**
	 *The main panel.
	 */
	private JPanel newPanel = new JPanel();
	/**
	 *The panel which is set to flow layout.
	 */
	private JPanel flowPanel = new JPanel();
	/**
	 *The main frame.
	 */
	private JFrame newFrame;
	/**
	 *The finish button.
	 */
	private JButton finishButton;
	/**
	 *The label which shows user have checked in successfully.
	 */
	private JLabel newLabel;
	/**
	 *The container.
	 */
	private Container content = getContentPane();
	/**
	 *The JTextArea which shows information of user.
	 */
	private JTextArea textArea[] = new JTextArea[5];
	/**
	 *The information of user.
	 */
	private String[] showInfo = new String[5];
/**
 *This is the constructor of AnotherFrame
 *@param information This array stores the information of user.
 *This code will show user the information they have typed in.
 */
	public AnotherFrame(String[] information){
		/*
		 *Create the frame and set the layout.
		 *Use BorderLayout.
		 */
		finishButton = new JButton("finish");
		finishButton.addActionListener(this);
		content.setLayout(new BorderLayout());
		flowPanel.setLayout(new FlowLayout());
		flowPanel.add(finishButton);
		newLabel = new JLabel("You have checked in successfully.", JLabel.CENTER);
		newLabel.setFont(new Font("", Font.BOLD,18));
    		content.add(BorderLayout.NORTH, newLabel);
		content.add(BorderLayout.SOUTH, flowPanel);
		/*
		 *Add information to the textArea.
		 *Then add textArea to the panel.
		 */
		showInfo[0] = "    Full name: "+ information[0] + " "+information[1];
		showInfo[1] = "    Date of birth: "+ information[2]+" "+information[3];
		showInfo[2] = "    Programme: "+information[4]+", Year "+information[5];
		showInfo[3] = "    Email: "+information[6];
		showInfo[4] = "    Phone number: "+information[7];
		for(int i=0;i<showInfo.length;i++){
			textArea[i] = new JTextArea(showInfo[i]);
			textArea[i].setEditable(false);
			textArea[i].setOpaque(false);
		}
		JPanel gridPanel = new JPanel();
		gridPanel.setLayout(new GridLayout(5,1));
		for(int j=0;j<showInfo.length;j++){
			gridPanel.add(textArea[j]);
		}
		content.add(BorderLayout.CENTER, gridPanel);
		gridPanel.setBorder(BorderFactory.createLoweredBevelBorder());
	}
	/**
	 *Listen to the button and exit the programme when the button was clicked.
	 */
	public void actionPerformed(ActionEvent e){
		if (e.getSource() == finishButton){
			System.exit(0);//Exit the program when the button is clicked.
		}
	}

}	