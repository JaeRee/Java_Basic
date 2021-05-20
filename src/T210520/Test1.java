// ����ó�� (Exception handling)

package T210520;

public class Test1 {
	public static void main(String[] args) {
		
		int n;
		
		System.out.println(1);
		System.out.println(2);
		
		
		try { // ���ܰ� �߻��� ���� �ְ�, ���� ���� �ִ� ������� ��!
			System.out.println(3/0);
			System.out.println(4);
			
		} catch(ArithmeticException ae){ // catch�� �ڿ��� Ŭ������ �;��Ѵ�.
			System.out.println(0);
			System.out.println(ae.getMessage());	// ���� �޽���
			ae.printStackTrace();
			// ������ �޼ҵ尡 ��������ϴ� ��, Ʈ���̽��� ���
			// �����ڵ��� ���̾��µ�, �����Ҷ��� ������ ����
		} catch(Exception e) {	// ��� ���� ó�����ִ� Ŭ����.. �� �������� ����
			System.out.println(5);
		} finally {		// ���ܹ߻��ϰų� ���ϰų� ������ finally�� �����ϰ� ����!
			System.out.println(6);
		}
		
		
		
	}

}
