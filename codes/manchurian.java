import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class manchurian extends JFrame implements ActionListener
{
    JPanel p1;
    JLabel l1,l2,l3,l4,cart,item1,item2,item3,item4,totbl;
    //panel4 jlabels e1,e2,e3,e4,e5,b;
    JLabel e1,e2,e3,e4,b,e5,e6,e7,e8;
    JButton b1,plus1,minus1,plus2,minus2,plus3,minus3,plus4,minus4,confirm,procced,cash,online;
    JPanel p2,p3,p4;
    private int quantity1 = 0;
    private int quantity2 = 0;
    private int quantity3 = 0;
    private int quantity4 = 0;
    private int price1 = 40;
    private int price2=35;
    private int price3=45;
    private int price4=100;
    private int totalbill;
    private int tb=0;
    int sum1=0;
    int sum2=0;
    int sum3=0;
    int sum4=0;
    int tax=40;
    int delivery=20;
    manchurian()
    {
    	 getContentPane().setBackground(new Color(246,177,122));
        setLayout(null);
        setLayout(null);
        p1 = new JPanel();
        p1.setLayout(null);
        p1.setBackground(new Color(0,166,156,255));
        p1.setPreferredSize(new Dimension(160, 400)); // Set preferred size for the panel
        JScrollPane j1 = new JScrollPane(p1);
        j1.setBounds(50, 80, 380, 400); // Set bounds for the scroll pane
        add(j1);

        l1=new JLabel("Dishes");
        l1.setBounds(170,10,100,50);
        l1.setForeground(new Color(6,35,66,255));
        add(l1);
    

        b1=new JButton("back");
        b1.setBounds(0,0,60,30);
        b1.setBackground(new Color(6,35,66,255));
        b1.setForeground(Color.white);
        b1.addActionListener(this);
        add(b1);
    
        //-------------------------------------------------
        l2=new JLabel("<html>1.Gobi Manchuri<br>rs/- =40</html>");
        l2.setBounds(10,20,150,50);
        l2.setForeground(Color.white);
        p1.add(l2);
    
        plus1=new JButton("+");
        plus1.setBounds(180,20,50,30);
        plus1.setBackground(new Color(6,35,66,255));
        plus1.setFont(new Font("Arial", Font.BOLD , 20));
        plus1.setForeground(Color.white);
        plus1.addActionListener(this);
        p1.add(plus1);
    
        minus1=new JButton("remove");
        minus1.setBounds(250,20,90,30);
        minus1.setBackground(new Color(6,35,66,255));
        minus1.setForeground(Color.white);
        minus1.addActionListener(this);
        p1.add(minus1);
        //----------------------------------------------------------------
        l3=new JLabel("<html>2.Dry Gobi<br>rs/- =35</html>");
        l3.setBounds(10,100,180,50);
        l3.setForeground(Color.white);
        p1.add(l3);
    
        plus2=new JButton("+");
        plus2.setBounds(180,110,50,30);
        plus2.setBackground(new Color(6,35,66,255));
        plus2.setFont(new Font("Arial", Font.BOLD , 20));
        plus2.setForeground(Color.white);
        plus2.addActionListener(this);
        p1.add(plus2);
    
        minus2=new JButton("remove");
        minus2.setBounds(250,110,90,30);
        minus2.setBackground(new Color(6,35,66,255));
        minus2.setForeground(Color.white);
        minus2.addActionListener(this);
        p1.add(minus2);
        //----------------------------------------------------------------------
    
        l3=new JLabel("<html>3.Gobi Chilli<br>rs/- =45</html>");
        l3.setBounds(10,140,180,150);
        l3.setForeground(Color.WHITE);
        p1.add(l3);
    
        plus3=new JButton("+");
        plus3.setBounds(180,200,50,30);
        plus3.setBackground(new Color(6,35,66,255));
        plus3.setFont(new Font("Arial", Font.BOLD , 20));
        plus3.addActionListener(this);
        plus3.setForeground(Color.white);
        p1.add(plus3);
    
        minus3=new JButton("remove");
        minus3.setBounds(250,200,90,30);
        minus3.setBackground(new Color(6,35,66,255));
        minus3.addActionListener(this);
        minus3.setForeground(Color.white);
        p1.add(minus3);
        //----------------------------------------------------
    
        l4=new JLabel("<html>4.Chicken Manchurian<br>rs/- =100</html>");
        l4.setBounds(10,220,180,150);
        l4.setForeground(Color.white);
        p1.add(l4);
    
        plus4=new JButton("+");
        plus4.setBounds(180,280,50,30);
        plus4.setFont(new Font("Arial", Font.BOLD , 20));
        plus4.setBackground(new Color(6,35,66,255));
        plus4.setForeground(Color.white);
        plus4.addActionListener(this);
        p1.add(plus4);
    
        minus4=new JButton("Remove");
        minus4.setBounds(250,280,90,30);
        minus4.setBackground(new Color(6,35,66,255));
        minus4.setForeground(Color.white);
        minus4.addActionListener(this);
        p1.add(minus4);
    
        p2=new JPanel();
        p2.setBounds(50,560,350,100);
        p2.setBackground(new Color(0,166,156,255));
        add(p2);
        item1=new JLabel();
        p2.add(item1);
        item2=new JLabel();
        p2.add(item2);
        item3=new JLabel();
        p2.add(item3);
        item4=new JLabel();
        p2.add(item4);


        p3=new JPanel();
        p3.setBounds(50,680,220,30);
        p3.setBackground(new Color(0,166,156,255));
        add(p3);

        totbl=new JLabel();
        p3.add(totbl);
        
    cart=new JLabel("<html><b>Your cart:");
    cart.setBounds(40,528,60,30);
   add(cart);
    
   confirm=new JButton("Confirm your order");
   confirm.setBounds(50,710,160,30);
   confirm.setBackground(new Color(6,35,66,255));
   confirm.setForeground(Color.white);
   confirm.addActionListener(this);
   add(confirm);


   procced =new JButton("Procced");
   procced.setBounds(380,740,100,20);
   procced.setBackground(new Color(6,35,66,255));
   procced.setForeground(Color.white);
   procced.addActionListener(this);
   add(procced);
   
   p4=new JPanel();
   p4.setBounds(20,500,420,200);
 //  p3.setBackground(new Color(0,166,156,255));
   p4.setBackground(Color.yellow);
   p4.setLayout(null);
   p4.setVisible(false);
   add(p4);
   e1=new JLabel();
   e1.setBounds(0,0,280,30);
   p4.add(e1);
   e2=new JLabel();
   e2.setBounds(0,27,310,20);
   p4.add(e2);
   e3=new JLabel();
   e3.setBounds(0,44,350,20);
   p4.add(e3);
   e4=new JLabel();
   e4.setBounds(0,59,350,20);
   p4.add(e4);
   b=new JLabel();
   p4.add(b);
   e5=new JLabel();
   e5.setBounds(6,75,100,30);
   p4.add(e5);
   e6=new JLabel();
   e6.setBounds(5,89,100,30);
   p4.add(e6);
   e7=new JLabel();
   e7.setBounds(5,103,100,30);
   p4.add(e7); 
   e8=new JLabel("<html><b></b></html>");
   e8.setBounds(6,117,150,30);
   e8.setForeground(Color.red);
   p4.add(e8);
        cash=new JButton("cash");
        cash.setBounds(20,160,100,30);
        cash.setBackground(new Color(6,35,66,255));
        cash.setForeground(Color.white);
        cash.addActionListener(this);
        p4.add(cash);

        online=new JButton("pay online");
        online.setBounds(150,160,120,30);
        online.setBackground(new Color(6,35,66,255));
        online.setForeground(Color.white);
        online.addActionListener(this);
        p4.add(online);

    setLocation(550,10);
    setSize(500,800);
    setVisible(true);
    }
    public int calculatebill(int quantity,int price)
    {
     
        int sum=quantity*price;
        return sum;
    }
    public int totalbill(int sum1,int sum2,int sum3,int sum4)
    {
        totalbill=sum1+sum2+sum3+sum4;
        return totalbill;
    }
    public void actionPerformed(ActionEvent e)
    {
      
       
    
      
       if(e.getSource()==plus1)
       {
        quantity1++;
         sum1 = calculatebill(quantity1, price1);
        item1.setText("<html>1.Gobi Manchuri <U> QUANTITY ="+quantity1+" PRICE ="+(sum1));

        }
        else if(e.getSource()==minus1)
        {
            item1.setText("");
        }

        if(e.getSource()==plus2)
        {
            quantity2++;
            sum2=calculatebill(quantity2,price2);
            item2.setText("<html>2.Dry Gobi<u> QUANTITY ="+quantity2+" PRICE ="+sum2);
            
        }
        else if(e.getSource()==minus2)
        {
           

        item2.setText("");
        }




        if(e.getSource()==plus3)
        {
            quantity3++;
            sum3=calculatebill(quantity3, price3);
            item3.setText("<html>3.Gobi chilli<u> QUANTITY ="+quantity3+" PRICE ="+sum3);

        }
        else if(e.getSource()==minus3)
        {
            item3.setText("");
        }




        if(e.getSource()==plus4)
        {
            quantity4++;
            sum4=calculatebill(quantity4, price4);
            item4.setText("<html>4.Chicken Manchurian <u> QUANTITY ="+quantity4+" PRICE ="+sum4);
        }
        else if(e.getSource()==minus4)
        {
            item4.setText("");
        }

        if(e.getSource()==confirm)
        {
            tb=totalbill(sum1,sum2,sum3,sum4);
            totbl.setText(""+tb);
        }

        //procced
        if(e.getSource()==procced)
        {
            p2.setVisible(false);
            p3.setVisible(false);
            cart.setVisible(false);
            p4.setVisible(true);
            confirm.setVisible(false);

               String a=item1.getText();
               String  b=item2.getText();
               String c=item3.getText();
               String d=item4.getText();
               int b1=Integer.parseInt(totbl.getText());
                e1.setText(a);
                e2.setText(b);
                e3.setText(c);
                e4.setText(d);
                e5.setText("\nbill ="+b1);
                e6.setText("Tax="+tax);
                e7.setText("delivery cost ="+delivery);
                int finalbill=b1+tax+delivery;
                e8.setText("\nFinal bill payable ="+finalbill);
                
        }
        if(e.getSource()==online)
        {
            new online();
            setVisible(false);
        }
        if(e.getSource()==cash)
        {
            new orderdone();
            setVisible(false);
        }
        if(e.getSource()==b1)
        {
        	new main1();
        	setVisible(false);
        }
        if(e.getSource()==b1)
        {
        	new main1();
        	setVisible(false);
        }
    

    }
    
    public static void main(String args[])
    {
        new manchurian();
    }
}