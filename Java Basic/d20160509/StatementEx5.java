package d20160509;
import java.util.Scanner; // Scanner 객체의 사용을 위한 Library import

// StatementEx5 Class Start
public class StatementEx5 {
	// Main Method Start
	public static void main(String[] args)
	{
		System.out.print("값 입력: ");
		// 값을 입력 받는 스캐너 만들기
		Scanner sc = new Scanner(System.in);
		// 스캐너로 부터 숫자 입력 받기
		int value = sc.nextInt();
		// 입력 받은 값 출력
		System.out.println(value);
		if(value > 100){ // 조건 분기문.
			System.out.println("입력된 값이 100보다 크다."); // if 내 조건문을 만족한다면(value>100) "입력된 값이 100보다 크다." 문자열 출력.
		}else{
			System.out.println("입력된 값이 100보다 작다."); // if 내 조건문을 만족하지 않는다면(value<=100) "입력된 값이 100보다 작다." 문자열 출력
		}
	}
	// Main Method End
}
//StatementEx5 Class End