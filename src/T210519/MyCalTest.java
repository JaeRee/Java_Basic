package T210519;

public class MyCalTest {
	
	public static void main(String[] args) {
		
		Calculator cal = new MyCal();
		cal.plus(3, 4);
		
		cal.exec(5, 6);
		int i = cal.exec(56, 11);
		
		int z = cal.multiple(6, 7);	
		System.out.println(z);
	}

}
