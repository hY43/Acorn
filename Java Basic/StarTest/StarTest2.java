package StarTest;
import java.util.Scanner;

public class StarTest2 {
	public static void main(String[] args)
	{
		System.out.println("몇 줄 출력? : ");
		Scanner sc = new Scanner(System.in);
		int starCnt = sc.nextInt();
		
		for(int i=0;i<starCnt;i++)
		{
			for(int j = 0; (i-j) > 0; j++)
				System.out.print(" ");
			for(int k = starCnt-i; k > i;k--)
				System.out.print("*");
			System.out.println();
		}
	}
}
