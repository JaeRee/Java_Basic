package Defaul_Test;
// *****
//  ****
//   ***
//    **
//     *
// 행 입력으로 찍기
import java.util.*;


public class Test8 {
	
	public static void main(String[] args) {
		
		
		int n=0;
		
		Scanner sc = new Scanner(System.in);
		System.out.print("행을 입력하세요: ");
		n = sc.nextInt();
		
		
		for(int i=1 ; i<=n ; i++ ) {
			
			for(int j=2 ; j<=i ; j++) {
				System.out.print(" ");
			}
			for(int z=0 ; z<6-i ; z++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}