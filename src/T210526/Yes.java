package T210526;


import java.awt.*;
import java.awt.event.*;
import javax.swing.ImageIcon;

public class Yes extends Frame{
	Button b1,b2,b3,b4, b5;
	Font f1 = new Font("Webdings",Font.BOLD+Font.PLAIN, 22);
	Font f2 = new Font("Webdings",Font.BOLD+Font.PLAIN, 38);
	Panel p1;
	Label L1;
	Image img = null, img2 =null;
	
	Yes(String title){
	   super(title);
	    this.setBounds(500,300,500,600);
	    this.setLayout(null); // ������ ���̾ƿ� ������!
	    this.setBackground(Color.DARK_GRAY);
	    
		
		Toolkit tk = Toolkit.getDefaultToolkit();		// �̹����� ���� ��Ŷ �־����
		Dimension screenSize = tk.getScreenSize();
		setBounds((screenSize.width)/2-300,
				(screenSize.height)/2-400, 600, 800);
		
//*******************    ��ư �κ�   ***************************** //
	      b1 = new Button("�Ƹ޸�ī��");
	      b1.setBounds(430,230,135,80);
	      b1.setBackground(new Color(112,146,190));
	      b1.setForeground(Color.white);
	      b1.setFont(f1);

	      b2 = new Button("īǪġ��");
	      b2.setBounds(430,360,135,80);
	      b2.setBackground(new Color(112,146,190));
	      b2.setForeground(Color.white);
	      b2.setFont(f1);
	      
	      b3 = new Button("��ġǪī");
	      b3.setBounds(430,490,135,80);
	      b3.setBackground(new Color(112,146,190));
	      b3.setForeground(Color.white);
	      b3.setFont(f1);
	      
	      b4 = new Button("��ī���޾�");
	      b4.setBounds(430,620,135,80);
	      b4.setBackground(new Color(112,146,190));
	      b4.setForeground(Color.white);
	      b4.setFont(f1);
	      

	      
	      b1.addActionListener(new  ActionListener(){// 2. �̺�Ʈ ������(������)
	          public void actionPerformed(ActionEvent e) {
	        	  
	          }
	       });   
	       b2.addActionListener(new  ActionListener(){// 2. �̺�Ʈ ������(������)
	          public void actionPerformed(ActionEvent e) {

	          }
	       });  
	       b3.addActionListener(new  ActionListener(){// 2. �̺�Ʈ ������(������)
	          public void actionPerformed(ActionEvent e) {

	          }
	       });  
	       b4.addActionListener(new  ActionListener(){// 2. �̺�Ʈ ������(������)
	          public void actionPerformed(ActionEvent e) {

	          }
	       }); 
	      
	      
	      
//*******************    �� �κ�   ***************************** //
	      L1 = new Label("ī�信 ���Ű� ȯ���մϴ�.");
	      L1.setBounds(30, 60,540,120);
	      L1.setBackground(new Color(112,146,190));
	      L1.setAlignment(Label.CENTER);
	      L1.setForeground(Color.white);
	      L1.setFont(f2);
	      
	      
	      
	      
	      
//*******************   �г� �κ�   ***************************** //	      
	      
	      p1 = new Panel();
	      p1.setBounds(30, 230, 380, 400);
	      p1.setBackground(new Color(112,146,190));
	      
	      
	      
	      
	      
//*******************    �̹��� �κ�   ***************************** //		
		img = tk.getImage("images/help.jpg");
		img2 =tk.getImage("mini.jpg");
		
			
		
		
		
		
		this.addWindowListener(new WindowAdapter(){ // �͸�Ŭ���� ���! 
            public void windowClosing(WindowEvent e) { // �������̵�
               System.exit(0); // ���α׷� ����
            }
         });
 
		
		
		
//*******************  ���̴� �κ�   ***************************** //
		
	    add(b1);add(b2);add(b3);add(b4); add(L1);
		// add(p1);
		this.setVisible(true);
	}
	
	
	
	
	public void paint(Graphics g) {			// �������̵�
		
		if(img == null) {
			return;							// �����ϰ� ���ư�
		}

		
		g.drawImage(img, 0, 0,this);
		g.drawImage(img2, 50, 200,this);

	}
	
	
	class Event123 implements ActionListener{
	      public void actionPerformed(ActionEvent e) {
	       //  Button b1 = (Button)e.getSource();
	         
	    	  
	    	  if(e.getActionCommand() == "�Ƹ޸�ī��") {
	    		  //  ta.setText("��¼�� ��¼�� �Դϴ�");
	    	  }
	         
	      }
	      
	   }
	
	
	public static void main(String[] args) {
		
		
		new Yes("�̹��� �ֱ�");
		
	}
	

}

