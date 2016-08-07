package d20160511;

// ArrayEx4 Class Start. 
public class ArrayEx4 {
	// Main Method Start.
	public static void main(String[] args)
	{
		// Main Method의 배열 사용하기.(거의 사용되지 않는다.)
		// System.out.println("args[0]: " + args[0]); // run as - run configuration - argument
		// System.out.println("args[1]: " + args[1]);
		
		char[] ch = {'j', 'a', 'v', 'a', ' ', 'w', 'o', 'r', 'l', 'd'}; // char Type 배열 ch 선언 후, 각 요소 초기화.
		for(int i=0;i<ch.length;i++) // 배열의 각 요소를 출력하기 위한 for문.
			System.out.print(ch[i]);
		
		System.out.println("\n----------------");
		String str = "java world"; // String는 자료형이 아니라 Char 배열을 조작하여 만들어진 Class이다.
		System.out.println(str);
		
	}
	// Main Method End.
}
// ArrayEx4 Class End.