package J210514;
// 1 ~ 100 ������ r�� ����� ���
// r�� 5~10 ������ ������ �߻�!
// >>���ȭ��<<
// 1~100 ������ r�� ����� ����մϴ�.
// 5 10 15 ... 100

import java.math.*;

public class Test15 {
	
	public static void main(String[] args) {
		
		int n, cnt = 0;
		
		n = (int) (Math.random()*6+5);
	
		for(int i=1 ; i<=100 ; i++ ) {
			
			if(i%n==0) {
				
				System.out.print(i);
				System.out.print(" ");
				cnt++;
				
				if(cnt%4==0) {
					System.out.println();
				}
			}
		}
	}
}
