package T210517;

public class Car2 {
	
	String color;
	int door = 10;  //1. ����� �ʱ�ȭ ���
	
	// 3. �ʱ�ȭ ���� �̿��� ���
	// 3-1. �ν��Ͻ� �ʱ�ȭ ��{}
	// ��ü(�ν��Ͻ�) �����ø��� ȣ���, ������ ���� ���� ȣ�� ��! 
	{
		System.out.println("�ν��Ͻ� �ʱ�ȭ ���Դϴ�.");
	}
	
	
	Car2(){	// 2. ������ �ʱ�ȭ���, �⺻������
		this("black");	// Car("black"); �� ������ this()�� ����ؾ���.
						// ù ���忡 �ۼ��ؾ���!
						// ���� ���� Ŭ������ �ٸ� ������ ȣ��!
		door = 4;
		System.out.println("�⺻ ������ �Դϴ�.");
	}
	
	Car2(String color, int door){
		this.color = color;
		this.door = door;
	}
	
	Car2(String color){
		this.color = color;			// this. �ڱ� �ڽ��� ����
		door = 3;
	}
	
	
	Car2(Car2 c){						// �Ű�����
		this(c.color, c.door);
		
		//this.color = c.color;
		//this.door = c.door;
	}

	void start() {
		System.out.println("����մϴ�.");
	}
	
	void stop() {
		System.out.println("����ϴ�.");
	}
	
}