package T210521;

import java.awt.*;
import java.awt.event.*;


class Click implements ActionListener{
	public void actionPerformed(ActionEvent arg0) {
		System.out.println("Ȯ�� ��ư�� �����̽��ϴ�.");
	}
}


public class Test7 {
	
	public static void main(String[] args) {
		
		Frame f = new Frame();
		f.setBounds(500, 300, 500, 500);
		f.setBackground(Color.pink);
		f.setLayout(null);
		
		
		Button b1 = new Button("Ȯ��");			// 1. �̺�Ʈ ��� (�ҽ�)
		b1.setBounds(70, 75, 100, 100);
		b1.addActionListener(new Click());		// 2. ������(�̺�Ʈ ������) ��������?
		
			
		Button b2 = new Button("�ּ�");
		b2.setBounds(270, 75, 100, 100);
		b2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.out.println("��� ������ ������");
			}
		});
		
		
		
		f.addWindowListener(new WindowAdapter() {	///****�͸�Ŭ����****
			public void windowClosing(WindowEvent e) {
				System.out.println("������ �����մϴ�.");
				System.exit(0);						//  ���α׷� ����.. �� �����ϸ� �����ϰ� ����!
			}
		});
		
		
		f.add(b1);	f.add(b2);
		f.setVisible(true);
		
	}
}
