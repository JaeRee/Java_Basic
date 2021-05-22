package T210520;

import java.awt.*;



public class Test10 {
	
	public static void main(String[] args) {
		
		Frame f = new Frame("혈액형 선택");
		f.setBounds(500, 300, 450, 300);
		f.setBackground(Color.PINK);
		f.setLayout(null);
		Color c1 = new Color(170,216,253);		// R,G,B,투명도  색상 생성
		
		Font f1 = new Font("Serif", Font.BOLD, 20);	// 폰트색상 생성
		Font f2 = new Font("Dialog", Font.BOLD, 20);
		
		
		Label label1 = new Label("당신의 혈액형을 고르세요.");
		label1.setBounds(50, 50, 400, 50);
		label1.setFont(f1);
		label1.setForeground(c1);
		
		Label label2 = new Label("당신의 취미를 고르세요.");
		label2.setBounds(50, 150, 400, 50);
		label2.setFont(f2);
		label2.setForeground(Color.black);
		
		
		
		CheckboxGroup abc = new CheckboxGroup();			// 다중선택 못하게 그룹으로 False도 줘야한다..
		Checkbox cb1 = new Checkbox("A형", abc, true);			// A형, 체크를하고싶음True
		Checkbox cb2 = new Checkbox("B형", abc, false);
		Checkbox cb3 = new Checkbox("AB형", abc, false);
		Checkbox cb4 = new Checkbox("O형", abc, false);
		cb1.setBounds(50, 100, 90, 50);
		cb2.setBounds(150, 100, 90, 50);
		cb3.setBounds(250, 100, 90, 50);
		cb4.setBounds(350, 100, 90, 50);
		
		
		//CheckboxGroup abc = new CheckboxGroup();			// 다중선택 못하게 그룹으로 False도 줘야한다..
		Checkbox cb5 = new Checkbox("수영", false);			// A형, 체크를하고싶음True
		Checkbox cb6 = new Checkbox("피아노", false);
		Checkbox cb7 = new Checkbox("축구", false);
		Checkbox cb8 = new Checkbox("볼링", false);
		cb5.setBounds(50, 200, 90, 50);
		cb6.setBounds(150, 200, 90, 50);
		cb7.setBounds(250, 200, 90, 50);
		cb8.setBounds(350, 200, 90, 50);
		
		
		
		f.add(cb1);	f.add(cb2);	f.add(cb5);	f.add(cb6);	
		f.add(cb3); f.add(cb4); f.add(cb7);	f.add(cb8);	
		f.add(label1); f.add(label2);
		f.setVisible(true);
		
	}

}
