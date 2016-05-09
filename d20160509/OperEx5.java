package d20160509;
// 5 순위 연산자: 비트 연산자
// and => &, or => |
//OperEx5 Class Start
public class OperEx5 {
	// Main Method Start
	public static void main(String[] args)
	{
		byte a = 10; // 0000 1010
		byte b = 22; // 0001 0110
		System.out.println("a & b :  " + (a&b)); // a&b : 0000 0010 // &는 둘다 참일때 참이다.
		System.out.println("a | b :  " + (a|b)); // a|b : 0001 1110 // |는 하나라도 참이면 참이다.
		
		boolean b1 = true; // boolean Type으로 b1 변수를 선언한 후, boolean Type의 상수인 true 대입.
		boolean b2 = false; // boolean Type으로 b2 변수를 선언한 후, boolean Type의 상수인 false 대입.
		
		// boolean Type의 변수간의 연산이기 때문에 비트 연산의 결과 역시 true 혹은 false로 출력.
		System.out.println("b1 & b2 :  " + (b1&b2)); // 둘다 true 일때 true 출력.
		System.out.println("b1 | b2 :  " + (b1|b2)); // 둘중 하나가 true라면 true 출력
	}
	// Main Method End
}
// OperEx5 Class End