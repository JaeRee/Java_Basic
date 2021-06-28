package T210521;

import java.awt.*;
import java.awt.event.*;


class Click implements ActionListener{
	public void actionPerformed(ActionEvent arg0) {
		System.out.println("확인 버튼을 누르셨습니다.");
	}
}


public class Test7 {
	
	public static void main(String[] args) {
		
		Frame f = new Frame();
		f.setBounds(500, 300, 500, 500);
		f.setBackground(Color.pink);
		f.setLayout(null);
		
		
		Button b1 = new Button("확인");			// 1. 이벤트 대상 (소스)
		b1.setBounds(70, 75, 100, 100);
		b1.addActionListener(new Click());		// 2. 감지기(이벤트 리스너) 깨래보니?
		
			
		Button b2 = new Button("최소");
		b2.setBounds(270, 75, 100, 100);
		b2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.out.println("취소 ㅂㅌ을 눌렀어");
			}
		});
		
		
		
		f.addWindowListener(new WindowAdapter() {	///****익명클래쓰****
			public void windowClosing(WindowEvent e) {
				System.out.println("프레임 종료합니다.");
				System.exit(0);						//  프로그램 종료.. 위 과정하면 안전하게 종료!
			}
		});
		
		
		f.add(b1);	f.add(b2);
		f.setVisible(true);
		
	}
}
