/*import java.lang.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.awt.Color;
import java.awt.Font;
//import java.awt.event.ActionEvent;
//import java.ActionListener;
import java.io.FileReader;
import java.nio.file.Files;
import java.nio.file.Paths;
*/
import javax.swing.*;  
import java.awt.event.*;
import java.awt.Color;
import java.awt.Font;

import static javax.swing.JOptionPane.showMessageDialog;

public class SignUp implements ActionListener{
	JFrame signUpFrame;
	private JLabel fName;
	private JLabel lName;
	private JLabel signUpImg;
	private JLabel signUpImg2;
	private JLabel userName;
	private JLabel email;
	private JLabel userPass;
	private JTextField fNameText;
	private JTextField lNameText;
	private JTextField emailText;
	private JTextField userNameText;
	private JPasswordField userPassword;
	private JButton signBtn;
	private JButton backBtn;

	public SignUp(){
		signUpFrame = new JFrame();

		Font headerText = new Font("Montserrat",Font.BOLD,35);

		//component declear
		fName = new JLabel("First Name");
		lName = new JLabel("Last Name");
		userName = new JLabel("Username");
		email = new JLabel("Email");
		userPass = new JLabel("Password");
		signUpImg = new JLabel();
		signUpImg2 = new JLabel();
		fNameText = new JTextField();
		lNameText = new JTextField();
		emailText = new JTextField();
		userNameText = new JTextField();
		userPassword = new JPasswordField();
		signBtn = new JButton("SignUp");
		backBtn = new JButton("Back");


		signUpImg.setIcon(new ImageIcon("ALLPicture/SignRight.jpg"));
		signUpImg.setBounds(0,-290,1902,1076);
		signUpImg2.setIcon(new ImageIcon("ALLPicture/SignUpLeft.jpg"));
		signUpImg2.setBounds(600,200,160,160);

		fName.setBounds(380,80,200,30);
		fNameText.setBounds(380,105,200,30);
		lName.setBounds(380,140,200,30);
		lNameText.setBounds(380,165,200,30);
		userName.setBounds(380,200,200,30);
		userNameText.setBounds(380,225,200,30);
		email.setBounds(380,260,200,30);
		emailText.setBounds(380,285,200,30);
		userPass.setBounds(380,320,200,30);
		userPassword.setBounds(380,345,200,30);
		signBtn.setBounds(380,390,120,30);
		backBtn.setBounds(530,390,120,30);


		signBtn.setFocusable(false);
		backBtn.setFocusable(false);


		fName.setForeground(Color.black);		
		lName.setForeground(Color.black);
		userName.setForeground(Color.black);
		email.setForeground(Color.black);
		userPass.setForeground(Color.black);
		signBtn.setForeground(Color.white);		
		backBtn.setForeground(Color.white);
		signBtn.setBackground(Color.green);		
		backBtn.setBackground(Color.green);

		





		//add to the frame
		signUpFrame.add(fName);
		signUpFrame.add(lName);
		signUpFrame.add(userName);
		signUpFrame.add(email);
		signUpFrame.add(userPass);
		signUpFrame.add(signUpImg);
		signUpFrame.add(signUpImg2);
		signUpFrame.add(fNameText);
		signUpFrame.add(lNameText);
		signUpFrame.add(emailText);
		signUpFrame.add(userNameText);
		signUpFrame.add(userPassword);
		signUpFrame.add(signBtn);
		signUpFrame.add(backBtn);
		signUpFrame.setResizable(false);

		//button action perform


		//frame build
		signUpFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		signUpFrame.setLayout(null);
		signUpFrame.setTitle("Local Bus Route");
		signUpFrame.setSize(815,530);
		signUpFrame.getContentPane().setBackground(Color.white);
		signUpFrame.setVisible(true);
		signUpFrame.setLocationRelativeTo(null);


	}
	
}	