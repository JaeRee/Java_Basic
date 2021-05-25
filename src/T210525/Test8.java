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
		
		//�������� ȭ�� �߾ӿ� ���̱�
		Toolkit tk = Toolkit.getDefaultToolkit();
		Dimension screenSize = tk.getScreenSize();
		setBounds((screenSize.width)/2-250,
				(screenSize.height)/2-250, 500, 500);

		
		
		img = this.createImage(500, 500);
		gImg = img.getGraphics();
		gImg.drawString("���ʹ�ư�� ����ä�� ���콺�� ������������", x, y);
		repaint();
		
		
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
		if(img != null) {
			g.drawImage(img, 0,0,this);
			// ����ȭ�鿡 �׷��� �׸��� Frame�� ����
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
			
			repaint();	// repain() -> update() -> paint() ȣ���!
		}
		
	}
	
	
	public static void main(String[] args) {
		
		
		new Test8("�׷��� ����2");
		
	}
	

}

