package T210520;

public class Test3 {
	
	public static void main(String[] args) {
		method1();	// �޼ҵ�1 ȣ��
	}
	
	static void method1() {
		method2();
	}
	
	static void method2() {
		try {
			throw new Exception("���ܹ߻�!");
			
		}catch(Exception e){					// ĳġ�� �ڿ��� ������ Ŭ����
			System.out.println("ĳġ���iġ��");
			e.printStackTrace();
		}
	}

}

// ���� ��δ� �� �о����...