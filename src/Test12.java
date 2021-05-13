
// 54321
//	4321
//	 321
//	  21
//	   1

public class Test12 {
	
	public static void main(String[] args) {
		
		for(int i=1 ; i<=5 ; i++) {
			
			
			for(int z=1; z<i ; z++) {
				System.out.print(" ");
			}
			
			for(int j=6-i; j>=1;j--) {
				
				System.out.print(j);
			}
			

			
			
			
			System.out.println();
		}
	}
}
