package J210517;

public class Car extends Object{
	
	String color;
	int door;
	
	
	
	
	Car(){
		this("black");	// this()는 다른 생성자 호출, 첫 문장에 작성
		door=4;
	}
	
	
	Car(String color){
		super();
		this.color = color;
		door = 3;
	}
	
	
	void start() {
		System.out.println("출발합니다.");
	}
	
	void stop() {
		System.out.println("멈춥니다.");
	}
	
}