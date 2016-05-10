package d20160510;
// Quiz, 1부터 100까지의 수중 2의 배수와 3의 배수가 아닌 값을 출력하시오.

// StatementHw16 Class Start.
public class StatementHw16 {
	// Main Method Start.
	public static void main(String[] args)
	{
		for(int i=1;i<=100;i++)
		{
			if(i%2 != 0 && i%3 != 0) 
				// 2의 배수도, 3의 배수도 아닌 수를 출력하는 것이므로 2와 3으로 나눈 나머지가 0이 아닌 것을 찾도록 분기 조건 생성.
				System.out.println(i);
		}
	}
	// Main Method End.
}
//StatementHw16 Class End.