<<<<<<< HEAD
package T210523;

import java.util.UUID;

public class Test3 {
	
	public static void main(String[] args) {
			
		
		UUID id = UUID.randomUUID();
		
		System.out.println(id);
		
		String str = "527c3932-685a-4098-8c8d-b41da6294dcc";
		
		System.out.println(str.length());
=======
// üũ�ڽ� Ŭ���� ������ �̺�Ʈ �߻�!!

package T210524;

import java.awt.*;
import java.awt.event.*;

public class Test3 extends Frame {
	CheckboxGroup group;
	Checkbox cb1, cb2, cb3;

	
	
	
	
	Test3(String title){
		super(title);
		this.setBounds(500, 300, 500, 300);
		this.setLayout(new FlowLayout());		// �������, �¿�, ���Ʒ� ���� 5px
		this.setBackground(Color.pink);
		
		
		
		
		
		
		
		
		this.addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
			
		});
		
		
		
		group = new CheckboxGroup();
		cb1 = new Checkbox("red", group, true);
		cb2 = new Checkbox("green", group, true);
		cb3 = new Checkbox("blue", group, true);
		
		cb1.addItemListener(new EventD());
		cb2.addItemListener(new EventD());
		cb3.addItemListener(new EventD());
		
		
		
		add(cb1); add(cb2); add(cb3);
		
		setVisible(true);
	}
	
	
	
	// üũ�ڽ� cb1, cb2, cb3 �� üũ ����/���� ���� �� ó���ϴ� Ŭ����
	class EventD implements ItemListener{
		public void itemStateChanged(ItemEvent e) {
			System.out.println("üũ�ڽ� �̺�Ʈ��...");
		}
		
	}
	
	
	



	public static void main(String[] args) {
		
		new Test3("checkbox event");
>>>>>>> 1cfce454ef19cbb845c235f58fac5ee4439b87f9
	}

}
