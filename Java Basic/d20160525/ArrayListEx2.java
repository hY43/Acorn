package d20160525;

public class ArrayListEx2 {
	// 자바는 객체 지향 언어 입니다.
	// 하지만 primitive 변수는 C에서 가져왔기 때문에 관련 클래스가 없다.
	// 이런 타입의 변수들은 Wrapper Class로 Primitive 변수를 감싸서 객체로 만들 수 있다.
	// Ex) int => Integer
	//     byte => Byte
	//     short => Short
	//     char => Character
	// int와 char를 제외한 모든 Primitive Type의 첫글자를 대문자로 바꾸면 Wrapper Class 이다.
	public static void main(String[] args) {
		byte b = 20;
		Byte by = new Byte(b);
		System.out.println(Byte.MAX_VALUE);
		System.out.println(Byte.MIN_VALUE);
		
		int c = 30;
		Integer it = new Integer(c);
		System.out.println(Integer.MAX_VALUE);
		System.out.println(Integer.MIN_VALUE);
		// 입력된 숫자의 이진수 출력
		System.out.println(Integer.toBinaryString(30));
		
		// float Type으로 변형
		System.out.println(it.floatValue());
		
		// Primitive <-> Wrapper Class 자유롭게 변환 가능하다.
		Integer it2 = c; // Auto-Boxing
		Integer it3 = 30; // Auto-Boxing
		int it4 = it2; // UnBoxing
	}
}
