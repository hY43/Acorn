package d20160509;
// *
// **
// ***
// ****
// *****

// StatementHw2 Class Start
public class StatementHw2 {
	// Main Method Start
	public static void main(String[] args)
	{
		for(int i=0;i<5;i++) // 문제에 제공된 Line 수만큼을 출력하기 위한 반복문(5 Line이기 때문에 0~4 까지 i가 변화.
		{
			for(int j=0;j<=i;j++) // 실제 '*' 문자 출력을 위한 반복문으로, j가 i보다 작을 때까지만 *을 출력하므로, 1회전때 1개, 2회전때 2개 출력된다.
			{
				System.out.print("*");
			}
			System.out.println(); // 개행을 위한 출력문.
		}
	}
	// Main Method End
}
// StatementHw2 Class End