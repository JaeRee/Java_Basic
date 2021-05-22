package T210519;

public class LedTV implements TV {						// 클래스 LedTV를 정의하는데,     인터페이스 TV를 이용해 구현하겠다.
	
	@Override
	public void turnOn() {
		// TODO Auto-generated method stub
		System.out.println("켜다");
	}

	@Override
	public void turnOff() {
		// TODO Auto-generated method stub
		System.out.println("끄다");
	}

	@Override
	public void ChangVolume(int Volume) {
		// TODO Auto-generated method stub
		System.out.println("볼륨을 조정하다");
	}

	@Override
	public void ChangChannel(int Channel) {
		// TODO Auto-generated method stub
		System.out.println("채널을 지정하다");
	}

}
