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
			arr[i].addActionListener(new EventButton());								// ������, �����ϸ� �̺�Ʈ ��ư Ŭ������ ��
		}
		

		

		
		
		this.addWindowListener(new WindowAdapter(){ // �͸�Ŭ���� ���! 
            public void windowClosing(WindowEvent e) { // �������̵�
               System.exit(0); // ���α׷� ����
            }
         });
		
		add(p1,"Center");
		
		
		setVisible(true);
	}
	
	class EventButton implements ActionListener{									// �ൿ����
		  public void actionPerformed(ActionEvent e) {
			  Button bo = (Button)e.getSource();
			  bo.setBackground(Color.black);
		  }
	}
	
	


	public static void main(String[] args) {
		
		Test1 T1 = new Test1();
		
		
	}

}