package T210520;

public class Test3_2 {
	
	public static void main(String[] args) {
		
		
		
		try {
			method1();				//�޼ҵ� 1 ȣ��
		}
		catch(Exception e){
			System.out.println("main() ���� ���� ó���մϴ�.");
		}	
	}
	
	static void method1()throws Exception {     // throws �� ���ο� ���ܸ� ���ѱ�..
			method2();				// �޼ҵ� 2 ȣ�� 

	}
	
	static void method2() throws Exception {	// throws �� ���ܸ� ���ѱ��.. 
			
		throw new Exception("���ܹ߻�!");
		

	}

}

