package T210517;

public class Car2 {
	
	String color;
	int door = 10;  //1. 명시적 초기화 방밥
	
	// 3. 초기화 블럭을 이용한 방법
	// 3-1. 인스턴스 초기화 블럭{}
	// 객체(인스턴스) 생성시마다 호출됨, 생성자 보다 먼저 호출 됨! 
	{
		System.out.println("인스턴스 초기화 블럭입니다.");
	}
	
	
	Car2(){	// 2. 생성자 초기화방법, 기본생성자
		this("black");	// Car("black"); 와 같지만 this()로 사용해야함.
						// 첫 문장에 작성해야함!
						// 나와 같은 클래스의 다른 생성자 호출!
		door = 4;
		System.out.println("기본 생성자 입니다.");
	}
	
	Car2(String color, int door){
		this.color = color;
		this.door = door;
	}
	
	Car2(String color){
		this.color = color;			// this. 자기 자신을 참조
		door = 3;
	}
	
	
	Car2(Car2 c){						// 매개변수
		this(c.color, c.door);
		
		//this.color = c.color;
		//this.door = c.door;
	}

	void start() {
		System.out.println("출발합니다.");
	}
	
	void stop() {
		System.out.println("멈춥니다.");
	}
	
}