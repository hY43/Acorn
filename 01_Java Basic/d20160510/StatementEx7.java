package d20160510;
import java.util.Scanner; // Scanner 객체를 사용하기 위한 Library import.

// StatementEx7 Class Start.
public class StatementEx7 {
	// Main Method Start.
	public static void main(String[] args)
	{
		// System.out: 모니터, System.in: 키보드
		// 사용자의 입력 값을 받아서 이 값이 홀수인지 짝수인지 판별.
		System.out.print("입력: ");
		Scanner sc = new Scanner(System.in); // 사용자로부터 값을 입력 받음.
		int num = sc.nextInt(); // 입력 값을 int Type 변수 num에 대입.
		if((num%2) == 0) // 분기문을 이용해서, %2의 결과가 0이면 짝수, 0이 아니면 홀수.
			System.out.println(num + "는 짝수 입니다."); // 분기문의 조건 만족시, 출력.
		else // if 문의 조건을 불만족시에만 수행되는 else.
			System.out.println(num + "는 홀수 입니다."); // 분기문의 조건 불만족시, 출력.
	}
	// Main Method End.
}
//StatementEx7 Class End.