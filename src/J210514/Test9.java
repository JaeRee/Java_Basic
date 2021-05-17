package J210514;
//    *    
//   ***   
//  *****
// *******
//*********

public class Test9 {
	
	public static void main(String[] args) {
		
		int n=0;
		
		for(int i=0 ; i<5 ; i++) {
			
			for(int j=4; j>i ;j--) {
				System.out.print(" ");
			}
			for(int z=1 ; z<=2*i+1 ; z++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
