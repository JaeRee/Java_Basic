package Kanu;
import java.awt.*;
import javax.swing.*;

public class PanelT extends JFrame
{
 Container cPane;
 ImageIcon img;
 JLabel ImgBox;
 
 public PanelT()
 {
  // ȭ�� �г� ������.
  cPane = getContentPane();
  cPane.setLayout( null );
 
  //�̹��� �ҷ�����
  img = new ImageIcon( ".\\Kanu.jpg" );
 
  ImgBox = new JLabel( img );
 
  ImgBox.setBounds( 0, 50, img.getIconWidth(), img.getIconHeight() );
 
  // �гο� ������Ʈ ���
  cPane.add( ImgBox );  
 }
 
 public static void main( String[] args )
 {
  final int FRAME_WIDTH = 350;
  final int FRAME_HEIGHT = 525;
 
  PanelT frame = new PanelT();
 
  frame.setTitle( "�̹��� ����." );
  frame.setSize( FRAME_WIDTH, FRAME_HEIGHT );
  frame.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
  frame.setVisible( true );
 }
}