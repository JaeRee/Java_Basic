package T210520;

import java.awt.Color;
import java.awt.Frame;
import java.awt.Label;
import java.awt.TextField;


public class Test9 {
	
	public static void main(String[] args) {
		
		
		Frame f = new Frame("ȸ������");
		f.setLayout(null);
		f.setBackground(Color.LIGHT_GRAY);
		f.setBounds(500, 500, 300, 200);
		
		
		
		Label id = new Label("ID :");				// ID ���̺�
		id.setBounds(35, 50, 100, 10);
		id.setAlignment(Label.RIGHT);
		
		
		Label pwd = new Label("Password :");		// PWD ���̺�
		pwd.setBounds(35, 70, 100, 10);
		pwd.setAlignment(Label.RIGHT);
		
		
		
		
		
		TextField txtId = new TextField("���̵� �Է��ϼ��� ");	// ID �� �ؽ�Ʈ �ڽ�
		txtId.setBounds(140, 50, 120, 20);
		
		System.out.println(txtId.getText());
		
		
		TextField txtPwd = new TextField("�н����� �Է��ϼ��� ");  // Pwd �� txt box
		txtPwd.setBounds(140, 70, 120, 20);
		txtPwd.setEchoChar('*');			// ��й�ȣ �Է½� * �� ��ü
		
		
		
		
		f.add(id);	f.add(pwd);
		f.add(txtId); f.add(txtPwd);
		
		
		
		f.setVisible(true);
		
		
	}

}
