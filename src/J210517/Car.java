package J210517;

public class Car extends Object{
	
	String color;
	int door;
	
	
	
	
	Car(){
		this("black");	// this()�� �ٸ� ������ ȣ��, ù ���忡 �ۼ�
		door=4;
	}
	
	
	Car(String color){
		super();
		this.color = color;
		door = 3;
	}
	
	
	void start() {
		System.out.println("����մϴ�.");
	}
	
	void stop() {
		System.out.println("����ϴ�.");
	}
	
}