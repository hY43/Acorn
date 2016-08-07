package d20160510;

// Quiz, 아래의 내용을 출력하시오.
// *****
// ****
// ***
// **
// *

// StatementHw15 Class Start.
public class StatementHw15 {
	// Main Method Start.
	public static void main(String[] args)
	{
		for(int i=5;i>=1;i--)
		{
			for(int j=1;j<=i;j++)
				System.out.print("*"); // i 한개당 i가 j보다 작은 수만큼 *을 출력. 
			System.out.println();
		}
	}
	// Main Method End.
}
// StatementHw15 Class End.