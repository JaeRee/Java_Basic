package T210521;

import java.awt.*;							// 프레임, 패널 쓰려고
import java.awt.event.*;					// 이벤트 쓰려고 1.소스대상 2.감지기 3.발생?


public class Test8 extends Frame {
	
	Label lid, lpw;
	TextField tfid, tfpw;
	Button ok;
	
	
	Test8(){
		super("로그인 이벤트 연습");	//Frame("로그인 이벤트 연습"); 랑 똑같다..
		lid = new Label("ID : ", Label.RIGHT);
		lpw = new Label("PW : ", Label.RIGHT);
		tfid = new TextField(10);
		tfpw = new TextField(10);
		tfpw.setEchoChar('*');			// 셋에코 = 입력값 대신 문자를 변형시켜준다.
		ok = new Button("OK");
		
		
		this.setLayout(new FlowLayout());
		setBackground(Color.pink);
		setBounds(500, 300, 400, 80);
		this.setResizable(false);		// 화면 크기 고정하게 만드셈
		
		tfid.addActionListener(new Event4());		// 감지기를 단다
		tfpw.addActionListener(new Event4());
		ok.addActionListener(new Event4());
		
		
		add(lid); add(tfid); add(lpw);	add(tfpw); add(ok);
		setVisible(true);
		
		
		this.addWindowListener(new WindowAdapter() {	///****익명클래쓰****
			public void windowClosing(WindowEvent e) {
				System.out.println("프레임 종료합니다.");
				System.exit(0);						//  프로그램 종료.. 위 과정하면 안전하게 종료!
			}
		});
		
	}
	
	
	public static void main(String[] args) {
		
		Test8 t = new Test8();
		
	}
	
	
	// 내부 클래스 사용, TextFiled 입력 후 엔터 or ok버튼 클릭시 이벤트 처리
	class Event4 implements ActionListener {
		
		public void actionPerformed(ActionEvent arg0) {
			
			String id = tfid.getText();		// 내부 클래스는 외부클래스 접근가능
			String password = tfpw.getText();
			
			if(!id.equals("admin")) {		// id가 admin이 아니면 참
				System.out.println("아이디가 틀렸습니다. 다시 입력 하세요.");
				tfid.requestFocus();		// tfid로 포커스 옮김
				tfid.selectAll();			// tfid 전체선택해서 다시 입력시 지워지게
			}
			
			
			
			
		}
	}
	

}
