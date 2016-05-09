package d20160509;
import java.util.Scanner; // Scanner 객체 사용을 위한 Library import

// StatementEx6 Class Start
public class StatementEx6 {
	// Main Method Start
	public static void main(String[] args)
	{
		// 1. 사용자로부터 성적을 입력 받는다.
		//	1) System.out.read();
		//	2) Scanner
		System.out.print("입력: "); // "입력: " 문자열 출력.
		Scanner sc = new Scanner(System.in); // Scanner Class의 객체 sc를 선언하고 입력 값을 받아 해당 reference를 대입.
		int value = sc.nextInt(); // 객체 sc를 이용하여 입력 받은 값을 int 형 변수 value를 선언하고 이에 대입.
		// 2. 입력된 값 출력.
		System.out.println("입력된 값은 " + value + "입니다.");
		// 3. 입력된 성적이 90점 이상이면 A 학점 문자을 출력한다.
		if(value >= 90) // 조건 분기문
			System.out.println("A 학점"); // 분기문 조건, value >= 90이 참이라면 "A 학점" 문자열 출력.
	}
	// Main Method End
}
//StatementEx6 Class End