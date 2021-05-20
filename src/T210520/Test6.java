package T210520;

public class Test6 {
	
	public static void main(String[] args) {
		
		
		String a = "";
		String b = "";
		
		String str  = "hello java!!";
		String str2 = "programing"; 
		
		a = str.substring(0, 5);	// 시작부터 끝나기전까지의 문자 따옴
		
		System.out.println(a);
		
		
		b= str.toUpperCase();		// 소문자를 대문자로
		
		System.out.println(b);
		
		
		System.out.println(str + "은" + str.length() +"개");
		
		System.out.println(str.charAt(1));
		
		System.out.println(str.concat(str2));	// 문장 합치기 !
		
		}
		
}


