package Kanu;


import java.awt.*;
import java.awt.event.*;
import java.awt.image.*;


public class Test1 extends Frame {
	
	   Checkbox cb1,cb2,cb3,cb4,cb5,cb6;
	   CheckboxGroup group1, group2;
	   Label L1, L2, L3, L4;
	   Panel p1, p2, p3;
	   Button ok;
	   Image img=null, img2=null;
	   int coffee_money, size_money=0;
	   

	   
	   Test1(String title){
		super(title);
	    setBounds(300,300,630,600); // 237 465 �߰�
	    setLayout(null); 
	    setBackground(new Color(41,32,35));		
	   // Container c = this.getContentPane();			// JFrame �� �����̳� ����ؼ� ��������
	   // c.setBackground(new Color(41,32,35));
		
	    
	    
	    
	  //**************** IMG
	    
	   Toolkit t = Toolkit.getDefaultToolkit();
	   img = t.getImage("images/Kanu.jpg");
	   img2 = t.getImage("images/Kanu12.jpg");

	    
	    
	    
	    
	    
	    
	    
	    
	    
	   //**************** Checkbox1 (Ŀ�Ǽ���)
	   group1 = new CheckboxGroup(); 
	   cb1 = new Checkbox("�Ƹ޸�ī��(1000��)",group1, false);
	   cb2 = new Checkbox("ī���(1500��)",group1, false);
	   cb3 = new Checkbox("īǪġ��(2000��)",group1, false);
	   
	   
	   //**************** Checkbox2 (�������)
	   group2 = new CheckboxGroup(); 
	   cb4 = new Checkbox("Small(+0��)",group2, false);
	   cb5 = new Checkbox("Medium(+500��)",group2, false);
	   cb6 = new Checkbox("Large(+1000��)",group2, false);
	    
	   //**************** p1  (Ŀ�Ǽ���)
	   
      p1 = new Panel();
      p1.setLayout(new GridLayout(4,1));
      p1.setBackground(Color.pink);
      p1.setForeground(Color.black);
      p1.setBounds(20,60,170,280);
      
	   
	   //**************** p2  (�������)
	   
      p2 = new Panel();
      p2.setLayout(new GridLayout(4,1));
      p2.setBackground(Color.pink);
      p2.setForeground(Color.black);
      p2.setBounds(200,60,170,280);
      
      

      
      
      //*************** Label L1 �κ�  //
      L1 = new Label();
      L1.setBounds(30,80,150,50);
      L1.setBackground(new Color(158,73,66));
      L1.setAlignment(Label.CENTER);
      L1.setText("Ŀ�Ǽ���");
      
      
      L2 = new Label();
      L2.setBounds(30,80,150,50);
      L2.setBackground(new Color(158,73,66));
      L2.setAlignment(Label.CENTER);
      L2.setText("������ ����");
      
      p3 = new Panel();
      p3.setLayout(null);
      p3.setBounds(200, 0, 350, 525);
      
	   //***************** ��� ok��ư
	   ok = new Button("���");
	   ok.setBounds(20, 360, 350, 70);
	   ok.setBackground(new Color(158,73,66));
	   
	   ok.addActionListener(new EventF()); 		
	   
	   
	   //**************** �����Ͻ� Ŀ�Ǵ� ���
	   L3 = new Label();
	   L3.setBounds(20,460,350,70);
	   L3.setBackground(new Color(30,27,36));
	   L3.setAlignment(Label.CENTER);
	   
	   
	    
	 //**************** �����Ͻ� Ŀ�Ǵ� ���

	   
		
	    this.addWindowListener(new WindowAdapter(){ 
	       public void windowClosing(WindowEvent e) { 
	          System.exit(0); 
	          }
	       });
	    
	    
	    p1.add(L1); p1.add(cb1);p1.add(cb2);p1.add(cb3);
	    p2.add(L2); p2.add(cb4); p2.add(cb5); p2.add(cb6);
	    add(ok); add(L3); 
	    add(p1); add(p2); 
	    
	    
		this.setVisible(true);
	   }
	   
	   public void paint(Graphics g) {
		   g.drawImage(img,200,20,this);
		   g.drawImage(img2,0,0,this);
	   }
	   


	class EventF implements ActionListener{

		   public void actionPerformed(ActionEvent e) {
				
			if(cb1.getState()) {
				coffee_money+=1000;
			}else if(cb2.getState()) {
				coffee_money+=1500;
			}else if(cb3.getState()) {
				coffee_money+=2000;
			}
			
			if(cb4.getState()) {
				size_money+=0;
			}else if(cb5.getState()) {
				size_money+=500;
			}else if(cb6.getState()) {
				size_money+=1000;
			}
			
			
			L3.setText(coffee_money+size_money+"�� �Դϴ�.");
			L3.setForeground(Color.white);
			coffee_money=0; 
			size_money=0;
		
	   }
	   }
	   

	   
	   public static void main(String[] args) {
		   new Test1("Ŀ�Ǹӽ�");
	   }

}