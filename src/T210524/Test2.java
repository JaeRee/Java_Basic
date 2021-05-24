package T210524;

import java.awt.*;
import java.awt.event.*;


public class Test2 extends Frame {
	Label location;  // 멤버 변수
	
	Test2(String title){
		super(title);
		
		/********** Font 부분*****************************/
		Font f1 = new Font("Serif", Font.BOLD, 20);
		Font f2 = new Font("Serif", Font.ITALIC, 15);
		
		
		/********** Color 부분*****************************/
		Color c1 = new Color(209,207,208);
		
		
		
		/********** Frame 부분*****************************/
		this.setBounds(500, 300, 500, 300);
		this.setLayout(null);		// 프레임 레이아웃 사용x (직접 좌표 사용)
		this.setBackground(Color.pink);
		

		// 윈도우 닫기 버튼 누를 경우 닫는 이벤트 처리 (익명클래스)
		this.addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
			
		});
		
		
		
		
		
		
		/*********** Label 부분 ****************************/
		location = new Label("Mouse Pointer Location");
		location.setBounds(5, 30, 400, 25);
		location.setBackground(c1);
		location.setForeground(Color.black);
		location.setFont(f1);
		
		
		
		
		
		/********** 마우스 이벤트 처리 부분*****************************/
		
		addMouseMotionListener(new EventC());
		
		
		
		
		/********** 프레임에 컴포넌트 붙이는 부분 *****************/
		
		this.add(location);
		
		
		this.setVisible(true);
		
	}
	
	
	// 내부 클래스로 EventC 클래스 작성
	// 내부 클래스를 사용하면 외부 클래스의 멤버 접근가능!
	
	class EventC implements MouseMotionListener{

		public void mouseDragged(MouseEvent e) {
			System.out.println("("+e.getX()+", "+e.getY()+")");
		}
		
		public void mouseMoved(MouseEvent e) {
			location.setText("Mouse Pointer Location: ("+e.getX()+", "+e.getY()+")");
		}
		
	}
	
	
	
	public static void main(String[] args) {
		new Test2("Mouse Event Test");
		
	}
}
