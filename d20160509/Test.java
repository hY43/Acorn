package d20160509;
// Test Class Start
public class Test {
	// Main Method Start
	public static void main(String[] args)
	{
		char c1 = 'a'; // char Type 변수 c1 선언 후, 'a' 문자 대입.
		char c2 = 97; // char Type 변수 c2 선언 후, 아스키 코드 97 대입.('a' 출력)
		char c3 = '\u0061'; // char Type 변수 c3 선언 후, 유니 코드 0061 대입.('a' 출력)
		System.out.println("c1: " + c1 + ", c2: " +  c2 + ", c3: " + c3); // 문자 출력
		//char c4 = "a"; // c4는 char Type 변수이므로 문자열을 의미하는 더블 쿼터(")로 묶인 문자를 담을 수 없다.
		//char c5 = 'ab'; // c5는 char Type 변수이며, 싱글 쿼터(')는 문자를 묶기 때문에 에러가 난다.
		
		char ch6 = '\n'; // \ 의미가 있는 특수 문자를 표기하는 기호.
		System.out.println("오늘은 " + " 월요일"); // 연결 연산자 + 를 이용하여 "오늘은 월요일" 문자열 출력.
		System.out.println("오늘은 " + ch6 + " 월요일"); // \n은 개행을 의미하기 때문에 출력 시 오늘은 이후에 enter를 입력과 같은 결과를 출력한다.
		
		char ch7 = '\t'; // \ 의미가 있는 특수 문자를 표기하는 기호.
		System.out.println("오늘은 " + " 월요일"); // 연결 연산자 + 를 이용하여 "오늘은 월요일" 문자열 출력.
		System.out.println("오늘은 " + ch7 + " 월요일"); // \t은 Tab을 의미하기 때문에 출력 시 오늘은 이후에 Tab을 입력과 같은 결과를 출력한다.
		
		char ch8 = '\b'; // \ 의미가 있는 특수 문자를 표기하는 기호.
		System.out.println("오늘은 " + " 월요일"); // 연결 연산자 + 를 이용하여 "오늘은 월요일" 문자열 출력.
		System.out.println("오늘은 " + ch8 + " 월요일"); // \b은 Backspace을 의미하기 때문에 출력 시 오늘은 이후에 backspace 입력과 같은 결과를 출력한다.
		
		char ch9 = '\''; // 싱글 쿼터(')를 출력하기 위해서는 싱글 쿼터(')만 쓰는 것이 아니라 역슬래시(\)를 입력한 후, 그뒤에 적어준다.
		System.out.println(ch9);		
	}
	// Main Method End
}
//Test Class End