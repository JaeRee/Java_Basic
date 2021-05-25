package T210525;

import java.awt.*;
import java.awt.event.*;

import javax.swing.JFrame;

public class Test3 extends Frame {
	Label l1, l2;
	TextField tf;
	
	
	
	Test3(String title){
		super(title);
		setBackground(Color.pink);
		this.setLayout(null);
		
		
		
		//프레임을 화면 중앙에 보이기
		Toolkit tk = Toolkit.getDefaultToolkit();
		Dimension screenSize = tk.getScreenSize();
		setBounds((screenSize.width)/2-200,
				(screenSize.height)/2-150, 400, 300);
		
		
		
		l1 = new Label("돈을 입력하세요");
		
		l2 = new Label("0");
		l2.setBackground(Color.black);
		l2.setForeground(Color.yellow);
		
		
		
		
		
		
		
		
		this.addWindowListener(new WindowAdapter() {	///****익명클래쓰****
			public void windowClosing(WindowEvent e) {
				System.out.println("프레임 종료합니다.");
				System.exit(0);						//  프로그램 종료.. 위 과정하면 안전하게 종료!
			}
		});
		
		add(l1); add(l2);
		
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new Test3("Money Event");
		
	}

}
