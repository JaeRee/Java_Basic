package T210514;
// ���Է��ؼ� �����

import java.util.Scanner;

public class Test4 {
	
	public static void main(String[] args) {
		
		int n;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("�� �Է�: ");
		n = sc.nextInt();
		
		
		
		for(int i=1; i<=n;i++) {
			
			for(int j=1; j<=n+1-i;j++) {
				System.out.print("*");
			}
			System.out.println();
			
		}
		
		
		
		
	}

}