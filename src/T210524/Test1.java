package T210524;

import java.awt.*;
import java.awt.event.*;


class EventA implements WindowListener{

	public void windowOpened(WindowEvent e) {
		
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



public class Test1 extends Frame{
	
	Button b1;
	
	
	Test1(String title){					// 생성자는 멤버변수 초기화 담당!
		super(title);						// 1. 이벤트 소스(대상)-Frame
		b1 = new Button("ok");
		
		
		this.addWindowListener(new EventA());		// 2. 이벤트 리스너(감지기)
		
		
		
		
		
		
		
		
		setBounds(500, 300, 500, 400);
		setVisible(true);
		
	
	}
	
	
	public static void main(String[] args) {
		
		Test1 t1 = new Test1("이벤트 처리연습중");
		
		
	}
	
}
