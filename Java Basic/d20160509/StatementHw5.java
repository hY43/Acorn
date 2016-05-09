package d20160509;

// StatementHw5 Class Start
public class StatementHw5 {
	// Main Method Start
	public static void main(String[] args)
	{
		int sum = 0; // 누적 값을 담기 위한 sum 선언
		for(int i=1;i<101;i++) // 1~100의 수들을 합하기 위한 반복문
			sum+=i; // 매 반복마다 1씩 증가하는 i 값을 더해주어 1+2+...+100 까지의 합을 누적.
		
		// sum = (1+100)*50; // 가우스의 해법
		System.out.println("1부터 100까지의 누적합은 "+ sum + "입니다."); // 누적된 sum 갑 출력.
	}
	// Main Method End
}
//StatementHw5 Class End