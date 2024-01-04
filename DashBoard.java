import javax.swing.*;  
import java.awt.*;
import java.util.*;
import java.lang.*;
import java.io.*;
import java.nio.file.*;
import java.awt.event.*;
import javax.swing.table.*;
import javax.swing.border.Border;
import java.awt.Color;
import java.awt.Font;
import java.time.LocalDate;
import java.text.SimpleDateFormat;  
import java.util.Date;
import static javax.swing.JOptionPane.showMessageDialog;
public class DashBoard implements ActionListener{
	JFrame dashBoard;
	JTextArea textArea;  
    JScrollPane scrollableTextArea;
	JLabel showBusData,showBusData1,welcome,welcome2,welcome3,frmLvl,toLvl,dashImg,dateLvl,logo;
	JTextField datefield,rent;
	JComboBox strtCombo,endCombo;
	JButton showBuses,logoutBtn,backbtn;
	String[] location = {"Abdullahpur","Airport","Khilkhet","Mohakhali","Badda"};
	double[] distance = {0,3,5.7,14,11};
	int y;
    int z;

	public DashBoard(){
		dashBoard = new JFrame();
		
		//Logo
		logo = new JLabel();
		logo.setIcon(new ImageIcon("ALLPicture/logolast.png"));
		logo.setBounds(55,15,100,100);
		dashBoard.add(logo);
		
		//Label Text
		welcome = new JLabel("Find Buses");
		welcome.setBounds(130, 45, 350, 20);
		welcome.setFont(new Font("Arial", Font.BOLD, 20));
		welcome.setForeground(Color.black);
		dashBoard.add(welcome);

		welcome3 = new JLabel("Where you want to go!");
		welcome3.setBounds(130, 65, 350, 20);
		welcome3.setFont(new Font("Arial", Font.BOLD, 15));
		welcome3.setForeground(Color.black);
		dashBoard.add(welcome3);

		welcome2 = new JLabel("Find Local Buses for different Road in Dhaka City");
		welcome2.setBounds(70, 110, 350, 15);
		welcome2.setFont(new Font("Arial", Font.PLAIN, 13));
		welcome2.setForeground(Color.black);
		dashBoard.add(welcome2);

		//Strt Label
		frmLvl = new JLabel("From");
		frmLvl.setBounds(90, 145, 350, 15);
		frmLvl.setFont(new Font("Arial", Font.PLAIN, 15));
		frmLvl.setForeground(new Color(0,0,0));
		dashBoard.add(frmLvl);

		//Start Combo
		String[] from = {"From", "Abdullahpur", "Airport", "Khilkhet","Mohakhali","Badda"};
		strtCombo = new JComboBox(from);
		strtCombo.setBounds(90, 165, 230, 25);
		strtCombo.setForeground(Color.black);
		dashBoard.add(strtCombo);

		//To Label
		toLvl = new JLabel("Destination");
		toLvl.setBounds(90,200,230,15);
		toLvl.setFont(new Font("Arial", Font.PLAIN, 15));
		toLvl.setForeground(Color.black);
		dashBoard.add(toLvl);

		//To Combo
		String[] to = {"To", "Abdullahpur", "Airport", "Khilkhet","Mohakhali","Badda"};
		endCombo = new JComboBox(to);
		endCombo.setBounds(90,220,230,25);
		endCombo.setForeground(Color.black);
		dashBoard.add(endCombo);

		// Date lable and field
		dateLvl = new JLabel("Date:");
		dateLvl.setBounds(90, 250, 230, 30);
		dashBoard.add(dateLvl);

		datefield = new JTextField();
		datefield.setBounds(90, 280, 230, 30);
		datefield.setEditable(false);
		dashBoard.add(datefield);
		LocalDate date = LocalDate.now();
		datefield.setText("" + date);

		//Show Button
		showBuses = new JButton("Available Bus");
		showBuses.setBounds(80, 325, 120, 30);
		showBuses.setBackground(new Color(96,191,193));
		showBuses.setFocusable(false);
		showBuses.setVisible(true);
		dashBoard.add(showBuses);


		//Back Button
		backbtn = new JButton("Back");
		backbtn.setBounds(220,325,120,30);
		backbtn.setBackground(new Color(96,191,193));
		backbtn.setFocusable(false);
		backbtn.setVisible(true);
		dashBoard.add(backbtn);


		// Logout Button
		logoutBtn = new JButton("LogOut");
		logoutBtn.setBounds(150,360,120,30);
		logoutBtn.setBackground(new Color(96,191,193));
		logoutBtn.setFocusable(false);
		logoutBtn.setVisible(true);
		dashBoard.add(logoutBtn);


		//Scroll Area Label

		showBusData = new JLabel("Show Available Local buses,");
		showBusData.setBounds(550, 65, 350, 20);
		showBusData.setFont(new Font("Arial", Font.BOLD, 15));
		showBusData.setForeground(Color.black);
		dashBoard.add(showBusData);

		showBusData1 = new JLabel("To your Destination");
		showBusData1.setBounds(575, 90, 350, 20);
		showBusData1.setFont(new Font("Arial", Font.BOLD, 15));
		showBusData1.setForeground(Color.black);
		dashBoard.add(showBusData1);

	/*	//back Button
        back = new JButton("<-");
        back.setBounds(8, 10, 90, 25);
        back.setFont(new Font("Segoe UI", Font.BOLD, 25));
        back.setForeground(new Color(0,0,0));
        //back.setCursor(new Cursor(Cursor.HAND_CURSOR));
        back.setFocusPainted(false);
        back.setBorder(BorderFactory.createEmptyBorder(4, 4, 4, 4));
        back.setCursor(new Cursor(Cursor.HAND_CURSOR));
        back.setContentAreaFilled(false);
       	dashBoard.add(back);

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
        dashBoard.add(logout);

*/
       



		//ScrollBar Text Area
		dashBoard.getContentPane().setLayout(new FlowLayout());  
        textArea = new JTextArea(20, 20); 
        textArea.setFont(new Font("Segoe UI", Font.PLAIN, 15)); 
        //textArea.setBounds(500,120,200,200);
        textArea.setEditable(false);
        //textArea.setText("jhjdhjhj");
        JScrollPane scrollableTextArea = new JScrollPane(textArea);  
        scrollableTextArea.setBounds(494,120,300,270);
  		scrollableTextArea.setFont(new Font("Segoe UI", Font.PLAIN, 15));
  		//scrollableTextArea.setEditable(false);
        //scrollableTextArea.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);  
        scrollableTextArea.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);  
        dashBoard.getContentPane().add(scrollableTextArea);



        rent = new JTextField();
		rent.setBounds(494, 420, 300, 30);
		rent.setEditable(false);
		//rent.setText("4");
		dashBoard.add(rent);  

        //Button Action Listener
		logoutBtn.addActionListener(this);
		showBuses.addActionListener(this);
		backbtn.addActionListener(this);

		//Frame Image
		dashImg = new JLabel();
		dashImg.setIcon(new ImageIcon("ALLPicture/Dash Last.jpg"));
		dashImg.setBounds(0,-290,1902,1076);
		dashBoard.add(dashImg);


		// Frame
		dashBoard.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		dashBoard.setSize(865,540);
		dashBoard.setLocationRelativeTo(null);
		dashBoard.setLayout(null);
		dashBoard.setResizable(false);
		dashBoard.getContentPane().setBackground(new Color(204,255,229));
		dashBoard.setVisible(true);
		



	}



	public void actionPerformed(ActionEvent e) {   
        /*if(e.getSource()==logoutBtn)
		{  
			new Login();
			dashBoard.setVisible(false);
			//System.exit(0);


					// distance and rent
	            		
        			for(int i = 0; i<location.length;i++){
        				if(x.equals(location[i])){
        					 y = i;
        					rent.setText("e");
        					break;
        				}
        			}
        			for(int i = 0; i<distance.length;i++){
        				if(y == distance[i] ){
        					double z= distance[i]*2.45;
        					String str = Double.toString(z);
        					rent.setText(str);
        					break;
        				}
        			}	
			
        }  	*/
        if(e.getSource()==showBuses){

			if (strtCombo.getSelectedIndex()==endCombo.getSelectedIndex()) {
				JOptionPane.showMessageDialog(null,  "You have selected same Departure and Arrival", "WARNING",JOptionPane.WARNING_MESSAGE);
			}
			else if (strtCombo.getSelectedIndex()==0) {
				JOptionPane.showMessageDialog(null, " Please select departure", "WARNING!!",JOptionPane.WARNING_MESSAGE);
			}
			else if (endCombo.getSelectedIndex()==0) {
				JOptionPane.showMessageDialog(null, " Please select Arival", "WARNING!!",JOptionPane.WARNING_MESSAGE);
			}
			else {

					/*
						String x = endCombo.getSelectedItem().toString();
							try {
			            BufferedReader reader = new BufferedReader(new FileReader(".\\Data\\Buses.txt"));
			            String line = reader.readLine();
			            while (line != null) {
			                if (line.contains(x)) {
			                    textArea.setText(line);
			                }
			               // line = reader.readLine();
			            }
			            reader.close();
			        } catch (IOException ex) {
			            ex.printStackTrace();
			        }
					*/
				      
				
					//File read
					String x = endCombo.getSelectedItem().toString();
					String x1 = strtCombo.getSelectedItem().toString();
					//String y = endCombo.getSelectedItem();
					try (BufferedReader br = new BufferedReader(new FileReader(".\\Data\\Buses.txt"))) {
            		String line;
	            	while ((line = br.readLine()) != null) {
	            		//line = line.substring(0,15);
		                if (line.contains(x)) {
		                		textArea.setText(line);
		                    	break;
		                	}


	            		}
	            		

	            		//Distance Calculation
	            		for(int i =0;i<location.length;i++){
        				if(location[i].equals(x)){
        						y=i;
        						//System.out.println(y);
        				        }
        			   }
        			   for(int j =0;j<location.length;j++){
        			   	if(location[j].equals(x1)){
        			   		z =j;
        			   		//System.out.println(z);
        			   	}
        			   }

        			   //vara
        			   double rents = (distance[y]-distance[z])*2.40;
        			   if(rents <=10){
        			   	//String s=String.valueOf(rents);
        			   	rent.setText("10");
        			   }else if(rents > 10){
        			   	String s=String.valueOf(rents);
        			   	rent.setText(s);
        			   }
        			   
					

        			}
        			catch(IOException c) {
            			c.printStackTrace();
        			}

        			

        	}
		}
        else if(e.getSource()==backbtn)
		{  
			new Login();
			dashBoard.setVisible(false);
			//System.exit(0);
			
        } 
        else if(e.getSource()==logoutBtn)
		{  
			new Login();
			dashBoard.setVisible(false);
			//System.exit(0);
			
        }
	}
}


