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

public class AdminLogin implements ActionListener{
	JFrame adminLogin;
	private JLabel adminUserNameLabel,adminUserPassLabel,adminLogo,passLogo,welcomLvl,welcomLvl1,cpyrt,coverLogo;
	ImageIcon icon = new ImageIcon("ALLPicture/ok1.png");
	private JTextField adminUserNameTxt;
	private JPasswordField adminUserPassTxt;
	private JButton loginBtn,userloginbtn;
	private JButton extBtn;

	public AdminLogin(){
		adminLogin = new JFrame();

		//welcome label
		welcomLvl = new JLabel("Welcome");
		welcomLvl.setBounds(340,80,250,40);
		welcomLvl.setForeground(new Color(34,158,196));
		welcomLvl.setFont(new Font("Segoe UI", Font.BOLD, 35));
		adminLogin.add(welcomLvl);

		welcomLvl1 = new JLabel("Admin");
		welcomLvl1.setBounds(380,120,250,25);
		welcomLvl1.setForeground(new Color(38,188,255));
		welcomLvl1.setFont(new Font("Segoe UI", Font.BOLD, 25));
		adminLogin.add(welcomLvl1);

		//username Label
		adminUserNameLabel = new JLabel("Username");
		adminUserNameLabel.setBounds(300,270,150,20);
		adminUserNameLabel.setForeground(new Color(34,158,196));
		adminUserNameLabel.setFont(new Font("Segoe UI", Font.PLAIN, 20));
		adminLogin.add(adminUserNameLabel);

		//Admin Usertxt
		adminUserNameTxt = new JTextField();
		adminUserNameTxt.setBounds(300,300,220,25);
		adminUserNameTxt.setBorder(BorderFactory.createMatteBorder(0,0,1,0,new Color(34,158,196)));
		adminLogin.add(adminUserNameTxt);


		//admin pass label
		adminUserPassLabel = new JLabel("Password");
		adminUserPassLabel.setBounds(300,330,150,20);
		adminUserPassLabel.setForeground(new Color(34,158,196));
		adminUserPassLabel.setFont(new Font("Segoe UI", Font.PLAIN, 20));
		adminLogin.add(adminUserPassLabel);

		//admin pass txt
		adminUserPassTxt = new JPasswordField();
		adminUserPassTxt.setBounds(300,360,220,25);
		adminUserPassTxt.setBorder(BorderFactory.createMatteBorder(0,0,1,0,new Color(34,158,196)));
		adminLogin.add(adminUserPassTxt);

		// copy right label
		cpyrt = new JLabel("Copyright @2023, TEAM ROAR");
		cpyrt.setBounds(650,470,300,15);
		cpyrt.setForeground(Color.black);
		cpyrt.setFont(new Font("Segoe UI", Font.PLAIN, 10));
		adminLogin.add(cpyrt);

		//login btn
		loginBtn = new JButton("Login");
		loginBtn.setBounds(290,400,110,30);
		loginBtn.setBackground(new Color(34,158,196));
		loginBtn.setForeground(Color.white);
		
		//loginBtn.setBorder(new RoundedBorder(10));
		loginBtn.setFocusable(false);
		adminLogin.add(loginBtn);


		//userlogin btn
		userloginbtn = new JButton("User Login");
		userloginbtn.setBounds(425,400,110,30);
		userloginbtn.setBackground(new Color(34,158,196));
		userloginbtn.setForeground(Color.white);
		
		//loginBtn.setBorder(new RoundedBorder(10));
		userloginbtn.setFocusable(false);
		adminLogin.add(userloginbtn);


		/*adminLogo = new JLabel();
        adminLogo.setIcon(new ImageIcon("AllPicture/icon.png"));
        adminLogo.setBounds(525,275,80, 80);
        adminLogo.setForeground(new Color(34,158,196));
        adminLogo.setFont(new Font("Segoe UI", Font.PLAIN, 25));
        adminLogin.add(adminLogo);*/


        // background
		coverLogo = new JLabel();
		coverLogo.setIcon(new ImageIcon("AllPicture/adminlog.jpg"));
		coverLogo.setBounds(0,-290,1902,1076);
		adminLogin.add(coverLogo);


		//frame
		adminLogin.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		adminLogin.setLayout(null);
		adminLogin.setTitle("Local Bus Route");
		adminLogin.setSize(815,530);

		loginBtn.addActionListener(this);
		//signUpBtn.addActionListener(this);
		userloginbtn.addActionListener(this);

		adminLogin.setVisible(true);
		adminLogin.setLocationRelativeTo(null);

	}

	public void actionPerformed(ActionEvent e){
		 if(e.getSource()==loginBtn)
		{  
			

                String userName = adminUserNameTxt.getText().toLowerCase(); // User Name 
                String userPass = adminUserPassTxt.getText(); // Password

                if (userName.isEmpty() || userPass.isEmpty()) {
                    JOptionPane.showMessageDialog(null, "Please fill all of the fields.", "Warning!",
                            JOptionPane.WARNING_MESSAGE);
                } else {

                    try {
                        String userNameS = "Username : " + userName;
                        String passwordS = "Password : " + userPass;
                        BufferedReader reader = new BufferedReader(new FileReader(".\\Data\\admin_data.txt"));

                        int totalLines = 0;
                        while (reader.readLine() != null)
                            totalLines++;
                        reader.close();

                        for (int i = 0; i <= totalLines; i++) {
                            String line = Files.readAllLines(Paths.get(".\\Data\\admin_data.txt")).get(i);
                            if (line.equals(userNameS)) {
                                String line2 = Files.readAllLines(Paths.get(".\\Data\\admin_data.txt")).get((i + 1));
                                if (line2.equals(passwordS)) {
                                    JOptionPane.showMessageDialog(null, "Login Successful.", "Local Bus Route",
                                            JOptionPane.INFORMATION_MESSAGE,icon);

                                    
                                    new AdminDashboard();
                                    adminLogin.setVisible(false);
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
        else if(e.getSource()==userloginbtn){
        	new Login();
        	adminLogin.setVisible(false);
        }
       
	}

}

