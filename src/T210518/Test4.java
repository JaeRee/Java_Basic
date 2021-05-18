package T210518;

public class Test4 {
	
	public static void main(String[] args) {
		
			Buyer b1 = new Buyer();		// 구매자 객체 b1 생성
			Computer com = new Computer();
			Audio au = new Audio();
			
			b1.buy(com);		// 업캐스팅 
			b1.buy(au);
			
			
			
			System.out.println("현재 남은돈은 "+b1.money +"만원 입니다.");
			System.out.println("보너스포인트는 "+b1.bonusPoint+"만점 입니다.");
	
	}

}
