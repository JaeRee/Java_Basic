package T210514;
// >>결과화면<<
// -1+2-3+4-5 = -3



public class Test16 {
	
	public static void main(String[] args) {
		
		
		int sum =0;
		
		for(int i=1 ; i<=5 ; i++) {
			
			if(i%2==1) {
				System.out.print("-"+i);
				sum -= i;
			}else{
				System.out.print("+"+i);
				sum += i;
			}
		}System.out.println("="+sum);
	}
}
