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
  // 화면 패널 얻어오기.
  cPane = getContentPane();
  cPane.setLayout( null );
 
  //이미지 불러오기
  img = new ImageIcon( ".\\Kanu.jpg" );
 
  ImgBox = new JLabel( img );
 
  ImgBox.setBounds( 0, 50, img.getIconWidth(), img.getIconHeight() );
 
  // 패널에 컴퍼턴트 등록
  cPane.add( ImgBox );  
 }
 
 public static void main( String[] args )
 {
  final int FRAME_WIDTH = 350;
  final int FRAME_HEIGHT = 525;
 
  PanelT frame = new PanelT();
 
  frame.setTitle( "이미지 띄우기." );
  frame.setSize( FRAME_WIDTH, FRAME_HEIGHT );
  frame.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
  frame.setVisible( true );
 }
}