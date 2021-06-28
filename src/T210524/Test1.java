<<<<<<< HEAD
/*
 
    â˜… 
   â˜…â˜…â˜… 
  â˜…â˜…â˜…â˜…â˜… 
 â˜…â˜…â˜…â˜…â˜…â˜…â˜… 
â˜…â˜…â˜…â˜…â˜…â˜…â˜…â˜…â˜… 

*/

package T210523;


public class Test1 {
public static void main (String[] args) {
	String star="â˜…";
	
	for(int i=0 ; i<5 ; i++) {
		
		
		for(int j=4-i ; j>0 ; j--){		// 5ë²ˆ ê³µê°„, 4, 3, 2, 1, 
			System.out.print(" ");
		}
		
		for(int j=2*i+1 ; j>0; j--) {		// 1, 3, 5, 7, 9 ..... 2 4 6 8  10 -1
			
			System.out.print(star);
		}
		System.out.println(" ");
		
	}
	
}
=======
package T210524;

import java.awt.*;
import java.awt.event.*;


class EventA implements WindowListener{			// ÀÌº¥Æ® A¶ó´Â Ã³¸®±â

	public void windowOpened(WindowEvent e) {
		System.out.println("ÇÁ·¹ÀÓÀ» ½ÃÀÛÇÕ´Ï´Ù.");
	}

	public void windowClosing(WindowEvent e) {
		System.out.println("ÇÁ·¹ÀÓÀ» Á¾·áÇÕ´Ï´Ù.");
		System.exit(0); // ÇÁ·¹ÀÓ Á¾·á
		
	}

	public void windowClosed(WindowEvent e) {
		
	}

	public void windowIconified(WindowEvent e) {
		
	}

	public void windowDeiconified(WindowEvent e) {
		
	}

	public void windowActivated(WindowEvent e) {
		
	}

	@Override
	public void windowDeactivated(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}			// 3. ÀÌº¥Æ® Ã³¸®±â(ÇÁ·¹ÀÓÀÇ x¹öÆ° ´©¸¦¶§ Ã³¸®µÇ´Â Å¬·¡½º)
	
}



// 2°³ ÀÌ»óÀÇ Ãß»ó¸Þ¼Òµå¸¦ °¡Áö°í ÀÖ´Â ÀÎÅÍÆäÀÌ½º´Â ¹Ì¸® Adapter Å¬·¡½º·Î ±¸ÇöµÇ¾î ÀÖ±â¶§¹®¿¡
// Adapter Å¬·¡½º¸¦ »ó¼Ó ¹Þ¾Æ¼­ ¿øÇÏ´Â ÄÝ¹é¸Þ¼Òµå¸¸ ¿À¹ö¶óÀÌµù ÇÏ¸é µÊ!
class EventB extends WindowAdapter{				// ÀÌº¥Æ®B ¶ó´Â Ã³¸®±â
	public void windowClosing(WindowEvent e) {	//¿À¹ö¶óÀÌµù
		System.exit(0);
	}
	
}



public class Test1 extends Frame{
	
	Button b1;
	
	
	Test1(String title){					// »ý¼ºÀÚ´Â ¸â¹öº¯¼ö ÃÊ±âÈ­ ´ã´ç!
		super(title);						// 1. ÀÌº¥Æ® ¼Ò½º(´ë»ó)-Frame
		b1 = new Button("ok");
		
		
		//this.addWindowListener(new EventB());		// 2. ÀÌº¥Æ® ¸®½º³Ê(°¨Áö±â)
		
		
		// ÀÍ¸íÅ¬·¡½º »ç¿ë¹æ¹ý(¿ø·¡´Â À§¿¡Ã³·³ ´Ù¸¥ Å¬·¡½º¸¦ ºÒ·¯¼­ ´Ù³à¿Í¾ßÇÏÁö¸¸, ÂªÀº°ÍµéÀº ÀÍ¸íÅ¬·¡½º¸¦ ºÒ·¯¼­ ¹Ù·Î ¾²°í ¹ö¸°´ÙÀÕ!!!
		this.addWindowListener(new WindowAdapter(){		
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
			
		});
		
		
		
		
		
		setBounds(500, 300, 500, 400);
		setVisible(true);
		
	
	}
	
	
	public static void main(String[] args) {
		
		Test1 t1 = new Test1("ÀÌº¥Æ® Ã³¸®¿¬½ÀÁß");
		
		
	}
	
>>>>>>> 1cfce454ef19cbb845c235f58fac5ee4439b87f9
}
