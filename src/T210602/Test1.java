package T210602;

import java.awt.Frame;
import java.awt.event.*;

public class Test1 extends Frame {
	
	
	
	
	Test1(){
		
		
		
		
		
		
		
		
		this.addWindowListener(new WindowAdapter(){ // �͸�Ŭ���� ���! 
            public void windowClosing(WindowEvent e) { // �������̵�
               System.exit(0); // ���α׷� ����
            }
         });
		
		
		setVisible(true);
	}
	
	
	

	
	
	
	public static void main(String[] args) {
		
		Test1 T1 = new Test1();
		

	}

}
