package com.rec.standalone;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Date;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

class Driver extends JFrame implements ActionListener 

{  
	private static final long serialVersionUID = 1L;

	JLabel l1, l2, l3, l4 , l5;

	JTextField tf1, tf2, tf3 , tf4 ;

	JButton btn1;
	
	Driver()
	{
		//pack();
		
		setSize(700, 700);
		setLayout(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("Feature Description for IC360 Version 3");
		
		l1 = new JLabel("Enter Feature Description for IC360 Version 3");

		l1.setForeground(Color.BLACK);

		l1.setFont(new Font("Serif", Font.BOLD, 20));
		
		l2 = new JLabel("Short Description");

		l3 = new JLabel("Long Description");

		l4 = new JLabel("Version Number");

		tf1 = new JTextField();

		tf2 = new JTextField();

		tf3 = new JTextField();

		btn1 = new JButton("Submit");

		btn1.addActionListener(this);

		l1.setBounds(100, 30, 400, 30);

		l2.setBounds(80, 70, 200, 30);

		l3.setBounds(80, 110, 200, 30);

		l4.setBounds(80, 150, 200, 30);

		tf1.setBounds(300, 70, 200, 30);

		tf2.setBounds(300, 110, 200, 30);

		tf3.setBounds(300, 150, 200, 30);

		btn1.setBounds(50, 350, 100, 30);

		add(l1);

		add(l2);

		add(tf1);

		add(l3);

		add(tf2);

		add(l4);

		add(tf3);

		add(btn1);
		
		setVisible(true);
	}

	public void actionPerformed(ActionEvent e) 
	{
		if (e.getSource() == btn1)
		{
			int x = 0;

			String s1 = tf1.getText();

			String s2 = tf2.getText();

			int a=Integer.parseInt(tf3.getText());
			try{  

				Class.forName("org.postgresql.Driver");  
				
				Connection con=DriverManager.getConnection(  
						"jdbc:postgresql://localhost:5432/ic_data","postgres","posttivh@10");
				PreparedStatement ps = con.prepareStatement("insert into welcome_feature values(?,?,?,?)");

				ps.setString(1, s1);

				ps.setString(2, s2);

				ps.setInt(3, a);

				ps.setTimestamp(4, new java.sql.Timestamp(new Date().getTime()));
				
				ps.executeUpdate();
				
				x++;

				if (x > 0) 
				{
					JOptionPane.showMessageDialog(btn1, "Data Saved Successfully");
				}
				tf1.setText("");
				tf2.setText("");
				tf3.setText("");
			}catch (Exception ex) 
			{
				ex.getStackTrace();
			}
		}
	}

	public static void main(String args[])
	{
		new Driver();
	}

}

