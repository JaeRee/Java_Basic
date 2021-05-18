package T210518;

public class Test2 {
	
	public static void main(String[] args) {
		
		Car c1 = null;
		
		FireEngine FE = new FireEngine();
		FireEngine FE2 = null;
		
		FE.water();
		c1 = FE;	// FireEngine(자식)->Car(조상), UpCasting (자동형변환)
		// c1.water(); 는 error!! 옛날 리모컨으로 최신티비...
		
		FE2 = (FireEngine)c1;
		
	}

}
