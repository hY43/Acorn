package d20160509;

// Quiz, 홀수단만 출력하기.

// StatementHw8 Class Start
public class StatementHw8 {
	// Main Method Start
	public static void main(String[] args)
	{
		for(int i=3;i<=9;i+=2) // 홀수단 출력을 위해 i가 3부터 시작하여 2씩 증가하는 반복문
		{
			for(int j=1;j<=9;j++) // 실제 구구단 출력을 위한 반복문으로 j는 1~9로 변화한다.
				System.out.println(i + " * " + j + " = " + (i*j)); // 구구단 출력.
		}
	}
	// Main Method End
}
//StatementHw8 Class End