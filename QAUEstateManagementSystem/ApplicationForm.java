package QAUEstateManagementSystem;
import javax.swing.*;
import java.awt.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.awt.event.*;

@SuppressWarnings("serial")
public class ApplicationForm extends JFrame implements ActionListener
{
	JPanel p,p1,p2;
	JLabel l,l1,name,dob,doj,cnic,des,dept,scale,pn,fm,gender,fn ,fcnic,cadd,padd;
	JTextField tname,tdob,tdoj,tcnic,tdes,tdept,tscale,tpn,tfm,tgender,tfn ,tfcnic,tcadd,tpadd;
	JButton submit_btn, reset_btn , back ;
	ApplicationForm()
	{
		p = new JPanel();
		p1 = new JPanel();
		p2 = new JPanel();
		
		l = new JLabel();
		l1 = new JLabel();
		name = new JLabel("Full Name");    		    tname = new JTextField();
		dob = new JLabel("DOB");           		    tdob = new JTextField();
		doj = new JLabel("DOJ");					tdoj = new JTextField();
		cnic = new JLabel("CNIC");					tcnic = new JTextField();
		des = new JLabel("Designation");			tdes = new JTextField();
		dept = new JLabel("Department");			tdept = new JTextField();
		scale = new JLabel("Scale");				tscale = new JTextField();
		pn = new JLabel("Phone Number");			tpn = new JTextField();
		fm = new JLabel("FamilyMember");			tfm = new JTextField();
		gender = new JLabel("Gender");				tgender = new JTextField();
		fn = new JLabel("Father Name");				tfn = new JTextField();
		fcnic = new JLabel("Father CNIC");			tfcnic = new JTextField();
		cadd = new JLabel("Current Address");		tcadd = new JTextField();
		padd = new JLabel("Permenant Address");		tpadd = new JTextField();
		
		
		
		
		
		
		
		
		
			
		submit_btn = new JButton("Submit");
		submit_btn.setFont(new Font("DIALOG", Font.BOLD, 20)); 
		submit_btn.setBackground(new Color(0,255,255));
		submit_btn.setBounds(415,365,130,30);
		submit_btn.addActionListener(this);
		
		reset_btn = new JButton("Reset");
		reset_btn.setFont(new Font("DIALOG", Font.BOLD, 20)); 
		reset_btn.setBackground(new Color(124,252,0));
		reset_btn.setBounds(560,365,130,30);
		reset_btn.addActionListener(this);
		
		back = new JButton("x");
		back.setBackground(new Color(170,214,225));
		back.setBounds(710,0,40,30);
		back.addActionListener(this);
		
	    l.setText("Welcome to QAU Estate Management System");
	    //l.setHorizontalTextPosition(JLabel.LEFT);
	    l.setFont(new Font("Serif", Font.BOLD, 20)); 
	    l.setBounds(200,0,400,30);
	    l.setForeground(Color.white);
	    l.setBackground(Color.white);
		p.setBackground(Color.black);
		p.setBounds(0,0,750,30);
		p.setLayout(null);
		p.add(l);
		p.add(back);
		
		
		
		l1.setText("Please fill the application Form");
		l1.setFont(new Font("DIALOG", Font.BOLD, 20)); 
		l1.setBounds(0,31,710,20);
		p1.setBackground(new Color(173,216,230));
		p1.setBounds(0,31,750,40);
		p1.setLayout(new GridLayout());
		p1.add(l1);
		
		
		
		name.setBounds(10,10,60,30);    		   tname.setBounds(10,35,200,30);  
		dob.setBounds(250,10,60,30);               tdob.setBounds(250,35,200,30);  
		doj.setBounds(490,10,60,30);  			   tdoj.setBounds(490,35,200,30);  
		cnic.setBounds(10,65,60,30);  		       tcnic.setBounds(10,90,200,30);  
		des.setBounds(250,65,80,30);  			   tdes.setBounds(250,90,200,30);  
		dept.setBounds(490,65,80,30);  		       tdept.setBounds(490,90,200,30);  
		scale.setBounds(10,125,110,30);  		   tscale.setBounds(10,150,200,30);  
		pn.setBounds(250,120,110,40);  	 		   tpn.setBounds(250,150,200,30);  
		fm.setBounds(490,120,120,40);  		       tfm.setBounds(490,150,200,30);  
		gender.setBounds(10,180,60,40);  		   tgender.setBounds(10,210,200,30);  
		fn.setBounds(250,185,80,30);  			   tfn.setBounds(250,210,200,30);  
		fcnic.setBounds(490,185,80,30);  		   tfcnic.setBounds(490,210,200,30);
		
		cadd.setBounds(10,243,100,30);  		   tcadd.setBounds(10,268,680,30); 
		padd.setBounds(10,303,120,30);  		   tpadd.setBounds(10,328,680,30);  
		
		p2.setBackground(new Color(173,216,230));
		p2.setBounds(0,70,750,400);
		p2.setLayout(null);
		p2.add(name);p2.add(tname);
		p2.add(dob);p2.add(tdob);
		p2.add(doj);p2.add(tdoj);
		p2.add(cnic);p2.add(tcnic);
		p2.add(des);p2.add(tdes);
		p2.add(dept);p2.add(tdept);
		p2.add(scale);p2.add(tscale);
		p2.add(pn);p2.add(tpn);
		p2.add(fm);p2.add(tfm);
		p2.add(gender);p2.add(tgender);
		p2.add(fn);p2.add(tfn);
		p2.add(fcnic);p2.add(tfcnic);
		p2.add(cadd);p2.add(tcadd);
		p2.add(padd);p2.add(tpadd);
		
		
		
		
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
	

	public static void main(String[] args)
	{
		
		new ApplicationForm();

	}

	public void actionPerformed(ActionEvent e)
	{
		JButton btn1 = (JButton)e.getSource();
		String text1 = btn1.getText();
		if(text1=="x")
		{
			dispose();
			new menu();
		}
		if(text1 == "Submit")
		{
			String n = tname.getText();
			String age = tdob.getText();
			String doj =  tdoj.getText();
			String cnic = tcnic.getText();
			String desg = tdes.getText();
			String dept = tdept.getText();
			String sc = tscale.getText();
			String pn = tpn.getText();
			String fmem = tfm.getText();
			String g = tgender.getText();
			String Fn = tfn.getText();
			String Fcnic = tfcnic.getText();
			String Cadd = tcadd.getText();
			String Padd = tpadd.getText();
			try
			{
				String url = "jdbc:ucanaccess://E://BS Folder//5th semester//SC LAB//QAU_Estate_Management_System//src//QAUEstateManagementSystem/Database.accdb";
				Connection con_app = DriverManager.getConnection(url);
				PreparedStatement stm_app = con_app.prepareStatement("insert into applicationFORM(FullName,age,doj,cnic,desg,dept,scale,pn,fm,gender,fname,fcnic,cadd,padd)values(?,?,?,?,?,?,?,?,?,?,?,?,?,?)");
				
				stm_app.setString(1, n);
				stm_app.setString(2, age);
				stm_app.setString(3, doj);
				stm_app.setString(4, cnic);
				stm_app.setString(5, desg);
				stm_app.setString(6,dept);
				stm_app.setString(7,sc);
				stm_app.setString(8, pn);
				stm_app.setString(9,fmem);
				stm_app.setString(10, g);
				stm_app.setString(11, Fn);
				stm_app.setString(12,Fcnic);
				stm_app.setString(13, Cadd);
				stm_app.setString(14,Padd);
				
				
				stm_app.executeUpdate();
				dispose();
				new menu();
				JOptionPane.showMessageDialog(this, "succesfuly registered");
				System.out.println("Successfully Submit");
			}
			catch(Exception q)
			{
			System.out.println("data is not correct");	
			}
		}
		else
			if(text1 == "Reset")	
			{
				try{
					
						tname.setText("");
						tdob.setText("");
						tdoj.setText("");
						tcnic.setText("");
						tdes.setText("");
						tdept.setText("");
						tscale.setText("");
						tpn.setText("");
						tfm.setText("");
						tgender.setText("");
						tfn.setText("");
						tfcnic.setText("");
						tcadd.setText("");
						tpadd.setText("");
						
						//stm.executeUpdate();
						
						System.out.println("form has been reset");
						//JOptionPane.showMessageDialog(this, "");
						dispose();
						new ApplicationForm();
					}
					catch(Exception q)
					{
						System.out.println("form invalid");
					}
				
			}
			
	}
		
	


}	
