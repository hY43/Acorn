package StarTest;

import java.util.Scanner;

public class StarTest4 {
	public static void main(String[] args)
	{
		System.out.println("별 수를 입력하세요: ");
		Scanner sc = new Scanner(System.in);
		int starCnt = sc.nextInt();

		for (int j = 0; j < (starCnt/2); j++) 
		{
			for(int n=starCnt/2;n>=j;n--)
				System.out.print("*");
			System.out.println();
		}
		int num = 0;
		for (int k=(starCnt/2); k < starCnt; k++) 
		{
			for(int m=starCnt-num++;m<=starCnt;m++)
				System.out.print("*");
			System.out.println();
		}
	}
}
