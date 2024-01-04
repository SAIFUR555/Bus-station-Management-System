package Classes;

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

import static javax.swing.JOptionPane.showMessageDialog;

public class AdminDashboard1 implements ActionListener{

	JFrame adminDashboard1;
	private JButton logout,back;
	private JLabel admin1Img,infoTxt;
	private JPanel panel1;
    private JScrollPane scroll;
    private JTable table;
    private DefaultTableModel model;

    private String[] column = { "First Name", "Last Name", "Email", "Username", "Password" };
    private String[] rows = new String[7];

	public AdminDashboard1(){
		adminDashboard1 = new JFrame();


        


		//Panel
		panel1 = new JPanel();
        panel1.setBounds(0, 0, 530, 440);
        panel1.setBackground(new Color(25, 118, 211));

        //logout Button
        logout = new JButton("Sign Out");
        logout.setBounds(800, 10, 90, 25);
        logout.setFont(new Font("Segoe UI", Font.BOLD, 16));
        logout.setForeground(new Color(119,85,163));
        //logout.setCursor(new Cursor(Cursor.HAND_CURSOR));
        logout.setFocusPainted(false);
        logout.setBorder(BorderFactory.createEmptyBorder(4, 4, 4, 4));
        logout.setCursor(new Cursor(Cursor.HAND_CURSOR));
        logout.setContentAreaFilled(false);
        adminDashboard1.add(logout);

        //back Button
        back = new JButton("<-");
        back.setBounds(15, 10, 90, 25);
        back.setFont(new Font("Segoe UI", Font.BOLD, 25));
        back.setForeground(new Color(119,85,163));
        //back.setCursor(new Cursor(Cursor.HAND_CURSOR));
        back.setFocusPainted(false);
        back.setBorder(BorderFactory.createEmptyBorder(4, 4, 4, 4));
        back.setCursor(new Cursor(Cursor.HAND_CURSOR));
        back.setContentAreaFilled(false);
        adminDashboard1.add(back);

        // table
        table = new JTable();
        model = new DefaultTableModel();
        model.setColumnIdentifiers(column);

        table.setModel(model);
        table.setSelectionBackground(Color.decode("#8AC5FF"));
        table.setBackground(Color.WHITE);
        table.setRowHeight(30);
        table.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
        table.getColumnModel().getColumn(0).setPreferredWidth(120);
        table.getColumnModel().getColumn(1).setPreferredWidth(120);
        table.getColumnModel().getColumn(2).setPreferredWidth(300);
        table.getColumnModel().getColumn(3).setPreferredWidth(220);
        table.getColumnModel().getColumn(4).setPreferredWidth(200);


        //Scroll Btn
        scroll = new JScrollPane(table);
        scroll.setBounds(400, 50, 530, 440);
        scroll.setBackground(Color.cyan);
        adminDashboard1.add(scroll);


        // data read and input
        String file = ".\\Data\\user_data.txt";
        String temp = ".\\Data\\temp.txt";

        // To input data in the table
        try {

            BufferedReader reader = new BufferedReader(new FileReader(file));
            int totalLines = 0;
            while (reader.readLine() != null)
                totalLines++;
            reader.close();

            for (int i = 0; i <= totalLines; i++) {
                String line = Files.readAllLines(Paths.get(file)).get(i);
                String x = line.substring(0,10);
                if (x.equals("First Name")) {
                    rows[0] = Files.readAllLines(Paths.get(file)).get(i).substring(13); // First Name
                    rows[1] = Files.readAllLines(Paths.get(file)).get((i + 1)).substring(12); // Last Name
                    rows[2] = Files.readAllLines(Paths.get(file)).get((i + 2)).substring(8); // Email
                    rows[3] = Files.readAllLines(Paths.get(file)).get((i + 3)).substring(11); // Username
                    rows[4] = Files.readAllLines(Paths.get(file)).get((i + 4)).substring(11); // Password
                    model.addRow(rows);
                }
            }

        } catch (Exception ex) {
            System.out.println(ex);
        }

        // background img
		admin1Img = new JLabel();
		admin1Img.setIcon(new ImageIcon("AllPicture/Admin1.png"));
		admin1Img.setBounds(0,-20,400,530);
		//admin1Img.setBackground(Color.YELLOW);
		adminDashboard1.add(admin1Img);

        //btn listener
        logout.addActionListener(this);
        back.addActionListener(this);
		
        //frame init
		adminDashboard1.setTitle("Local Bus Route");
		adminDashboard1.setSize(950,530);
		adminDashboard1.setBackground(new Color(152,235,152));
		adminDashboard1.setLayout(null);
		adminDashboard1.setResizable(false);
		adminDashboard1.setLocationRelativeTo(null);
		adminDashboard1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);


		//loginBtn.addActionListener(this);
		//signUpBtn.addActionListener(this);
		//adminloginbtn.addActionListener(this);
		//extBtn.addActionListener(this);

		adminDashboard1.setVisible(true);
		
	}


    //Action Listener
    public void actionPerformed(ActionEvent e){
         if(e.getSource()==logout)
        {

            new Login();
            adminDashboard1.setVisible(false);
        }
        else if(e.getSource()==back)
        {

            new AdminDashboard();
            adminDashboard1.setVisible(false);
        }
    }
	
}