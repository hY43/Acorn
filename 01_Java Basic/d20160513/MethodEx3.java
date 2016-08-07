package d20160513;

// MethodEx3 Class Start.
public class MethodEx3 {
	// static [return값의자료형] [MethodName] ([자료형] [변수명], [자료형] [변수명]...){}
	// void: 이 Method를 실행한 후에 아무 것도 반환하지 말 것.(Return 값 없음)
	
	// add Method Start. ( int )
	static int add(int a, int b) // 매개변수는 지역 변수로, 해당 Method에서만 사용되므로 이름은 그 Method에서만 유일하면 된다.
	{
		System.out.println("============= add Method 내부 실행 중 =============");
		System.out.println("a: " + a);
		System.out.println("b: " + b);
		
		// 일을 처리하고 값을 Main Method로 리턴할 수 있다.
		return (a+b);
	}
	// add Method End.
	
	// add Method Start. ( float )
		static float add(float a, int b)
		{
			System.out.println("============= add Method 내부 실행 중 =============");
			System.out.println("a: " + a);
			System.out.println("b: " + b);
			
			// 일을 처리하고 값을 Main Method로 리턴할 수 있다.
			return (a+b);
		}
		// add Method End.
	
	// minus Method Start.
	static int minus(int a, int b)
	{
		System.out.println("============= minus Method 내부 실행 중 =============");
		System.out.println("a: " + a);
		System.out.println("b: " + b);
		
		// 일을 처리하고 값을 Main Method로 리턴할 수 있다.
		return (a-b);
	}
	// minus Method End.
	
	// Main Method Start.
	public static void main(String[] args)
	{
		// Method 호출 시, Method 명과 매개 변수 개수, 타입, 순서가 일치해야 한다.
		int k = add(100,200);
		System.out.println("k: " + k);

		int n = minus(300,100);
		System.out.println("n: " + n );
		
		float f = add(102.2f, 500);
		System.out.println("f: " + f );
	}
	// Main Method End.
}
//MethodEx3 Class End.