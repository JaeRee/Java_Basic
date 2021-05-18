package T210514;
//  팩토리얼 (5! = 5*4*3*2*1 = 120) ~35
//  결과화면
//  5! = 120

import java.util.*;

public class Test18 {
	
	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		
		int num=0;
		int sum=1;
		
		
		System.out.print("정수를 입력하세요: ");
		num = sc.nextInt();
		
		for(int i=num;i>0;i--) {

			sum = sum*i;
		}
		
		System.out.println(num+"! = "+sum);
		
		
		
	}

}
