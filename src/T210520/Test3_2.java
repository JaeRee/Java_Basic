package T210520;

public class Test3_2 {
	
	public static void main(String[] args) {
		
		
		
		try {
			method1();				//메소드 1 호출
		}
		catch(Exception e){
			System.out.println("main() 에서 예외 처리합니다.");
		}	
	}
	
	static void method1()throws Exception {     // throws 로 메인에 예외를 떠넘김..
			method2();				// 메소드 2 호출 

	}
	
	static void method2() throws Exception {	// throws 로 예외를 떠넘긴다.. 
			
		throw new Exception("예외발생!");
		

	}

}

