package Defaul_Test;
//		1
//	   212
//	  32123
//   4321234
//  543212345

public class Test24 {
	public static void main (String[] args) {
		String star="???";
		
		for(int i=0 ; i<5 ; i++) {
			
			
			for(int j=4-i ; j>0 ; j--){		// 5??? 공간, 4, 3, 2, 1, 
				System.out.print(" ");
			}
			
			for(int j=2*i+1 ; j>0; j--) {		// 1, 3, 5, 7, 9 ..... 2 4 6 8  10 -1
				
				System.out.print(star);
			}
			System.out.println(" ");
			
		}
		
	}
}
