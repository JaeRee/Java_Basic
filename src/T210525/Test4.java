package T210525;

import java.awt.*;
import java.awt.event.*;

public class Test4 extends Frame {
	Image img=null;
	
	Test4(String title){
		super(title);
		
		//�������� ȭ�� �߾ӿ� ���̱�
		Toolkit tk = Toolkit.getDefaultToolkit();
		Dimension screenSize = tk.getScreenSize();
		setBounds((screenSize.width)/2-200,
				(screenSize.height)/2-150, 400, 300);
	
		
		Toolkit toolkit = this.getToolkit(); 
		
		
		
		   Image img = toolkit.getImage("Kanu.jpg");

		
		
		
		
        this.addWindowListener(new WindowAdapter(){ // �͸�Ŭ���� ���! 
            public void windowClosing(WindowEvent e) { // �������̵�
               System.exit(0); // ���α׷� ����
            }
         });
		
		
		this.setVisible(true);
	}
	
	
	// �ܺ� Ŭ����(���� �ִ� ��).... paint() �ڵ�ȣ�� �ñ�
	// 1. ó�� ȭ�鿡 ��Ÿ�� ��
	// 2. �ٸ� ȭ�鿡 �������ٰ� �ٽ� ��Ÿ����
	// 3. �ּ�ȭ -> ���� ũ��� �ٽ� ��Ÿ����
	
	public void paint(java.awt.Graphics g) {			// �������̵�
		
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
