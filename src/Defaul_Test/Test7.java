package Defaul_Test;
// *****
//  ****
//   ***
//    **
//     *
public class Test7 {
	
	public static void main(String[] args) {
		
		
		for(int i=1 ; i<=5 ; i++ ) {
			
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
