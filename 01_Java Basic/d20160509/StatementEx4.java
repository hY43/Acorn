package d20160509;
import java.io.IOException; // System.in.read()를 사용하기 위한 라이브러리 import

// StatementEx4 Class Start
public class StatementEx4 {
	// Main Method Start
	public static void main(String[] args) throws IOException
	{
		// 외부로 부터 값을 입력 받기.
		System.out.println("입력받기");
		// 사용자로부터 한글자를 입력받아 ASCII 코드로 리턴
		int value = System.in.read(); // 사용자 데이터 입력 받기 위해 System.in.read() 사용
		value -= 48; // 입력 받은 문자의 아스키 코드가 출력되기 때문에 48을 빼면 입력한 숫자가 출력.
		System.out.println("value: " + value); // 입력된 술자 출력
		
		// 사용자가 입력한 구구단 출력
		for(int i=1;i<10;i++) // 1~9까지의 값을 입력받은 값에 곱해 구구단을 출력하는데, 이때 사용할 변수 i에 대한 for 문.
		{
			System.out.println(value + " * " + i + " = " + (value*i));	
			// ex) 3*1=3 과 같은 형식으로 구구단을 출력하기 위한 출력문.
		}
	}
	// Main Method End
}
//StatementEx4 Class End