package T210518;

import java.util.*;

public class TimeTest {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int h, m ,s;
		
		System.out.print("�� �� �Է��ϼ���: "); h=sc.nextInt();
		System.out.print("�� �� �Է��ϼ���: "); m=sc.nextInt();
		System.out.print("�� �� �Է��ϼ���: "); s=sc.nextInt();
		
		
		Time t1 = new Time();
		
		Time t2 = new Time(11, 35, 30);
		
		Time t3 = new Time(h, m, s);
		
		t1.getHour();
		
		
		System.out.println(t1.getHour());
		
		
		t1.setHour(15);
		System.out.println(t1.getHour());
		
		
		System.out.println(t2);
		// System.out.println(t2.toString());  �� ����!
	}

}
