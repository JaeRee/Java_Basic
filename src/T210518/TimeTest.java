package T210518;

import java.util.*;

public class TimeTest {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int h, m ,s;
		
		System.out.print("시 를 입력하세요: "); h=sc.nextInt();
		System.out.print("분 를 입력하세요: "); m=sc.nextInt();
		System.out.print("초 를 입력하세요: "); s=sc.nextInt();
		
		
		Time t1 = new Time();
		
		Time t2 = new Time(11, 35, 30);
		
		Time t3 = new Time(h, m, s);
		
		t1.getHour();
		
		
		System.out.println(t1.getHour());
		
		
		t1.setHour(15);
		System.out.println(t1.getHour());
		
		
		System.out.println(t2);
		// System.out.println(t2.toString());  와 같음!
	}

}
