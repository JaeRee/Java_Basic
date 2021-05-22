package T210520;

import java.awt.Color;
import java.awt.Frame;
import java.awt.Label;
import java.awt.TextField;


public class Test9 {
	
	public static void main(String[] args) {
		
		
		Frame f = new Frame("회원가입");
		f.setLayout(null);
		f.setBackground(Color.LIGHT_GRAY);
		f.setBounds(500, 500, 300, 200);
		
		
		
		Label id = new Label("ID :");				// ID 레이블
		id.setBounds(35, 50, 100, 10);
		id.setAlignment(Label.RIGHT);
		
		
		Label pwd = new Label("Password :");		// PWD 레이블
		pwd.setBounds(35, 70, 100, 10);
		pwd.setAlignment(Label.RIGHT);
		
		
		
		
		
		TextField txtId = new TextField("아이디 입력하세요 ");	// ID 옆 텍스트 박스
		txtId.setBounds(140, 50, 120, 20);
		
		System.out.println(txtId.getText());
		
		
		TextField txtPwd = new TextField("패스워드 입력하세요 ");  // Pwd 옆 txt box
		txtPwd.setBounds(140, 70, 120, 20);
		txtPwd.setEchoChar('*');			// 비밀번호 입력시 * 로 대체
		
		
		
		
		f.add(id);	f.add(pwd);
		f.add(txtId); f.add(txtPwd);
		
		
		
		f.setVisible(true);
		
		
	}

}
