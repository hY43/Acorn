package d20160513;

// MethodEx4 Class Start.
public class MethodEx4 {
	// mul Method Start.
	// int Type의 변수 a와 b를 선언하고 매개 변수를 통해 값을 받아 두 수의 곱을 반환해주는 Method.
	static int mul(int a, int b)
	{
		System.out.println("a: " + a);
		System.out.println("b: " + b);
		a++;
		System.out.println("a: " + a);
		return a * b;
	}
	// mul Method End.
	
	// Main Method Start.
	public static void main(String[] args)
	{
		int a = 100;
		int b = 200;
		
		int c = mul(a,b);
		System.out.println("a: " + a);
		System.out.println("c: " + c);
	}
	// Main Method End.
}
// MethodEx4 Class End.