package d20160511;
// ArrayEx5 Class Start.
public class ArrayEx5 {
	// Main Method Start.
	public static void main(String[] args)
	{
		// 2���� �迭
		int[][] b = new int[3][2];
		
 		int k = 0; // 10 �� �����ϴ� ���� ����� ���� int Type ���� k ���� �� �ʱ�ȭ.
		for(int i=0;i<b.length;i++)
		{
			for(int j=0;j<b[i].length;j++)
			{
				k += 10; // k�� 10�� ����.
				b[i][j] = k; // 10�� �����ϴ� k ���� ������ �迭 �� ��ҿ� ����.
				System.out.print(b[i][j] + " ");
			}
			System.out.println();
		}
		
		System.out.println("----------------------------------");
		
		int[][] m = { {4,5,2},
					  {6,7,8},
					  {4,3,9},
					  {1,2,9} }; // ��Ģ�� ���� ������ ������ �迭�� ����.
		
		for(int i=0; i<m.length; i++) // ���� �ǹ��ϴ� i�� ���� for��.
		{
			for(int j=0; j<m[i].length; j++) // ���� �ǹ��ϴ� j�� ���� for��.
				System.out.print(m[i][j] + " ");
			System.out.println();
		}
		
		System.out.println("----------------------------------");
		
		int[][] t = {
						{6,9,2},
						{4,5,8}
					}; // 2�� 3��¥�� ������ �迭�� ���� ��, ��Ģ������ ���� ������ �� ��ҿ� ����.
		
		for(int i=0; i<t.length; i++) // ���� �ǹ��ϴ� i�� ���� for��.
		{
			for(int j=0; j<t[i].length; j++) // ���� �ǹ��ϴ� i�� ���� for��.
				System.out.print(t[i][j] + " ");
			System.out.println();
		}
	}
	// Main Method End.
}
// ArrayEx5 Class End.