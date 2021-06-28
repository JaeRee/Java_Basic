package T210526;


import java.awt.*;
import java.awt.event.*;
import javax.swing.ImageIcon;

public class Yes extends Frame{
	Button b1,b2,b3,b4, b5;
	Font f1 = new Font("Webdings",Font.BOLD+Font.PLAIN, 22);
	Font f2 = new Font("Webdings",Font.BOLD+Font.PLAIN, 38);
	Panel p1;
	Label L1;
	Image img = null, img2 =null;
	
	Yes(String title){
	   super(title);
	    this.setBounds(500,300,500,600);
	    this.setLayout(null); // 프레임 레이아웃 사용안함!
	    this.setBackground(Color.DARK_GRAY);
	    
		
		Toolkit tk = Toolkit.getDefaultToolkit();		// 이미지를 위해 툴킷 넣어야함
		Dimension screenSize = tk.getScreenSize();
		setBounds((screenSize.width)/2-300,
				(screenSize.height)/2-400, 600, 800);
		
//*******************    버튼 부분   ***************************** //
	      b1 = new Button("아메리카노");
	      b1.setBounds(430,230,135,80);
	      b1.setBackground(new Color(112,146,190));
	      b1.setForeground(Color.white);
	      b1.setFont(f1);

	      b2 = new Button("카푸치노");
	      b2.setBounds(430,360,135,80);
	      b2.setBackground(new Color(112,146,190));
	      b2.setForeground(Color.white);
	      b2.setFont(f1);
	      
	      b3 = new Button("노치푸카");
	      b3.setBounds(430,490,135,80);
	      b3.setBackground(new Color(112,146,190));
	      b3.setForeground(Color.white);
	      b3.setFont(f1);
	      
	      b4 = new Button("노카리메아");
	      b4.setBounds(430,620,135,80);
	      b4.setBackground(new Color(112,146,190));
	      b4.setForeground(Color.white);
	      b4.setFont(f1);
	      

	      
	      b1.addActionListener(new  ActionListener(){// 2. 이벤트 리스너(감지기)
	          public void actionPerformed(ActionEvent e) {
	        	  
	          }
	       });   
	       b2.addActionListener(new  ActionListener(){// 2. 이벤트 리스너(감지기)
	          public void actionPerformed(ActionEvent e) {

	          }
	       });  
	       b3.addActionListener(new  ActionListener(){// 2. 이벤트 리스너(감지기)
	          public void actionPerformed(ActionEvent e) {

	          }
	       });  
	       b4.addActionListener(new  ActionListener(){// 2. 이벤트 리스너(감지기)
	          public void actionPerformed(ActionEvent e) {

	          }
	       }); 
	      
	      
	      
//*******************    라벨 부분   ***************************** //
	      L1 = new Label("카페에 오신걸 환영합니다.");
	      L1.setBounds(30, 60,540,120);
	      L1.setBackground(new Color(112,146,190));
	      L1.setAlignment(Label.CENTER);
	      L1.setForeground(Color.white);
	      L1.setFont(f2);
	      
	      
	      
	      
	      
//*******************   패널 부분   ***************************** //	      
	      
	      p1 = new Panel();
	      p1.setBounds(30, 230, 380, 400);
	      p1.setBackground(new Color(112,146,190));
	      
	      
	      
	      
	      
//*******************    이미지 부분   ***************************** //		
		img = tk.getImage("images/help.jpg");
		img2 =tk.getImage("mini.jpg");
		
			
		
		
		
		
		this.addWindowListener(new WindowAdapter(){ // 익명클래스 사용! 
            public void windowClosing(WindowEvent e) { // 오버라이딩
               System.exit(0); // 프로그램 종료
            }
         });
 
		
		
		
//*******************  붙이는 부분   ***************************** //
		
	    add(b1);add(b2);add(b3);add(b4); add(L1);
		// add(p1);
		this.setVisible(true);
	}
	
	
	
	
	public void paint(Graphics g) {			// 오버라이딩
		
		if(img == null) {
			return;							// 종료하고 돌아가
		}

		
		g.drawImage(img, 0, 0,this);
		g.drawImage(img2, 50, 200,this);

	}
	
	
	class Event123 implements ActionListener{
	      public void actionPerformed(ActionEvent e) {
	       //  Button b1 = (Button)e.getSource();
	         
	    	  
	    	  if(e.getActionCommand() == "아메리카노") {
	    		  //  ta.setText("어쩌고 저쩌고 입니다");
	    	  }
	         
	      }
	      
	   }
	
	
	public static void main(String[] args) {
		
		
		new Yes("이미지 넣기");
		
	}
	

}

