package T210518;

public class Test2 {
	
	public static void main(String[] args) {
		
		Car c1 = null;
		
		FireEngine FE = new FireEngine();
		FireEngine FE2 = null;
		
		FE.water();
		c1 = FE;	// FireEngine(�ڽ�)->Car(����), UpCasting (�ڵ�����ȯ)
		// c1.water(); �� error!! ���� ���������� �ֽ�Ƽ��...
		
		FE2 = (FireEngine)c1;
		
	}

}
