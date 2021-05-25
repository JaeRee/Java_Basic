package T210525;

import java.awt.*;
import java.awt.event.*;

public class Test6 extends Frame  {
	int x=0, y=0;
	
	
	Test6(String title){
		super(title);
		
		//프레임을 화면 중앙에 보이기
		Toolkit tk = Toolkit.getDefaultToolkit();
		Dimension screenSize = tk.getScreenSize();
		setBounds((screenSize.width)/2-250,
				(screenSize.height)/2-250, 500, 500);

		
        this.addWindowListener(new WindowAdapter(){ // 익명클래스 사용! 
            public void windowClosing(WindowEvent e) { // 오버라이딩
               System.exit(0); // 프로그램 종료
            }
         });
        
        
        
        
        // 마우스가 움직일 경우 이벤트 마우스에 정보 전달... 감지기 역할
        this.addMouseMotionListener(new EventMouse());				
        
        
		
		this.setVisible(true);
		
		
	}
	

	
	
	
	
	public void paint(Graphics g) {			// 오버라이딩
		
		g.setFont(new Font("Serif", Font.BOLD, 20));
		g.drawString("마우를 움직여보세요!", 10, 50);
		g.drawString("*", x, y);

	}
	
	
	// repain() -> update() -> paint() 호출됨!
	//기본 update()는 화면을 지우고, paint()를 호출하는 메소드임!
	public void update(Graphics g) {		// 오버라이딩
		paint(g);
	}
	
	
	
	
	
	
	class EventMouse implements MouseMotionListener{

		public void mouseDragged(MouseEvent me) {
			
		}

		public void mouseMoved(MouseEvent me) {
			x = me.getX();
			y = me.getY();
			
			repaint();	// repain() -> update() -> paint() 호출됨!
		}
		
	}
	
	
	public static void main(String[] args) {
		
		
		new Test6("그래픽 연습2");
		
	}
	

}

