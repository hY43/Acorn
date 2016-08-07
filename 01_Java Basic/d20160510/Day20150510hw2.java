package d20160510;
import java.util.Scanner;

// 숙제2 . 국어, 영어 , 수학 점수를 입력 받아 총점과 평균을 출력하세요 
// Day20150510hw2 Class Start.
public class Day20150510hw2 {
	// Main Method Start.
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in); // 사용자로부터 값을 입력 받기 위한 터미널 개방.
		System.out.print("국어 점수: ");
		int kor = sc.nextInt(); // 값을 입력 받아 kor 변수에 저장(국어 점수)
		System.out.print("영어 점수: ");
		int eng = sc.nextInt(); // 값을 입력 받아 eng 변수에 저장(영어 점수)
		System.out.print("수학 점수: ");
		int math = sc.nextInt(); // 값을 입력 받아 math 변수에 저장(수학 점수)
		
		int total = kor + eng + math; // 국영수의 점수 합계를 구한 후, int Type 변수 total에 대입.
		float avg = total/3; // total을 과목 수인 3으로 나눠 평균을 구하는데, 평균은 소수점이 존재하므로 float Type의 변수 avg를 선언하여 대입한다.
		
		System.out.println("----------"); // 결과 출력.
		System.out.println("총점: " + total);
		System.out.println("평균: " + avg);
	}
	// Main Method End.
}
//Day20150510hw2 Class End.