package T210520;

import java.awt.*;



public class Test10 {
	
	public static void main(String[] args) {
		
		Frame f = new Frame("혈액형 선택");
		f.setBounds(500, 300, 400, 300);
		f.setBackground(Color.PINK);
		f.setLayout(null);
		Color c1 = new Color(170,216,253);		// R,G,B,투명도
		
		Label label1 = new Label("당신의 혈액형을 고르세요.");
		label1.setBounds(50, 50, 400, 50);
		
		
		
		//CheckboxGroup abc = new CheckboxGroup();			// 다중선택 못하게 그룹으로 False도 줘야한다..
		Checkbox cb1 = new Checkbox("A형", true);			// A형, 체크를하고싶음True
		Checkbox cb2 = new Checkbox("B형", false);
		Checkbox cb3 = new Checkbox("AB형", false);
		Checkbox cb4 = new Checkbox("O형", false);
		cb1.setBounds(50, 100, 90, 50);
		cb2.setBounds(150, 100, 90, 50);
		cb3.setBounds(250, 100, 90, 50);
		cb4.setBounds(350, 100, 90, 50);
		
		
		
		
		
		f.add(cb1);	f.add(cb2);
		f.add(cb3); f.add(cb4);
		f.setVisible(true);
		
	}

}
