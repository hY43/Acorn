package StarTest;

import java.util.Scanner;

public class StarTest3 {
	public static void main(String[] args) {
		System.out.println("�� ���� �Է��ϼ���: ");
		Scanner sc = new Scanner(System.in);
		int starCnt = sc.nextInt();

		for (int j = 0; j < (starCnt/2); j++) 
		{
			for(int m=starCnt/2;(m-j)<starCnt/2;m++)
				System.out.print(" ");
			for(int n=starCnt/2;n>j;n--)
				System.out.print("*");
			System.out.println();
		}
		int num = 0;
		for (int k=(starCnt/2); k < starCnt; k++) 
		{
			for(int n=num;n<(starCnt/2-1);n++)
				System.out.print(" ");
			for(int m=starCnt-num++;m<=starCnt;m++)
				System.out.print("*");
			System.out.println();
		}
	}
}
