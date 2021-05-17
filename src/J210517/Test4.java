package J210517;

public class Test4 {
	
	public static void main(String[] args) {
		
		int cnt=0;
		
		
		for(int i=1 ; i<=100 ; i++) {
			
			
			if(i%4==0||i%7==0) {
				
				cnt += 1;
				
				System.out.printf("%3d, ",i);
				
				if(cnt%5==0) {
					System.out.println();
				}
			}
			
		}
		
	}

}
