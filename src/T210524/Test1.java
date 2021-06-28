/*
 
    ★ 
   ★★★ 
  ★★★★★ 
 ★★★★★★★ 
★★★★★★★★★ 

*/

package T210523;


public class Test1 {
public static void main (String[] args) {
	String star="★";
	
	for(int i=0 ; i<5 ; i++) {
		
		
		for(int j=4-i ; j>0 ; j--){		// 5번 공간, 4, 3, 2, 1, 
			System.out.print(" ");
		}
		
		for(int j=2*i+1 ; j>0; j--) {		// 1, 3, 5, 7, 9 ..... 2 4 6 8  10 -1
			
			System.out.print(star);
		}
		System.out.println(" ");
		
	}
	
}
}
