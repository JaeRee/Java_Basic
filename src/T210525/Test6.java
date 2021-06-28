package T210525;

import java.awt.*;
import java.awt.event.*;

public class Test6 extends Frame  {
	int x=0, y=0;
	
	
	Test6(String title){
		super(title);
		
		//�������� ȭ�� �߾ӿ� ���̱�
		Toolkit tk = Toolkit.getDefaultToolkit();
		Dimension screenSize = tk.getScreenSize();
		setBounds((screenSize.width)/2-250,
				(screenSize.height)/2-250, 500, 500);

		
        this.addWindowListener(new WindowAdapter(){ // �͸�Ŭ���� ���! 
            public void windowClosing(WindowEvent e) { // �������̵�
               System.exit(0); // ���α׷� ����
            }
         });
        
        
        
        
        // ���콺�� ������ ��� �̺�Ʈ ���콺�� ���� ����... ������ ����
        this.addMouseMotionListener(new EventMouse());				
        
        
		
		this.setVisible(true);
		
		
	}
	

	
	
	
	
	public void paint(Graphics g) {			// �������̵�
		
		g.setFont(new Font("Serif", Font.BOLD, 20));
		g.drawString("���츦 ������������!", 10, 50);
		g.drawString("*", x, y);

	}
	
	
	// repain() -> update() -> paint() ȣ���!
	//�⺻ update()�� ȭ���� �����, paint()�� ȣ���ϴ� �޼ҵ���!
	public void update(Graphics g) {		// �������̵�
		paint(g);
	}
	
	
	
	
	
	
	class EventMouse implements MouseMotionListener{

		public void mouseDragged(MouseEvent me) {
			
		}

		public void mouseMoved(MouseEvent me) {
			x = me.getX();
			y = me.getY();
			
			repaint();	// repain() -> update() -> paint() ȣ���!
		}
		
	}
	
	
	public static void main(String[] args) {
		
		
		new Test6("�׷��� ����2");
		
	}
	

}

