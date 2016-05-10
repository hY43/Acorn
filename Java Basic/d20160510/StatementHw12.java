package d20160510;
import java.io.IOException; // 사용자의 데이터를 입력받는 함수, System.in.read()를 사용하기 위한 Library import
// Quiz, 입력된 문자를 대소 전환 시키고자 한다.
// StatementHw12 Class Start.
public class StatementHw12 {
	// Main Method Start.
	public static void main(String[] args) throws IOException
	{
		System.out.print("입력:");
		int value = System.in.read(); // 사용자가 입력한 문자의 아스키 코드를 int Type의 변수 value에 대입.
		
		if(value >= 65 && value <= 90) // A~Z의 아스키 코드 범위 내에 들어있는지 확인.(+32)
			System.out.println("대문자 " + (char)value + "의 소문자는 " + (char)(value+32) + "입니다.");
		else if(value >= 97 && value <= 122) // a~z의 아스키 코드 범위 내에 들어있는지 확인.(-32)
			System.out.println("소문자 " + (char)value + "의 대문자는 " + (char)(value-32) + "입니다.");
		else
			System.out.println("잘못된 입력 값입니다.");
	}
	// Main Method End.
}
//StatementHw12 Class End.