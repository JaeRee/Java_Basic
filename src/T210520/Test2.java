// ���� �߻���.. �������

package T210520;

public class Test2 {
	
	public static void main(String[] args) {
		
		
		//Exception ex = new Exception("�����Դϴ�."); ���� ��ü ����
		
		
		
		
		try {
			System.out.println("Try�� �Դϴ�.");	//1
			throw new Exception("�����Դϴ�.");
			//throw ex;		// throw �� ���ܸ� ������ �߻���Ŵ
		} catch(Exception e) {
			 System.out.println("catch�� �Դϴ�.");	//2
			 System.out.println(e.getMessage()); // ���ܸ޽����� �������� ���.. String
		}
	}

}


// 17��° ��ó���ϴ���
// 10, 18 ���� ó���ϸ� ��