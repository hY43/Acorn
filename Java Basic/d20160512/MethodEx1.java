package d20160512;
import java.util.Scanner; // 사용자로부터 데이터를 입력받기 위한 Library Import.

// MethodEx1 Class Start.
public class MethodEx1 {
	// Method: 자주 사용하는 코드가 있다면 그 코드에 이름을 붙이고, 필요할 때 호출하여 사용한다.

	// prtStar Method Start.
	static void prtStar() // 입력 받은 값을 이용하여 *을 출력하는 Method.
	{
		System.out.print("몇줄: ");
		Scanner sc = new Scanner(System.in); // 사용자로 부터 데이터를 입력 받기 위한 터미널 개방.
		int val = sc.nextInt(); // 사용자로부터 데이터를 입력 받아, int Type 변수 val에 대입.
		
		for(int i=1;i<=val;i++) // N Line을 출력하기 위한 for문.
		{
			for(int j=0;j<i;j++) // 실제 "*" 문자를 찍기 위한 for 문.
				System.out.print("*"); // "*" 문자 출력.
			System.out.println(); // 개행.
		} // for end.
	}
	// prtStar Method End.
	
	// prtHello Method Start.
	static void prtHello() // "안녕 자바" 문자열을 출력하는 Method
	{
		System.out.println("안녕 자바");
	}
	// prtHello Method End.
	
	// Main Method Start.
	public static void main(String[] args)
	{	
		prtStar();
		prtHello(); // "안녕 자바" 메세지 출력.
	}
	// Main Method End.
}
// MethodEx1 Class End.