package T210524;

import java.awt.*;
import java.awt.event.*;

import T210524.Test4_1.EventF; 


public class Test5 extends Frame {
	   Checkbox cb1,cb2,cb3,cb4,cb5,cb6;
	   CheckboxGroup group1, group2;
	   Label L1, L2, L3;
	   Panel p1, p2;
	   Button ok;
	   int coffee_money, size_money=0;
	
	   
	   Test5(String title){
		super(title);
	    setBounds(300,300,390,600);
	    setLayout(null); 
	    setBackground(Color.white);
	    
		
	   //**************** Checkbox1 (커피선택)
	   group1 = new CheckboxGroup(); 
	   cb1 = new Checkbox("아메리카노(1000원)",group1, false);
	   cb2 = new Checkbox("카페라떼(1500원)",group1, false);
	   cb3 = new Checkbox("카푸치노(2000원)",group1, false);
	   
	   
	   //**************** Checkbox2 (사이즈선택)
	   group2 = new CheckboxGroup(); 
	   cb4 = new Checkbox("Small(+0원)",group2, false);
	   cb5 = new Checkbox("Medium(+500원)",group2, false);
	   cb6 = new Checkbox("Large(+1000원)",group2, false);
	    
	   

	   
	   
	   
	   
	   /* checkbox 이벤트 처리 //
	   cb1.addItemListener(new EventE());
	   cb2.addItemListener(new EventE());
	   cb3.addItemListener(new EventE());
	   cb4.addItemListener(new EventE());
	   cb5.addItemListener(new EventE());
	   cb6.addItemListener(new EventE());
	   */
	   
	   
	   
	   
	   
	   //**************** p1  (커피선택)
	   
      p1 = new Panel();
      p1.setLayout(new GridLayout(4,1));
      p1.setBackground(Color.pink);
      p1.setForeground(Color.black);
      p1.setBounds(20,60,170,280);
      
	   
      
      
	   //**************** p2  (사이즈선택)
	   
      p2 = new Panel();
      p2.setLayout(new GridLayout(4,1));
      p2.setBackground(Color.pink);
      p2.setForeground(Color.black);
      p2.setBounds(200,60,170,280);
      
      
      
      
      //*************** Label L1 부분  //
      L1 = new Label();
      L1.setBounds(30,80,150,50);
      L1.setBackground(Color.yellow);
      L1.setAlignment(Label.CENTER);
      L1.setText("커피선택");
      
      
      L2 = new Label();
      L2.setBounds(30,80,150,50);
      L2.setBackground(Color.yellow);
      L2.setAlignment(Label.CENTER);
      L2.setText("사이즈 선택");
      
      
	   //***************** 계산 ok버튼
	   ok = new Button("계산");
	   ok.setBounds(20, 360, 350, 70);
	   ok.setBackground(new Color(0,64,128));
	   
	   ok.addActionListener(new EventF()); 		
	   
	   
	   //**************** 선택하신 커피는 결과
	   L3 = new Label();
	   L3.setBounds(20,460,350,70);
	   L3.setBackground(Color.yellow);
	   L3.setAlignment(Label.CENTER);
	    
	   
		
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
			
			
			L3.setText(coffee_money+size_money+"원 입니다.");
			coffee_money=0; 
			size_money=0;
		
	   }
	   }
	   
	   
	   
	   public static void main(String[] args) {
		   new Test5("커피머신");
	   }

}
