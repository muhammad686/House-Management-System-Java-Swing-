package QAUEstateManagementSystem;

import java.awt.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.awt.event.*;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.SpringLayout;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.border.Border;
import javax.swing.table.DefaultTableModel;

@SuppressWarnings({ "serial", "unused" })
public class ReceivedComplains extends JFrame implements ActionListener
{
	
	JPanel p1,p2;
	JLabel l;
	
	JButton back;
	private Object absolute;
	ReceivedComplains()
	{
		p1 = new JPanel();
		p2 = new JPanel();
		
		l = new JLabel();
	
     


		

	    l.setText("Welcome to QAU Estate Management System");
	    l.setHorizontalTextPosition(JLabel.RIGHT);
	    l.setFont(new Font("Serif", Font.BOLD, 20)); 
	    l.setBounds(200,0,400,20);
	    l.setForeground(Color.white);
	    p1.setBackground(Color.black);
		p1.setBounds(0,0,750,30);
		p1.setLayout(null);
		p1.add(l);
		
		back = new JButton("x");
		back.setBounds(700,0,40,30);
		back.setBackground(new Color(173,216,230));
		back.addActionListener(this);
		p1.add(back);
		
		p2.setBackground(Color.white);
		p2.setBackground(new Color(173,216,230));
		p2.setBounds(0,30,750,400);
		p2.setLayout(new GridLayout());

		
	  String data[][] = {{"ID","Name","Designation","Colony Type","Complain","Date" ,"Apartment No","Phone"}};
	  String col[] = {"","","","","","","",""};
	  
	  DefaultTableModel model = new DefaultTableModel(data,col);
	
	  JTable table = new JTable(model);
	  table.setBounds(0,50,50,50);
	  table.setBackground(new Color(173,216,230));
	  //Insert first position
	  p2.add(table);
	
		
		setSize(750,750);
		setVisible(true);
		
		setLayout(null);
		
		setResizable(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		add(p1);
		
		add(p2);//add(p3);

		try
		{
			int i=1;
		    String url = "jdbc:ucanaccess://E://BS Folder//5th semester//SC LAB//QAU_Estate_Management_System//src//QAUEstateManagementSystem/Database.accdb";
			Connection conObj = DriverManager.getConnection(url);
			Statement st = conObj.createStatement();
			ResultSet rt = st.executeQuery("SELECT * from Maintinance");
			while(rt.next())
			{
				
				model.insertRow(i, new Object[] {rt.getString(1),rt.getString(2),rt.getString(3),rt.getString(4),rt.getString(5),rt.getString(6),rt.getString(7),rt.getString(8)});
				i++;
			}
		}
		catch(Exception q)
		{
			System.out.println("data is not corrrect");	
		}	
	
	}

	

	public static void main(String[] args)
	{
		new ReceivedComplains();

	}



	@Override
	public void actionPerformed(ActionEvent e) {
		JButton btn = (JButton)e.getSource();
		String text = btn.getText();
		if(text =="x")
		{
			dispose();
			new menu();
		}
		
	}







}


