package T210525;


import java.awt.*;
import java.awt.event.*;

import javax.swing.ImageIcon;

public class Test9 extends Frame{
	Image img = null;
	
	Test9(String title){
		super(title);
		
		
		this.setIconImage(new ImageIcon("").getImage());
		
		Toolkit tk = Toolkit.getDefaultToolkit();		// 이미지를 위해 툴킷 넣어야함
		Dimension screenSize = tk.getScreenSize();
		setBounds((screenSize.width)/2-300,
				(screenSize.height)/2-400, 600, 800);
		
		
		
		
		img = tk.getImage("images/help.jpg");
		
		
		
		
		this.addWindowListener(new WindowAdapter(){ // 익명클래스 사용! 
            public void windowClosing(WindowEvent e) { // 오버라이딩
               System.exit(0); // 프로그램 종료
            }
         });
        
		
		this.setVisible(true);
	}
	
	
	
	
	public void paint(Graphics g) {			// 오버라이딩
		int imgWidth, imgHeight;
		
		if(img == null) {
			return;							// 종료하고 돌아가
		}
		
		imgWidth  = img.getWidth(this);		// 이미지 너비와 높이 알아오기
		imgHeight = img.getHeight(this);
		
		g.drawImage(img, 0, 0,this);

	}
	
	

	
	
	public static void main(String[] args) {
		
		
		new Test9("이미지 넣기");
		
	}
	

}

