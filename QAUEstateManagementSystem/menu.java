package QAUEstateManagementSystem;

import java.awt.*;


import java.awt.event.*;
import javax.swing.JPanel;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JButton;

@SuppressWarnings("serial")
public class menu extends JFrame implements ActionListener
{
	JPanel p1,p2;
	JLabel l,ln,lapp,alist,lcb,lo;
	
	JButton b1,b2,b3,b4,b5,b6,b7,b8,b9,b10,b11,b12,b13,b14;
	menu()
	{
		p1 = new JPanel();
		p2 = new JPanel();
		
		l = new JLabel();
		
     b1=new JButton("News & Updates");
     b1.setFont(new Font("DIALOG", Font.BOLD, 20)); 
	 b1.setBackground(new Color(124,252,0));
     b2=new JButton("Apply here");
     b2.setFont(new Font("DIALOG", Font.BOLD, 20)); 
	 b2.setBackground(new Color(124,252,0));
     b3=new JButton("Allotment form");
     b3.setFont(new Font("DIALOG", Font.BOLD, 20)); 
	 b3.setBackground(new Color(124,252,0));
     b4=new JButton("Complain Box");
     b4.setFont(new Font("DIALOG", Font.BOLD, 20)); 
	 b4.setBackground(new Color(124,252,0));
     b5=new JButton("Colonies");
     b5.setFont(new Font("DIALOG", Font.BOLD, 20)); 
	 b5.setBackground(new Color(124,252,0));
   
     b6=new JButton("Advertise");
     b6.setFont(new Font("DIALOG", Font.BOLD, 20)); 
	 b6.setBackground(new Color(124,252,0));
     b7=new JButton("Log out");
     b7.setFont(new Font("DIALOG", Font.BOLD, 20)); 
	 b7.setBackground(new Color(124,252,0));
     b8=new JButton("Allotment list");
     b8.setFont(new Font("DIALOG", Font.BOLD, 20)); 
	 b8.setBackground(new Color(124,252,0));
     b9=new JButton("Received Complains");
     b9.setFont(new Font("DIALOG", Font.BOLD, 15)); 
	 b9.setBackground(new Color(124,252,0));
//     b10=new JButton("");
//     b10.setFont(new Font("DIALOG", Font.BOLD, 20)); 
//	 b10.setBackground(new Color(124,252,0));
//     b11=new JButton("");
//     b11.setFont(new Font("DIALOG", Font.BOLD, 20)); 
//	 b11.setBackground(new Color(124,252,0));
//     b12=new JButton("");
//     b12.setFont(new Font("DIALOG", Font.BOLD, 20)); 
//	 b12.setBackground(new Color(124,252,0));
//    b13=new JButton("Log out");
//     b13.setFont(new Font("DIALOG", Font.BOLD, 20)); 
//	 b13.setBackground(new Color(124,252,0));

     

	 b1.setBounds(130,50,200,40);  b8.setBounds(360,50,200,40);
     b2.setBounds(130,100,200,40); b9.setBounds(360,100,200,40); 
     b3.setBounds(130,150,200,40); // b10.setBounds(310,150,200,40);
     b4.setBounds(130,200,200,40);   //b11.setBounds(310,200,200,40); 
     b5.setBounds(130,250,200,40); //b12.setBounds(310,250,200,40);
     b6.setBounds(130,300,200,40);   
    b7.setBounds(130,350,200,40); 
//   b13.setBounds(50,400,200,40);
     
    
    
     
     

     b1.addActionListener(this);
     b2.addActionListener(this);
     b3.addActionListener(this);
     b4.addActionListener(this);
     b5.addActionListener(this);
     b6.addActionListener(this);
     b7.addActionListener(this);
     b8.addActionListener(this);
     b9.addActionListener(this);
//     b10.addActionListener(this);
//     b11.addActionListener(this);
//     b12.addActionListener(this);
  //  b13.addActionListener(this);

		

	    l.setText("Welcome to QAU Estate Management System");
	    l.setHorizontalTextPosition(JLabel.LEFT);
	    l.setFont(new Font("Serif", Font.BOLD, 20)); 
	    l.setBounds(0,0,50,20);
	    l.setForeground(Color.white);
	    p1.setBackground(Color.black);
		p1.setBounds(0,0,750,30);
		p1.add(l);
		
		p2.setBackground(Color.white);
		p2.setBackground(new Color(173,216,230));
		p2.setBounds(0,10,750,400);
		p2.setLayout(null);
		p2.add(b1);
		p2.add(b2);
		p2.add(b3);
		p2.add(b4);
		p2.add(b5);
	     p2.add(b6);
	     p2.add(b7);
	     p2.add(b8);
	     p2.add(b9);
//	     p2.add(b10);
//	     p2.add(b11);
//	     p2.add(b12);
//	     p2.add(b13);
//     b1.setBackground(new Color(124,252,0));
//     b2.setBackground(new Color(124,252,0));
//     b3.setBackground(new Color(124,255,0));
//     b4.setBackground(new Color(124,255,0));
//     b5.setBackground(new Color(124,255,0));
//     b6.setBackground(new Color(124,255,0));
//     b7.setBackground(new Color(124,255,0));
//     b8.setBackground(new Color(124,255,0));
//     b9.setBackground(new Color(124,255,0));
//     b10.setBackground(new Color(124,255,0));
//     b11.setBackground(new Color(124,255,0));
//     b12.setBackground(new Color(124,255,0));
//     b13.setBackground(new Color(124,255,0));
		
		setSize(1000,1000);
		setVisible(true);
		
		setLayout(null);
		
		setResizable(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		add(p1);
		
		add(p2);//add(p3);
	}

	

	public static void main(String[] args)
	{
		new menu();

	}



	@Override
	public void actionPerformed(ActionEvent e) {
		JButton btn = (JButton)e.getSource();
		String text = btn.getText();
		if(text=="x")
		{
			dispose();
			new menu();
		}
		else
		if(text == "Complain Box")
		{

				dispose();
				new Maintenance();

		}
		if(text == "Apply here")
		{

				dispose();
				new ApplicationForm();

		}
		if(text == "News & Updates")
		{

				dispose();
				new Advertise();

		}
		if(text == "Allotment form")
		{

				dispose();
				new AllotmentForm();
	
		}
		if(text == "Received Complains")
		{

				dispose();
				new ReceivedComplains();
	
		}
		if(text == "Colonies")
		{
		
				dispose();
				new Colonies();
		
		}
		else
			if(text == "Log out")
			{
				
					dispose();
					new Home();
			}
				
			else
				if(text == "News & Updates")
				{
						dispose();
						new NewsAndUpdates();
					
				
				}
				else
					if(text == "Advertise")
					{
						
							dispose();
							new Advertise(); 
					
					}
					else
						if(text == "Allotment list")
						{
							
								dispose();
								new ShowSeniorityList();
						
						}
	}

}
