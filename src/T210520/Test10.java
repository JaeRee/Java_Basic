package T210520;

import java.awt.*;



public class Test10 {
	
	public static void main(String[] args) {
		
		Frame f = new Frame("������ ����");
		f.setBounds(500, 300, 400, 300);
		f.setBackground(Color.PINK);
		f.setLayout(null);
		Color c1 = new Color(170,216,253);		// R,G,B,����
		
		Label label1 = new Label("����� �������� ������.");
		label1.setBounds(50, 50, 400, 50);
		
		
		
		//CheckboxGroup abc = new CheckboxGroup();			// ���߼��� ���ϰ� �׷����� False�� ����Ѵ�..
		Checkbox cb1 = new Checkbox("A��", true);			// A��, üũ���ϰ����True
		Checkbox cb2 = new Checkbox("B��", false);
		Checkbox cb3 = new Checkbox("AB��", false);
		Checkbox cb4 = new Checkbox("O��", false);
		cb1.setBounds(50, 100, 90, 50);
		cb2.setBounds(150, 100, 90, 50);
		cb3.setBounds(250, 100, 90, 50);
		cb4.setBounds(350, 100, 90, 50);
		
		
		
		
		
		f.add(cb1);	f.add(cb2);
		f.add(cb3); f.add(cb4);
		f.setVisible(true);
		
	}

}
