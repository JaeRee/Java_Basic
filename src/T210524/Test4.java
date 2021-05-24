package T210524;


import java.awt.*; // AWT ������Ʈ ����ϱ� ����
import java.awt.event.*; // �̺�Ʈ ó���ϱ� ����




public class Test4 extends Frame{
   Checkbox cb1,cb2,cb3,cb4;
   CheckboxGroup group;
   Label result;
   Panel p1;
   
   Test4(String title){
      super(title);
      setBounds(500,300,500,400);
      setLayout(null); // ������ ���̾ƿ� ��� ����.
      setBackground(Color.LIGHT_GRAY);
      Font f2 = new Font("SansSeif",Font.ROMAN_BASELINE,25);
      
      
      
      // ������(������)�ݱ� x ��ư ���� ��� �ݴ� �̺�Ʈ ó�� (�͸�Ŭ����)
      this.addWindowListener(new WindowAdapter(){ // �͸�Ŭ���� ���! 
         public void windowClosing(WindowEvent e) { // �������̵�
            System.exit(0); // ���α׷� ����
         }
      });
      //                    Checkbox �κ�                                    //
      group = new CheckboxGroup(); // üũ�ڽ� �׷� ��ü ����
      cb1 = new Checkbox("A��",group, false);
      cb2 = new Checkbox("B��",group, false);
      cb3 = new Checkbox("O��",group, false);
      cb4 = new Checkbox("AB��",group, false);
      
      
      // checkbox �̺�Ʈ ó�� //
      cb1.addItemListener(new EventE());
      cb2.addItemListener(new EventE());
      cb3.addItemListener(new EventE());
      cb4.addItemListener(new EventE());
      
      // panel p1 �κ�  //
      p1 = new Panel();
      p1.setBackground(Color.BLUE);
      p1.setForeground(Color.white);
      p1.setBounds(65,80,370,60);
      p1.setFont(f2);
      p1.add(cb1);p1.add(cb2);p1.add(cb3);p1.add(cb4);
      
      
      
      // Label result �κ�  //
      result = new Label();
      result.setBounds(100,200,300,50);
      result.setBackground(Color.yellow);
      result.setFont(f2);
      result.setAlignment(Label.CENTER);
      
   

      
      // �����ӿ� ������Ʈ add //
            add(p1);
            add(result);
      this.setVisible(true);
   }
   class EventE implements ItemListener {
      public void itemStateChanged(ItemEvent e){
         Checkbox cb = (Checkbox)e.getSource();
         String color = cb.getLabel();
         
         if(color.equals("A��")){
            result.setText(color+"�� �����ϼ̽��ϴ�.");
      }
      else if(color.equals("B��")){
         result.setText(color+"�� �����ϼ̽��ϴ�.");
      }
      else if(color.equals("O��")){
         result.setText(color+"�� �����ϼ̽��ϴ�.");
      }else{
         result.setText(color+"�� �����ϼ̽��ϴ�.");
      }
   
   }
   }
   
   public static void main(String[] args) {
      new Test4("������ ���α׷�");
   }

}