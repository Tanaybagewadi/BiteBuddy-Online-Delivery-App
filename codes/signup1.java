import javax.swing.*;
import java.sql.*;
import java.awt.*;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.awt.event.ActionEvent;
public class signup1 extends JFrame implements ActionListener
{
    JLabel l1,l2,l3;
    JTextField t1,t2,t3,t4;
    JButton b1,b2;
    signup1()
    {
        setLayout(null);
        getContentPane().setBackground(new Color(0,166,156,255));
      
        l1=new JLabel("<html><u>Welcome to BiteBuddy</u></html>");
        l1.setFont(new Font("Comic Sans MS", Font.PLAIN, 28));
     
        l1.setForeground(new Color(246,177,122));
        l1.setBounds(230,2,450,100);
        add(l1);
      
        
        l2=new JLabel("<html><center>Join our food-loving community today!</center><br> sign up now for exclusive deals and delecious deliveries straight to your doorstep.</html>");
        l2.setBounds(130,60,900,100);
        l2.setForeground(Color.WHITE);
        add(l2);
       

        t1=new JTextField("");
        t1.setText("");
        t1.setBounds(110,190,250,30);
        t1.setFont(new Font("Comic Sans MS", Font.PLAIN, 18));
        t1.setBackground(new Color(246,177,122));
        add(t1);
        JLabel name=new JLabel("<html><b><i>Enter Name:</b></html>");
        name.setBounds(110,165,90,30);
        name.setForeground(Color.white);
        add(name);

        t2=new JTextField("");
        t2.setBounds(370,190,250,30);
        t2.setBackground(new Color(246,177,122));
        t2.setFont(new Font("Comic Sans MS", Font.PLAIN, 18));
        add(t2);
        JLabel pass=new JLabel("<html><b><i>Enter Password:</b></html>");
        pass.setBounds(370,165,120,30);
        pass.setForeground(Color.white);
        add(pass);

        t3=new JTextField();
        t3.setBounds(110,250,250,30);
        t3.setBackground(new Color(246,177,122));
        t3.setFont(new Font("Comic Sans MS", Font.PLAIN, 18));
        add(t3);
        JLabel gmail=new JLabel("<html><i>Gmail:</html></i>");
        gmail.setBounds(110,228,90,30);
        gmail.setForeground(Color.white);
        add(gmail);
        
        t4=new JTextField();
        t4.setBounds(370,250,250,30);
        t4.setBackground(new Color(246,177,122));
        t4.setFont(new Font("Comic Sans MS", Font.PLAIN, 18));
        add(t4);
        
        JLabel no=new JLabel("<html><i>Phone no:</i></html>");
        no.setBounds(370,228,90,30);
        no.setForeground(Color.white);
        add(no);
        


        b1=new JButton("submit");
        b1.setBounds(240,320,250,30);
        b1.setBackground(new Color(6,35,66,255));
        b1.setForeground(Color.white);
        b1.setFont(new Font("Comic Sans MS", Font.PLAIN, 18));
        b1.addActionListener(this);
        add(b1);

        b2=new JButton("Back");
        b2.setBounds(240,360,250,30);
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


          setVisible(true);
          setLocation(350,50);
        setSize(770,480);

    }
    public void actionPerformed(ActionEvent e)
    {
    	String value1;
    	String value2;
    	String value3;
    	String value4;
        if(e.getSource()==b1)
        {
            new login();
            setVisible(false);
            //connection to databse
            Connection con=null;
 		   Statement st=null;
 		   String sql=null;
 		   try
 		   {
 			   Class.forName("oracle.jdbc.driver.OracleDriver");
 			   con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","project1","bitebuddy");
 			   System.out.print("Connected to DataBase succesfully");
 			   st=con.createStatement();
 			   
 			   //get values from text
 			   value1=t1.getText();
 			   value2=t2.getText();
 			   value3=t3.getText();
 			   value4=t4.getText();
 			   
 			  
 			  sql = "INSERT INTO signup (name, password,gmail,no) VALUES ('" + value1 + "', '" + value2 + "','"+value3+"','"+value4+"')";
 			  st.executeUpdate(sql);
 			   System.out.println("\nRecord inserted successfully");
 		   }catch(Exception e1)
 		   {
 			  System.out.println(""+e1);
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
        new signup1();
    }
}