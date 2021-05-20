// 예외처리 (Exception handling)

package T210520;

public class Test1 {
	public static void main(String[] args) {
		
		int n;
		
		System.out.println(1);
		System.out.println(2);
		
		
		try { // 예외가 발생할 수도 있고, 안할 수도 있는 문장들이 옴!
			System.out.println(3/0);
			System.out.println(4);
			
		} catch(ArithmeticException ae){ // catch문 뒤에는 클래스가 와야한다.
			System.out.println(0);
			System.out.println(ae.getMessage());	// 예외 메시지
			ae.printStackTrace();
			// 스택은 메소드가 들락날락하는 곳, 트레이스는 경로
			// 개발자들이 많이쓰는데, 배포할때는 무조건 삭제
		} catch(Exception e) {	// 모든 예외 처리해주는 클래스.. 맨 마지막에 써줘
			System.out.println(5);
		} finally {		// 예외발생하거나 안하거나 무조건 finally문 실행하고 나감!
			System.out.println(6);
		}
		
		
		
	}

}
