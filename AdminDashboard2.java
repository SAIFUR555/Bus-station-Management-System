package Classes;

import javax.swing.*;  
import java.awt.*;
import java.util.*;
import java.lang.*;
import java.io.*;
import java.nio.file.*;
import java.awt.event.*;
import javax.swing.border.Border;
import java.awt.Color;
import java.awt.Font;

import static javax.swing.JOptionPane.showMessageDialog;

public class AdminDashboard2 implements ActionListener{
	JFrame adminDashboard2;
	private ImageIcon icon = new ImageIcon("ALLPicture/ok1.png");
	private JLabel usern,fname,lname,email1,username,password,adminPic,uselopic,wel,wel2;
	private JTextField usernTxt,fnameTxt,lnameTxt,email1Txt,usernameTxt,passwordTxt;
	private JButton showUserDetails,back,logout;
	private JRadioButton jusername,jemail;
	ButtonGroup bg1;
	private int pc = 0;

	public AdminDashboard2(){

		adminDashboard2 = new JFrame();

		// Search Text
		wel = new JLabel("Search User using Email or username");
		wel.setBounds(68,150,250,20);
		wel.setForeground(new Color(255,255,255));
		wel.setFont(new Font("Segoe UI", Font.BOLD, 12));
		adminDashboard2.add(wel);

		wel2 = new JLabel("User Details");
		wel2.setBounds(390,80,180,20);
		wel2.setForeground(new Color(255,255,255));
		wel2.setFont(new Font("Segoe UI", Font.BOLD, 20));
		adminDashboard2.add(wel2);

		//username label
		usern = new JLabel("Username");
		usern.setBounds(90,230,180,20);
		usern.setForeground(new Color(255,255,255));
		usern.setFont(new Font("Segoe UI", Font.PLAIN, 20));
		adminDashboard2.add(usern);

		//username txt box
		usernTxt = new JTextField();
		usernTxt.setBounds(90,260,180,20);
		usernTxt.setBorder(BorderFactory.createMatteBorder(0,0,2,0,new Color(59,44,118)));
		usernTxt.setBackground(new Color(103,82,162));
		usernTxt.setForeground(new Color(255,255,255));
		adminDashboard2.add(usernTxt);

		// Search btn
		showUserDetails = new JButton("Search User");
		showUserDetails.setBounds(85,310,180,30);
		showUserDetails.setBackground(new Color(34,158,196));
		showUserDetails.setForeground(Color.white);
		showUserDetails.setFocusable(false);
		adminDashboard2.add(showUserDetails);

		//back Button
        back = new JButton("<-");
        back.setBounds(8, 10, 90, 25);
        back.setFont(new Font("Segoe UI", Font.BOLD, 25));
        back.setForeground(new Color(0,0,0));
        //back.setCursor(new Cursor(Cursor.HAND_CURSOR));
        back.setFocusPainted(false);
        back.setBorder(BorderFactory.createEmptyBorder(4, 4, 4, 4));
        back.setCursor(new Cursor(Cursor.HAND_CURSOR));
        back.setContentAreaFilled(false);
        adminDashboard2.add(back);

        //logout Button
        logout = new JButton("Sign Out");
        logout.setBounds(500, 10, 90, 25);
        logout.setFont(new Font("Segoe UI", Font.BOLD, 16));
        logout.setForeground(new Color(255,255,255));
        //logout.setCursor(new Cursor(Cursor.HAND_CURSOR));
        logout.setFocusPainted(false);
        logout.setBorder(BorderFactory.createEmptyBorder(4, 4, 4, 4));
        logout.setCursor(new Cursor(Cursor.HAND_CURSOR));
        logout.setContentAreaFilled(false);
        adminDashboard2.add(logout);


		
		


/*
		cpyrt = new JLabel("Copyright @2023, TEAM ROAR");
		cpyrt.setBounds(650,470,300,15);
		cpyrt.setForeground(Color.black);
		cpyrt.setFont(new Font("Segoe UI", Font.PLAIN, 10));
		adminLogin.add(cpyrt);
*/
		//login btn
		JRadioButton jusername=new JRadioButton("UserName");    
		JRadioButton jemail=new JRadioButton("Email");    
		jusername.setBounds(75,190,100,30);    
		jemail.setBounds(200,190,100,30);
		jusername.setContentAreaFilled(false); 
		jemail.setContentAreaFilled(false);  
		jusername.setBorder(BorderFactory.createEmptyBorder(4, 4, 4, 4));
		jemail.setBorder(BorderFactory.createEmptyBorder(4, 4, 4, 4));  
		jusername.setFocusPainted(false);
		jemail.setFocusPainted(false);
		ButtonGroup bg=new ButtonGroup();    
		bg.add(jusername);bg.add(jemail);    
		adminDashboard2.add(jusername);adminDashboard2.add(jemail); 




		//fname
		fname = new JLabel("First Name");
		fname.setBounds(370,120,180,15);
		fname.setForeground(new Color(0,0,0));
		fname.setFont(new Font("Segoe UI", Font.PLAIN, 15));
		adminDashboard2.add(fname);

		fnameTxt = new JTextField();
		fnameTxt.setBounds(370,145,180,18);
		fnameTxt.setBorder(BorderFactory.createMatteBorder(0,0,2,0,new Color(59,44,118)));
		fnameTxt.setBackground(new Color(103,82,162));
		fnameTxt.setForeground(new Color(255,255,255));
		fnameTxt.setFont(new Font("Segoe UI", Font.BOLD, 15));
		fnameTxt.setEditable(false);
		adminDashboard2.add(fnameTxt);

		//lname
		lname = new JLabel("Last Name");
		lname.setBounds(370,170,180,15);
		lname.setForeground(new Color(0,0,0));
		lname.setFont(new Font("Segoe UI", Font.PLAIN, 15));
		adminDashboard2.add(lname);

		lnameTxt = new JTextField();
		lnameTxt.setBounds(370,200,180,18);
		lnameTxt.setBorder(BorderFactory.createMatteBorder(0,0,2,0,new Color(59,44,118)));
		lnameTxt.setBackground(new Color(103,82,162));
		lnameTxt.setForeground(new Color(255,255,255));
		lnameTxt.setFont(new Font("Segoe UI", Font.BOLD, 15));
		lnameTxt.setEditable(false);
		adminDashboard2.add(lnameTxt);

		//eamil
		email1 = new JLabel("Email");
		email1.setBounds(370,230,180,15);
		email1.setForeground(new Color(0,0,0));
		email1.setFont(new Font("Segoe UI", Font.PLAIN, 15));
		adminDashboard2.add(email1);

		email1Txt = new JTextField();
		email1Txt.setBounds(370,260,180,22);
		email1Txt.setBorder(BorderFactory.createMatteBorder(0,0,2,0,new Color(59,44,118)));
		email1Txt.setBackground(new Color(103,82,162));
		email1Txt.setForeground(new Color(255,255,255));
		email1Txt.setFont(new Font("Segoe UI", Font.BOLD, 15));
		email1Txt.setEditable(false);
		adminDashboard2.add(email1Txt);

		//username label and txt
		username = new JLabel("Username");
		username.setBounds(370,290,180,15);
		username.setForeground(new Color(0,0,0));
		username.setFont(new Font("Segoe UI", Font.PLAIN, 15));
		adminDashboard2.add(username);

		usernameTxt = new JTextField();
		usernameTxt.setBounds(370,320,180,18);
		usernameTxt.setBorder(BorderFactory.createMatteBorder(0,0,2,0,new Color(59,44,118)));
		usernameTxt.setBackground(new Color(103,82,162));
		usernameTxt.setForeground(new Color(255,255,255));
		usernameTxt.setFont(new Font("Segoe UI", Font.BOLD, 15));
		usernameTxt.setEditable(false);
		adminDashboard2.add(usernameTxt);

		// password label and txt
		password = new JLabel("password");
		password.setBounds(370,340,180,25);
		password.setForeground(new Color(0,0,0));
		password.setFont(new Font("Segoe UI", Font.PLAIN, 15));
		adminDashboard2.add(password);

		passwordTxt = new JTextField();
		passwordTxt.setBounds(370,370,180,18);
		passwordTxt.setBorder(BorderFactory.createMatteBorder(0,0,2,0,new Color(59,44,118)));
		passwordTxt.setBackground(new Color(103,82,162));
		passwordTxt.setForeground(new Color(255,255,255));
		passwordTxt.setFont(new Font("Segoe UI", Font.BOLD, 15));
		passwordTxt.setEditable(false);
		adminDashboard2.add(passwordTxt);



		bg1 = new ButtonGroup();
		bg1.add(jusername);
		bg1.add(jemail);

		//logopic
		uselopic = new JLabel();
		uselopic.setIcon(new ImageIcon("AllPicture/usl.png"));
		uselopic.setBounds(150,80,50,50);
		adminDashboard2.add(uselopic);



		// background pic
		adminPic = new JLabel();
		adminPic.setIcon(new ImageIcon("AllPicture/admin2.png"));
		adminPic.setBounds(0,0,620,520);
		adminDashboard2.add(adminPic);


		//frame init
		adminDashboard2.setLayout(null);
		adminDashboard2.setTitle("Local Bus Route");
		adminDashboard2.setSize(630,530);
		//adminDashboard.setBackground(new Color(152,235,152));
		adminDashboard2.setResizable(false);
		adminDashboard2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		adminDashboard2.setLocationRelativeTo(null);
		
	
		// button listener
		jusername.addActionListener(this);
		jemail.addActionListener(this);
		logout.addActionListener(this);
		back.addActionListener(this);
		showUserDetails.addActionListener(this);

		adminDashboard2.setVisible(true);

		jusername.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if (e.getSource() == jusername) {
                    pc = 1;
                }
            }
        });

        jemail.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if (e.getSource() == jemail) {
                    pc = 2;
                }
            }
        });

	}

	// action listener
	public void actionPerformed(ActionEvent e){

		

		//Search button
		if(e.getSource()==showUserDetails){
			
        	String file = ".\\Data\\user_data.txt";

                String userName = usernTxt.getText().toLowerCase(); // User Name 
               
                if (userName.isEmpty()) {
                    JOptionPane.showMessageDialog(null, "Please fill all of the fields.", "Warning!",
                            JOptionPane.WARNING_MESSAGE);
                } else {

                    if(pc==1){
                    	try {
	                        String userNameS = "Username : " + userName;
	                        int check = 1;
	                        BufferedReader reader = new BufferedReader(new FileReader(".\\Data\\user_data.txt"));

	                        int totalLines = 0;
	                        while (reader.readLine() != null)
	                            totalLines++;
	                        reader.close();

	                        for (int i = 0; i <= totalLines; i++) {
	                            String line = Files.readAllLines(Paths.get(".\\Data\\user_data.txt")).get(i);
	                            if (line.equals(userNameS)) {
	                            	JOptionPane.showMessageDialog(null, "User Found.", "Local Bus Route",
	                                            JOptionPane.INFORMATION_MESSAGE,icon);
                                for (int j = (i-3); j <= totalLines; j++) {
					                
					                String line1 = Files.readAllLines(Paths.get(file)).get(j);
					                String x = line1.substring(0,10);
					                if (x.equals("First Name")) {
					                    fnameTxt.setText(Files.readAllLines(Paths.get(file)).get(j).substring(13)) ; // First Name
					                    lnameTxt.setText(Files.readAllLines(Paths.get(file)).get((j + 1)).substring(12)) ; // Last Name
					                    email1Txt.setText(Files.readAllLines(Paths.get(file)).get((j + 2)).substring(8)) ; // Email
					                    usernameTxt.setText(Files.readAllLines(Paths.get(file)).get((j + 3)).substring(11)) ; // UserName
					                    passwordTxt.setText(Files.readAllLines(Paths.get(file)).get((j + 4)).substring(11)) ; // Password
					                    
					                 
                					}
                					break;
            					}
            					break;
                            }

                        }
                    }
                    catch (Exception ex) {
                    	JOptionPane.showMessageDialog(null, "NO USER FOUND.", "Warning!", JOptionPane.WARNING_MESSAGE);
                        ex.printStackTrace();
                    }

                    }
                    else if(pc == 2){
                    	try {
                        String userNameS = "Email : " + userName;
                        int check = 1;
                        BufferedReader reader = new BufferedReader(new FileReader(".\\Data\\user_data.txt"));

                        int totalLines = 0;
                        while (reader.readLine() != null)
                            totalLines++;
                        reader.close();

                        for (int i = 0; i <= totalLines; i++) {
                            String line = Files.readAllLines(Paths.get(".\\Data\\user_data.txt")).get(i);
                            if (line.equals(userNameS)) {
                            	JOptionPane.showMessageDialog(null, "User Found.", "Local Bus Route",
                                            JOptionPane.INFORMATION_MESSAGE,icon);
                                for (int j = (i-2); j <= totalLines; j++) {
					                
					                String line1 = Files.readAllLines(Paths.get(file)).get(j);
					                String x = line1.substring(0,10);
					                if (x.equals("Email")) {
					                    fnameTxt.setText(Files.readAllLines(Paths.get(file)).get(j).substring(13)) ; // First Name
					                    lnameTxt.setText(Files.readAllLines(Paths.get(file)).get((j + 1)).substring(12)) ; // Last Name
					                    email1Txt.setText(Files.readAllLines(Paths.get(file)).get((j + 2)).substring(8)) ; // Email
					                    usernameTxt.setText(Files.readAllLines(Paths.get(file)).get((j + 3)).substring(11)) ; // UserName
					                    passwordTxt.setText(Files.readAllLines(Paths.get(file)).get((j + 4)).substring(11)) ; // Password
					                    
					                 
                					}
                					break;
            					}
            					break;
                            }

                        }
                    }
                    catch (Exception ex) {
                    	JOptionPane.showMessageDialog(null, "NO USER FOUND.", "Warning!", JOptionPane.WARNING_MESSAGE);
                        ex.printStackTrace();
                    }

                    }

                }
		
			
		}else if(e.getSource()==back){
		 	new AdminDashboard();
		 	adminDashboard2.setVisible(false);
		 }
		 else if(e.getSource()==logout){
		 	new Login();
		 	adminDashboard2.setVisible(false);
		 }
		
	}
}