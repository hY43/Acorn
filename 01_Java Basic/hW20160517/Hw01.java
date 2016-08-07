package hW20160517;
// 1. 두 행렬에 대한 덧셈을 구하시오.(배열을 사용하여)
// 3, 2, 3              1,  8,  7
// 4, 5, 6              6,  4,  4
// 1, 4, 9              3,  2,  3

public class Hw01 {
	public static void main(String[] args)
	{
		int[][] arr1 = {
				{ 3, 2, 3 }, 
				{ 4, 5, 6 },
				{ 1, 4, 9 }
		};
		int[][] arr2 = {
				{ 1, 8, 7 }, 
				{ 6, 4, 4 },
				{ 3, 2, 3 }
		};
		int[][] sum = new int[3][3];
		
		for(int i=0;i<arr1.length;i++)
		{
			for(int j=0;j<arr1[0].length;j++)
				sum[i][j] = arr1[i][j] + arr2[i][j];
		}
		
		for(int i=0;i<arr1.length;i++)
		{
			for(int j=0;j<arr1[0].length;j++)
				System.out.printf("%2d ",sum[i][j]);
			System.out.println();
		}
	}
}
