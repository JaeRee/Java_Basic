package T210520;

public class Test3_1 {
	
	public static void main(String[] args) {
		method1();	// �޼ҵ�1 ȣ��
	}
	
	static void method1() {
		try {
			method2();
		}
		catch(Exception e){
			System.out.println("method1 () ���� ���� ó���մϴ�.");
		}
	}
	
	static void method2() throws Exception {	// throws �� ���ܸ� ���ѱ��.. 
			
		throw new Exception("���ܹ߻�!");
		

	}

}

