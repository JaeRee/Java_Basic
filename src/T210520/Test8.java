package T210520;

import java.awt.*;

public class Test8 {
	
	public static void main(String[] args) {
		
		Frame f= new Frame("choice ������Ʈ ����");			// �������� �����̳�!
		
		f.setBounds(500, 300, 500, 500);
		f.setLayout(null);
		
		
		Choice day = new Choice();
		day.add("������");							// item �� �߰���!
		day.add("ȭ����");
		day.add("������");
		day.add("�����");
		day.add("�ݿ���");
		day.add("�����");
		day.add("�Ͽ���");
		day.setBounds(50, 50, 100, 70);				// x, y , �ʺ�, ����  �����̼�+�»�����
	//	day.remove("������");							// remove�� ������ ����
		f.add(day);
		
		
		Button b1 = new Button("OK");
		b1.setBounds(180, 50, 50, 30);
		b1.setBackground(Color.darkGray);
		f.add(b1);
		
		
		
		List list1 = new List();
		list1.add("���");	list1.add("ġŲ");	list1.add("����");
		list1.add("«��");	list1.add("�ܹ���");	list1.add("������");
		list1.add("���");	list1.add("������");
		
		list1.setBounds(500, 100, 150, 100);
		f.add(list1);
		
		
		
		List list2 = new List();
		list2.setMultipleMode(true);						//���߼���
		list2.add("���");	list2.add("ġŲ");	list2.add("����");
		list2.add("«��");	list2.add("�ܹ���");	list2.add("������");
		list2.add("���");	list2.add("������");
		
		list2.setBounds(500, 100, 300, 200);
		f.add(list2);
		
		
		
		
		
		
		
		
		
		f.setVisible(true);
		
	}

}
