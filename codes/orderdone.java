import javax.swing.*;
import java.awt.ActiveEvent;
import java.awt.event.ActionListener;
import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
public class orderdone extends JFrame implements ActionListener{
    JLabel imge,l1, l2,imge2;
    JButton b1;


    orderdone()
    {
        setLayout(null);
        getContentPane().setBackground(new Color(249,239,219));

        //check mark symbol section
        ImageIcon img=new ImageIcon("C:\\Users\\Tana Bagewadi\\OneDrive\\Desktop\\vs_code\\delivery1.png");

        Image i=img.getImage();
        Image newimg=i.getScaledInstance(200, 180,Image.SCALE_SMOOTH);
        img=new ImageIcon(newimg);

        imge=new JLabel(img);
        imge.setBounds(255,5,200,180);
        add(imge); 

        l1=new JLabel("<html><i><u>Thank you for Ordering</u></i></html>");
        l1.setBounds(250,130,300,30);
        l1.setFont(new Font("Arial", Font.BOLD , 20));
        add(l1);


        ImageIcon img1=new ImageIcon("C:\\Users\\Tana Bagewadi\\OneDrive\\Desktop\\vs_code\\delivery2.png");

        Image i1=img1.getImage();
        Image newimg1=i1.getScaledInstance(200, 180,Image.SCALE_SMOOTH);
        img1=new ImageIcon(newimg1);

        imge2=new JLabel(img1);
        imge2.setBounds(255,160,200,180);
        add(imge2); 
        
        l2=new JLabel("<html><i><u>Your Order is on the way</u></i></html>");
        l2.setBounds(250,320,300,30);
        l2.setFont(new Font("Arial", Font.BOLD , 20));
        add(l2);

        b1=new JButton("Go Back to Menue");
        b1.addActionListener(this);
        b1.setBounds(280,370,160,30);

        b1.setBackground(new Color(99,136,137));
        add(b1);




        setLocation(350,50);
        setVisible(true);
        setSize(770,480);
    }
    public void actionPerformed(ActionEvent e)
    {
    	if(e.getSource()==b1)
    	{
    		new main1();
    		setVisible(false);
    	}
    }
    public static void main(String args[])
    {
        new orderdone();
    }
}