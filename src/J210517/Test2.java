package J210517;

public class Test2 {
	
	int n;									// �ν��Ͻ� ����
	static int[] arr = new int[10];			// Ŭ���� ����, ���� ���� 
	
	static {							// Ŭ���� �ʱ�ȭ �� (���α׷� ���۽� 1ȸ ȣ��)
		int i;
		for(i=0; i<arr.length; i++ ) {
			arr[i] = (int)(Math.random()*10)+1;		// 1~10 ���� ������
			
			// Math.random()				: 0.0 <= r < 1.0
			// Math.random()*10 			: 0.0 <= r < 10.0
			// (int)(Math.random()*10)		: 0 <= r < 10		
			// (int)(Math.random()*10)+1 	: 1 <= r < 11	
		}
		
		
	}
	
	
	public static void main(String[] args) {
		
		int i;
		for(i=0; i<Test2.arr.length; i++) {
			System.out.println("arr["+i+"] =" + arr[i]);
		}
		
	}

}
