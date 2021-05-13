// 음료 자판기 프로그램
import java.util.Scanner;


public class Test17 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int money, num = 0;
		
		
		System.out.print("돈을 넣어주세요: ");
		money = sc.nextInt();
		
		roop1: while(money>0) {
			System.out.println("┌━━━━━ 메뉴 ━━━━━━");
			System.out.println("│ 1. 콜라(500원)");
			System.out.println("│ 2. 사이다(500원)");
			System.out.println("│ 3. 핫식스(500원)");
			System.out.println("│ 4. 종료");
			System.out.println("└━━━━━━━━━━━━━━━━");
			
			num = sc.nextInt();
			
			if(num==1) {
				if(money<500) {
					System.out.println("잔액이 부족합니다.");
					System.out.println("잔액은 "+money+"원 입니다.");
					break roop1;
				}
				money -= 500;
				System.out.println("콜라가 나왔습니다.");
				System.out.println("잔액은 "+money+"원 입니다.");

				
			}else if(num==2) {
				if(money<500) {
					System.out.println("잔액이 부족합니다.");
					System.out.println("잔액은 "+money+"원 입니다.");
					break roop1;
				}
				money -= 500;
				System.out.println("사이다가 나왔습니다.");
				System.out.println("잔액은 "+money+"원 입니다.");
			}else if(num==3) {
				if(money<500) {
					System.out.println("잔액이 부족합니다.");
					System.out.println("잔액은 "+money+"원 입니다.");
					break roop1;
				}
				money -= 500;
				System.out.println("핫식스가 나왔습니다.");
				System.out.println("잔액은 "+money+"원 입니다.");
			}else if(num==4) {
				System.out.println("잔액 "+money+"원을 반환합니다.");
				break roop1;
			}
			
		} // while 괄호
		System.out.println("종료합니다.");
	}
}
