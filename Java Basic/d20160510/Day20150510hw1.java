package d20160510;
// ����1. ������ ������ ����ϱ� (����for�� ���) 
// 2* 1 = 2   2 * 2 = 4    2 * 3 = 6        2 * 9  = 18
// 3 * 1 = 3   3 * 2 = 6   3 * 3 = 9 ...   3 * 9 = 27 

// Day20150510hw1 Class Start.
public class Day20150510hw1 {
	// Main Method Start.
	public static void main(String[] args)
	{
		for(int i=2;i<=9;i++) // �� ���� ���ڸ� �ǹ��ϴ� i�� ���� �ݺ���.
		{
			for(int j=1;j<=9;j++) // �� �ܿ����� 1~9������ ���� ���� j�� ���� �ݺ���.
			{
				System.out.print(i + " * " + j + " = " + (i*j) +" ");
				// i���� ���� j�� ��ȭ�� ���� ���Ͽ� ���.
			}
			System.out.println();
		}
	}
	// Main Method End.
}
//Day20150510hw1 Class End.