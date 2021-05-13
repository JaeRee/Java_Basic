// 3명의 점수 더블형을 입력받아 총점과 평점을 구하는 프로그램
// 결과화면
// 학생1 점수입력: 90.5
// 학생2 점수 입력: 88.5
// 학생3 점수 입력: 85.1;
// 
// 3명의 총점: xxx.x
// 3명의 평균: xx. x

import java.util.*;

public class Test19 {
	public static void main(String[] args) {
		
		int num=0;
		Double sum = 0.0, aver = 0.0;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("성적을 입력할 인원은 몇명입니까?");
		System.out.print("인원: ");
		num = sc.nextInt();
		
		
		double[] stu = new double[num];
		
		for(int i=1 ; i<=num ; i++) {
			System.out.print("학생"+i+" 의 성적을 입력하세요: ");
			stu[i-1] = sc.nextDouble();
			sum += stu[i-1];
			aver = sum/4;
		}
		
		System.out.println();
		System.out.println(num+"명의 총점 : "+sum);
		System.out.println(num+"명의 평점 : "+aver);
		
	}

}
