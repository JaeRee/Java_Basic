package T210524;

import java.awt.*; // AWT 컨포넌트 사용하기 위해
import java.awt.event.*; // 이벤트 처리하기 위해


public class Test3_1 extends Frame{
   Checkbox cb1,cb2,cb3;
   CheckboxGroup group;
   Button b1;
   
   Test3_1(String title){
      super(title);
      this.setBounds(500,300,500,400);
      this.setLayout(new FlowLayout(FlowLayout.LEFT)); // 가운데정렬,좌우,위아래 간격 5 설정
      this.setBackground(Color.LIGHT_GRAY);
      
      
      
      
      
      
      // 프레임(윈도우)닫기 x 버튼 누를 경우 닫는 이벤트 처리 (익명클래스)
            this.addWindowListener(new WindowAdapter(){ // 익명클래스 사용! 
               public void windowClosing(WindowEvent e) { // 오버라이딩
                  System.exit(0); // 프로그램 종료
               }
            });
            //                    Checkbox 부분                                    //
            group = new CheckboxGroup(); // 체크박스 그룹 객체 생성
            cb1 = new Checkbox("red",group, true);
            cb2 = new Checkbox("green",group, false);
            cb3 = new Checkbox("blue",group, false);
            
            cb1.addItemListener(new EventD());
            cb2.addItemListener(new EventD());
            cb3.addItemListener(new EventD());
            
            
      this.setVisible(true);
      
      
      //                 프레임에 컨포넌트 붙이기                                             //
      this.add(cb1);
      this.add(cb2);
      this.add(cb3);
   }
   // 체크박스 cb1,cb2,cb3를 체크하거나 해제했을때 처리하는 클래스
   class EventD implements ItemListener{

      
      public void itemStateChanged(ItemEvent e) {
         System.out.println("체크박스 이벤트중..");
         Checkbox cb = (Checkbox)e.getSource();
         String color = cb.getLabel();
         
         if(color.equals("red")){setBackground(Color.red);
            cb1.setBackground(Color.red);
            cb2.setBackground(Color.red);
            cb3.setBackground(Color.red);
            System.out.println(color+" 를 선택하셨습니다.");
         }
         else if(color.equals("green")){setBackground(Color.green);
         cb1.setBackground(Color.green);
         cb2.setBackground(Color.green);
         cb3.setBackground(Color.green);
         System.out.println(color+" 를 선택하셨습니다.");}
         
         else if(color.equals("blue")){setBackground(Color.blue);
         cb1.setBackground(Color.blue);
         cb2.setBackground(Color.blue);
         cb3.setBackground(Color.blue);
         System.out.println(color+" 를 선택하셨습니다.");}
      }
      
   }
   

   public static void main(String[] args) {
      new Test3_1("Checkbox Event");

   }

}