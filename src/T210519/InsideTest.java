package T210519;

import T210519.Inside.Inside2;

public class InsideTest {
	
	
	
	public static void main(String[] args) {
		
			Inside in = new Inside();
			Inside.Inside2 cal = in.new Inside2();
			
			
			cal.View();
			
			System.out.println(cal.value);
			
}
	


}
