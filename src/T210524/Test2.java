<<<<<<< HEAD
package T210523;

//    1
//   212
//  32123
// 4321234
//543212345

public class Test2 {
public static void main (String[] args) {
	
		
		for(int i=1 ; i<6 ; i++) {
		
			for(int j=i ; j<5 ; j++) {
				System.out.print(" ");
			}
			
			for(int j=i ; j>0 ; j--) {			// 1, 21, 321, 4321, 54321				1, 2, 3 , 4, 5
				System.out.print(j);
			}
			
			for(int j=2 ; j<i+1 ;  j++) {			// 0, 2, 23, 234, 2345
				System.out.print(j);
			}
			
			System.out.println();
		}
	}
}

=======
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
>>>>>>> 1cfce454ef19cbb845c235f58fac5ee4439b87f9
