package J210517;
import java.util.*;

class Point{
	
	int x, y;
	
	Point(){
		this(0,0);
	}
	Point(int x, int y){
		this.x = x;
		this.y = y;
	}
	
	String getLocation() {
		return x + "," + y;
	}
}

class Point3D extends Point{
	
	int z;
	String getLocation() {
	return "x: "+ x + ", y:" +y+", z:"+z;
	}
}



public class PointTest {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		Point p1 = new Point();
		Point p2 = new Point();
		
		
		System.out.println("�� ���� x���� �Է����ּ���: ");
		p1.x = sc.nextInt();

		
		System.out.println("�� ���� y���� �Է����ּ���: ");
		p1.y = sc.nextInt();
		
		System.out.println("�ٸ� �� ���� x���� �Է����ּ���: ");
		p2.x = sc.nextInt();

		
		System.out.println("�ٸ� �� ���� y���� �Է����ּ���: ");
		p2.y = sc.nextInt();

		
		int width, height;

		width = p2.x - p1.x;
		height = p2.y - p1.y;
		
		double dist = Math.sqrt((width*width)+(height*height));

		
		System.out.print("p1("+p1.getLocation()+") �� ");
		System.out.println("p2("+p2.getLocation()+") ������ �Ÿ���");	
		System.out.printf("%.2f �Դϴ�.", dist);
	}

}
