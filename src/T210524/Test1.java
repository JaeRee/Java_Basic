package T210524;

import java.awt.*;
import java.awt.event.*;


class EventA implements WindowListener{			// 이벤트 A라는 처리기

	public void windowOpened(WindowEvent e) {
		System.out.println("프레임을 시작합니다.");
	}

	public void windowClosing(WindowEvent e) {
		System.out.println("프레임을 종료합니다.");
		System.exit(0); // 프레임 종료
		
	}

	public void windowClosed(WindowEvent e) {
		
	}

	public void windowIconified(WindowEvent e) {
		
	}

	public void windowDeiconified(WindowEvent e) {
		
	}

	public void windowActivated(WindowEvent e) {
		
	}

	@Override
	public void windowDeactivated(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}			// 3. 이벤트 처리기(프레임의 x버튼 누를때 처리되는 클래스)
	
}



// 2개 이상의 추상메소드를 가지고 있는 인터페이스는 미리 Adapter 클래스로 구현되어 있기때문에
// Adapter 클래스를 상속 받아서 원하는 콜백메소드만 오버라이딩 하면 됨!
class EventB extends WindowAdapter{				// 이벤트B 라는 처리기
	public void windowClosing(WindowEvent e) {	//오버라이딩
		System.exit(0);
	}
	
}



public class Test1 extends Frame{
	
	Button b1;
	
	
	Test1(String title){					// 생성자는 멤버변수 초기화 담당!
		super(title);						// 1. 이벤트 소스(대상)-Frame
		b1 = new Button("ok");
		
		
		//this.addWindowListener(new EventB());		// 2. 이벤트 리스너(감지기)
		
		
		// 익명클래스 사용방법(원래는 위에처럼 다른 클래스를 불러서 다녀와야하지만, 짧은것들은 익명클래스를 불러서 바로 쓰고 버린다잇!!!
		this.addWindowListener(new WindowAdapter(){		
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
			
		});
		
		
		
		
		
		setBounds(500, 300, 500, 400);
		setVisible(true);
		
	
	}
	
	
	public static void main(String[] args) {
		
		Test1 t1 = new Test1("이벤트 처리연습중");
		
		
	}
	
}
