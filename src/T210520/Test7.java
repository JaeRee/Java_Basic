package T210520;
	
import java.awt.*;					// �����̳�, ������Ʈ �̿��ϱ� ����
									// ������Ʈ�� ����ִ°� �����̳�
									// ��Ӱ��迡���� ������Ʈ�� ����> �����̳� (�̻���--)
public class Test7 {
	
	public static void main(String[] args) {
		
		
		Frame f = new Frame("������ �������Դϴ�.");		// ������ ��ü����
		
		
		f.setSize(400, 300);						// ������ ������(�ȼ�����), ������ ���ϸ� �Ⱥ���
		f.setLocation(500,200);						// ������ ���� ��ġ (x, y) ����!
		// f.setBounds(500, 200, 400, 300);			// ������ġ �� �ʺ�,���� �ѹ濡 ����
		f.setBackground(Color.ORANGE);				// ȭ�� ��� ����
		f.setLayout(null);							// �⺻ ���̾ƿ� �Ⱦ��� ���� ��ǥ�� ��ġ��Ŵ!
		
		
		
		
		// f.setTitle("����������");
		// String str = f.getTitle();
		// System.out.println("����ǥ������ ������ "+str+"�Դϴ�.");
		
		
		Button b1 = new Button("��ư");				// ��ư1
		b1.setBounds(50,80, 50, 50);				// (x,y,�ʺ�,����)
		b1.setBackground(Color.CYAN);
		f.add(b1);									// �����ӿ� ������Ʈ(��ư) ���̱�
		b1.setForeground(Color.blue);				// ���� ����
		
		
		Button b2 = new Button("��ư");				// ��ư2
		b2.setBounds(250,80, 50, 50);
		b2.setBackground(Color.green);
		f.add(b2);									// �����ӿ� ������Ʈ(��ư) ���̱�
		
		
		
		f.setResizable(false);						// ȭ�� ũ�� ���� 
		f.setVisible(true);							// ������ ���̱�
		
		
		
		
	}

}
