package T210520;

public class Test6 {
	
	public static void main(String[] args) {
		
		
		String a = "";
		String b = "";
		
		String str  = "hello java!!";
		String str2 = "programing"; 
		
		a = str.substring(0, 5);	// ���ۺ��� �������������� ���� ����
		
		System.out.println(a);
		
		
		b= str.toUpperCase();		// �ҹ��ڸ� �빮�ڷ�
		
		System.out.println(b);
		
		
		System.out.println(str + "��" + str.length() +"��");
		
		System.out.println(str.charAt(1));
		
		System.out.println(str.concat(str2));	// ���� ��ġ�� !
		
		}
		
}


