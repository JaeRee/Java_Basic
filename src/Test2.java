import java.util.*;


public class Test2 {
	
	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수입력 ");
		int n = sc.nextInt();
		
		
		for(int i=0 ; i<n ; i++) {
			
			for(int j=0 ; j<=i ; j++) {
				
				System.out.print("*");
				
			}
				System.out.println();
		}
		
	}

}
