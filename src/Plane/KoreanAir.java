package Plane;

public class KoreanAir extends Airline{

		@Override
		public void printWelcom() {
			// TODO Auto-generated method stub
			System.out.println("반갑습니다. 대한항공입니다.");
		}

	}


 class AsianaAir extends Airline{

	@Override
	public void printWelcom() {
		// TODO Auto-generated method stub
		System.out.println("반갑습니다. 아시아나항공입니다.");
	}

}


 class JejuAir extends Airline{

	@Override
	public void printWelcom() {
		// TODO Auto-generated method stub
		System.out.println("반갑습니다. 제주항공입니다.");
	}

}