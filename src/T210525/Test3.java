package T210525;

import java.awt.*;
import java.awt.event.*;

import javax.swing.JFrame;

public class Test3 extends Frame {
	Label l1, l2;
	TextField tf;
	
	
	
	Test3(String title){
		super(title);
		setBackground(Color.pink);
		this.setLayout(null);
		
		
		
		//�������� ȭ�� �߾ӿ� ���̱�
		Toolkit tk = Toolkit.getDefaultToolkit();
		Dimension screenSize = tk.getScreenSize();
		setBounds((screenSize.width)/2-200,
				(screenSize.height)/2-150, 400, 300);
		
		
		
		l1 = new Label("���� �Է��ϼ���");
		
		l2 = new Label("0");
		l2.setBackground(Color.black);
		l2.setForeground(Color.yellow);
		
		
		
		
		
		
		
		
		this.addWindowListener(new WindowAdapter() {	///****�͸�Ŭ����****
			public void windowClosing(WindowEvent e) {
				System.out.println("������ �����մϴ�.");
				System.exit(0);						//  ���α׷� ����.. �� �����ϸ� �����ϰ� ����!
			}
		});
		
		add(l1); add(l2);
		
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new Test3("Money Event");
		
	}

}
