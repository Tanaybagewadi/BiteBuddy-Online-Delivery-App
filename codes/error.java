import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;
public class error extends JFrame implements ActionListener{

	JButton b1;
	
	error()
	{
		setLayout(null);
		
		getContentPane().setBackground(new Color(252,174,174));
		
		
		ImageIcon img=new ImageIcon("C:\\Users\\Tana Bagewadi\\OneDrive\\Desktop\\vs_code\\error.png");
		Image i=img.getImage();
		Image newimg=i.getScaledInstance(150, 150, Image.SCALE_FAST);
		img=new ImageIcon(newimg);
		
		JLabel imglab=new JLabel(img);
		imglab.setBounds(300,80,150,150);
		add(imglab);
		
		JLabel l1=new JLabel("Error");
		l1.setBounds(320,240,100,50);
		l1.setFont(new Font("Arial",Font.BOLD,40));
		l1.setForeground(Color.BLACK);
		add(l1);
		
		JLabel l2=new JLabel("<html>You have entered wrong<u><i> Username </i></u>or<i><u> Password </u></i><br><center>Please enter correct details</html> ");
		l2.setBounds(150,300,500,50);
		l2.setFont(new Font("Arial",Font.BOLD,20));
		l2.setForeground(Color.BLACK);
		add(l2);
		
		
		b1=new JButton("RETRY");
		b1.setBounds(325,360,100,30);
		b1.setBackground(Color.red);
		b1.setForeground(Color.white);
		b1.addActionListener(this);
		add(b1);
		
		
		
		
		
		
		
		
		 setVisible(true);
         setLocation(350,50);
         setSize(770,480);
	}
	public void actionPerformed(ActionEvent e)
	{
		if(e.getSource()==b1)
		{
			new login();
			setVisible(false);
		}
		
	}
	public static void main(String[] args) {
		new error();

	}

}
