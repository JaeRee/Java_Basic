package T210602;

import java.awt.Frame;
import java.awt.event.*;

public class Test1 extends Frame {
	
	
	
	
	Test1(){
		
		
		
		
		
		
		
		
		this.addWindowListener(new WindowAdapter(){ // 익명클래스 사용! 
            public void windowClosing(WindowEvent e) { // 오버라이딩
               System.exit(0); // 프로그램 종료
            }
         });
		
		
		setVisible(true);
	}
	
	
	

	
	
	
	public static void main(String[] args) {
		
		Test1 T1 = new Test1();
		

	}

}
