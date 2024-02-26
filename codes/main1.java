
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
public class main1 extends JFrame implements ActionListener{
    JLabel l1,l2,l3,l4,l5,l6,gravy,thali1;
    JPanel p1,p2,p3,p4,p5,p6,p7,p8,p9,p10,p11,p12,p13;
    JButton b1,b2,b3,b4,b5,b6,b7,b8,b9,b10,b11,thali,dosa,manchurian,sandwich,icecream,cake,rolls,juice,kichadi;
    JTextField t1;
    JMenuBar mb;
    main1()
    {
        setLayout(null);
        
        getContentPane().setBackground(new Color(245,232,199));




        p1=new JPanel();
        p1.setBounds(0,0,400,800);
        p1.setBackground(new Color(0,166,156,255));
        p1.setLayout(null);
        add(p1);


        
        l1=new JLabel("<html><u>Home:</u></html>");
        l1.setBounds(100,10,100,50);
        l1.setFont(new Font("Comic Sans MS", Font.PLAIN, 34));
        l1.setForeground(new Color(246,177,122));
        p1.add(l1);


        b1=new JButton("User login");
        b1.setBounds(10,150,250,30);
        b1.setBackground(new Color(6,35,66,255));
        b1.setForeground(new Color(246,177,122));
        p1.add(b1);

        b2=new JButton("Categories");
        b2.setBounds(10,200,250,30);
        b2.setBackground(new Color(6,35,66,255));
        b2.setForeground(new Color(246,177,122));
        p1.add(b2);

        b3=new JButton("Deals/promotion");
        b3.setBounds(10,250,250,30);
        b3.setBackground(new Color(6,35,66,255));
        b3.setForeground(new Color(246,177,122));
        p1.add(b3);

        
        b4=new JButton("Featured Items");
        b4.setBounds(10,300,250,30);
        b4.setBackground(new Color(6,35,66,255));
        b4.setForeground(new Color(246,177,122));
        p1.add(b4);

        
        b5=new JButton("Order Tracking");
        b5.setBounds(10,350,250,30);
        b5.setBackground(new Color(6,35,66,255));
        b5.setForeground(new Color(246,177,122));
        p1.add(b5);

        
        b6=new JButton("Customer Support");
        b6.setBounds(10,400,250,30);
        b6.setBackground(new Color(6,35,66,255));
        b6.setForeground(new Color(246,177,122));
        p1.add(b6);

        
        b7=new JButton("Featured restaurent");
        b7.setBounds(10,450,250,30);
        b7.setBackground(new Color(6,35,66,255));
        b7.setForeground(new Color(246,177,122));
        p1.add(b7);



        l2=new JLabel("<html><u>BiteBuddy");
        l2.setBounds(900,10,200,40);
        l2.setForeground(new Color(6,35,66,255));
        l2.setFont(new Font("Comic Sans MS", Font.PLAIN, 34));
        add(l2);

        //---------------------------------------
        l3=new JLabel("Pizza");
        l3.setBounds(550,280,60,60);
        l3.setForeground(new Color(6,35,66,255));
        add(l3);
        l4=new JLabel("Noodles");
        l4.setBounds(750,280,60,60);
        l4.setForeground(new Color(6,35,66,255));
        add(l4);


        mb=new JMenuBar();
        mb.setBounds(550,100,800,30);
        mb.setBackground(new Color(6,35,66,255));
        add(mb);


        p2=new JPanel();
        p2.setBounds(500,150,150,150);
        p2.setBackground(new Color(0,166,156,255));
        p2.setLayout(null);
        add(p2);

        //burgersection panel,button and image
        p3=new JPanel();
        p3.setBounds(700,150,150,150);
        p3.setBackground(new Color(0,166,156,255));
        p3.setLayout(null);
        add(p3);

        ImageIcon i3=new ImageIcon("C:\\Users\\Tana Bagewadi\\OneDrive\\Desktop\\vs_code\\noodles1.png");
        Image f=i3.getImage();
        Image newimg3=f.getScaledInstance(150,150 , Image.SCALE_SMOOTH);
        i3=new ImageIcon(newimg3);
        b10=new JButton(i3);
        b10.setBounds(0,0,150,150);
        b10.setBackground(new Color(0,166,156,255));
        b10.addActionListener(this);
        p3.add(b10);


        p4=new JPanel();
        p4.setBounds(500,350,150,150);
        p4.setBackground(new Color(0,166,156,255));
        p4.setLayout(null);
        add(p4);

        p5=new JPanel();
        p5.setBounds(700,350,150,150);
        p5.setBackground(new Color(0,166,156,255));
        p5.setLayout(null);
        add(p5);

        p6=new JPanel();
        p6.setBounds(500,550,150,150);
        p6.setBackground(new Color(0,166,156,255));
        p6.setLayout(null);
        add(p6);

        p7=new JPanel();
        p7.setBounds(700,550,150,150);
        p7.setBackground(new Color(0,166,156,255));
        p7.setLayout(null);
        add(p7);

        
        p8=new JPanel();
        p8.setBounds(1000,150,150,150);
        p8.setBackground(new Color(0,166,156,255));
        p8.setLayout(null);
        add(p8);

        
        p9=new JPanel();
        p9.setBounds(1200,150,150,150);
        p9.setBackground(new Color(0,166,156,255));
        p9.setLayout(null);
        add(p9);

        
        p10=new JPanel();
        p10.setBounds(1000,350,150,150);
        p10.setBackground(new Color(0,166,156,255));
        p10.setLayout(null);
        add(p10);

        
        p11=new JPanel();
        p11.setBounds(1200,350,150,150);
        p11.setBackground(new Color(0,166,156,255));
        p11.setLayout(null);
        add(p11);

        
        p12=new JPanel();
        p12.setBounds(1000,550,150,150);
        p12.setBackground(new Color(0,166,156,255));
        p12.setLayout(null);
        add(p12);

        
        p13=new JPanel();
        p13.setBounds(1200,550,150,150);
        p13.setBackground(new Color(0,166,156,255));
        p13.setLayout(null);
        add(p13);


        //pizza section
        ImageIcon i1=new ImageIcon("C:\\Users\\Tana Bagewadi\\OneDrive\\Desktop\\vs_code\\pizza.png");
        Image i=i1.getImage();
        Image newimg=i.getScaledInstance(150, 150,Image.SCALE_SMOOTH);
        i1=new ImageIcon(newimg); 

        b8=new JButton(i1);
        b8.setBounds(0,0,150,150);
        b8.setBackground(new Color(0,166,156,255));
        b8.addActionListener(this);
        p2.add(b8);


        //noodles section
        ImageIcon i2=new ImageIcon("C:\\Users\\Tana Bagewadi\\OneDrive\\Desktop\\vs_code\\noodles1.pn");
        Image e=i2.getImage();
        Image newimg2=e.getScaledInstance(140,140,Image.SCALE_SMOOTH );
        i2=new ImageIcon(newimg2);

       // b9=new JButton(i2);
        //b9.setBounds(0,0,140,140);
        //b9.setBackground(new Color(0,166,156,255));
       // b9.addActionListener();
       // p3.add(b9);


        //thali section
        ImageIcon i4=new ImageIcon("C:\\Users\\Tana Bagewadi\\OneDrive\\Desktop\\vs_code\\thali.png");
        Image e2=i4.getImage();
        Image newimge3=e2.getScaledInstance(150,190 ,Image.SCALE_SMOOTH);
        i4=new ImageIcon(newimge3);

        thali =new JButton(i4);
        thali.setBounds(0,0,150,150);
        thali.setBackground(new Color(0,166,156,255));
        thali.addActionListener(this);
        p4.add(thali);

        thali1 =new JLabel("Thali");
        thali1.setBounds(550,500,100,30);
        thali1.setForeground(new Color(6,35,66,255));
        add(thali1);

       


        //gravy selection
        ImageIcon i5=new ImageIcon("C:\\Users\\Tana Bagewadi\\OneDrive\\Desktop\\vs_code\\gravy.png");
        Image e3=i5.getImage();
        Image newimg4=e3.getScaledInstance(150,190 ,Image.SCALE_SMOOTH);
        i5=new ImageIcon(newimg4);

        b11=new JButton(i5);
        b11.setBounds(0,0,150,150);
        b11.setBackground(new Color(0,166,156,255));
        b11.addActionListener(this);//button for gravy
        p5.add(b11);

        gravy=new JLabel("Gravy");
        gravy.setBounds(750,500,80,20);
        gravy.setForeground(new Color(6,35,66,255));
        add(gravy);


        //dosa section
        ImageIcon i6 =new ImageIcon("c:\\Users\\Tana Bagewadi\\OneDrive\\Desktop\\vs_code\\dosa.png");
        Image e4=i6.getImage();
        Image newimg5 =e4.getScaledInstance(150, 170, Image.SCALE_SMOOTH);
        i6=new ImageIcon(newimg5);

        dosa =new JButton(i6);
        dosa.setBounds(0,0,150,160);
        dosa.setBackground(new Color(0,166,156,255));
        dosa.addActionListener(this);
        p6.add(dosa);

        JLabel dosa1=new JLabel("Dosa");
        dosa1.setBounds(550,700,80,30);
        dosa1.setForeground(new Color(6,35,66,255));
        add(dosa1);


        //manchurian section

        ImageIcon i7=new ImageIcon("C:\\Users\\Tana Bagewadi\\OneDrive\\Desktop\\vs_code\\manchurian.png");
        Image e5=i7.getImage();
        Image newimg6=e5.getScaledInstance(150,150,Image.SCALE_SMOOTH);
        i7=new ImageIcon(newimg6);

        manchurian =new JButton(i7);
        manchurian.setBounds(0,0,150,150);
        manchurian.setBackground(new Color(0,166,156,255));
        manchurian.addActionListener(this);
        p7.add(manchurian);

        JLabel manchu =new JLabel("Manchurian");
        manchu.setBounds(750,700,80,30);
        manchu.setForeground(new Color(6,35,66,255));
        add(manchu);

        //sandwich section

        ImageIcon i8=new ImageIcon("C:\\Users\\Tana Bagewadi\\OneDrive\\Desktop\\vs_code\\sandwich.png");
        Image e6=i8.getImage();
        Image newimg7=e6.getScaledInstance(150, 120, Image.SCALE_SMOOTH);
        i8=new ImageIcon(newimg7);

        sandwich=new JButton(i8);
        sandwich.setBounds(0,15,150,120);
        sandwich.setBackground(new Color(0,166,156,255));
        sandwich.addActionListener(this);
        p8.add(sandwich);
        
        JLabel sand=new JLabel("Sandwich");
        sand.setBounds(1040,293,80,30);
        add(sand);

        //ice creamsection
        
        ImageIcon i9=new ImageIcon("C:\\Users\\Tana Bagewadi\\OneDrive\\Desktop\\vs_code\\f8222d4c28f8ef38666e27d38ba1ac56-removebg-preview.png");
        Image e7=i9.getImage();
        Image newimg8=e7.getScaledInstance(150, 150,Image.SCALE_SMOOTH);
        i9=new ImageIcon(newimg8);

        icecream=new JButton(i9);
        icecream.setBounds(0,0,150,150);
        icecream.setBackground(new Color(0,166,156,255));
        icecream.addActionListener(this);
        p9.add(icecream);
        
        JLabel ice=new JLabel("Ice Cream");
        ice.setBounds(1240,293,100,30);
        ice.setForeground(new Color(6,35,66,255));
        add(ice);
        


        //cake section

        ImageIcon i10 =new ImageIcon("C:\\Users\\Tana Bagewadi\\OneDrive\\Desktop\\vs_code\\cake.png");
        Image e8=i10.getImage();
        Image newimg9 =e8.getScaledInstance(140, 140, Image.SCALE_SMOOTH);
        i10=new ImageIcon(newimg9);

        cake =new JButton(i10);
        cake.setBounds(5,0,140,140);
        cake.setBackground(new Color(0,166,156,255));
        cake.addActionListener(this);
        p11.add(cake);
        
        JLabel cak=new JLabel("Cake");
        cak.setBounds(1245,495,100,30);
        cak.setForeground(new Color(6,35,66,255));
        add(cak);
        
        
        
        
        
        //rolls section
        
        ImageIcon i11 =new ImageIcon("C:\\Users\\Tana Bagewadi\\OneDrive\\Desktop\\vs_code\\rolls.png");
        Image e9=i11.getImage();
        Image newimg10=e9.getScaledInstance(130, 100, Image.SCALE_SMOOTH);
        i11=new ImageIcon(newimg10);

        rolls=new JButton(i11);
        rolls.setBounds(10,20,130,100);
        rolls.setBackground(new Color(0,166,156,255));
        rolls.addActionListener(this);
        p10.add( rolls);
        
        JLabel roll=new JLabel("Rolls");
        roll.setBounds(1049,495,60,30);
        roll.setForeground(new Color(6,35,66,255));
        add(roll);
        
        //juice section
        
        
        ImageIcon i12 =new ImageIcon("C:\\Users\\Tana Bagewadi\\OneDrive\\Desktop\\vs_code\\11.png");
        Image e10=i12.getImage();
        Image newimg11=e10.getScaledInstance(120, 130, Image.SCALE_SMOOTH);
        i12=new ImageIcon(newimg11);

        juice=new JButton(i12);
        juice.setBounds(15,10,120,130);
        juice.setBackground(new Color(0,166,156,255));
        juice.addActionListener(this);
        p12.add( juice);
        
        JLabel juice1=new JLabel("Juice");
        juice1.setForeground(new Color(6,35,66,255));
        juice1.setBounds(1049,700,60,30);
        add(juice1);
        
        
        
        //Kichadi Section
        
        ImageIcon i13 =new ImageIcon("C:\\Users\\Tana Bagewadi\\OneDrive\\Desktop\\vs_code\\kichadi.png");
        Image e11=i13.getImage();
        Image newimg12=e11.getScaledInstance(150, 150, Image.SCALE_SMOOTH);
        i13=new ImageIcon(newimg12);

        kichadi=new JButton(i13);
        kichadi.setBounds(15,10,120,130);
        kichadi.setBackground(new Color(0,166,156,255));
        kichadi.addActionListener(this);
        p13.add(  kichadi);
        
        JLabel kichadi1=new JLabel("Kichadi");
        kichadi1.setBounds(1245,700,100,30);
        kichadi1.setForeground(new Color(6,35,66,255));
        add(kichadi1);
        
        
      

        setSize(1500,800);
        setVisible(true);
       
    }
    public void actionPerformed(ActionEvent e)
    {
    	if(e.getSource()==b8)
    	{
    		new pizza();
    		setVisible(false);
    	}
        if(e.getSource()==b10)
        {
            new noodles();
           setVisible(false);
        }
        if(e.getSource()==b11)
        {
        	new gravy();
        	setVisible(false);
        }
        if(e.getSource()==thali)
        {
        	new thali();
        	setVisible(false);
        }
        if(e.getSource()==dosa)
        {
        	new dosa();
        	setVisible(false);
        }
        if(e.getSource()==manchurian)
        {
        	setVisible(false);
        	new manchurian();
        	
        }
        if(e.getSource()==sandwich)
        {
        	new sandwich();
        	setVisible(false);
        }
        if(e.getSource()==rolls)
        {
        	new rolls();
        	setVisible(false);
        }
        if(e.getSource()==juice)
        {
        	new juice();
        	setVisible(false);
        }
        if(e.getSource()==kichadi)
        {
        	new kichadi();
        	setVisible(false);
        }
        if(e.getSource()==icecream)
        {
        	new icecream();
        	setVisible(false);
        }
        if(e.getSource()==cake)
        {
        	new cake();
        	setVisible(false);
        }
    }
    public static void main(String args[])
    {
        new main1();
    }
}