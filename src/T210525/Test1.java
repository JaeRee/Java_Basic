package T210525;

import java.awt.*;
import java.awt.event.*;


public class Test1 extends Frame {
   Button b1,b2,b3,b4,b5;
   Font f1 = new Font("Serif",Font.BOLD+Font.ITALIC, 25);
   Font f2 = new Font("Serif",Font.BOLD+Font.ITALIC, 20);
   
   Test1(String title){
      super(title);
      this.setBounds(500,300,500,600);
      this.setLayout(null); // 프레임 레이아웃 사용안함!
      this.setBackground(Color.DARK_GRAY);
      // 프레임(윈도우)닫기 x 버튼 누를 경우 닫는 이벤트 처리 (익명클래스)
            this.addWindowListener(new WindowAdapter(){ // 익명클래스 사용! 
               public void windowClosing(WindowEvent e) { // 오버라이딩
                  System.exit(0); // 프로그램 종료
               }
            });
      //                 버튼 부분                                              //
      b1 = new Button("빨강");
      b1.setBounds(50,50,180,150);
      b1.setBackground(Color.red);
      b1.setForeground(Color.white);
      b1.setFont(f1);
      
      b2 = new Button("노랑");
      b2.setBounds(260,50,180,150);
      b2.setBackground(Color.yellow);
      b2.setForeground(Color.black);
      b2.setFont(f1);
      
      b3 = new Button("파랑");
      b3.setBounds(50,230,180,150);
      b3.setBackground(Color.blue);
      b3.setForeground(Color.white);
      b3.setFont(f1);
      
      b4 = new Button("초록");
      b4.setBounds(260,230,180,150);
      b4.setBackground(Color.green);
      b4.setForeground(Color.black);
      b4.setFont(f1);
      
      b5 = new Button("랜덤");
      b5.setBounds(155,410,180,150);
      b5.setFont(f1);
      b5.addActionListener(new  EventColor());
      
      
      //                 이벤트 감지기 부분                                                        //
      b1.addActionListener(new  ActionListener(){// 2. 이벤트 리스너(감지기)
         public void actionPerformed(ActionEvent e) {
            setBackground(Color.red);
         }
      });   
      b2.addActionListener(new  ActionListener(){// 2. 이벤트 리스너(감지기)
         public void actionPerformed(ActionEvent e) {
            setBackground(Color.yellow);
         }
      });  
      b3.addActionListener(new  ActionListener(){// 2. 이벤트 리스너(감지기)
         public void actionPerformed(ActionEvent e) {
            setBackground(Color.blue);
         }
      });  
      b4.addActionListener(new  ActionListener(){// 2. 이벤트 리스너(감지기)
         public void actionPerformed(ActionEvent e) {
            setBackground(Color.green);
         }
      });  
      
      //                 프레임에 컨포넌트 붙이기                                              //
      add(b1);add(b2);add(b3);add(b4);add(b5);
      
      
      
      this.setVisible(true);
   }
   
   // 내부 클래스 사용한 3.이벤트 처리기 
   class EventColor implements ActionListener{
      public void actionPerformed(ActionEvent e) {
         // 배열, 랜덤 발생
         int r;
Color c[] = {Color.blue,Color.cyan,Color.LIGHT_GRAY,Color.orange,Color.pink,Color.magenta};
         r = (int)(Math.random()*6);
         
         
         
         setBackground(c[r]);
      }
      
   }
   
   
   
      
   public static void main(String[] args) {
      new Test1("Color Event");

   }

}