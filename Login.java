package Classes;

import javax.swing.*;  
import javax.swing.border.Border;
import java.awt.event.*;
import java.awt.Color;
import java.awt.Font;
import java.util.*;
import java.lang.*;
import java.io.*;
import java.nio.file.*;
import static javax.swing.JOptionPane.showMessageDialog;

public class Login implements ActionListener{
	JFrame loginFrame;
	private JLabel usernl,userpl,loginPImg,loginPTxt,userLogo,passLogo,usernl1,cpyrt;
	ImageIcon icon = new ImageIcon("ALLPicture/ok1.png");
	private JTextField usernameText;
	private JPasswordField passwordText;
	private JButton loginBtn,adminloginbtn;
	private JButton signUpBtn;
	private JButton extBtn;

	public Login(){
		loginFrame = new JFrame();

		//copyright txt
		cpyrt = new JLabel("Copyright @2023, TEAM ROAR");
		cpyrt.setBounds(120,400,300,15);
		cpyrt.setForeground(Color.white);
		cpyrt.setFont(new Font("Segoe UI", Font.PLAIN, 10));

		//welcome label
		usernl1 = new JLabel("Welcome");
		usernl1.setBounds(470,80,150,20);
		usernl1.setForeground(Color.white);
		usernl1.setFont(new Font("Segoe UI", Font.BOLD, 20));

		//username label
		usernl = new JLabel("Username");
		usernl.setBounds(470,180,150,20);
		usernl.setForeground(new Color(119,85,163));
		usernl.setFont(new Font("Segoe UI", Font.PLAIN, 18));

		//password label
		userpl = new JLabel("Password");
		userpl.setBounds(470,230,150,20);
		userpl.setForeground(new Color(119,85,163));
		userpl.setFont(new Font("Segoe UI", Font.PLAIN, 18));

		//login txt
		loginPTxt = new JLabel("User Login");
		loginPTxt.setBounds(470,120,210,50);
		loginPTxt.setFont(new Font("Segoe UI", Font.PLAIN, 30));
		loginPTxt.setForeground(new Color(119,85,163));
		loginPTxt.setBorder(BorderFactory.createMatteBorder(0,0,2,0,new Color(119,85,163)));

		//username txt field
		usernameText = new JTextField();
		usernameText.setBounds(470,200,220,25);
		usernameText.setBorder(BorderFactory.createMatteBorder(0,0,1,0,new Color(119,85,163)));

		//password text field
		passwordText = new JPasswordField();
		passwordText.setBounds(470,250,220,25);
		passwordText.setBorder(BorderFactory.createMatteBorder(0,0,1,0,new Color(119,85,163)));

		//login btn text field
		loginBtn = new JButton("Login");
		loginBtn.setBounds(470,290,220,30);
		loginBtn.setBackground(new Color(119,85,163));
		loginBtn.setForeground(Color.white);
		//loginBtn.setBorder(new RoundedBorder(10));
		loginBtn.setFocusable(false);

		/*loginBtn = new JButton("Login");
		loginBtn.setBounds(520,250,240,30);
		loginBtn.setBackground(Color.blue);
		loginBtn.setForeground(Color.white);
		loginBtn.setFocusable(false);*/

		// signup btn 
		signUpBtn = new JButton("Sign Up");
		signUpBtn.setBounds(470,325,220,30);
		signUpBtn.setBackground(new Color(119,85,163));
		signUpBtn.setForeground(Color.white);
		signUpBtn.setFocusable(false);

		//admin login
		adminloginbtn = new JButton("Admin Login");
		adminloginbtn.setBounds(470,360,220,30);
		adminloginbtn.setBackground(new Color(119,85,163));
		adminloginbtn.setForeground(Color.white);
		adminloginbtn.setFocusable(false);

		//exit btn
		extBtn = new JButton("Exit");
		extBtn.setBounds(470,395,220,30);
		extBtn.setBackground(new Color(119,85,163));
		extBtn.setForeground(Color.white);
		extBtn.setFocusable(false);

		//background
		loginPImg = new JLabel();
		loginPImg.setIcon(new ImageIcon("AllPicture/Log.jpg"));
		loginPImg.setBounds(0,-290,1902,1076);


		// frame add component
		loginFrame.add(usernl);
		loginFrame.add(usernl1);
		loginFrame.add(cpyrt);
		loginFrame.add(userpl);
		loginFrame.add(usernameText);
		loginFrame.add(passwordText);
		loginFrame.add(loginPTxt);
		loginFrame.add(adminloginbtn);
		loginFrame.add(loginBtn);
		loginFrame.add(signUpBtn);
		loginFrame.add(extBtn);
		loginFrame.add(loginPImg);
		
		// frame
		loginFrame.setResizable(false);

		loginFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		loginFrame.setLayout(null);
		loginFrame.setTitle("Local Bus Route");
		loginFrame.setSize(815,530);


		//button listener
		loginBtn.addActionListener(this);
		signUpBtn.addActionListener(this);
		adminloginbtn.addActionListener(this);
		extBtn.addActionListener(this);

		loginFrame.setVisible(true);
		loginFrame.setLocationRelativeTo(null);
	}
//action listener
	public void actionPerformed(ActionEvent e){
		 if(e.getSource()==loginBtn)
			{  
			

                String userName = usernameText.getText().toLowerCase(); // User Name 
                String userPass = passwordText.getText(); // Password

                if (userName.isEmpty() || userPass.isEmpty()) {
                    JOptionPane.showMessageDialog(null, "Please fill all of the fields.", "Warning!",
                            JOptionPane.WARNING_MESSAGE);
                } else {

                    try {
                        String userNameS = "Username : " + userName;
                        String passwordS = "Password : " + userPass;
                        BufferedReader reader = new BufferedReader(new FileReader(".\\Data\\user_data.txt"));

                        int totalLines = 0;
                        while (reader.readLine() != null)
                            totalLines++;
                        reader.close();

                        for (int i = 0; i <= totalLines; i++) {
                            String line = Files.readAllLines(Paths.get(".\\Data\\user_data.txt")).get(i);
                            if (line.equals(userNameS)) {
                                String line2 = Files.readAllLines(Paths.get(".\\Data\\user_data.txt")).get((i + 1));
                                if (line2.equals(passwordS)) {
                                    JOptionPane.showMessageDialog(null, "Login Successful.", "Local Bus Route",
                                            JOptionPane.INFORMATION_MESSAGE,icon);

                                    loginFrame.setVisible(false);
                                    new DashBoard();
                                    break;
                                }
                            }
                        }
                    } catch (Exception ex) {
                        JOptionPane.showMessageDialog(null, "Invalid User Name or Password!", "Warning!",
                                JOptionPane.WARNING_MESSAGE);
                    }

                }	
        }
        else if(e.getSource()==signUpBtn){
        	new SignUp();
        	loginFrame.setVisible(false);
        }
        else if(e.getSource()==adminloginbtn){
        	new AdminLogin();
        	loginFrame.setVisible(false);
        }
        else if(e.getSource()==extBtn){
        	System.exit(0);
        }
	}

}