package QAUEstateManagementSystem;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


@SuppressWarnings("serial")
public class Home extends JFrame implements ActionListener 
{
	
	JPanel p,p1,p2;
	JLabel l,l1;
	
	JButton b,b1,b2,b3,b4;
	Home()
	{
		p = new JPanel();
		p1 = new JPanel();
		p2 = new JPanel();
		
		l = new JLabel();
		l1 = new JLabel();
		
		 
		
		

	    l.setText("Welcome to QAU Estate Management System");
	    l.setHorizontalTextPosition(JLabel.LEFT);
	    l.setFont(new Font("Serif", Font.BOLD, 20)); 
	    l.setBounds(0,0,50,30);
	    l.setBackground(Color.white);
		p.setBackground(new Color(170,214,225));
		p.setBounds(0,0,750,30);
		p.add(l);
		
		p1.setBackground(new Color(173,216,230));
		p1.setBounds(0,31,750,40);
		p1.setLayout(new GridLayout());
		p1.add(l1);
		
		
		
		l1.setBounds(100,0, 1000, 30); 	
		

		b = new JButton("Login as Administrator");
		b.setFont(new Font("DIALOG", Font.BOLD ,20)); 
		b.setBackground(new Color(0,255,255));
		b.addActionListener(this);
		
		b1 = new JButton("Login as User");
		b1.setFont(new Font("DIALOG", Font.BOLD, 20)); 
		b1.setBackground(new Color(0,255,255));
		b1.addActionListener(this);

//		b4 = new JButton("Create an Account");
//		b4.setFont(new Font("DIALOG", Font.BOLD, 20)); 
//		b4.setBackground(new Color(0,255,255));
//		b4.addActionListener(this);
//		
		
		
		b.setBounds(200,110,280,40);
    	b1.setBounds(200,160,280,40);
    	//b4.setBounds(200,210,280,40);

		
		
		
		p2.setBackground(new Color(173,216,230));
		p2.setBounds(0,70,750,400);
		p2.setLayout(null);
		
		
		
		p2.add(l1);
		
		p2.add(b);
		p2.add(b1);
		//p2.add(b4);
//		p2.add(b2);
//		p2.add(b3);
		
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
		
		new Home();

	}

	@Override
	public void actionPerformed(ActionEvent e)
	{
		
		
		JButton btn_h = (JButton)e.getSource();
		String text = btn_h.getText();
		if(text =="Login as Administrator")
		{
			try
			{
				dispose();
				new AdminLogin();
				//System.out.println("Registered");
			}
			catch(Exception q)
			{
			System.out.println("data is not corrrect");	
			}

		}
	
		if(text =="Login as User")
		{
			try
			{
				dispose();
				new Login();
				System.out.println("Corrrect");
			}
			catch(Exception q)
			{
			System.out.println("data is not corrrect");	
			}
		}
		
	}

}