package J210517;



class Parent{
	int x = 10;
	
}

class Child extends Parent{
	int x = 20;
	
	void method() {
		System.out.println("x = "+x);
		System.out.println("x = "+this.x);
		System.out.println("x = "+super.x);
		
	}
	
}



public class SuperTest {
	public static void main(String[] args) {
		Parent p1 = new Parent();
		Child c1 = new Child();
		
		c1.method();
		
	}
}
