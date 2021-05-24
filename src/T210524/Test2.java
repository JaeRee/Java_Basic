package T210524;

import java.awt.*;
import java.awt.event.*;


public class Test2 extends Frame {
	Label location;  // ��� ����
	
	Test2(String title){
		super(title);
		
		/********** Font �κ�*****************************/
		Font f1 = new Font("Serif", Font.BOLD, 20);
		Font f2 = new Font("Serif", Font.ITALIC, 15);
		
		
		/********** Color �κ�*****************************/
		Color c1 = new Color(209,207,208);
		
		
		
		/********** Frame �κ�*****************************/
		this.setBounds(500, 300, 500, 300);
		this.setLayout(null);		// ������ ���̾ƿ� ���x (���� ��ǥ ���)
		this.setBackground(Color.pink);
		

		// ������ �ݱ� ��ư ���� ��� �ݴ� �̺�Ʈ ó�� (�͸�Ŭ����)
		this.addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
			
		});
		
		
		
		
		
		
		/*********** Label �κ� ****************************/
		location = new Label("Mouse Pointer Location");
		location.setBounds(5, 30, 400, 25);
		location.setBackground(c1);
		location.setForeground(Color.black);
		location.setFont(f1);
		
		
		
		
		
		/********** ���콺 �̺�Ʈ ó�� �κ�*****************************/
		
		addMouseMotionListener(new EventC());
		
		
		
		
		/********** �����ӿ� ������Ʈ ���̴� �κ� *****************/
		
		this.add(location);
		
		
		this.setVisible(true);
		
	}
	
	
	// ���� Ŭ������ EventC Ŭ���� �ۼ�
	// ���� Ŭ������ ����ϸ� �ܺ� Ŭ������ ��� ���ٰ���!
	
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
