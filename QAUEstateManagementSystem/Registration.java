package QAUEstateManagementSystem;

import javax.swing.*;

import java.awt.*;
import java.awt.event.*;
import java.sql.*;

@SuppressWarnings("serial")
public class Registration extends JFrame implements ActionListener
{
	
	JPanel p,p1,p2;
	JLabel l,l1,lname,lemail,luname,lpass,lcpass,login;
	JTextField tn,te,tu;
	JButton b,b1,back;
	JPasswordField pas,cpas;
	Registration()
	{
		p = new JPanel();
		p1 = new JPanel();
		p2 = new JPanel();
		
		l = new JLabel();
		l1 = new JLabel();
		lname = new JLabel("Full Name");
		lemail = new JLabel("Email");
		luname = new JLabel("Reg No");
		lpass = new JLabel("Password"); 
		lcpass = new JLabel("Confirm Password");
		login = new JLabel("Already have an account! please");
		
		
		tn = new JTextField();
		te = new JTextField();
		tu = new JTextField();
		pas = new JPasswordField();
		cpas = new JPasswordField();
		
		b = new JButton("Sign up");
		b.setFont(new Font("DIALOG", Font.BOLD, 20)); 
		b.setBackground(new Color(0,255,255));
		b.addActionListener(this);
		
		
		back = new JButton("x");
		back.setBackground(new Color(170,214,225));
		back.setBounds(710,0,40,30);
		back.addActionListener(this);

	    l.setText("Welcome to QAU Estate Management System");
	    l.setFont(new Font("Serif", Font.BOLD, 20)); 
	    l.setBounds(200,0,400,30);
	    l.setForeground(Color.white);
		p.setBackground(Color.black);
		p.setBounds(0,0,750,30);
		p.setLayout(null);
		p.add(l);
		p.add(back);
		
		
		
		l1.setText("Please Register Yourself");
		l1.setFont(new Font("MV Boli", Font.BOLD, 20)); 
		l1.setBounds(0,33,710,20);
		p1.setBackground(new Color(173,216,230));
		p1.setBounds(0,31,750,40);
		p1.setLayout(new GridLayout());
		p1.add(l1);
		
		
		
		lname.setBounds(10,33,80,30);tn.setBounds(10,70,200,40);
		lemail.setBounds(350,33,80,30); te.setBounds(350,70,200,40);
		
		luname.setBounds(10,115,80,30);tu.setBounds(10,150,200,40);
		lpass.setBounds(350,115,80,30); pas.setBounds(350,150,200,40);
				
		lcpass.setBounds(10,200,120,30);	cpas.setBounds(10,240,200,40);
		b.setBounds(20,320,120,30);
		
		
		p2.setBackground(new Color(173,216,230));
		p2.setBounds(0,70,750,400);
		p2.setLayout(null);
		
		
		
		p2.add(lname);
		p2.add(tn);
		p2.add(lemail);p2.add(te);
		p2.add(luname);p2.add(tu);
		p2.add(lpass);p2.add(pas);
		p2.add(lcpass);p2.add(cpas);
		p2.add(b);
		
		
		
		
		
		setSize(750,750);
		setVisible(true);
		
		setLayout(null);
		
		setResizable(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		add(p);
		add(p1);
		add(p2);
	}



	public static void main(String[] args)
	{
		
		new Registration();

	}



	@SuppressWarnings("deprecation")
	@Override
	public void actionPerformed(ActionEvent e) {
		JButton btn = (JButton)e.getSource();
		String txt = btn.getText();
		if(txt == "Sign up") 
		{
			String name = tn.getText();
			String email = te.getText();
			String uname =  tu.getText();
			String pass = pas.getText();
			String cpass = cpas.getText();
			
			try 
			{
				
				String url = "jdbc:ucanaccess://E://BS Folder//5th semester//SC LAB//QAU_Estate_Management_System//src//QAUEstateManagementSystem/Database.accdb";
				System.out.println("here");
				Connection con_reg = DriverManager.getConnection(url);
				System.out.println("here");
				PreparedStatement stm = con_reg.prepareStatement("insert into RegistrationUser(FullName,Email,UserName,Password,ConfirmPassword)values(?,?,?,?,?)");
				stm.setString(1, name);
				stm.setString(2, email);
				stm.setString(3, uname);
				stm.setString(4, pass);
				stm.setString(5, cpass);
				stm.executeUpdate();
				
				dispose();
				new Home();
				System.out.println("Registered");
				JOptionPane.showMessageDialog(this, "succesfuly registered");
				
				
			}
			catch(Exception q)
			{
			System.out.println("data is not corrrect");	
			}

	

		}
		else 
			if(txt =="Log in")
			{
				dispose();
				new Home();
				System.out.println("moved to Home Page");
				//JOptionPane.showMessageDialog(this, "succesfuly registered");
			}
			else
				if(txt=="x")
				{
					dispose();
					new Home();
				}
				
}
}