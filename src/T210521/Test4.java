// 메뉴 창 만들기

package T210521;

import java.awt.*;


public class Test4 {
   public static void main(String[] args) {
      Frame f = new Frame("메뉴 만들기 연습");
      f.setBackground(Color.orange);
      f.setBounds(500,300,500,300);
      
      MenuBar mb = new MenuBar();//메뉴바 객체 생성
      
      Menu mfile = new Menu("파일");//메뉴 객체 생성
      MenuItem miOpen = new MenuItem("열기");
      Menu mOthers = new Menu("기타");
      MenuItem miPrint = new MenuItem("인쇄");
      MenuItem miPreview = new MenuItem("미리보기");
      MenuItem miExit = new MenuItem("닫기");
      
      //
      mfile.add(miOpen);
      mfile.addSeparator(); //수평선
      mfile.add(miExit);
      mfile.add(mOthers);
      mfile.add(miPreview);
      mfile.add(miPrint);
      
      
      
      Menu mhelp = new Menu("도움말");
      MenuItem miHelp = new MenuItem("설명");
      CheckboxMenuItem mihelp2 = new CheckboxMenuItem("설명보기2");
      mhelp.add(miHelp);
      mhelp.add(mihelp2);
      
      /*************************************/
      
      
      
      
      
      
      
      /****************************/
      //메뉴바에는 메뉴만 add 할 수 있음
      mb.add(mfile);mb.add(mhelp);
      
      //프레임에 메뉴바 붙이기
      f.setMenuBar(mb);
      
      f.setVisible(true);
      
   }

}