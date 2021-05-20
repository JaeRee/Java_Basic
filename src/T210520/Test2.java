// 예외 발생시.. 문자출력

package T210520;

public class Test2 {
	
	public static void main(String[] args) {
		
		
		//Exception ex = new Exception("예외입니다."); 예외 객체 생성
		
		
		
		
		try {
			System.out.println("Try문 입니다.");	//1
			throw new Exception("예외입니다.");
			//throw ex;		// throw 은 예외를 강제로 발생시킴
		} catch(Exception e) {
			 System.out.println("catch문 입니다.");	//2
			 System.out.println(e.getMessage()); // 예외메시지가 무엇인지 출력.. String
		}
	}

}


// 17번째 줄처럼하던가
// 10, 18 라인 처럼하면 됌