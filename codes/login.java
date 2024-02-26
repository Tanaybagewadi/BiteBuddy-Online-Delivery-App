import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.awt.event.ActionEvent;
public class login extends JFrame implements ActionListener
{
    JLabel l1,l2,l3,l4;
    JTextField t1,t2;
    JButton b1,b2;
    JPanel p2;
    login()
    {
        setLayout(null);
        getContentPane().setBackground(new Color(0,166,156,255));
      
        l1=new JLabel("<html><u>Login Page");
        l1.setFont(new Font("Comic Sans MS", Font.PLAIN, 34));
        l1.setForeground(new Color(246,177,122));
        l1.setBounds(290,2,250,100);
        add(l1);
      
        
        l2=new JLabel("<html><center>Please ensure that all provided personal information, including name, phone number, and Gmail, is accurate.<br> The company holds no responsibility for inaccuracies in the information provided..</html>");
        l2.setBounds(90,30,900,150);
        l2.setForeground(Color.red);
        add(l2);
       

        t1=new JTextField("");
        t1.setText("");
        t1.setBackground(new Color(246,177,122));
        t1.setFont(new Font("Comic Sans MS", Font.PLAIN, 18));
        t1.setBounds(110,190,250,30);
        add(t1);
        JLabel name1=new JLabel("<html><b><i>Enter Name:</b></html>");
        name1.setBounds(110,165,90,30);
        name1.setForeground(Color.white);
        add(name1);

        t2=new JTextField("");
        t2.setBounds(370,190,250,30);
        t2.setBackground(new Color(246,177,122));
        t2.setFont(new Font("Comic Sans MS", Font.PLAIN, 18));
        add(t2);
        JLabel pass=new JLabel("<html><b><i>Enter Password:</b></html>");
        pass.setBounds(370,165,120,30);
        pass.setForeground(Color.white);
        add(pass);

        


        b1=new JButton("submit");
        b1.setBounds(240,270,250,30);
        b1.setBackground(new Color(6,35,66,255));
        b1.setFont(new Font("Comic Sans MS", Font.PLAIN, 18));
        b1.setForeground(Color.white);
        b1.addActionListener(this);
        add(b1);

        b2=new JButton("Back");
        b2.setBounds(240,300,250,30);
        b2.setBackground(new Color(6,35,66,255));
        b2.setForeground(Color.white);
        b2.setFont(new Font("Comic Sans MS", Font.PLAIN, 18));
        b2.addActionListener(this);
        add(b2);

        JPanel p1=new JPanel();
        p1.setBounds(0,405,770,40);
        p1.setBackground(new Color(6,35,66,255));
        b1.setForeground(Color.white);
        add(p1);

        JPanel p2=new JPanel();
        p2.setBounds(200,340,350,60);
        p2.setBackground(Color.yellow);
        p2.setForeground(Color.red);
        p2.setVisible(false);
        p2.setLayout(null);
        add(p2);
        l4=new JLabel();
        p2.add(l4);

          setVisible(true);
          setLocation(350,50);
          setSize(770,480);

    }
    public void actionPerformed(ActionEvent e)
    {
    	String n1,n2;
    	
        if(e.getSource()==b1)
        {
            
            //connection to databse
           Connection con=null;
 		   Statement st=null;
 		   String sql=null;
 		 
 			 
 			 
 			   
 			   n1=t1.getText();
 			   n2=t2.getText();
 			   try {
 				  Class.forName("oracle.jdbc.driver.OracleDriver");
 	 			   con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","project1","bitebuddy");
 	 			   System.out.print("Connected to DataBase succesfully");
 				  st=con.createStatement();
 				  String Query="SELECT * FROM signup WHERE name='"+n1+"' AND password='"+n2+"'";
 				  ResultSet rs=st.executeQuery(Query);
 				  
 				  //check if there is matching record
 				  if(rs.next())
 				  {
 					  new main1();
 					  setVisible(false);
 					  System.out.println("Login successfull");
 				  }else {
 					 
 					 new error();
 					 setVisible(false);
 					
 				  }
 				  rs.close();
 				  st.close();
 			   }catch(Exception e1) {
 				   e1.printStackTrace();
 			   }
 			
 		   
        }
        if(e.getSource()==b2)
        {
           new front();
           setVisible(false);
        
         
 	 }
 	}		  
    public static void main(String args[])
    {
        new login();
    }
}