package d20160504;
// ctrl + shift + 'F': 자동 정렬
// VarEx4 Class Start
public class VarEx4 {
	// Main Method Start
	public static void main(String[] args) {
		char c = 'a'; // char Type의 변수 c를 선언한 후, 문자 'a'를 대입.
		System.out.println("c : "+ c); // char Type의 변수 c의 내용 출력.
		
		char d1 = 'J';
		char d2 = 'A';
		char d3 = 'V';
		char d4 = 'A';
		System.out.println(""+d1+d2+d3+d4); // 문자+문자는 ASCII Code 값으로 산술 연산을 하기 깨문에 문자열 + 문자의 형태로 바꿔야 정상적으로 "JAVA"가 출력된다.
	
		String str = "Hello Java World";
		System.out.println(str);
		
		char c1 = 'A';
		//char c2 = 'AB';
		String s1 = "A";
		String s2 = "AB";
		
		char ch1 = 'a'; // 문자
		char ch2 = 97; // ASCII Code 97 => 'a'
		char ch3 = '\u0061'; // unicode
		System.out.println("ch1: " + ch1);
		System.out.println("ch2: " + ch2);
		System.out.println("ch3: " + ch3);
	}
	// Main Method End
}
// VarEx4 Class End