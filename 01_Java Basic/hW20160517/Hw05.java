package hW20160517;
import java.util.Scanner;

public class Hw05 {
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int[] input = new int[10];
		for(int i=0;i<input.length;i++)
		{
			System.out.print((i+1) + "번째 수를 입력하세요: ");
			input[i] = sc.nextInt();
		}
		int max = 0;
		for(int i=0;i<input.length;i++)
		{
			if(input[max] < input[i])
				max = i;
		}
		
		System.out.println("가장 큰 수는 " + (max+1) + "번째에 있습니다.");	
	}
}
