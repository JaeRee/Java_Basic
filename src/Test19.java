// 3���� ���� �������� �Է¹޾� ������ ������ ���ϴ� ���α׷�
// ���ȭ��
// �л�1 �����Է�: 90.5
// �л�2 ���� �Է�: 88.5
// �л�3 ���� �Է�: 85.1;
// 
// 3���� ����: xxx.x
// 3���� ���: xx. x

import java.util.*;

public class Test19 {
	public static void main(String[] args) {
		
		int num=0;
		Double sum = 0.0, aver = 0.0;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("������ �Է��� �ο��� ����Դϱ�?");
		System.out.print("�ο�: ");
		num = sc.nextInt();
		
		
		double[] stu = new double[num];
		
		for(int i=1 ; i<=num ; i++) {
			System.out.print("�л�"+i+" �� ������ �Է��ϼ���: ");
			stu[i-1] = sc.nextDouble();
			sum += stu[i-1];
			aver = sum/4;
		}
		
		System.out.println();
		System.out.println(num+"���� ���� : "+sum);
		System.out.println(num+"���� ���� : "+aver);
		
	}

}
