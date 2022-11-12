package QAUEstateManagementSystem;

import java.awt.*;


import java.awt.event.*;
import javax.swing.JPanel;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JButton;

@SuppressWarnings("serial")
public class ColonyWiseAllotForms extends JFrame implements ActionListener
{
	
	JPanel p1,p2;
	JLabel l,ln,lapp,alist,lcb,lo;
	
	JButton b1,b2,b3,b4,b5,b6,b7,b8,b9,b10,b11,b12,b13, back;
	ColonyWiseAllotForms()
	{
		p1 = new JPanel();
		p2 = new JPanel();
		
		l = new JLabel();
		b2=new JButton("Forms");
	     b2.setFont(new Font("DIALOG", Font.BOLD, 20)); 
		 b2.setBackground(new Color(124,252,0));
     b2=new JButton("VIP Colony");
     b2.setFont(new Font("DIALOG", Font.BOLD, 20)); 
	 b2.setBackground(new Color(124,252,0));
     b3=new JButton("A Type");
     b3.setFont(new Font("DIALOG", Font.BOLD, 20)); 
	 b3.setBackground(new Color(124,252,0));
     b4=new JButton("B Type");
     b4.setFont(new Font("DIALOG", Font.BOLD, 20)); 
	 b4.setBackground(new Color(124,252,0));
     b5=new JButton("C Type");
     b5.setFont(new Font("DIALOG", Font.BOLD, 20)); 
	 b5.setBackground(new Color(124,252,0));
   
     b6=new JButton("D Type");
     b6.setFont(new Font("DIALOG", Font.BOLD, 20)); 
	 b6.setBackground(new Color(124,252,0));
 
	 	back = new JButton("x");
		back.setBounds(710,0,40,30);
		back.setBackground(new Color(173,216,230));
		back.addActionListener(this);
		p1.add(back);

	 b2.setBounds(280,100,200,40);
     b3.setBounds(280,150,200,40); 
     b4.setBounds(280,200,200,40);  
     b5.setBounds(280,250,200,40); 
     b6.setBounds(280,300,200,40);   

     
    
    
     
     
     b2.addActionListener(this);
     b3.addActionListener(this);
     b4.addActionListener(this);
     b5.addActionListener(this);
     b6.addActionListener(this);


		

	    l.setText("Welcome to QAU Estate Management System");
	    l.setHorizontalTextPosition(JLabel.LEFT);
	    l.setFont(new Font("Serif", Font.BOLD, 20)); 
	    l.setBounds(200,0,400,30);
	    l.setForeground(Color.white);
	    p1.setBackground(Color.black);
		p1.setBounds(0,0,750,30);
		p1.setLayout(null);
		p1.add(l);
		
		p2.setBackground(Color.white);
		p2.setBackground(new Color(173,216,230));
		p2.setBounds(0,10,750,400);
		p2.setLayout(null);
		p2.add(b2);
		p2.add(b3);
		p2.add(b4);
		p2.add(b5);
	     p2.add(b6);
		
		setSize(750,750);
		setVisible(true);
		
		setLayout(null);
		
		setResizable(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		add(p1);
		
		add(p2);
	}

	

	public static void main(String[] args)
	{
		new ColonyWiseAllotForms();

	}



	@Override
	public void actionPerformed(ActionEvent e) {
		
		JButton btn =(JButton)e.getSource();
		String text = btn.getText();
		if(text=="x")
		{
			dispose();
			new Colonies();
		}
		if(text=="VIP Colony")
		{
			dispose();
			new VIPform();
		}
		if(text=="A Type")
		{
			dispose();
			new Aform();
		}
		if(text=="B Type")
		{
			dispose();
			new Bform();
		}
		if(text=="C Type")
		{
			dispose();
			new Cform();
		}
		if(text=="D Type")
		{
			dispose();
			new Dform();
		}
	}



}

