package T210518;

public class Time {
	// �ܺ� Ŭ�������� ���� �Ұ��� private ������ ���� �����̶�� ��!
	private int hour;
	private int minute;
	private int second;

	
	
	Time(){							// �⺻ ������
		hour = 10;
		minute = 10;
		second = 10;
	}
	
	Time(int hour, int minute, int second){
		SetHour(hour);
		SetMinute(minute);
		SetSecond(second);
	}
	
	private void SetHour(int hour2) {
		// TODO Auto-generated method stub
		
	}

	public String toString() {
		return hour + ":"+minute+ ":"+second;
	}
	
	
	private void SetSecond(int second2) {
		// TODO Auto-generated method stub
		
	}

	private void SetMinute(int minute2) {
		// TODO Auto-generated method stub
		
	}

	public int getHour() {			// ��� Ŭ�������� ���� ������ public �޼ҵ�
		return hour;
	}
	
	public int getminute() {			// ��� Ŭ�������� ���� ������ public �޼ҵ�
		return minute;
	}
	
	public int getsecond() {			// ��� Ŭ�������� ���� ������ public �޼ҵ�
		return second;
	}
	
	
	
	public void setHour(int hour) {		// private�� ���ѵǾ��־� ���� Ŭ���� ������ ����
		if(hour<0 || hour>23) {
			System.out.println("�ð��� 0~23 ���̸� �����մϴ�.");
			return;
		}
		this.hour = hour;
	}
	
	public void setMinute(int minute) {		// private�� ���ѵǾ��־� ���� Ŭ���� ������ ����
		if(minute<0 || minute>61) {
			System.out.println("�ð��� 0~23 ���̸� �����մϴ�.");
			return;
		}
		this.minute = minute;
	}
	
	
	public void setSecond(int second) {		// private�� ���ѵǾ��־� ���� Ŭ���� ������ ����
		if(second<0 || second>61) {
			System.out.println("�ð��� 0~23 ���̸� �����մϴ�.");
			return;
		}
		this.second = second;
	}
}
