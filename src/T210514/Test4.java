package T210514;
// 행입력해서 별찍기

import java.util.Scanner;

public class Test4 {
	
	public static void main(String[] args) {
		
		int n;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("행 입력: ");
		n = sc.nextInt();
		
		
		
		for(int i=1; i<=n;i++) {
			
			for(int j=1; j<=n+1-i;j++) {
				System.out.print("*");
			}
			System.out.println();
			
		}
		
		
		
		
	}

}
