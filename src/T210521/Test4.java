// �޴� â �����

package T210521;

import java.awt.*;


public class Test4 {
   public static void main(String[] args) {
      Frame f = new Frame("�޴� ����� ����");
      f.setBackground(Color.orange);
      f.setBounds(500,300,500,300);
      
      MenuBar mb = new MenuBar();//�޴��� ��ü ����
      
      Menu mfile = new Menu("����");//�޴� ��ü ����
      MenuItem miOpen = new MenuItem("����");
      Menu mOthers = new Menu("��Ÿ");
      MenuItem miPrint = new MenuItem("�μ�");
      MenuItem miPreview = new MenuItem("�̸�����");
      MenuItem miExit = new MenuItem("�ݱ�");
      
      //
      mfile.add(miOpen);
      mfile.addSeparator(); //����
      mfile.add(miExit);
      mfile.add(mOthers);
      mfile.add(miPreview);
      mfile.add(miPrint);
      
      
      
      Menu mhelp = new Menu("����");
      MenuItem miHelp = new MenuItem("����");
      CheckboxMenuItem mihelp2 = new CheckboxMenuItem("������2");
      mhelp.add(miHelp);
      mhelp.add(mihelp2);
      
      /*************************************/
      
      
      
      
      
      
      
      /****************************/
      //�޴��ٿ��� �޴��� add �� �� ����
      mb.add(mfile);mb.add(mhelp);
      
      //�����ӿ� �޴��� ���̱�
      f.setMenuBar(mb);
      
      f.setVisible(true);
      
   }

}