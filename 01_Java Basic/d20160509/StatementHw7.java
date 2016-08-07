package d20160509;
import java.util.Scanner; // 사용자로 부터 데이터를 입력 받기 위해 Library import

// Quiz, 입력 받은 구구단만 출력하기.

// StatementHw7 Class Start
public class StatementHw7 {
	// Main Method Start
	public static void main(String[] args)
	{
		System.out.print("입력: ");
		Scanner sc = new Scanner(System.in); // 사용자로부터 입력 받은 값을 저장하기 위한 Scanner 객체 sc 선언.
		int value = sc.nextInt(); // 입력 받은 값을 int Type 변수 value 선언 후, 초기화.
		
		for(int i=1;i<=9;i++) // 구구단 출력을 위한 반복문(i는 1~9 변화.)
			System.out.println(value + " * " + i + " = " + (value*i));
			// 입력 받은 값은 고정 값으로 두고 그에 대한 구구단을 출력하기 위해 변화하는 i를 곱하여 출력.
	}
	// Main Method End
}
//StatementHw7 Class End