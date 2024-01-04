package Classes;

import java.awt.*;  
import javax.swing.*;
import java.util.*;
import java.lang.*;
import java.io.*;
import java.nio.file.*;
import java.awt.event.*;
import javax.swing.table.*;
import javax.swing.border.Border;
import java.awt.Color;
import java.awt.Font;
import java.awt.Panel;
import static javax.swing.JOptionPane.showMessageDialog;

public class AdminDashboard3 implements ActionListener{
	JFrame adminDashboard3;
	//JPanel addPanel,dltPanel;
	JButton addUser,back,logout;
	private ImageIcon icon = new ImageIcon("ALLPicture/ok1.png");
	JLabel addUsers,fname,lname,email,userName,userPass,cvrimg;
	JTextField fnameTxt,lnameTxt,emailTxt,userNameTxt,userPassword;

	public AdminDashboard3(){
		adminDashboard3 = new JFrame();
        




		//Label
		addUsers = new JLabel("ADD New User");
		addUsers.setBounds(500,40,185,40);
		addUsers.setForeground(new Color(253,186,87));
		addUsers.setFont(new Font("Segoe UI", Font.BOLD, 25));
		addUsers.setBorder(BorderFactory.createMatteBorder(0,0,1,0,new Color(253,186,87)));
		adminDashboard3.add(addUsers);

		//User Add
		fname = new JLabel("First Name");
		fname.setBounds(480,100,200,30);
		fname.setForeground(Color.black);
		fname.setFont(new Font("Segoe UI", Font.PLAIN, 18));
		adminDashboard3.add(fname);

		fnameTxt = new JTextField();
		fnameTxt.setBounds(480,130,200,30);
		fnameTxt.setBackground(new Color(101,155,211));
		fnameTxt.setFont(new Font("Segoe UI", Font.PLAIN, 18));
		fnameTxt.setBorder(BorderFactory.createMatteBorder(0,0,1,0,new Color(255,255,255)));
		adminDashboard3.add(fnameTxt);

		
		lname = new JLabel("Last Name");
		lname.setBounds(480,160,200,30);
		lname.setForeground(Color.black);
		lname.setFont(new Font("Segoe UI", Font.PLAIN, 18));
		adminDashboard3.add(lname);

		lnameTxt = new JTextField();
		lnameTxt.setBounds(480,190,200,30);
		lnameTxt.setBackground(new Color(101,155,211));
		lnameTxt.setFont(new Font("Segoe UI", Font.PLAIN, 18));
		lnameTxt.setBorder(BorderFactory.createMatteBorder(0,0,1,0,new Color(255,255,255)));
		adminDashboard3.add(lnameTxt);


		userName = new JLabel("Username");
		userName.setBounds(480,220,200,30);
		userName.setForeground(Color.black);
		userName.setFont(new Font("Segoe UI", Font.PLAIN, 18));
		adminDashboard3.add(userName);


		userNameTxt = new JTextField();
		userNameTxt.setBounds(480,250,200,30);
		userNameTxt.setBackground(new Color(101,155,211));
		userNameTxt.setFont(new Font("Segoe UI", Font.PLAIN, 18));
		userNameTxt.setBorder(BorderFactory.createMatteBorder(0,0,1,0,new Color(255,255,255)));
		adminDashboard3.add(userNameTxt);


		email = new JLabel("Email");
		email.setBounds(480,280,200,30);
		email.setForeground(Color.black);
		email.setFont(new Font("Segoe UI", Font.PLAIN, 18));
		adminDashboard3.add(email);

		emailTxt = new JTextField();
		emailTxt.setBounds(480,310,200,30);
		emailTxt.setBackground(new Color(101,155,211));
		emailTxt.setFont(new Font("Segoe UI", Font.PLAIN, 18));
		emailTxt.setBorder(BorderFactory.createMatteBorder(0,0,1,0,new Color(255,255,255)));
		adminDashboard3.add(emailTxt);


		
		
		userPass = new JLabel("Password");
		userPass.setBounds(480,340,200,30);
		userPass.setForeground(Color.black);
		userPass.setFont(new Font("Segoe UI", Font.PLAIN, 18));
		

		userPassword = new JPasswordField();
		userPassword.setBounds(480,370,200,30);
		userPassword.setBackground(new Color(101,155,211));
		userPassword.setFont(new Font("Segoe UI", Font.PLAIN, 18));
		userPassword.setBorder(BorderFactory.createMatteBorder(0,0,1,0,new Color(255,255,255)));
		adminDashboard3.add(userPassword);
		adminDashboard3.add(userPass);




		//button
		addUser = new JButton("ADD User");
        addUser.setBounds(490, 420, 180,25);
        addUser.setFont(new Font("Segoe UI", Font.BOLD, 16));
        addUser.setForeground(new Color(255,255,255));
        addUser.setBackground(new Color(202,71,47));
		
        //logout.setCursor(new Cursor(Cursor.HAND_CURSOR));
        addUser.setFocusPainted(false);
        addUser.setBorder(BorderFactory.createEmptyBorder(4, 4, 4, 4));
        addUser.setCursor(new Cursor(Cursor.HAND_CURSOR));
		
        //addUser.setContentAreaFilled(false);
        adminDashboard3.add(addUser);

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
        adminDashboard3.add(back);

        //logout Button
        logout = new JButton("Sign Out");
        logout.setBounds(700, 10, 90, 25);
        logout.setFont(new Font("Segoe UI", Font.BOLD, 16));
        logout.setForeground(new Color(255,255,255));
		
        //logout.setCursor(new Cursor(Cursor.HAND_CURSOR));
        logout.setFocusPainted(false);
        logout.setBorder(BorderFactory.createEmptyBorder(4, 4, 4, 4));
        logout.setCursor(new Cursor(Cursor.HAND_CURSOR));
        logout.setContentAreaFilled(false);
        adminDashboard3.add(logout);


                




		//cover image
		cvrimg = new JLabel();
		cvrimg.setIcon(new ImageIcon("AllPicture/admin3.jpg"));
		cvrimg.setBounds(0,-20,820,530);
		
		//admin1Img.setBackground(Color.YELLOW);
		adminDashboard3.add(cvrimg);



		
		 //frame init
		adminDashboard3.setResizable(false);

		adminDashboard3.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		adminDashboard3.setLayout(null);
		adminDashboard3.setTitle("Local Bus Route");
		adminDashboard3.setSize(815,530);


		//button listener
		addUser.addActionListener(this);
		back.addActionListener(this);
		
		//adminloginbtn.addActionListener(this);
		//extBtn.addActionListener(this);

		adminDashboard3.setVisible(true);
		adminDashboard3.setLocationRelativeTo(null);


	}



	public void actionPerformed(ActionEvent e){
		 if(e.getSource()==addUser){

				String firstName = fnameTxt.getText(); // First Name
				String lastName = lnameTxt.getText(); // Last Name
                String email = emailTxt.getText().toLowerCase(); // User Name
                String username = userNameTxt.getText(); // Email
                String upassword = userPassword.getText(); // Password

                if (username.isEmpty() || upassword.isEmpty()) {
                    JOptionPane.showMessageDialog(null, "Please fill all of the fields.", "Warning!",
                            JOptionPane.WARNING_MESSAGE);
                } else {
                    //result = Integer.parseInt(tf5.getText());
                    if (firstName.isEmpty() || lastName.isEmpty() || email.isEmpty() || username.isEmpty() || upassword.isEmpty()) {
                        JOptionPane.showMessageDialog(null, "Please fill all of the fields.", "Warning!",JOptionPane.WARNING_MESSAGE);
                    }else {

                        try {
                            File file = new File(".\\Data\\user_data.txt");
                            if (!file.exists()) {
                                file.createNewFile();
                            }
                            FileWriter fw = new FileWriter(file, true);
                            BufferedWriter bw = new BufferedWriter(fw);
                            PrintWriter pw = new PrintWriter(bw);

                            pw.println("First Name : " + firstName);
                            pw.println("Last Name : " + lastName);
                            pw.println("Email : " + email);
                            pw.println("Username : " + username);
                            pw.println("Password : " + upassword);
                            pw.println("===============================================");
                            pw.close();

                        } catch (Exception ex) {
                            System.out.print(ex);
                        }

                        JOptionPane.showMessageDialog(null, "User Added","User Added", JOptionPane.INFORMATION_MESSAGE,icon);
                        	
                        	new AdminDashboard();
		 					adminDashboard3.setVisible(false);
                    }
                }
            
			
        
		 }else if(e.getSource()==back){
		 	new AdminDashboard();
		 	adminDashboard3.setVisible(false);
		 }
		 else if(e.getSource()==logout){
		 	new Login();
		 	adminDashboard3.setVisible(false);
		 }
		}
}