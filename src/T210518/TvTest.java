package T210518;

public class TvTest {
	
		public static void main(String[] args) {
			
			Tv t1 = new Tv();					// ����, ����     ���x
			CaptionTv ctv1 = new CaptionTv();
			
			// ctv1 = (CaptionTv)t1;
			// t1�� Ÿ���� Tv(����) -> ctv1�� Ÿ���� ĸ��Ƽ��(�ڽ�)
			// �̷� ���� �ٿ�ĳ�����̶����.. ����ȯ �ʼ�
			// ���ϰ��迡���� ����.. �������迡���� �ȉ�!
			
			t1 = ctv1;	// ctv1�� Ÿ���� ĸ��Ƽ��(�ڽ�Ŭ����) �ε� t1�� Ÿ���� Tv(����)
						// UpCasting(��ĳ����)�� ����ȯ ��������!!!
			
			
			
			
			
			
			
			
			// ������ : ����Ÿ���� ���������� �ڼ�Ÿ���� ��ü�� �ٷ� �� �ִ� ��!
			Tv t2 = new CaptionTv();	// ������
			// CaptionTv ctv2 =new Tv(); �� ����
		}
}
