package T210520;

import java.awt.*;

public class Test8 {
	
	public static void main(String[] args) {
		
		Frame f= new Frame("choice 컴포넌트 연습");			// 프레임은 컨테이너!
		
		f.setBounds(500, 300, 500, 500);
		f.setLayout(null);
		
		
		Choice day = new Choice();
		day.add("월요일");							// item 을 추가함!
		day.add("화요일");
		day.add("수요일");
		day.add("목요일");
		day.add("금요일");
		day.add("토요일");
		day.add("일요일");
		day.setBounds(50, 50, 100, 70);				// x, y , 너비, 높이  로케이션+셋사이즈
	//	day.remove("월요일");							// remove로 아이템 삭제
		f.add(day);
		
		
		Button b1 = new Button("OK");
		b1.setBounds(180, 50, 50, 30);
		b1.setBackground(Color.darkGray);
		f.add(b1);
		
		
		
		List list1 = new List();
		list1.add("삼쏘");	list1.add("치킨");	list1.add("피자");
		list1.add("짬뽕");	list1.add("햄버거");	list1.add("탕수육");
		list1.add("돈까스");	list1.add("마라탕");
		
		list1.setBounds(500, 100, 150, 100);
		f.add(list1);
		
		
		
		List list2 = new List();
		list2.setMultipleMode(true);						//다중선택
		list2.add("삼쏘");	list2.add("치킨");	list2.add("피자");
		list2.add("짬뽕");	list2.add("햄버거");	list2.add("탕수육");
		list2.add("돈까스");	list2.add("마라탕");
		
		list2.setBounds(500, 100, 300, 200);
		f.add(list2);
		
		
		
		
		
		
		
		
		
		f.setVisible(true);
		
	}

}
