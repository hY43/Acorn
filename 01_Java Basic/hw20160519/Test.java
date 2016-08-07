package hw20160519;

public class Test {
	public static void main(String[] args)
	{
		int[][] arr = new int[5][5];
		int num = 1;
		for(int i=4;i>=0;i--)
		{
			for(int j=4;j>=0;j--)
			{
				arr[i][j] = num++;
			}
		}
		
		for(int i=0;i<arr.length;i++)
		{
			for(int j=0;j<arr.length;j++)
				System.out.printf("%2d ", arr[i][j]);
			System.out.println();
		}
	}
}
