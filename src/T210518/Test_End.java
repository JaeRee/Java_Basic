// 1~9 사이의 중복되지 않은 숫자로 이루어진 3자리 숫자를 만들어내는 프로그램이다.
// (1), (2)에 알맞은 코드를 넣어서 프로그램을 완성하시오.
// 참고: Math.random() 사용, p156 5-5 문제

package T210518;
import java.math.*;
import java.util.Arrays;


public class Test_End {
	
	public static void main(String[] args) {
		
		int ballArr[] = {1,2,3,4,5,6,7,8,9};
		int ball3[] = new int[3];
	
		
					//0~1 0~<10
		
		for(int i=0; i<ball3.length ; i++) {
			
			int r = (int)(Math.random()*9);
			System.out.println(r);

			while(ballArr[r]==0){
				
				r = (int)(Math.random()*9);
				
				if(ballArr[r]!=0){
				break;
				}
			}
			
			ball3[i] = ballArr[r];
			ballArr[r]=0;

		}
		
		System.out.println(Arrays.toString(ball3));
	}
}
