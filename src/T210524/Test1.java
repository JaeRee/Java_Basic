package T210524;

import java.awt.*;
import java.awt.event.*;


class EventA implements WindowListener{			// �̺�Ʈ A��� ó����

	public void windowOpened(WindowEvent e) {
		System.out.println("�������� �����մϴ�.");
	}

	public void windowClosing(WindowEvent e) {
		System.out.println("�������� �����մϴ�.");
		System.exit(0); // ������ ����
		
	}

	public void windowClosed(WindowEvent e) {
		
	}

	public void windowIconified(WindowEvent e) {
		
	}

	public void windowDeiconified(WindowEvent e) {
		
	}

	public void windowActivated(WindowEvent e) {
		
	}

	@Override
	public void windowDeactivated(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}			// 3. �̺�Ʈ ó����(�������� x��ư ������ ó���Ǵ� Ŭ����)
	
}



// 2�� �̻��� �߻�޼ҵ带 ������ �ִ� �������̽��� �̸� Adapter Ŭ������ �����Ǿ� �ֱ⶧����
// Adapter Ŭ������ ��� �޾Ƽ� ���ϴ� �ݹ�޼ҵ常 �������̵� �ϸ� ��!
class EventB extends WindowAdapter{				// �̺�ƮB ��� ó����
	public void windowClosing(WindowEvent e) {	//�������̵�
		System.exit(0);
	}
	
}



public class Test1 extends Frame{
	
	Button b1;
	
	
	Test1(String title){					// �����ڴ� ������� �ʱ�ȭ ���!
		super(title);						// 1. �̺�Ʈ �ҽ�(���)-Frame
		b1 = new Button("ok");
		
		
		//this.addWindowListener(new EventB());		// 2. �̺�Ʈ ������(������)
		
		
		// �͸�Ŭ���� �����(������ ����ó�� �ٸ� Ŭ������ �ҷ��� �ٳ�;�������, ª���͵��� �͸�Ŭ������ �ҷ��� �ٷ� ���� ��������!!!
		this.addWindowListener(new WindowAdapter(){		
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
			
		});
		
		
		
		
		
		setBounds(500, 300, 500, 400);
		setVisible(true);
		
	
	}
	
	
	public static void main(String[] args) {
		
		Test1 t1 = new Test1("�̺�Ʈ ó��������");
		
		
	}
	
}
