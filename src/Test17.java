// ���� ���Ǳ� ���α׷�
import java.util.Scanner;


public class Test17 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int money, num = 0;
		
		
		System.out.print("���� �־��ּ���: ");
		money = sc.nextInt();
		
		roop1: while(money>0) {
			System.out.println("������������ �޴� ������������");
			System.out.println("�� 1. �ݶ�(500��)");
			System.out.println("�� 2. ���̴�(500��)");
			System.out.println("�� 3. �ֽĽ�(500��)");
			System.out.println("�� 4. ����");
			System.out.println("����������������������������������");
			
			num = sc.nextInt();
			
			if(num==1) {
				if(money<500) {
					System.out.println("�ܾ��� �����մϴ�.");
					System.out.println("�ܾ��� "+money+"�� �Դϴ�.");
					break roop1;
				}
				money -= 500;
				System.out.println("�ݶ� ���Խ��ϴ�.");
				System.out.println("�ܾ��� "+money+"�� �Դϴ�.");

				
			}else if(num==2) {
				if(money<500) {
					System.out.println("�ܾ��� �����մϴ�.");
					System.out.println("�ܾ��� "+money+"�� �Դϴ�.");
					break roop1;
				}
				money -= 500;
				System.out.println("���̴ٰ� ���Խ��ϴ�.");
				System.out.println("�ܾ��� "+money+"�� �Դϴ�.");
			}else if(num==3) {
				if(money<500) {
					System.out.println("�ܾ��� �����մϴ�.");
					System.out.println("�ܾ��� "+money+"�� �Դϴ�.");
					break roop1;
				}
				money -= 500;
				System.out.println("�ֽĽ��� ���Խ��ϴ�.");
				System.out.println("�ܾ��� "+money+"�� �Դϴ�.");
			}else if(num==4) {
				System.out.println("�ܾ� "+money+"���� ��ȯ�մϴ�.");
				break roop1;
			}
			
		} // while ��ȣ
		System.out.println("�����մϴ�.");
	}
}
