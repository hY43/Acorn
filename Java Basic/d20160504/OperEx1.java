package d20160504;
// 연산자: 자료 가공을 위해 정해진 방식으로 계산하고 그 결과를 얻는 행위를 의미하는 기호들의 총칭.
// 1 순위: 증감 연산자.
// OperEx1 Class Start
public class OperEx1 {
	// Main Method Start
	public static void main(String[] args)
	{
		int a = 100;
		int b = 20;
		// a의 변수 값을 1 증가 시키고 싶다.
		a = a + 1;
		
		System.out.println("a : " + a);
		
		// 연산자를 한개만 이용하여 a의 값을 1 증가 시키고 싶다.
		a++; // a=a+1 보다 연산자 수가 적기 때문에 속도가 빠르다.
		System.out.println("a : " + a);
		
		// a의 변수 값을 1 감소 시키고 싶다.
		a--;
		System.out.println("a : " + a);
		
		b = a++; // 뒤의 ++은 이 Line이 진행된 후에 증가 연산을 하기 때문에 값이 증가하기 전의 a값이 b에 들어간다.
		         // 즉, b = a; a = a+1; 을 한번에 쓴 것이라고 할 수 있다.
		System.out.println("a: " + a + ", b: " + b);
		
		int k = 20;
		int m = 10;
		
		k = m++;
		// k = 10, m = 11
		System.out.println("k: " + k + ", m: "+ m);
	}
	// Main Method End
}
// OperEx1 Class End