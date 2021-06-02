package T210602;

import java.awt.*;
import java.util.*;
import java.awt.event.*;


public class Test1 extends Frame {
	
	Panel p1 = new Panel();
	
	Button arr[] = new Button[9];
	int BG[] = new int[9];
	
	
	
	Test1(){
		
		setLayout(null);
		setBounds(600, 450, 600, 600);
		
		p1 = new Panel();
		p1.setLayout(new GridLayout(3,3));
		p1.setBounds(20, 30, 500, 500);
		
		for(int i=0; i<9;i++) {
			arr[i] = new Button();
			p1.add(arr[i]);
			arr[i].addActionListener(new EventButton());								// 감지기, 감지하면 이벤트 버튼 클래스로 감
		}
		

		

		
		
		this.addWindowListener(new WindowAdapter(){ // 익명클래스 사용! 
            public void windowClosing(WindowEvent e) { // 오버라이딩
               System.exit(0); // 프로그램 종료
            }
         });
		
		add(p1,"Center");
		
		
		setVisible(true);
	}
	
	class EventButton implements ActionListener{									// 행동개시
		  public void actionPerformed(ActionEvent e) {
			  Button bo = (Button)e.getSource();
			  bo.setBackground(Color.black);
		  }
	}
	
	


	public static void main(String[] args) {
		
		Test1 T1 = new Test1();
		
		
	}

}