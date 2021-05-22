package T210520;
	
import java.awt.*;					// 컨테이너, 컴포넌트 이용하기 위해
									// 컴포넌트를 담고있는게 컨테이너
									// 상속관계에서는 컴포넌트가 높다> 컨테이너 (이상함--)
public class Test7 {
	
	public static void main(String[] args) {
		
		
		Frame f = new Frame("프레임 연습중입니다.");		// 프레임 객체생성
		
		
		f.setSize(400, 300);						// 프레임 사이즈(픽셀단위), 설정을 안하면 안보임
		f.setLocation(500,200);						// 프레임 시작 위치 (x, y) 설정!
		// f.setBounds(500, 200, 400, 300);			// 시작위치 와 너비,높이 한방에 설정
		f.setBackground(Color.ORANGE);				// 화면 배경 색상
		f.setLayout(null);							// 기본 레이아웃 안쓰고 직접 좌표를 위치시킴!
		
		
		
		
		// f.setTitle("제목이지롱");
		// String str = f.getTitle();
		// System.out.println("제목표시줄의 내용은 "+str+"입니다.");
		
		
		Button b1 = new Button("버튼");				// 버튼1
		b1.setBounds(50,80, 50, 50);				// (x,y,너비,높이)
		b1.setBackground(Color.CYAN);
		f.add(b1);									// 프레임에 컴포넌트(버튼) 붙이기
		b1.setForeground(Color.blue);				// 글자 색상
		
		
		Button b2 = new Button("버튼");				// 버튼2
		b2.setBounds(250,80, 50, 50);
		b2.setBackground(Color.green);
		f.add(b2);									// 프레임에 컴포넌트(버튼) 붙이기
		
		
		
		f.setResizable(false);						// 화면 크기 고정 
		f.setVisible(true);							// 프레임 보이기
		
		
		
		
	}

}
