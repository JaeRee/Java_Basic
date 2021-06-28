package T210523;

//    1
//   212
//  32123
// 4321234
//543212345

public class Test2 {
public static void main (String[] args) {
	
		
		for(int i=1 ; i<6 ; i++) {
		
			for(int j=i ; j<5 ; j++) {
				System.out.print(" ");
			}
			
			for(int j=i ; j>0 ; j--) {			// 1, 21, 321, 4321, 54321				1, 2, 3 , 4, 5
				System.out.print(j);
			}
			
			for(int j=2 ; j<i+1 ;  j++) {			// 0, 2, 23, 234, 2345
				System.out.print(j);
			}
			
			System.out.println();
		}
	}
}

