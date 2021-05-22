package T210520;

import java.math.*;


public class Test4 {
	
	public static void main(String[] args) {
		
		int i, n = 100, result = 0;
		
		for(i=0; i<10; i++) {	// 0~9
			try {
				result = n / (int)(Math.random()*10);	//100/
				System.out.println(result);
			}catch(Exception e) {
				System.out.println(0);
			}
		}
	}

}


// 0 으로 나눈게 모두 예외처리 된것.. 100/ 0~9  0일때 프린트0