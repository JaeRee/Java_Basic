package T210521;

import java.awt.*;

public class Test3 {
	
	public static void main(String[] args) {
		
		
		Frame f = new Frame("�׸��� ���̾ƿ� ����");
		f.setLayout(new GridLayout(3,1));			// 3�� 1��
		f.setBounds(300, 200, 500, 700);
		f.setBackground(Color.PINK);
		
		
		Panel p1 = new Panel();
		p1.setBackground(Color.PINK);
		p1.setLayout(null);
		
		Label label1 = new Label("����� �������� ���ÿ�: ");
		label1.setBackground(Color.WHITE);
		label1.setBounds(50, 50, 400, 60);
		label1.setForeground(Color.magenta);
		label1.setAlignment(Label.CENTER);
		
		Button b1 = new Button("��ư1");
		Button b2 = new Button("��ư2");
		
		b1.setBounds(50, 130, 190, 50);
		b2.setBounds(250, 130, 190, 50);
		
		p1.add(label1); p1.add(b1); p1.add(b2);
		
//********************* ������ P1 **********************************************		
		
		
		CheckboxGroup abc = new CheckboxGroup();
		Checkbox cb1 = new Checkbox("A��", abc, true);
		Checkbox cb2 = new Checkbox("B��", abc, true);
		Checkbox cb3 = new Checkbox("AB��", abc, true);
		Checkbox cb4 = new Checkbox("O��", abc, true);
		cb1.setBounds(50, 70, 70, 50);
		cb2.setBounds(160, 70, 70, 50);
		cb3.setBounds(240, 70, 70, 50);
		cb4.setBounds(330, 70, 70, 50);
		
		Font font1 = new Font("DialogInput", Font.BOLD, 20); // ���� ��Ÿ��, ũ��
		cb1.setFont(font1); cb1.setForeground(Color.white);
		cb2.setFont(font1); cb2.setForeground(Color.white);
		cb3.setFont(font1); cb3.setForeground(Color.white);
		cb4.setFont(font1); cb4.setForeground(Color.white);
		
	
		Panel p2 = new Panel();
		p2.setBackground(Color.green);
		p2.setLayout(null);
		p2.add(cb1); p2.add(cb2); p2.add(cb3); p2.add(cb4); 
		
		Label label2 = new Label("ddddddd");
		label2.setBackground(Color.WHITE);
		label2.setBounds(50, 50, 400, 60);
		label2.setForeground(Color.magenta);
		label2.setAlignment(Label.CENTER);
		

//********************* ������ P2 **********************************************		
		
		
		Panel p3 = new Panel();
		p3.setBackground(Color.BLUE);
		p3.setLayout(null);
		
		
		Label label3 = new Label("����� �������� ..");
		label3.setBackground(Color.white);
		label3.setBounds(50, 50, 380, 110);
		Font font2 = new Font("DialogInput", Font.BOLD, 20); // ���� ��Ÿ��, ũ��
		label3.setFont(font2); label3.setForeground(Color.black);
		label3.setAlignment(Label.CENTER);
		
		
		p3.add(label3);
		
		
		
		f.add(p1);
		f.add(p2);
		f.add(p3);
		
		f.setVisible(true);
		
	}

}
