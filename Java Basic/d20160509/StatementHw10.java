package d20160509;
import java.util.Scanner; // 데이터를 입력 받기 위해 Scanner 객체를 생성 받아야하는데, 이를 위한 Library Import.

// Quiz, 성적 입력 받아 학점 출력하는 코드 완성

// StatementHw10 Class Start
public class StatementHw10 {
	// Main Method Start
	public static void main(String[] args)
	{
		System.out.print("학점 입력:"); // "학점 입력: " 문자열 출력.
		Scanner sc = new Scanner(System.in); // 데이터를 입력 받기 위해 sc 객체 생성 후, 입력 값 저장.
		int val = sc.nextInt(); // int Type의 변수를 선언하고 입력 값을 사용하여 초기화.  
		
		if(val >= 90) // 입력 값이 90 이상이면, "A 학점" 문자열 출력.
			System.out.println("A 학점");
		else if(val>=80) // 입력 값이 90 미만, 80 이상이라면, "B 학점" 문자열 출력.
			System.out.println("B 학점");
		else if(val>=70) // 입력 값이 80 미만, 70 이상이라면, "C 학점" 문자열 출력.
			System.out.println("C 학점");
		else if(val>=60) // 입력 값이 70  미만, 60 이상이라면, "D 학점" 문자열 출력.
			System.out.println("D 학점");
		else // 입력 값이 60 미만이라면, "F 학점" 문자열 출력.
			System.out.println("F 학점");
	}
	// Main Method End
}
//StatementHw10 Class Start