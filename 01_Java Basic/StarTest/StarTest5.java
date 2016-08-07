package StarTest;

import java.util.Scanner;

public class StarTest5 {
	public static void main(String[] args)
	{
		System.out.println("별 수를 입력하세요: ");
		Scanner sc = new Scanner(System.in);
		int starCnt = sc.nextInt();
		int totalLine = starCnt*2+1;
		for(int i=0;i<totalLine;i++)
		{
			if(i==0 || i==totalLine-1)
			{
				for(int j=0;j<totalLine;j++)
					System.out.print("*");
			}
			else
			{
				for(int j=0;j<totalLine-1;j++)
				{
					System.out.print("*");
				}
			}
			System.out.println();
		}
	}
}
