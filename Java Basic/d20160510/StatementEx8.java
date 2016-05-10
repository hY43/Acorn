package d20160510;
import java.io.IOException;

// StatementEx8 Class Start.
public class StatementEx8 {
	// Main Method Start.
	public static void main(String[] args) throws IOException
	{
		// 입력된 값이 대문자인지 소문자인지 숫자인지 판별.
		System.out.print("입력: ");
		int value = System.in.read();// 사용자부터 값을 입력 받음.
									 // 입력 받은 ASCII Code 값을 저장할 int Type 변수 value 선언 후, 대입.
		
		// 분기문: 입력 받은 값이 대문자인지 소문자인지 숫자인지 판별.(ASCII Code A:65, a:97, 0:48)
		if(value >= 65 && value <= 90) // A~Z 의 아스키코드 범위를 만족하는지 확인하는 분기문.
			System.out.println((char)value + "는 대문자 입니다.");
		else if(value >= 97 && value <= 122) // a~z 의 아스키코드 범위를 만족하는지 확인하는 분기문.
			System.out.println((char)value + "는 소문자 입니다.");
		else if(value >= 48 && value <= 57) // 0~9 의 아스키코드 범위를 만족하는지 확인하는 분기문.
			System.out.println((char)value + "는 숫자 입니다.");
		else // 대문자, 소문자, 숫자의 아스키코드 범위를 아무 것도 만족하지 않았을때만 실행되는 else문.
			System.out.println("값을 잘못 입력하셨습니다.");
	}
	// Main Method End.
}
//StatementEx8 Class End.