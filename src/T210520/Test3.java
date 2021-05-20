package T210520;

public class Test3 {
	
	public static void main(String[] args) {
		method1();	// 메소드1 호출
	}
	
	static void method1() {
		method2();
	}
	
	static void method2() {
		try {
			throw new Exception("예외발생!");
			
		}catch(Exception e){					// 캐치문 뒤에는 무조건 클래스
			System.out.println("캐치유챜치우");
			e.printStackTrace();
		}
	}

}

// 스택 경로는 다 털어버림...