package QAUEstateManagementSystem;

import javax.swing.*;

import java.awt.event.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.awt.*;

@SuppressWarnings("serial")
public class Login extends JFrame implements ActionListener
{

	JPanel p,p1,p2,p3;
	JLabel l,l1,luname,lpass;
	JTextField tu;
	JButton b,b1,back;
	JPasswordField jp;
	Login()
	{
		p = new JPanel();
		p1 = new JPanel();
		p2 = new JPanel();
		p3 = new JPanel();
		
		l = new JLabel();
		l1 = new JLabel();
		
		luname = new JLabel("User Name");
		lpass = new JLabel("Password"); 
	
		tu = new JTextField();
		jp = new JPasswordField();
	
		back = new JButton("x");
		back.setBackground(new Color(170,214,225));
		back.setBounds(710,0,40,30);
		back.addActionListener(this);
		
		b = new JButton("Create an account");
		b.setFont(new Font("DIALOG", Font.BOLD, 20)); 
		b.setBackground(new Color(124,252,0));
		b.addActionListener(this);
		
		b1 = new JButton("Log in");
		b1.setFont(new Font("DIALOG", Font.BOLD, 20)); 
		b1.setBackground(new Color(0,255,255));
		b1.addActionListener(this);
		
	
	    l.setText("Welcome to QAU Estate Management System");
	   // l.setHorizontalTextPosition(JLabel.LEFT);
	    l.setFont(new Font("Serif", Font.BOLD, 20)); 
	    l.setBounds(200,0,400,30);
	    l.setForeground(Color.white);
		p.setBackground(Color.black);
		p.setBounds(0,0,750,30);
		p.setLayout(null);
		p.add(l);
		p.add(back);
		
		
		
		l1.setText("Please enter username & password to login");
		l1.setFont(new Font("MV Boli", Font.BOLD, 20)); 
		l1.setBounds(0,33,710,20);
		p1.setBackground(new Color(173,216,230));
		p1.setBounds(0,31,750,40);
		p1.setLayout(new GridLayout());
		p1.add(l1);
		
		
		luname.setBounds(90,50,80,30);
		tu.setBounds(90,80,240,40);
		lpass.setBounds(90,120,80,30); 
		jp.setBounds(90,150,240,40);
		b1.setBounds(90,210,240,35);
		b.setBounds(90,260,240,35);
		
		p3.setBounds(120,50,400,350);
		p3.setLayout(null);
		p3.setBackground(new Color(173,216,230));	
		p3.add(luname);p3.add(tu);
		p3.add(lpass);p3.add(jp);
		
		p3.add(b1);
		p3.add(b);
		
		p2.setBackground(new Color(173,216,230));
		p2.setBounds(0,70,750,450);
		p2.setLayout(null);
		p2.add(p3);
		
		
		
		setSize(750,750);
		setVisible(true);
		setLayout(null);
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		add(p);
		add(p1);
		add(p2);
	}

	

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		new Login();

	}


	@SuppressWarnings("deprecation")
	@Override
	public void actionPerformed(ActionEvent e)
	{
		JButton btn = (JButton)e.getSource();
		String txt = btn.getText();
		if(txt == "Log in") 
		{
			try
			{
				String RegNo = tu.getText();
				String pass = jp.getText();
				String url = "jdbc:ucanaccess://E://BS Folder//5th semester//SC LAB//QAU_Estate_Management_System//src//QAUEstateManagementSystem/Database.accdb";
				Connection conObj = DriverManager.getConnection(url);
				Statement st = conObj.createStatement();
				ResultSet rt = st.executeQuery("SELECT * from RegistrationUser");
				while(rt.next())
				{
					
					if(rt.getString(4).equals(RegNo) && rt.getString(5).equals(pass))
					{
						dispose();
						new menu();
					}
			}
			}
			catch(Exception q)
			{
			System.out.println("data is not corrrect");	
			}
			
		}
		else
			if(txt=="x")
		{
			dispose();
			new Home();
		}
			else
				if(txt=="Create an account")
				{
					dispose();
					new Registration();
				}
		
		
	}


}

