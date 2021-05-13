import java.util.*;


// 행입력 역별 만들기??


public class Test6 {
	
	public static void main(String[] args) {
		
		int n = 0;
		
		Scanner sc = new Scanner(System.in);
		
		
		System.out.println("정수를 입력해주세요: ");
		n = sc.nextInt();
		
		
		
		for(int i=0; i<n ;i++) { // 입력 갯수대로 행 
			
			for(int j=3 ; j>=i ; j--) {
				System.out.print(" ");
			}
			
			for(int z=0; z<=i ;z++) {
				System.out.print("*");
			}
			
			System.out.println();
		}
	}

}
