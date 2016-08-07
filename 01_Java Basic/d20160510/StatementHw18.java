package d20160510;
// Quiz, 주사위 2개를 던져 합이 4가 되는 모든 경우의 수를 출력하세요.

// StatementHw18 Class Start.
public class StatementHw18 {
	// Main Method Start.
	public static void main(String[] args)
	{
		for(int i=1;i<7;i++) // 주사위 한개의 눈을 의미하는 i에 대한 반복문.
		{
			for(int j=1;j<7;j++) // 주사위 한개의 눈을 의미하는 j에 대한 반복문.
			{
				if((i+j)==4) // 각 주사위 눈을 의미하는 i와 j의 합이 0이 되는 i,j를 찾는 분기 조건.
					System.out.println(i + ", "+j);
			}
		}
	}
	// Main Method End.
}
//StatementHw18 Class End.