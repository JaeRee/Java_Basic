<<<<<<< HEAD
/*
 
    ★ 
   ★★★ 
  ★★★★★ 
 ★★★★★★★ 
★★★★★★★★★ 

*/

package T210523;


public class Test1 {
public static void main (String[] args) {
	String star="★";
	
	for(int i=0 ; i<5 ; i++) {
		
		
		for(int j=4-i ; j>0 ; j--){		// 5번 공간, 4, 3, 2, 1, 
			System.out.print(" ");
		}
		
		for(int j=2*i+1 ; j>0; j--) {		// 1, 3, 5, 7, 9 ..... 2 4 6 8  10 -1
			
			System.out.print(star);
		}
		System.out.println(" ");
		
	}
	
}
=======
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
	
>>>>>>> 1cfce454ef19cbb845c235f58fac5ee4439b87f9
}
