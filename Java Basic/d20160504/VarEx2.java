package d20160504;

// VarEx2 Class Start
public class VarEx2 {
	// Main Method Start
	public static void main(String[] args)
	{
		// 자바의 모든 변수는 반드시 초기화해서 사용해야 합니다.
		// 변수를 선언하면서 값을 담는 것을 초기화라 한다.
		byte b1 = 1; // byte Type의 변수 b1을 선언하고 10을 대입.
		byte b2 = 20; // byte Type의 변수 b2를 선언하고 20을 대입.
		
		System.out.println(b1 + b2); // 변수 b1과 b2에 들어있는 값을 + 연산한 후, 그 결과를 출력.
		
		short sh1 = 100; // short Type의 변수 sh1을 선언하고 100을 대입.
		
		sh1 = b1; // b1의 값을 sh1에 대입한다. sh1이 b1보다 큰 자료형이기 때문에 아무 문제 없이 실행.(암시적 형변환)
		b1 = (byte)sh1; // sh1의 값을 b1에 대입하는데, sh1의 자료형이 더 크기 때문에 강제로 같은 자료형으로 형변환 시킴.(명시적 형변환)
	}
	// Main Method End
}
// VarEx2 Class End