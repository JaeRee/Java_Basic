package T210518;


//instanceof ������: ������ �ǿ����ڸ� ���� ��


public class Test3 {
	public static void main(String[] args) {
		
		FireEngine FE = new FireEngine();
		
		
		
		// ���������� �����ϴ��ν��Ͻ� ���� Ÿ������ �ƴ��� üũ�ϴ� instanceof ������
		// ���������� Ÿ������ ���ɽ��� �Ǹ� ��!
		if(FE instanceof FireEngine) {
			System.out.println("FE�� ���̾�� ��ü �Դϴ�.");
			
		}
		
		if(FE instanceof Car) {
			System.out.println("FE�� ���̾�� ��ü �Դϴ�.");
			
		}
		
		if(FE instanceof Object) {
			System.out.println("FE�� ���̾�� ��ü �Դϴ�.");
			
		}
		
		
	}

}
