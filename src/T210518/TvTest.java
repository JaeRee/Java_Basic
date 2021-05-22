package T210518;

public class TvTest {
	
		public static void main(String[] args) {
			
			Tv t1 = new Tv();					// 참조, 포함     상속x
			CaptionTv ctv1 = new CaptionTv();
			
			// ctv1 = (CaptionTv)t1;
			// t1의 타입은 Tv(조상) -> ctv1은 타입이 캡션티비(자식)
			// 이런 것을 다운캐스팅이라고함.. 형변환 필수
			// 상하관계에서만 가능.. 형제관계에서는 안됌!
			
			t1 = ctv1;	// ctv1은 타입이 캡션티비(자식클래스) 인데 t1은 타입이 Tv(조상)
						// UpCasting(업캐스팅)은 형변환 생략가능!!!
			
			
			
			
			
			
			
			
			// 다형성 : 조상타입의 참조변수로 자손타입의 객체를 다룰 수 있는 것!
			Tv t2 = new CaptionTv();	// 다형성
			// CaptionTv ctv2 =new Tv(); 는 에러
		}
}
