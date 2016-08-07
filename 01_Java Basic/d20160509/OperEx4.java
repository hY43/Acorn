package d20160509;
// 4 순위 연산자: 비교 연산자
// >, <, >=, <=, ==, !=, <>
// OperEx4 Class Start
public class OperEx4 {
	// Main Method Start
	public static void main(String[] args)
	{
		int a = 100;
		int b = 20;
		System.out.println("a > b: " + a + b); // 앞에 문자열과 연결 연산했기 때문에, 120이 아니라 10020이 출력.
		System.out.println("a > b: " + (a > b)); // 변수 a의 값이 변수 b의 값보다 크므로 true가 출력.
		System.out.println("a < b: " + (a < b)); // 변수 a의 값이 변수 b의 값보다 크므로 false가 출력.
		System.out.println("a >= b: " + (a >= b)); // 변수 a의 값이 변수 b의 값보다 크므로 true가 출력.
		System.out.println("a <= b: " + (a <= b)); // 변수 a의 값이 변수 b의 값보다  크므로 false가 출력.
		System.out.println("a == b: " + (a == b)); // 변수 a의 값이 변수 b의 값보다 크므로 false가 출력.
		System.out.println("a != b: " + (a != b)); // 변수 a의 값이 변수 b의 값보다 크므로 true가 출력.
	}
	// Main Method End
}
// OperEx4 Class End