package com.rec.standalone;
import javax.swing.*;

import java.awt.*;

import java.awt.event.*;

import java.sql.*;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;



class Registration extends JFrame implements ActionListener 

	{  
	
	    JLabel l1, l2, l3, l4 , l5;

	    JTextField tf1, tf2, tf3 , tf4 ;

	    JButton btn1;


	    Registration()
	     {

	        setVisible(true);

	        setSize(700, 700);

	        setLayout(null);

	        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	        setTitle("Registration Form in Java");

	 

	        l1 = new JLabel("Registration Form in Windows Form:");

	        l1.setForeground(Color.blue);

	        l1.setFont(new Font("Serif", Font.BOLD, 20));

	  

	        l2 = new JLabel("Short Deescription");

	        l3 = new JLabel("Long Description");

	        l4 = new JLabel("Version Number");

	        l5 = new JLabel("Date & Time");

	        

	        tf1 = new JTextField();

	        tf2 = new JTextField();

	        tf3 = new JTextField();

	        tf4 = new JTextField();


	        btn1 = new JButton("Submit");

	        btn1.addActionListener(this);

	        l1.setBounds(100, 30, 400, 30);

	        l2.setBounds(80, 70, 200, 30);

	        l3.setBounds(80, 110, 200, 30);

	        l4.setBounds(80, 150, 200, 30);

	        l5.setBounds(80, 190, 200, 30);

	        tf1.setBounds(300, 70, 200, 30);

	        tf2.setBounds(300, 110, 200, 30);

	        tf3.setBounds(300, 150, 200, 30);

	        tf4.setBounds(300, 190, 200, 30);

	        btn1.setBounds(50, 350, 100, 30);

	       

	        add(l1);

	        add(l2);

	        add(tf1);

	        add(l3);

	        add(tf2);

	        add(l4);

			add(tf3);

	        add(l5);

			add(tf4);

	        add(btn1);

	      

	    }

	 

	    public void actionPerformed(ActionEvent e) 
	     {

	        if (e.getSource() == btn1)
	         {

	            int x = 0;

	            String s1 = tf1.getText();

	            String s2 = tf2.getText();

	            int a=Integer.parseInt(tf3.getText());
	            
	          

	            String str_date = "11-02-15";
	            DateFormat formatter;
	            Date date = null;
	            formatter = new SimpleDateFormat("dd-MM-yy");
	            try {
					date = formatter.parse(str_date);
				} catch (ParseException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}

	            if (s1.equals(s2))
	           {
	           
		/*public static void main(String args[])*/
			try{  
//step1 load the driver class  
					Class.forName("org.postgresql.Driver");  
  
//step2 create  the connection object  
					Connection con=DriverManager.getConnection(  
					"jdbc:postgresql://localhost:5432/ic_data","postgres","aniqa");
					PreparedStatement ps = con.prepareStatement("insert into DES values(?,?,?,?)");

                    ps.setString(1, s1);

                    ps.setString(2, s2);

                    ps.setInt(3, a);

                    ps.setDate(4, new java.sql.Date(date.getTime()));
                    
                   
                    
                    ResultSet rs = ps.executeQuery();

                    x++;

                    if (x > 0) 
                    {

                        JOptionPane.showMessageDialog(btn1, "Data Saved Successfully");

                    }

                }
          catch (Exception ex) 
                {

                    System.out.println(ex);

                }

            }
         

        } 
       else
       {

            tf1.setText("");

            tf2.setText("");

          
            tf3.setText("");

            tf4.setText("");

        }

	     }

    public static void main(String args[])
   {

        new Registration();

    }

}
                    
                    
				/* 
				jdbc:postgresql://localhost:5432/friday_db
				*/

//step3 create the statement object  
					/*Statement stmt=con.createStatement();  
  
//step4 execute query  
					ResultSet rs=stmt.executeQuery("select * from employee");  
					while(rs.next())  
					System.out.println(rs.getInt(1)+"  "+rs.getString(2)+"  "+rs.getString(3));  
  
//step5 close the connection object  
					con.close();  
  
			}
				
	}  */