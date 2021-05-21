package T210521;

import java.awt.*;

public class Test1 {
	
	public static void main(String[] args) {
		
		Frame f = new Frame();
		
		f.setLocation(400, 300);
		f.setSize(500, 400);
		f.setBackground(Color.PINK);
		// f.setLayout(null);	: 레이아웃을 설정안함, 안할시 F에 왕크게 붙여짐
		
		// 프레임은 기본 레이아웃이 보더레이아웃 (동, 서, 남, 북 , 중앙)
		// f.setLayout(new BorderLayout(5, 10)); 

		
		Button b1 = new Button("확인1");
		Button b2 = new Button("확인2");	
		Button b3 = new Button("확인3");
		Button b4 = new Button("확인4");
		Button b5 = new Button("확인5");
		
		f.add(b1, "North");				// 앞에 오나 뒤에 오나 상관이 없다. 
		f.add("South", b2); 
		f.add(b3); 
		f.add(b4); 
		f.add(b5);
		
		
		
		f.setVisible(true);
		
	}
	

}
