package T210517;
// �ڹٴ� ���� ��Ӹ� ����! 


public class Bus extends Car {  // Car Ŭ������ ��ӹ޴� Bus Ŭ���� ����
	//super();
	int window=5; // �ν��Ͻ� ����, ��� ����
	
	
	
	Bus(){						// Bus Ŭ������ �����ڰ� �ڵ����� ����
		// super()�� �θ��� ������ ȣ���� �� ���!
		// ��� ������ �տ� super()�� �ۼ��Ǿ����� ������ �����Ϸ��� super();�� �߰�����
		// �� this()�� ������ super()�� �߰������� ����!
		super("green");				// ���� Ŭ���� ȣ�� Car(); �� ������ ���۷� ��ߴ�
		//this.window();
	}
	
	
	void start() {		// �������̵�: ����Ŭ�������� ���ǵ� �޼ҵ带 �ڽ�Ŭ�������� ������
		System.out.println("����մϴ�~");
	}
	
	
	void busStart() {							// ��� �޼ҵ� �߰�
		System.out.println("���� ����մϴ�.");
	}
	
	void busStop() {							// ��� �޼ҵ� �߰�
		System.out.println("���� ����մϴ�.");
	}
	
	
	

}
