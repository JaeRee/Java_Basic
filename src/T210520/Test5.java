// java.lang ��Ű������ �Ʒ� Ŭ�������� ����~
// String, System, Object, Math...


// ObjectŬ������ toString() �޼ҵ� : Ŭ������@16�������ڵ�
// ObjectŬ������ equals() �޼ҵ�: ��ü �ڽ��� �־��� obj (��ü)�� ���ؼ� true/false�� ��ȯ


package T210520;

public class Test5 {
	
	public static void main(String[] args) {
		
		String str = "hello";
		String str2 = new String("Hello~~!!");
		String n;
		
		System.out.println(str.valueOf(123));  //����->���ڿ�..���̽ʻ��� �ƴ϶� 123..
		
		
		
		System.out.println(str2);
		
		
	
		Person p1 =new Person(92052825487744548L);
		Person p2 =new Person(92052899879874555L);
		
		System.out.println(p1.equals(p2));
		System.out.println(p1 == p2);
	}

}
