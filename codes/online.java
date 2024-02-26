import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class online extends JFrame implements ActionListener
{
    JButton b1;
    JTextField t1;

    online()
    {

        getContentPane().setBackground(new Color(248,244,236));
        setLayout(null);

        ImageIcon img=new ImageIcon("C:\\Users\\Tana Bagewadi\\OneDrive\\Desktop\\vs_code\\or.jpg");
        Image i=img.getImage();
        Image newimg=i.getScaledInstance(250, 250, Image.SCALE_SMOOTH);
        img=new ImageIcon(newimg);

        JLabel l1=new JLabel(img);
        l1.setBounds(250,20,250,250);
        add(l1);

        JLabel l2=new JLabel("<html>Scan the <u><b>QR</b></u> code</html>");
        l2.setBounds(289,280,200,30);
        l2.setFont(new Font("Arial", Font.BOLD , 20));
        l2.setForeground(Color.BLACK);
        add(l2);

        JLabel l3=new JLabel("OR");
        l3.setBounds(360,330,100,30);
        l3.setFont(new Font("Arial", Font.BOLD , 20));
        l3.setForeground(Color.BLACK);
        add(l3);

        t1=new JTextField();
        t1.setBounds(249,365,250,30);
        t1.setBackground(new Color(243,215,202));
        add(t1);

        JLabel l4=new JLabel("Enter UPI ID:");
        l4.setBounds(170,355,100,50);
        add(l4);

        b1=new JButton("Order");
        b1.setBounds(510,365,80,30);
        b1.setBackground(Color.RED);
        b1.addActionListener(this);
        add(b1);







        
        setLocation(350,50);
        setVisible(true);
        setSize(770,480);
    }
    public void actionPerformed(ActionEvent e)
    {
        if(e.getSource()==b1)
        {
            new orderdone();
            setVisible(false);
        }

    }
    public static void main(String args[])
    {
        new online();
    }
}