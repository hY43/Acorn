package d20160509;
import java.io.IOException; // 사용자로 부터 값을 입력 받기 위한 Method System.in.read 사용을 위한 Library import
// 사용자로부터 입력 받은 한문자를 출력하기.

// StatementHw6 Class Start
public class StatementHw6
{
	// Main Method Start
	public static void main(String[] args)  throws IOException // System.in.read Method에서 나오는 예외를 처리하기 위한 throws 추가.
	{
		System.out.print("입력:");
		System.out.println("사용자가 입력한 문자는 "+(char)(System.in.read())+"입니다."); 
		// System.in.read을 통해 입력 받은 값은 int Type으로 저장되기 때문에, 문자 입력 시 ASCII Code 값으로 출력된다.
		// 이 때문에 char Type으로 강제 형변환 시켜 문자로 출력한다.
	}
	// Main Method End
}
//StatementHw6 Class End