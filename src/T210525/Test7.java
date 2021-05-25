package T210525;


import java.awt.*;
import java.awt.event.*;

public class Test7 extends Frame{
	Image img = null;
	
	Test7(String title){
		super(title);
		
		
		
		
		Toolkit tk = Toolkit.getDefaultToolkit();		// �̹����� ���� ��Ŷ �־����
		Dimension screenSize = tk.getScreenSize();
		setBounds((screenSize.width)/2-400,
				(screenSize.height)/2-450, 800, 900);
		
		
		
		
		img = tk.getImage("images/Kanu.jpg");
		
		
		
		
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
		
		g.drawImage(img, 50, 50,this);

	}
	
	

	
	
	public static void main(String[] args) {
		
		
		new Test7("�̹��� �ֱ�");
		
	}
	

}

