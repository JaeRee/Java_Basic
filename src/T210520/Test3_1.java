package T210520;

public class Test3_1 {
	
	public static void main(String[] args) {
		method1();	// 메소드1 호출
	}
	
	static void method1() {
		try {
			method2();
		}
		catch(Exception e){
			System.out.println("method1 () 에서 예외 처리합니다.");
		}
	}
	
	static void method2() throws Exception {	// throws 로 예외를 떠넘긴다.. 
			
		throw new Exception("예외발생!");
		

	}

}

