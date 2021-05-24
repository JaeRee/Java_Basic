package T210524;


import java.awt.*; // AWT 컨포넌트 사용하기 위해
import java.awt.event.*; // 이벤트 처리하기 위해




public class Test4_1 extends Frame{
   Checkbox cb1,cb2,cb3,cb4;
   CheckboxGroup group;
   Label result, result2;
   Panel p1;
   Button ok;
   
   Test4_1(String title){
      super(title);
      setBounds(500,300,600,450);
      setLayout(null); // 프레임 레이아웃 사용 안함.
      setBackground(Color.pink);
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
      
   
      
      // Label result2 부분  //
      result2 = new Label();
      result2.setBounds(65, 300,480,60);
      result2.setBackground(Color.yellow);
      result2.setFont(f2);
      result2.setAlignment(Label.CENTER);
      
      
      // ok 버튼
      ok = new Button("선택");
      ok.setBounds(470, 80, 80, 150);
      ok.setBackground(new Color(0,64,128));
      ok.setForeground(Color.white);
      ok.setFont(f2);
      
      
      ok.addActionListener(new EventF());    //감지기 ok 버튼을 눌렀을 때 이벤트F로 이동

      
      // 프레임에 컨포넌트 add //
            add(p1); add(result); add(ok); add(result2);
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
   
   
   
   class EventF implements ActionListener{

	public void actionPerformed(ActionEvent e) {
		

		if(cb1.getState()) {
			result2.setText(cb1.getLabel()+"을 선택하셨습니다.");
		} else if(cb2.getState()) {
			result2.setText(cb2.getLabel()+"을 선택하셨습니다.");
		} else if(cb3.getState()) {
			result2.setText(cb3.getLabel()+"을 선택하셨습니다.");
		}else if(cb4.getState())  {
			result2.setText("AB형을 선택하셨습니다.");
		}else {
			result2.setForeground(Color.red);
			result2.setText("혈액형을 선택해주세요");
		}
	
   }
			
   }
   
   
   public static void main(String[] args) {
      new Test4_1("혈액형 프로그램");
   }

}