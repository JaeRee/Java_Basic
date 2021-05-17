package J210517;

public class Test2 {
	
	int n;									// 인스턴스 변수
	static int[] arr = new int[10];			// 클래스 변수, 공유 변수 
	
	static {							// 클래스 초기화 블럭 (프로그램 시작시 1회 호출)
		int i;
		for(i=0; i<arr.length; i++ ) {
			arr[i] = (int)(Math.random()*10)+1;		// 1~10 사이 랜덤값
			
			// Math.random()				: 0.0 <= r < 1.0
			// Math.random()*10 			: 0.0 <= r < 10.0
			// (int)(Math.random()*10)		: 0 <= r < 10		
			// (int)(Math.random()*10)+1 	: 1 <= r < 11	
		}
		
		
	}
	
	
	public static void main(String[] args) {
		
		int i;
		for(i=0; i<Test2.arr.length; i++) {
			System.out.println("arr["+i+"] =" + arr[i]);
		}
		
	}

}
