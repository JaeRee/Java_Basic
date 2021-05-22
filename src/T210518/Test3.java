package T210518;


//instanceof 연산자: 양쪽의 피연산자를 갖게 됨


public class Test3 {
	public static void main(String[] args) {
		
		FireEngine FE = new FireEngine();
		
		
		
		// 참조변수가 참조하는인스턴스 실제 타입인지 아닌지 체크하는 instanceof 연산자
		// 참조변수가 타입으로 업케스팅 되면 참!
		if(FE instanceof FireEngine) {
			System.out.println("FE는 파이어엔진 객체 입니다.");
			
		}
		
		if(FE instanceof Car) {
			System.out.println("FE는 파이어엔진 객체 입니다.");
			
		}
		
		if(FE instanceof Object) {
			System.out.println("FE는 파이어엔진 객체 입니다.");
			
		}
		
		
	}

}
