package T210524;

import java.awt.*;
import java.awt.event.*;


class EventA implements WindowListener{

	public void windowOpened(WindowEvent e) {
		
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



public class Test1 extends Frame{
	
	Button b1;
	
	
	Test1(String title){					// �����ڴ� ������� �ʱ�ȭ ���!
		super(title);						// 1. �̺�Ʈ �ҽ�(���)-Frame
		b1 = new Button("ok");
		
		
		this.addWindowListener(new EventA());		// 2. �̺�Ʈ ������(������)
		
		
		
		
		
		
		
		
		setBounds(500, 300, 500, 400);
		setVisible(true);
		
	
	}
	
	
	public static void main(String[] args) {
		
		Test1 t1 = new Test1("�̺�Ʈ ó��������");
		
		
	}
	
}
