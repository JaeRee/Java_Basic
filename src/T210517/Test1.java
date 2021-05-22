package T210517;


public class Test1 {
	
	public static void main(String[] args)
	{
		int n=123;
		Car c1 = new Car();			// n이나 c1이나 지역변수
		// Car c2 = new Car("red");
		// Car c4 = new Car(c2);
		
		
		System.out.println("c1.color = "+c1.color);
		System.out.println("c1.door = " +c1.door);
		
		///System.out.println("c1.color = "+c2.color);
		//System.out.println("c1.door = " +c2.door);
		
		
		//c1.start();
	}

}
