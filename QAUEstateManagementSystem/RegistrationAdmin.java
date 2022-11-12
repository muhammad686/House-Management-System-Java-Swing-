package QAUEstateManagementSystem;

import javax.swing.*;

import java.awt.*;
import java.awt.event.*;
import java.sql.*;

@SuppressWarnings("serial")
public class RegistrationAdmin extends JFrame implements ActionListener
{
	
	JPanel p,p1,p2;
	JLabel l,l1,lname,lrn,lpass,lcpass;//,login;
	JTextField tn,trn,tpass,tcpass;
	JButton b,b1,back;
	JPasswordField pas,cpas;
	RegistrationAdmin()
	{
		p = new JPanel();
		p1 = new JPanel();
		p2 = new JPanel();
		
		l = new JLabel();
		l1 = new JLabel();
		lname = new JLabel("Full Name");
		lrn = new JLabel("Reg No");
		lpass = new JLabel("Password");
		lcpass = new JLabel("Confirm Password"); 

		
		
		tn = new JTextField();
		trn = new JTextField();
		tpass = new JPasswordField();
		tcpass = new JPasswordField();
		//cpas = new JPasswordField();
		
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
		p.setLayout(null);
		p.setBounds(0,0,750,30);
		p.add(l);
		p.add(back);
		
		
		
		l1.setText("Please Register Yourself");
		l1.setFont(new Font("MV Boli", Font.BOLD, 20)); 
		l1.setBounds(0,33,710,20);
		p1.setBackground(new Color(173,216,230));
		p1.setBounds(0,31,750,40);
		p1.setLayout(new GridLayout());
		p1.add(l1);
		
		
		
		lname.setBounds(10,33,80,30);tn.setBounds(10,70,200,30); 
		lrn.setBounds(350,33,80,30); trn.setBounds(350,70,200,30);
		lpass.setBounds(10,115,80,30);tpass.setBounds(10,150,200,30);
		lcpass.setBounds(350,115,120,30); tcpass.setBounds(350,150,200,30);
				
		//lpass.setBounds(10,200,120,30);	cpas.setBounds(10,240,200,30);
		b.setBounds(20,320,120,30);
		
//		login.setBounds(160,320,400,30);	
//		b1.setBounds(350,320,120,30);
		
		p2.setBackground(new Color(173,216,230));
		p2.setBounds(0,70,750,400);
		p2.setLayout(null);
		
		
		
		p2.add(lname);
		p2.add(tn);
		p2.add(lrn);p2.add(trn);
		p2.add(lpass);p2.add(tpass);
		p2.add(lcpass);p2.add(tcpass);
		//p2.add(lpass);p2.add(cpas);
		p2.add(b);
	//	p2.add(login);p2.add(b1);		
		
		
		
		
		
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
		
		new RegistrationAdmin();

	}



	@Override
	public void actionPerformed(ActionEvent e) {
		JButton btn = (JButton)e.getSource();
		String txt = btn.getText();
		if(txt == "Sign up") 
		{
			try 
			{
				String name = tn.getText();
				String regno = trn.getText();
				String pass =  tpass.getText();
				String cpass = tcpass.getText();
				
				String url = "jdbc:ucanaccess://E://BS Folder//5th semester//SC LAB//QAU_Estate_Management_System//src//QAUEstateManagementSystem/Database.accdb";
				Connection conObj = DriverManager.getConnection(url);
				
				PreparedStatement stm = conObj.prepareStatement("insert into RegistrationAdmin(FullName,RegNo,Password,ConfirmPassword)values(?,?,?,?)");
				stm.setString(1, name);
				stm.setString(2, regno);
				stm.setString(3, pass);
				stm.setString(4, cpass);
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
			if(txt =="x")
			{
				dispose();
				new Home();
				System.out.println("moved to Home Page");
			}
		}
		
		
}



