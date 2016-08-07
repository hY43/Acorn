package d20160510;
import java.util.Scanner; // 사용자로 부터 값을 입력 받기 위해 Library import.
// Quiz, 변환하고자 하는 초를 입력: 54321
// [출력]
// 15시간 5분 21초

// StatementHw13 Class Start.
public class StatementHw13 {
	// Main Method Start.
	public static void main(String[] args)
	{
		System.out.print("변환하고자 하는 초를 입력: ");
		Scanner sc = new Scanner(System.in);
		int input = sc.nextInt(); // Scanner 객체를 이용하여 사용자로 부터 값을 입력 받고 그 값을 int Type의 변수 input에 대입.
		
		System.out.println("[출력]");
		int hours = input/3600; // 60*60 = 3600초, 한시간은 3600초이므로 3600초로 나누어 시간 값을 구함.
		int minutes = (input%3600)/60; // 시간 값을 구한 나머지를 분으로 나누어 분 값을 구함.
		int seconds = (input%3600)%60; // 시간 값을 구한 나머지에서 분을 구하고 그 나머지는 초이므로, 그 값을 대입.
		
		System.out.println("변환된 시간은 " + hours + "시간 " + minutes + "분 " + seconds + "초 입니다."); // x시간 x분 x초 결과 출력.
	}
	// Main Method End.
}
//StatementHw13 Class End.