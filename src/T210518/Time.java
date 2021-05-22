package T210518;

public class Time {
	// 외부 클래스에서 접근 불가인 private 변수를 정보 은닉이라고 함!
	private int hour;
	private int minute;
	private int second;

	
	
	Time(){							// 기본 생성자
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

	public int getHour() {			// 모든 클래스에서 접근 가능한 public 메소드
		return hour;
	}
	
	public int getminute() {			// 모든 클래스에서 접근 가능한 public 메소드
		return minute;
	}
	
	public int getsecond() {			// 모든 클래스에서 접근 가능한 public 메소드
		return second;
	}
	
	
	
	public void setHour(int hour) {		// private로 제한되어있어 같은 클래스 내에서 접근
		if(hour<0 || hour>23) {
			System.out.println("시간은 0~23 사이만 가능합니다.");
			return;
		}
		this.hour = hour;
	}
	
	public void setMinute(int minute) {		// private로 제한되어있어 같은 클래스 내에서 접근
		if(minute<0 || minute>61) {
			System.out.println("시간은 0~23 사이만 가능합니다.");
			return;
		}
		this.minute = minute;
	}
	
	
	public void setSecond(int second) {		// private로 제한되어있어 같은 클래스 내에서 접근
		if(second<0 || second>61) {
			System.out.println("시간은 0~23 사이만 가능합니다.");
			return;
		}
		this.second = second;
	}
}
