package T210521;

import java.awt.*;

public class Test1 {
	
	public static void main(String[] args) {
		
		Frame f = new Frame();
		
		f.setLocation(400, 300);
		f.setSize(500, 400);
		f.setBackground(Color.PINK);
		// f.setLayout(null);	: ���̾ƿ��� ��������, ���ҽ� F�� ��ũ�� �ٿ���
		
		// �������� �⺻ ���̾ƿ��� �������̾ƿ� (��, ��, ��, �� , �߾�)
		// f.setLayout(new BorderLayout(5, 10)); 

		
		Button b1 = new Button("Ȯ��1");
		Button b2 = new Button("Ȯ��2");	
		Button b3 = new Button("Ȯ��3");
		Button b4 = new Button("Ȯ��4");
		Button b5 = new Button("Ȯ��5");
		
		f.add(b1, "North");				// �տ� ���� �ڿ� ���� ����� ����. 
		f.add("South", b2); 
		f.add(b3); 
		f.add(b4); 
		f.add(b5);
		
		
		
		f.setVisible(true);
		
	}
	

}
