package T210524;


import java.awt.*; // AWT 컨포넌트 사용하기 위해
import java.awt.event.*; // 이벤트 처리하기 위해




public class Test4 extends Frame{
   Checkbox cb1,cb2,cb3,cb4;
   CheckboxGroup group;
   Label result;
   Panel p1;
   
   Test4(String title){
      super(title);
      setBounds(500,300,500,400);
      setLayout(null); // 프레임 레이아웃 사용 안함.
      setBackground(Color.LIGHT_GRAY);
      Font f2 = new Font("SansSeif",Font.ROMAN_BASELINE,25);
      
      
      
      // 프레임(윈도우)닫기 x 버튼 누를 경우 닫는 이벤트 처리 (익명클래스)
      this.addWindowListener(new WindowAdapter(){ // 익명클래스 사용! 
         public void windowClosing(WindowEvent e) { // 오버라이딩
            System.exit(0); // 프로그램 종료
         }
      });
      //                    Checkbox 부분                                    //
      group = new CheckboxGroup(); // 체크박스 그룹 객체 생성
      cb1 = new Checkbox("A형",group, false);
      cb2 = new Checkbox("B형",group, false);
      cb3 = new Checkbox("O형",group, false);
      cb4 = new Checkbox("AB형",group, false);
      
      
      // checkbox 이벤트 처리 //
      cb1.addItemListener(new EventE());
      cb2.addItemListener(new EventE());
      cb3.addItemListener(new EventE());
      cb4.addItemListener(new EventE());
      
      // panel p1 부분  //
      p1 = new Panel();
      p1.setBackground(Color.BLUE);
      p1.setForeground(Color.white);
      p1.setBounds(65,80,370,60);
      p1.setFont(f2);
      p1.add(cb1);p1.add(cb2);p1.add(cb3);p1.add(cb4);
      
      
      
      // Label result 부분  //
      result = new Label();
      result.setBounds(100,200,300,50);
      result.setBackground(Color.yellow);
      result.setFont(f2);
      result.setAlignment(Label.CENTER);
      
   

      
      // 프레임에 컨포넌트 add //
            add(p1);
            add(result);
      this.setVisible(true);
   }
   class EventE implements ItemListener {
      public void itemStateChanged(ItemEvent e){
         Checkbox cb = (Checkbox)e.getSource();
         String color = cb.getLabel();
         
         if(color.equals("A형")){
            result.setText(color+"을 선택하셨습니다.");
      }
      else if(color.equals("B형")){
         result.setText(color+"을 선택하셨습니다.");
      }
      else if(color.equals("O형")){
         result.setText(color+"을 선택하셨습니다.");
      }else{
         result.setText(color+"을 선택하셨습니다.");
      }
   
   }
   }
   
   public static void main(String[] args) {
      new Test4("혈액형 프로그램");
   }

}