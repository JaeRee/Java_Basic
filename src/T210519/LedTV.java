package T210519;

public class LedTV implements TV {						// Ŭ���� LedTV�� �����ϴµ�,     �������̽� TV�� �̿��� �����ϰڴ�.
	
	@Override
	public void turnOn() {
		// TODO Auto-generated method stub
		System.out.println("�Ѵ�");
	}

	@Override
	public void turnOff() {
		// TODO Auto-generated method stub
		System.out.println("����");
	}

	@Override
	public void ChangVolume(int Volume) {
		// TODO Auto-generated method stub
		System.out.println("������ �����ϴ�");
	}

	@Override
	public void ChangChannel(int Channel) {
		// TODO Auto-generated method stub
		System.out.println("ä���� �����ϴ�");
	}

}
