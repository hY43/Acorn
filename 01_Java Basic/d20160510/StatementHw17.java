package d20160510;
// Quiz, 1부터 100까지 수중 2의 배수와 3의 배수가 아닌 값을 모아서 누적한 값을 출력.

// StatementHw17 Class Start.
public class StatementHw17 {
	// Main Method Start.
	public static void main(String[] args)
	{
		int sum = 0; // 값 누적을 위한 int Type 변수 sum을 선언한 후, 0으로 초기화.
		
		for(int i=1;i<=100;i++)
		{
			if(i%2 != 0 && i%3 != 0) // 2의 배수도 3의 배수도 아닌 값을 찾기 위한 분기문.
				sum+=i; // 분기 조건을 만족하면 해당 i 값을 sum에 누적한다.
		}
		
		System.out.println("2의 배수도 3의 배수도 아닌 수들의 합은 "+sum+"입니다.");
	}
	// Main Method End.
}
//StatementHw17 Class End.