package QAUEstateManagementSystem;

import java.awt.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.awt.event.*;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JButton;

@SuppressWarnings("serial")
public class Advertise extends JFrame implements ActionListener
{
	
	JPanel p,p1,p2;
	JLabel l,l1,l2,l3,l4,l5,l6,l7;
	JTextField t1,t2,t3,t4,t5,t6;
	JButton b,back;
	Advertise()
	{
		p = new JPanel();
		p1 = new JPanel();
		p2 = new JPanel();
		
		l = new JLabel();
		l1 = new JLabel();
		l2 = new JLabel(" Appart No");
		l3 = new JLabel("Colony Type");
		l4 = new JLabel("Last Date");
		l5 = new JLabel(" Other Details"); 
		l6 = new JLabel("Eligabelity");
		
		t1 = new JTextField();
		t2 = new JTextField();
		t3 = new JTextField();
		t4 = new JTextField();
		t5 = new JTextField();
		
		b = new JButton("Advertise");
		b.setFont(new Font("DIALOG", Font.BOLD, 20)); 
		b.setBackground(new Color(0,255,255));
		b.addActionListener(this);
		
		back = new JButton("x");
		back.setBackground(new Color(170,214,225));
		back.setBounds(710,0,40,30);
		back.addActionListener(this);
		
	    l.setText("Welcome to QAU Estate Management System");
	    l.setHorizontalTextPosition(JLabel.LEFT);
	    l.setFont(new Font("Serif", Font.BOLD, 20)); 
	    l.setBounds(200,0,400,30);
	    l.setForeground(Color.white);
	    l.setBackground(Color.white);
		p.setBackground(Color.black);
		p.setLayout(null);
		p.setBounds(0,0,750,30);
		p.add(l);
		p.add(back);
		
		
		
		l1.setText("Advertisement of Houses");
		l1.setFont(new Font("MV Boli", Font.BOLD, 20)); 
		l1.setBounds(20,20,100,70);
		p1.setBackground(new Color(173,216,230));
		p1.setBounds(0,31,750,40);
		p1.setLayout(null);
		p1.add(l1);
		
		
		l1.setBounds(100,0, 1000, 30); 	
		t1.setBounds(10,70,200,40);
		l2.setBounds(10,30,80,30);
		t2.setBounds(340,70,200,40);
		l3.setBounds(10,115,80,30);
		t3.setBounds(10,150,200,40);
		l4.setBounds(340,30,80,30);
		t4.setBounds(340,150,200,40);
				
		l5.setBounds(10,200,120,30);
	    t5.setBounds(10,240,200,40);
	    l6.setBounds(340,110,120,30);
	    t5.setBounds(10,240,200,40);
		b.setBounds(20,310,130,30);

		
		
		
		p2.setBackground(new Color(173,216,230));
		p2.setBounds(0,70,750,400);
		p2.setLayout(null);
		
		
		
		p2.add(l1);
		p2.add(t1);
		p2.add(l2);
		p2.add(t2);
		p2.add(l3);
		p2.add(t3);
		p2.add(l4);
		p2.add(t4);
		p2.add(l5);
		p2.add(t5);
		p2.add(l6);

		p2.add(b);
		
		setSize(750,450);
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
		
		new Advertise();

	}



	@Override
	public void actionPerformed(ActionEvent e)
	{
		
		JButton btn = (JButton)e.getSource();
		String text = btn.getText();
		if(text == "x")
		{

				dispose();
				new menu();		
		}
		if(text == "Advertise")
		{
			try
			{
				String ano = t1.getText();
				String ctype = t2.getText();
				String ldate = t3.getText();
				String elig = t5.getText();
				String othdet = t4.getText();
				
				String url = "jdbc:ucanaccess://E://BS Folder//5th semester//SC LAB//QAU_Estate_Management_System//src//QAUEstateManagementSystem/Database.accdb";
				Connection con_adv = DriverManager.getConnection(url);
				PreparedStatement stm_adv = con_adv.prepareStatement("insert into Advertise(AptNo,LD,CT,Eligibility,OtherDetails)values(?,?,?,?,?)");
				
				System.out.println("here");
				stm_adv.setString(1,ano);
				stm_adv.setString(2,ctype);
				stm_adv.setString(3, ldate);
				stm_adv.setString(4,elig);
				stm_adv.setString(5,othdet);
				
				stm_adv.executeUpdate();
				dispose();
				new menu();
				System.out.println("Advertised");
				JOptionPane.showMessageDialog(this, "Advertised");
			
			}
			catch(Exception q)
			{
				System.out.println("failed");
			}

			
		}
	}

}
