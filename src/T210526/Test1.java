package T210526;

import java.awt.*;
import java.awt.event.*;


public class Test1 extends Frame {
	
	Toolkit tk = Toolkit.getDefaultToolkit();
	Dimension screenSize = tk.getScreenSize();
	
	Canvas c1;
	
	Image img = tk.getImage("images/mini.jpg");
	Image img1, img2, img3;
	
//	Image img1 = tk.getImage("images/img1.jpg");
//	Image img2 = tk.getImage("images/img2.jpg");
//	Image img3 = tk.getImage("images/img3.jpg");
	
	Button b1, b2, b3, b4;
	
	
	Test1(String title){
		super(title);
		
		// 프레임 화면 중앙에 보이기
		this.setBounds((screenSize.width)/2-300,
				(screenSize.height)/2-400, 600, 800);
		this.setLayout(null);
		
		
		// Cavas c1 부분
		
		c1 = new Canvas() {
			public void paint(Graphics g) {
				g.drawImage(img, 0, 0, this);
			}
		};
		
		
		
		c1.setBackground(Color.pink);
		c1.setBounds(50, 50, 280, 300);
		
		
	      //************************  버튼 부분    
		//
	      b1 = new Button("이미지1");
	      b1.setBounds(360,50,80,50);
	      b1.setBackground(Color.red);
	      b1.setForeground(Color.white);
	      b1.addActionListener(new EventCanvas());
	        
	      
	      b2 = new Button("이미지2");
	      b2.setBounds(360,150,80,50);
	      b2.setBackground(Color.yellow);
	      b2.setForeground(Color.black);
	      b2.addActionListener(new EventCanvas());
	      
	      b3 = new Button("이미지3");
	      b3.setBounds(360,250,80,50);
	      b3.setBackground(Color.blue);
	      b3.setForeground(Color.white);
	      b3.addActionListener(new EventCanvas());
		
	      
	      b4 = new Button("랜덤이미지");
	      b4.setBounds(360,350,80,50);
	      b4.setBackground(Color.blue);
	      b4.setForeground(Color.white);
	      b4.addActionListener(new EventCanvas());
		
		
		
		
		
		
		//****************** p1 ************
		
		
		
		
		
		//****************** 프레임에 컴포넌트, 컨테이너 붙이기 ************
		add(c1);
		add(b1); add(b2); add(b3); add(b4);
		
		
		
		this.addWindowListener(new WindowAdapter(){ // 익명클래스 사용! 
            public void windowClosing(WindowEvent e) { // 오버라이딩
               System.exit(0); // 프로그램 종료
            }
         });
		
		this.setVisible(true);
	}
	
	
	
	
	// 내부클래스 
	class EventCanvas implements ActionListener{
		public void actionPerformed(ActionEvent e) {
			
			Button b = (Button)e.getSource();
			
			int r = (int)(Math.random()*3);	//0,1,2
			String imgArr[] = {"images/img1.jpg", "images/img2.jpg", "images/img3.jpg"};
			
			
			
			
			if(b.getLabel() == "이미지1") {
				img = tk.getImage(imgArr[0]);
				c1.repaint();
				
			}else if(b.getLabel() == "이미지2") {
				img = tk.getImage(imgArr[1]);
				c1.repaint();
				
			}else if(b.getLabel() == "이미지3") {
				img = tk.getImage(imgArr[2]);
				c1.repaint();
			}else {
				img = tk.getImage(imgArr[r]);
				c1.repaint();
			}
		
		}
	}
	
	public static void main(String[] args) {
		
		new Test1("Canvas 연습");
	}
}


// https://raccoonjy.tistory.com/16
// 