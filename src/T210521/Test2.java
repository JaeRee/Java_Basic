package T210521;

import java.awt.Button;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.Panel;

public class Test2 {
	
	
		public static void main(String[] args) {
			
			Frame f = new Frame("FlowLayout");	// �������� �����̳�
			f.setLayout(new GridLayout());		// ��->����, ��->�Ʒ�
			f.setBounds(400, 300, 600, 500);
			f.setBackground(Color.BLUE);
			
			
			
			
			Panel p1 = new Panel();		// �������� �����̳ʷ� �ٸ� �������� �����̳ʿ� �پ����
			p1.setLayout(null);			// ��ǥ�� ����ϰڴ�.
			p1.setBackground(Color.pink);
			// p1.setBounds(300, 200, 200, 100);
			p1.setSize(200, 200);
			
			
			Panel p2 = new Panel();		// �������� �����̳ʷ� �ٸ� �������� �����̳ʿ� �پ����
			p2.setLayout(null);			// ��ǥ�� ����ϰڴ�.
			p2.setBackground(Color.green);
			// p2.setBounds(300, 200, 200, 100);
			p2.setSize(200, 200);
			
			
			
			Button b1 = new Button("OK");
			b1.setBackground(Color.yellow);
			b1.setBounds(50, 50, 100, 50);
			p1.add(b1);
			
			
			p2.add(b1);
			p2.add(b1);
			p2.add(b1);
			p2.add(b1);
			
			
			
			
			f.add(p1);
			f.add(b1);
			f.add(p2);
			f.setVisible(true);
			
		}
}
