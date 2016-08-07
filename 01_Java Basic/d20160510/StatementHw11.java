package d20160510;
import java.util.Scanner; // Scanner 객체 사용을 위한 Library import.

// Quiz, 입력된 값이 3의 배수인지 아닌지 판별.
// StatementHw1 Class Start.
public class StatementHw11 {
	// Main Method Start.
	public static void main(String[] args)
	{
		System.out.print("입력: ");
		Scanner sc = new Scanner(System.in); // 사용자로부터 값을 입력 받음.
		int num = sc.nextInt(); // 입력 받은 값을 int Type 변수 num에 저장.
		
		if(num%3 == 0) // 분기문을 통해 %3의 값이 0이면 3의 배수, 아니면 3의 배수가 아님을 출력.
			System.out.println(num + "은 3의 배수이다."); // 분기문의 조건 만족 시, 출력.
		else // if 문의 조건을 만족하지 않을 때에만 실행.
			System.out.println(num + "은 3의 배수가 아니다."); // 분기문의 조건 불만족 시, 출력.
	}
	// Main Method End.
}
//StatementHw1 Class End.