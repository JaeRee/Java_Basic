package T210521;

import java.awt.*;							// ������, �г� ������
import java.awt.event.*;					// �̺�Ʈ ������ 1.�ҽ���� 2.������ 3.�߻�?


public class Test8 extends Frame {
	
	Label lid, lpw;
	TextField tfid, tfpw;
	Button ok;
	
	
	Test8(){
		super("�α��� �̺�Ʈ ����");	//Frame("�α��� �̺�Ʈ ����"); �� �Ȱ���..
		lid = new Label("ID : ", Label.RIGHT);
		lpw = new Label("PW : ", Label.RIGHT);
		tfid = new TextField(10);
		tfpw = new TextField(10);
		tfpw.setEchoChar('*');			// �¿��� = �Է°� ��� ���ڸ� ���������ش�.
		ok = new Button("OK");
		
		
		this.setLayout(new FlowLayout());
		setBackground(Color.pink);
		setBounds(500, 300, 400, 80);
		this.setResizable(false);		// ȭ�� ũ�� �����ϰ� �����
		
		tfid.addActionListener(new Event4());		// �����⸦ �ܴ�
		tfpw.addActionListener(new Event4());
		ok.addActionListener(new Event4());
		
		
		add(lid); add(tfid); add(lpw);	add(tfpw); add(ok);
		setVisible(true);
		
		
		this.addWindowListener(new WindowAdapter() {	///****�͸�Ŭ����****
			public void windowClosing(WindowEvent e) {
				System.out.println("������ �����մϴ�.");
				System.exit(0);						//  ���α׷� ����.. �� �����ϸ� �����ϰ� ����!
			}
		});
		
	}
	
	
	public static void main(String[] args) {
		
		Test8 t = new Test8();
		
	}
	
	
	// ���� Ŭ���� ���, TextFiled �Է� �� ���� or ok��ư Ŭ���� �̺�Ʈ ó��
	class Event4 implements ActionListener {
		
		public void actionPerformed(ActionEvent arg0) {
			
			String id = tfid.getText();		// ���� Ŭ������ �ܺ�Ŭ���� ���ٰ���
			String password = tfpw.getText();
			
			if(!id.equals("admin")) {		// id�� admin�� �ƴϸ� ��
				System.out.println("���̵� Ʋ�Ƚ��ϴ�. �ٽ� �Է� �ϼ���.");
				tfid.requestFocus();		// tfid�� ��Ŀ�� �ű�
				tfid.selectAll();			// tfid ��ü�����ؼ� �ٽ� �Է½� ��������
			}
			
			
			
			
		}
	}
	

}
