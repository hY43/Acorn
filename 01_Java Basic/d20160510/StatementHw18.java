package d20160510;
// Quiz, �ֻ��� 2���� ���� ���� 4�� �Ǵ� ��� ����� ���� ����ϼ���.

// StatementHw18 Class Start.
public class StatementHw18 {
	// Main Method Start.
	public static void main(String[] args)
	{
		for(int i=1;i<7;i++) // �ֻ��� �Ѱ��� ���� �ǹ��ϴ� i�� ���� �ݺ���.
		{
			for(int j=1;j<7;j++) // �ֻ��� �Ѱ��� ���� �ǹ��ϴ� j�� ���� �ݺ���.
			{
				if((i+j)==4) // �� �ֻ��� ���� �ǹ��ϴ� i�� j�� ���� 0�� �Ǵ� i,j�� ã�� �б� ����.
					System.out.println(i + ", "+j);
			}
		}
	}
	// Main Method End.
}
//StatementHw18 Class End.