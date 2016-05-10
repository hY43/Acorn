package d20160510;
import java.util.Scanner; // 사용자로부터 값을 입력 받기 위한 Library import.

// Quiz, ABC 입력시 DEF가 출력되도록 코드를 구현하시오.
// SimSim1 Class Start.
public class SimSim1 {
	// Main Method Start.
	public static void main(String[] args) {
		System.out.print("입력: ");
		Scanner sc = new Scanner(System.in); // 사용자로부터 데이터 입력받음.
		String str = sc.nextLine(); // 사용자의 입력 값을 nextLine을 통해 String 변수 str에 대입.
		char[] alp = str.toCharArray(); // 문자열 배열 alp를 선언한 후, toCharArray Method를 사용하여 str에 저장된 문자열을 한글자단위로 잘라 배열의 각 요소에 대입.
		
		for (int i = 0; i < str.length(); i++) // str에 저장된 문자열의 길이만큼 반복을 진행.
			System.out.print((char)(alp[i]+3)); // 입력한 각 문자의 아스키 코드 값에 3을 더한 후, 출력.
	}
	// Main Method End.
}
//SimSim1 Class End.