package T210514;
//	  1
//	 212
//	32123
// 4321234
//543212345

public class Test14 {
	
	public static void main(String[] args) {
			
		
		for(int i=1 ; i<=5 ; i++) {			// Çà
			
			for(int j=1 ; j<6-i ; j++)		// ºóÄ­ ¸¸µé±â
			{
				System.out.print(" ");
			}
			for(int j=i ; j>0 ; j--) {		// 1 21 321 431
				System.out.print(j);
			}
			
			for(int j=2 ; j<i+1 ; j++) {		// 0 2 23 234 2345
			}
			
			
			System.out.println();
		}
	}
}
