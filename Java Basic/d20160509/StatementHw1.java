package d20160509;
// Quiz, �Ʒ��� ���� ����Ͻÿ�.
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
		for(int i=1;i<6;i++) // 5 ���� ����ϱ� ���� �ݺ���.
		{
			for(int j=1;j<=i;j++) // ���� ���� ����� ���� �ݺ���.
			{
				System.out.print(j); // j�� i���� ���� ��쿡�� ���.
									 // i�� �ٱ� �� �ݺ������� 1�� ���� ��Ű�� ������ ù ��° �ݺ����� 1����, �� ��° �ݺ����� 2���� �� ���� ��µȴ�.
			}
			System.out.println(); // ������ ���� ��¹�.
		}
	}
	// Main Method End
}
//StatementHw1 Class End