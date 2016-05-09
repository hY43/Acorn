package d20160509;
// Quiz, 아래와 같이 출력하시오.
// 1
// 12
// 123
// 1234
// 12345
// StatementHw1 Class Start
public class StatementHw1 {
	// Main Method Start
	public static void main(String[] args)
	{
		for(int i=1;i<6;i++) // 5 줄을 출력하기 위한 반복문.
		{
			for(int j=1;j<=i;j++) // 실제 내용 출력을 위한 반복문.
			{
				System.out.print(j); // j가 i보다 작은 경우에만 출력.
									 // i는 바깥 쪽 반복문에서 1씩 증가 시키기 때문에 첫 번째 반복때는 1까지, 두 번째 반복때는 2까지 와 같이 출력된다.
			}
			System.out.println(); // 개행을 위한 출력문.
		}
	}
	// Main Method End
}
//StatementHw1 Class End