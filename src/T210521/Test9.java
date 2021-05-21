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
		super("CheckBox 이벤트 연습");
		this.setLayout(new GridLayout(13,1));
		setBounds(500, 200, 500, 300);
		setBackground(Color.pink);
		
		q1 = new Label("1. 다음 중 ActionEvent의 actionPerformed 메소드가 호출되는 경우는?");
		q1cb1 = new Checkbox("Button을 눌렀을 때");
		q1cb2 = new Checkbox("TextField에서 Enter키를 눌렀을 때");
		q1cb3 = new Checkbox("MenuItem을 클릭했을 때");
		q1cb4 = new Checkbox("List에서 더블클릭으로 item 선택했을 때");
		
		
		q2 = new Label("2. Frame의 기본 LayoutManger는? (하나만 고르시오)");
		group = new CheckboxGroup();
		q2cb1 = new Checkbox("FlowLayout", group,false);
		q2cb2 = new Checkbox("GridLayout", group,false);
		q2cb3 = new Checkbox("BorderLayout", group,false);
		q2cb4 = new Checkbox("CardLayout", group,false);		
		
		
		score = new Label("* 결과: ");
		score.setBackground(Color.white);
		end = new Button("이 버튼을 누르시면 결과를 알 수 있습니다.");	// 1. 이벤트 소스
		
		
		// 이벤트 처리기를 메인말고 여기에도 쓸수있다   
		end.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e) {
				
				double totalScore = 0.0;
				
				if(q1cb1.getState()) {	totalScore += 12.5;	}
				if(q1cb2.getState()) {	totalScore += 12.5;	}
				if(q1cb3.getState()) {	totalScore += 12.5;	}
				if(q1cb4.getState()) {	totalScore += 12.5;	}
				
				if(q2cb3.getState()) { totalScore += 50.0;  }
			
				score.setText("* 결과 : "+ totalScore +"점 입니다.");
			}
		});
		
		
		add(q1);
		add(q1cb1); add(q1cb2); add(q1cb3); add(q1cb4);
		add(new Label(""));						//레이블을 없지만 생성해서 넣기  색넣기 레이아웃은 안됌... 바로 생성해서
		add(q2);
		add(q2cb1); add(q2cb2); add(q2cb3);	add(q2cb4);
		add(end);
		add(score);
		this.setVisible(true);
		
		
		this.addWindowListener(new WindowAdapter() {	///****익명클래쓰****
			public void windowClosing(WindowEvent e) {
				System.out.println("프레임 종료합니다.");
				System.exit(0);						//  프로그램 종료.. 위 과정하면 안전하게 종료!
			}
		});
	}
	
	
	public static void main(String[] args) {
		
		
		new Test9();				// Test9 t = new Test9();
	}
	
	
	
	/* 이벤트 처리기
	class Event5 implements ActionListener{
		public void actionPerformed(ActionEvent e) {
			
			double totalScore = 0.0;
			
			if(q1cb1.getState()) {	totalScore += 12.5;	}
			if(q1cb2.getState()) {	totalScore += 12.5;	}
			if(q1cb3.getState()) {	totalScore += 12.5;	}
			if(q1cb4.getState()) {	totalScore += 12.5;	}
			
			if(q1cb3.getState()) { totalScore += 50.0;  }
		
			score.setText("* 결과 : "+ totalScore +"점 입니다.");
		
		
		}
	}
	*/
	
} // Test9 클래스 끝
