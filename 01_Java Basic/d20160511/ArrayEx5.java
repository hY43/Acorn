package d20160511;
// ArrayEx5 Class Start.
public class ArrayEx5 {
	// Main Method Start.
	public static void main(String[] args)
	{
		// 2차원 배열
		int[][] b = new int[3][2];
		
 		int k = 0; // 10 씩 증가하는 값을 만들기 위한 int Type 변수 k 선언 및 초기화.
		for(int i=0;i<b.length;i++)
		{
			for(int j=0;j<b[i].length;j++)
			{
				k += 10; // k를 10씩 증가.
				b[i][j] = k; // 10씩 증가하는 k 값을 이차원 배열 각 요소에 대입.
				System.out.print(b[i][j] + " ");
			}
			System.out.println();
		}
		
		System.out.println("----------------------------------");
		
		int[][] m = { {4,5,2},
					  {6,7,8},
					  {4,3,9},
					  {1,2,9} }; // 규칙이 없는 값들을 이차원 배열에 대입.
		
		for(int i=0; i<m.length; i++) // 행을 의미하는 i에 대한 for문.
		{
			for(int j=0; j<m[i].length; j++) // 열을 의미하는 j에 대한 for문.
				System.out.print(m[i][j] + " ");
			System.out.println();
		}
		
		System.out.println("----------------------------------");
		
		int[][] t = {
						{6,9,2},
						{4,5,8}
					}; // 2행 3열짜리 이차원 배열을 선언 후, 규칙적이지 않은 값을들 각 요소에 대입.
		
		for(int i=0; i<t.length; i++) // 행을 의미하는 i에 대한 for문.
		{
			for(int j=0; j<t[i].length; j++) // 열을 의미하는 i에 대한 for문.
				System.out.print(t[i][j] + " ");
			System.out.println();
		}
	}
	// Main Method End.
}
// ArrayEx5 Class End.