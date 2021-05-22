package T210517;
// 자바는 단일 상속만 가능! 


public class Bus extends Car {  // Car 클래스를 상속받는 Bus 클래스 정의
	//super();
	int window=5; // 인스턴스 변수, 멤버 버스
	
	
	
	Bus(){						// Bus 클래스의 생성자가 자동으로 생성
		// super()는 부모의 생성자 호출할 때 사용!
		// 모든 생성자 앞에 super()이 작성되어있지 않으면 컴파일러가 super();를 추가해줌
		// 단 this()가 있으면 super()를 추가해주지 않음!
		super("green");				// 조상 클래스 호출 Car(); 와 같지만 수퍼로 써야댐
		//this.window();
	}
	
	
	void start() {		// 오버라이딩: 조상클래스에서 정의된 메소드를 자식클래스에서 재정의
		System.out.println("출발합니다~");
	}
	
	
	void busStart() {							// 멤버 메소드 추가
		System.out.println("버스 출발합니다.");
	}
	
	void busStop() {							// 멤버 메소드 추가
		System.out.println("버스 출발합니다.");
	}
	
	
	

}
