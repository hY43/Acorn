package d20160509;
// Quiz, 3단 옆으로 출력하기
// ex) 3*1=3 3*2=6 3*3=9....

// StatementHw9 Class Start
public class StatementHw9 {
	// Main Method Start
	public static void main(String[] args)
	{
		for(int i=1;i<=9;i++) // 구구단 출력을 위해 i가 1~9로 변화하는 반복문.
		{
			System.out.print("3*" + i + "=" +(3*i) + " "); // 옆으로 출력하기 위해 개행문자가 들어있지 않은 print 사용.
		}
	}
	// Main Method End
}
// StatementHw9 Class End
