package Defaul_Test;

public class Test10 {
	
	public static void main(String[] args) {
		
		int n=0;
		
		for(int i=0 ; i<=5 ; i++) {
			
			for(int j=0; j<i ;j++) {					// 0 1 2 3 4 5
				System.out.print(" ");
			}
			for(int z=0 ; z<=6-(2*i) ; z++) {			// 7 5 3 2 1
				System.out.print("*");
			}
			System.out.println();
		}
		
		
	}

}
