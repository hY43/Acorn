package d20160510;
import java.util.Scanner; // 사용자로부터 값을 입력 받기 위해 사용할 Class에 대한 Library import

// StatementEx11 Class Start.
public class StatementEx11 {
	// Main Method Start.
	public static void main(String[] args) {
		System.out.print("당신의 성적을 입력하세요: ");
		Scanner sc = new Scanner(System.in); // 사용자로부터 값을 입력 받기 위한 터미널 개방.
		int score = sc.nextInt(); // 사용자로부터 입력 받은 값을 int Type 변수 score에 대입.
		
		System.out.println("score: " + score);
		
		switch(score/10) // 학점은 10단위로 나뉘어지기 때문에 10으로 나눈 몫으로 구분.
		{
		case 10:
		case 9: // 나눈 몫이 9 혹은 10이라면 A학점 출력.
			System.out.println("A학점");
			break;
		case 8: // 나눈 몫이 8이라면 B학점 출력.
			System.out.println("B학점");
			break;
		case 7: // 나눈 몫이 7이라면 C학점 출력.
			System.out.println("C학점");
			break;
		case 6: // 나눈 몫이 6이라면 D학점 출력.
			System.out.println("D학점");
			break;
		default: // 나눈 몫이 6미만이라면 F학점 출력.
			System.out.println("F학점");
			break;
		}
	}
	// Main Method End.
}
//StatementEx11 Class End.