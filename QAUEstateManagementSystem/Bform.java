package QAUEstateManagementSystem;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.awt.event.*;
@SuppressWarnings("serial")
public class Bform extends JFrame implements ActionListener
{
	JPanel p,p1,p2;
	JLabel l,l1,name,des,ctpe,aptno,date,pn;
	JTextField tname,tdes,tctpe,taptno,tdate,tcomp,tpn;
	JButton submit_btn, reset_btn , back ;
	Bform()
	{
		p = new JPanel();
		p1 = new JPanel();
		p2 = new JPanel();
		
		l = new JLabel();
		l1 = new JLabel();
		name = new JLabel("House no");    		   			 tname = new JTextField();
		des = new JLabel("Resident Name");           			 tdes = new JTextField();
		ctpe = new JLabel("Allot date");					tctpe = new JTextField();
		aptno = new JLabel("scale");					taptno = new JTextField();
		date = new JLabel("Designation");			      			tdate = new JTextField();
		pn = new JLabel("Dept");					tpn = new JTextField();

		
		submit_btn = new JButton("Submit");
		submit_btn.setFont(new Font("DIALOG", Font.BOLD, 20)); 
		submit_btn.setBackground(new Color(0,255,255));
		submit_btn.setBounds(170,350,130,30);
		submit_btn.addActionListener(this);
		
		reset_btn = new JButton("Reset");
		reset_btn.setFont(new Font("DIALOG", Font.BOLD, 20)); 
		reset_btn.setBackground(new Color(124,252,0));
		reset_btn.setBounds(315,350,130,30);
		reset_btn.addActionListener(this);

		back = new JButton("x");
		back.setBackground(new Color(170,214,225));
		back.setBounds(700,0,40,30);
		back.addActionListener(this);
		
	    l.setText("Welcome to QAU Estate Management System");
	    l.setHorizontalTextPosition(JLabel.LEFT);
	    l.setFont(new Font("Serif", Font.BOLD, 20)); 
	    l.setBounds(200,0,400,30);
	    l.setForeground(Color.white);
		p.setBackground(Color.black);
		p.setBounds(0,0,750,30);
		p.setLayout(null);
		p.add(l);
		p.add(back);
		
		
		
		l1.setText("Colony A Details");
		l1.setFont(new Font("DIALOG", Font.BOLD, 20)); 
		l1.setBounds(0,31,710,20);
		p1.setBackground(new Color(173,216,230));
		p1.setBounds(0,31,750,40);
		p1.setLayout(new GridLayout());
		p1.add(l1);
		
		
		
		name.setBounds(10,10,60,30);    		   tname.setBounds(10,35,200,30);  
		des.setBounds(250,10,80,30);               tdes.setBounds(250,35,200,30);  
		ctpe.setBounds(10,65,90,30);  		       tctpe.setBounds(10,90,200,30);  
		date.setBounds(250,65,80,30);  			   tdate.setBounds(250,90,200,30);  
		aptno.setBounds(10,125,110,30);  		   taptno.setBounds(10,150,200,30);  
		pn.setBounds(250,120,110,40);  	 		   tpn.setBounds(250,150,200,30);  
	
		p2.setBackground(new Color(173,216,230));
		p2.setBounds(0,70,750,400);
		p2.setLayout(null);
		p2.add(name);p2.add(tname);
		p2.add(des);p2.add(tdes);
		p2.add(ctpe);p2.add(tctpe);
		p2.add(aptno);p2.add(taptno);
		p2.add(date);p2.add(tdate);
		p2.add(pn);p2.add(tpn);
		
		
		p2.add(submit_btn); p2.add(reset_btn);
		
		setSize(750,750);
		setVisible(true);
		
		setLayout(null);
		
		setResizable(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		add(p);
		add(p1);
		add(p2);
	}
	
	public static void main (String[] args)
	{
		new Bform();

	}
	@SuppressWarnings("unused")
	public void actionPerformed(ActionEvent e)
	{
		JButton btn_adv = (JButton)e.getSource();
		String text_adv = btn_adv.getText();
		if(text_adv=="x")
		{
			dispose();
			new ColonyWiseAllotForms();
		}
		if(text_adv == "Submit")
		{
			try
			{
				 String aptno = tname.getText();  
		         String rn=     tdes.getText();  
		         String ad=     tctpe.getText();  
				 String s=   tdate.getText();  
		 		 String desg=  taptno.getText();  
	 	 		 String dept=   tpn.getText();  
				

	 	 		String url = "jdbc:ucanaccess://E://BS Folder//5th semester//SC LAB//QAU_Estate_Management_System//src//QAUEstateManagementSystem/Database.accdb";
				Connection con_all = DriverManager.getConnection(url);
				PreparedStatement stm_all = con_all.prepareStatement("insert into ColonyB(AptNo,ResName,AllotDate,Scale,Desg,Dept)values(?,?,?,?,?,?)");
				
				stm_all.setString(1, aptno);
				stm_all.setString(2, rn);
				stm_all.setString(3, ad);
				stm_all.setString(4, s);
				stm_all.setString(5, desg);
				stm_all.setString(6, dept);
				
				stm_all.executeUpdate();
				dispose();
				new Bform();
				System.out.println("Successfully Submit");
				JOptionPane.showMessageDialog(this, "Done");
			}
			catch(Exception q)
			{
			System.out.println("data is not correct");	
			}

		}
		else
			if(text_adv == "Reset")	
			{
				try{
					tname.setText("");  
			       tdes.setText("");  
			       tctpe.setText("");  
					tdate.setText("");  
			 		 taptno.setText("");  
		 	 		 tpn.setText("");  
						System.out.println("form has been reset");
						JOptionPane.showMessageDialog(this,"form has been reset");
						dispose();
						new Bform();
					}
					catch(Exception q)
					{
						System.out.println("form invalid");
					}
				
			}
			
	}
		
	


}




