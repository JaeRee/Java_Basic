package T210525;


import java.awt.*;
import java.awt.event.*;

import javax.swing.ImageIcon;

public class Test9 extends Frame{
	Image img = null;
	
	Test9(String title){
		super(title);
		
		
		this.setIconImage(new ImageIcon("").getImage());
		
		Toolkit tk = Toolkit.getDefaultToolkit();		// �̹����� ���� ��Ŷ �־����
		Dimension screenSize = tk.getScreenSize();
		setBounds((screenSize.width)/2-300,
				(screenSize.height)/2-400, 600, 800);
		
		
		
		
		img = tk.getImage("images/help.jpg");
		
		
		
		
		this.addWindowListener(new WindowAdapter(){ // �͸�Ŭ���� ���! 
            public void windowClosing(WindowEvent e) { // �������̵�
               System.exit(0); // ���α׷� ����
            }
         });
        
		
		this.setVisible(true);
	}
	
	
	
	
	public void paint(Graphics g) {			// �������̵�
		int imgWidth, imgHeight;
		
		if(img == null) {
			return;							// �����ϰ� ���ư�
		}
		
		imgWidth  = img.getWidth(this);		// �̹��� �ʺ�� ���� �˾ƿ���
		imgHeight = img.getHeight(this);
		
		g.drawImage(img, 0, 0,this);

	}
	
	

	
	
	public static void main(String[] args) {
		
		
		new Test9("�̹��� �ֱ�");
		
	}
	

}

