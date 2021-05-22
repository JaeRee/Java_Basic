// 문자열 

package T210520;

public class Test5_1 {
	
	public static void main(String[] args) {
		
		String str = "hello";
		String str2 = new String("Hello~!!");
		
		String n = "1234";
		int n2;
		
		// 랩퍼클래스: 기본형(8개)을 클래스로 만들어 놓은것!
		n2 = Integer.parseInt(n);		//문자열을 숫자로
		
		
		String.valueOf(true);
		n=str.valueOf(123);
	}

}
