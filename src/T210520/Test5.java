// java.lang 패키지에는 아래 클래스들이 있음~
// String, System, Object, Math...


// Object클래스의 toString() 메소드 : 클래스명@16진수해코드
// Object클래스의 equals() 메소드: 객체 자신의 주어진 obj (객체)를 비교해서 true/false로 반환


package T210520;

public class Test5 {
	
	public static void main(String[] args) {
		
		String str = "hello";
		String str2 = new String("Hello~~!!");
		String n;
		
		System.out.println(str.valueOf(123));  //숫자->문자열..백이십삼이 아니라 123..
		
		
		
		System.out.println(str2);
		
		
	
		Person p1 =new Person(92052825487744548L);
		Person p2 =new Person(92052899879874555L);
		
		System.out.println(p1.equals(p2));
		System.out.println(p1 == p2);
	}

}
