package T210518;

public class Buyer {
	
	int money = 1000;
	int bonusPoint = 0;

		
	
	void buy(Product p) {
		if(money<p.price) {
			System.out.println("잔액이 부족합니다.");
			return;
		}
		money -= p.price;
		bonusPoint += p.bonusPoint;
		
		System.out.println(p+"을 구매하셨습니다.");
	
	}
	
}