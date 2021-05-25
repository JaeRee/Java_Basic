package T210525;

import java.awt.*;
import java.awt.event.*;

import sun.java2d.loops.GraphicsPrimitive;

public class Test8 extends Frame  {
	Image img = null;
 	Graphics gImg = null;
	int x=0, y=0;
	
	
	Test8(String title){
		super(title);
		
		//프레임을 화면 중앙에 보이기
		Toolkit tk = Toolkit.getDefaultToolkit();
		Dimension screenSize = tk.getScreenSize();
		setBounds((screenSize.width)/2-250,
				(screenSize.height)/2-250, 500, 500);

		
		
		img = this.createImage(500, 500);
		gImg = img.getGraphics();
		gImg.drawString("왼쪽버튼을 누른채로 마우스를 움직여보세요", x, y);
		repaint();
		
		
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
		if(img != null) {
			g.drawImage(img, 0,0,this);
			// 가상화면에 그려진 그림을 Frame에 복사
		}

	}
	
	
	
	class EventMouse implements MouseMotionListener{

		public void mouseDragged(MouseEvent me) {
			if(me.getModifiersEx() == MouseEvent.BUTTON1_DOWN_MASK) {
				x = me.getX();
				y = me.getY();
				gImg.drawString("*", x, y);
				repaint();
			}
		}

		public void mouseMoved(MouseEvent me) {
			x = me.getX();
			y = me.getY();
			
			repaint();	// repain() -> update() -> paint() 호출됨!
		}
		
	}
	
	
	public static void main(String[] args) {
		
		
		new Test8("그래픽 연습2");
		
	}
	

}

