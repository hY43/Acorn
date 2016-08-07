package d20160509;

// StatementEx2 Class Start
public class StatementEx2 {
	// Main Method Start
	public static void main(String[] args)
	{
		for(int i=0;i<=9;i++)
			System.out.println("*");
		// for문의 내용이 한줄이라면 중괄호 생략 가능.
		
		// 반복문 - while 문.
		int i = 1;// 초기식
		while(i<10){ // 조건식
			System.out.println("3*"+i+"="+(i*3)); // 초기식에서 선언/초기화된 i의 값에 따라 3단을 순차전으로 출력.
			i++; // 증감식
		}
		// While문은 for문과는 달리 추가적으로 증감식을 넣어주어야 하며, 사용자가 입력 값을 지정해 주는 경우에 주로 사용되는 반복문이다.
	}
	// Main Method End
}
//StatementEx2 Class End