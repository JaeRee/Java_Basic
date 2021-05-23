
public class Test24 {
	public static void main (String[] args) {
		String star="★";
		
		for(int i=0 ; i<5 ; i++) {
			
			
			for(int j=4-i ; j>0 ; j--){		// 5번 공간, 4, 3, 2, 1, 
				System.out.print(" ");
			}
			
			for(int j=0 ; j<=i; j++) {		// 1번 찍, 2, 3, 4, 5
				
				System.out.print(star);
			}
			System.out.println(" ");
			
		}
		
		
		
	}
}
