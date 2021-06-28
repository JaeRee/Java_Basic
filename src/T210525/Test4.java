package T210525;

import java.awt.*;
import java.awt.event.*;

public class Test4 extends Frame {
	Image img=null;
	
	Test4(String title){
		super(title);
		
		//프레임을 화면 중앙에 보이기
		Toolkit tk = Toolkit.getDefaultToolkit();
		Dimension screenSize = tk.getScreenSize();
		setBounds((screenSize.width)/2-200,
				(screenSize.height)/2-150, 400, 300);
	
		
		Toolkit toolkit = this.getToolkit(); 
		
		
		
		   Image img = toolkit.getImage("Kanu.jpg");

		
		
		
		
        this.addWindowListener(new WindowAdapter(){ // 익명클래스 사용! 
            public void windowClosing(WindowEvent e) { // 오버라이딩
               System.exit(0); // 프로그램 종료
            }
         });
		
		
		this.setVisible(true);
	}
	
	
	// 외부 클래스(원래 있던 애).... paint() 자동호출 시기
	// 1. 처음 화면에 나타날 때
	// 2. 다른 화면에 가려졌다가 다시 나타날때
	// 3. 최소화 -> 원래 크기로 다시 나타날때
	
	public void paint(java.awt.Graphics g) {			// 오버라이딩
		
		g.setFont(new Font("Serif", Font.BOLD, 20));
		g.drawString("Hello Java~!!", 50, 100);
		
		g.setColor(Color.blue);
		g.drawLine(50, 150, 100, 200);
		
		g.fillRoundRect(200, 150, 100, 100, 30, 30);
		
		

	}
	
	
	public static void main(String[] args) {
		
		
		new Test4("title");
		
	}
	

}
