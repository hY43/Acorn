package d20160509;
// 6 순위 논리 연산자 : &&, ||, (예외적으로 !는 1순위 연산자이다.)

// OperEx6 Class Start
public class OperEx6 {
	// Main Method Start
	public static void main(String[] args)
	{
		boolean b1 = true;
		boolean b2 = false;
		// boolean Type의 변수 b1, b2를 선언한 후, 초기화.
		System.out.println("b1 && b2 : " + (b1&&b2)); // 둘다 true 인 경우에만 true 출력.
		System.out.println("b1 || b2 : " + (b1||b2)); // 둘 중 하나가 true이면 true 출력.
		
		/*
		byte b3 = 10;
		byte b4 = 20;
		System.out.println("b1 || b2 : " + (b3||b4)); // int 값이므로 논리 연산이 불가능하다. 
		*/		
		
		System.out.println(!b1); // true라면 false로, false라면 true를 출력한다.
	}
	// Main Method End
}
//OperEx6 Class End