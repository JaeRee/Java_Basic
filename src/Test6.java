import java.util.*;


// ���Է� ���� �����??


public class Test6 {
	
	public static void main(String[] args) {
		
		int n = 0;
		
		Scanner sc = new Scanner(System.in);
		
		
		System.out.println("������ �Է����ּ���: ");
		n = sc.nextInt();
		
		
		
		for(int i=0; i<n ;i++) { // �Է� ������� �� 
			
			for(int j=3 ; j>=i ; j--) {
				System.out.print(" ");
			}
			
			for(int z=0; z<=i ;z++) {
				System.out.print("*");
			}
			
			System.out.println();
		}
	}

}
