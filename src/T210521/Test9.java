package T210521;

import java.awt.*;
import java.awt.event.*;

public class Test9 extends Frame {
	
	Label q1, q2, score;
	Checkbox q1cb1, q1cb2, q1cb3, q1cb4;
	Checkbox q2cb1, q2cb2, q2cb3, q2cb4;
	CheckboxGroup group;
	Button end;
	
	
	Test9(){
		super("CheckBox �̺�Ʈ ����");
		this.setLayout(new GridLayout(13,1));
		setBounds(500, 200, 500, 300);
		setBackground(Color.pink);
		
		q1 = new Label("1. ���� �� ActionEvent�� actionPerformed �޼ҵ尡 ȣ��Ǵ� ����?");
		q1cb1 = new Checkbox("Button�� ������ ��");
		q1cb2 = new Checkbox("TextField���� EnterŰ�� ������ ��");
		q1cb3 = new Checkbox("MenuItem�� Ŭ������ ��");
		q1cb4 = new Checkbox("List���� ����Ŭ������ item �������� ��");
		
		
		q2 = new Label("2. Frame�� �⺻ LayoutManger��? (�ϳ��� ���ÿ�)");
		group = new CheckboxGroup();
		q2cb1 = new Checkbox("FlowLayout", group,false);
		q2cb2 = new Checkbox("GridLayout", group,false);
		q2cb3 = new Checkbox("BorderLayout", group,false);
		q2cb4 = new Checkbox("CardLayout", group,false);		
		
		
		score = new Label("* ���: ");
		score.setBackground(Color.white);
		end = new Button("�� ��ư�� �����ø� ����� �� �� �ֽ��ϴ�.");	// 1. �̺�Ʈ �ҽ�
		
		
		// �̺�Ʈ ó���⸦ ���θ��� ���⿡�� �����ִ�   
		end.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e) {
				
				double totalScore = 0.0;
				
				if(q1cb1.getState()) {	totalScore += 12.5;	}
				if(q1cb2.getState()) {	totalScore += 12.5;	}
				if(q1cb3.getState()) {	totalScore += 12.5;	}
				if(q1cb4.getState()) {	totalScore += 12.5;	}
				
				if(q2cb3.getState()) { totalScore += 50.0;  }
			
				score.setText("* ��� : "+ totalScore +"�� �Դϴ�.");
			}
		});
		
		
		add(q1);
		add(q1cb1); add(q1cb2); add(q1cb3); add(q1cb4);
		add(new Label(""));						//���̺��� ������ �����ؼ� �ֱ�  ���ֱ� ���̾ƿ��� �ȉ�... �ٷ� �����ؼ�
		add(q2);
		add(q2cb1); add(q2cb2); add(q2cb3);	add(q2cb4);
		add(end);
		add(score);
		this.setVisible(true);
		
		
		this.addWindowListener(new WindowAdapter() {	///****�͸�Ŭ����****
			public void windowClosing(WindowEvent e) {
				System.out.println("������ �����մϴ�.");
				System.exit(0);						//  ���α׷� ����.. �� �����ϸ� �����ϰ� ����!
			}
		});
	}
	
	
	public static void main(String[] args) {
		
		
		new Test9();				// Test9 t = new Test9();
	}
	
	
	
	/* �̺�Ʈ ó����
	class Event5 implements ActionListener{
		public void actionPerformed(ActionEvent e) {
			
			double totalScore = 0.0;
			
			if(q1cb1.getState()) {	totalScore += 12.5;	}
			if(q1cb2.getState()) {	totalScore += 12.5;	}
			if(q1cb3.getState()) {	totalScore += 12.5;	}
			if(q1cb4.getState()) {	totalScore += 12.5;	}
			
			if(q1cb3.getState()) { totalScore += 50.0;  }
		
			score.setText("* ��� : "+ totalScore +"�� �Դϴ�.");
		
		
		}
	}
	*/
	
} // Test9 Ŭ���� ��
