package T210521;

import java.awt.*;
import java.awt.event.*;


class Event3 implements WindowListener{

	public void windowOpened(WindowEvent e) {}
	public void windowClosing(WindowEvent e) {
		System.out.println("������ �����մϴ�.");
		e.getWindow().setVisible(false);	//  ȭ�鿡�� �Ⱥ��̱�
		e.getWindow().dispose(); 			// 	�޸𸮿��� ����
		System.exit(0);						//  ���α׷� ����.. �� �����ϸ� �����ϰ� ����!
	}
	public void windowClosed(WindowEvent e) {}
	public void windowIconified(WindowEvent e) {}
	public void windowDeiconified(WindowEvent e) {}
	public void windowActivated(WindowEvent e) {}
	public void windowDeactivated(WindowEvent e) {}
}

class Event4 extends WindowAdapter{			//  
	public void windowClosing(WindowEvent e) {
		System.out.println("������ �����մϴ�.");
		System.exit(0); // ���α׷� ����
	}
}


public class Test6_1 {

	public static void main(String[] args) {
		
		Frame f = new Frame("�̺�Ʈ ó���κ�");		//	1. �̺�Ʈ �ҽ�(���)
		f.setBounds(500, 300, 500, 400);
		f.setBackground(Color.pink);
		
		
		
		f.addWindowListener(new WindowAdapter() {			///****�͸�Ŭ����****
			public void windowClosing(WindowEvent e) {
				System.out.println("������ �����մϴ�.");
				e.getWindow().setVisible(false);	//  ȭ�鿡�� �Ⱥ��̱�
				e.getWindow().dispose(); 			// 	�޸𸮿��� ����
				System.exit(0);						//  ���α׷� ����.. �� �����ϸ� �����ϰ� ����!
			}
		
		});				
		
		
		
		
		f.setVisible(true);
	}
}
