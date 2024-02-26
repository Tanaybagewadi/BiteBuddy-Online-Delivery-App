import javax.swing.*;
import java.sql.*;
import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
public class front extends JFrame implements ActionListener
{
    JLabel l1,image,image2,image3,image4;
    JButton b1,b2,user,login;
    JPanel p1;
    front()
    {
        
        setLayout(null);
     
      
        getContentPane().setBackground(new Color(245,232,199));


        l1=new JLabel("<html><i>Welcome to BiteBuddy, your go-to food delivery app!<br> Get ready to embark on a delicious journey, <br>discovering a world of flavors right at your fingertips. Whether it's a craving for comfort food or a gourmet delight,<br> BiteBuddy is here to make your dining experience effortless and enjoyable. Happy ordering and bon appétit!");
        l1.setBounds(100,20,500,200);
        l1.setForeground(new Color(6,35,66,255));
        l1.setFont(new Font("Arial", Font.BOLD , 15));
        add(l1);


        user=new JButton("New user:Signup");
        user.setBounds(150,230,160,30);
        user.setBackground(new Color(6,35,66,255));
        user.setForeground(Color.white);
        user.addActionListener(this);
        add(user);

        login =new JButton("Login");
        login.setBounds(350,230,80,30);
        login.setBackground(new Color(6,35,66,255));
        login.setForeground(Color.white);
        login.addActionListener(this);
        add(login);

        p1=new JPanel();
        p1.setBounds(0,330,700,150);
        p1.setBackground(new Color(0,166,156,255));
        p1.setLayout(null);
        add(p1);

        


        ImageIcon img=new ImageIcon("C:\\Users\\Tana Bagewadi\\OneDrive\\Desktop\\vs_code\\picture1.png");
        Image image1=imageresize(img.getImage());
        ImageIcon resizedImg = new ImageIcon(image1);
        image=new JLabel(resizedImg);
        image.setBounds(40,2,100,100);
        p1.add(image);
        JLabel l2=new JLabel("<html><i>#EcoFriendlyEats</i></html>");
        l2.setBounds(30,85,160,30);
        l2.setFont(new Font("Arial", Font.BOLD , 15));
        l2.setForeground(Color.white);
        p1.add(l2);


        ImageIcon img2=new ImageIcon("C:\\Users\\Tana Bagewadi\\OneDrive\\Desktop\\vs_code\\picture2.png");
        Image i=imageresize(img2.getImage());
        ImageIcon resizedimg2=new ImageIcon(i);
        image2=new JLabel(resizedimg2);
        image2.setBounds(280,2,100,100);
        p1.add(image2);
        JLabel l3=new JLabel("<html><i>#ZeroWaste</i></html>") ;
        l3.setBounds(290,85,150,30);
        l3.setFont(new Font("Arial", Font.BOLD , 15)); 
        l3.setForeground(Color.white);
        p1.add(l3);      

        ImageIcon img3=new ImageIcon("C:\\Users\\Tana Bagewadi\\OneDrive\\Desktop\\vs_code\\picture3.png");
        Image i2=imageresize(img3.getImage());
        ImageIcon resizedimage3=new ImageIcon(i2);
        image3=new JLabel(resizedimage3);
        image3.setBounds(500,2,100,100);
        p1.add(image3);
        JLabel l4=new JLabel("<html><i>#Farmto/fork");
        l4.setBounds(505,87,100,30);
        l4.setFont(new Font("Arial", Font.BOLD , 15));
        l4.setForeground(Color.white);
        p1.add(l4);





        //function to resize image
    

        setVisible(true);
        setLocation(350,50);
        setSize(700,480);

    }
        public Image imageresize(Image i)
        {
            return i.getScaledInstance(110, 90, Image.SCALE_SMOOTH);
        }
        public void actionPerformed(ActionEvent e)
        {
        	if(e.getSource()==user)
        	{
        		new signup1();
        		setVisible(false);
        		
        		
        		  
        		
        		
        	}
        	if(e.getSource()==login)
        	{
        		new login();
        		setVisible(false);
        	}
        }
    public static void main(String args[])
    {
        new front();
    }
}
