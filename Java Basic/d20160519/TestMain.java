package d20160519;
import java.util.Arrays;

public class TestMain {
	public static void main(String[] args)
	{
		int[] m = { 1,2,3,4,5,6,7,8,9,10,
				11,12,13,14,15,16,17,18,19,20,
				21,22,23,24,25,26,27,28,29,30,
				31,32,33,34,35,36,37,38,39,40,
				41,42,43,44,45};
		int temp = 0;
		int[] n = new int[6];
		// 0.0 < Math.random() < 1.0
		// 0부터 44까지의 정수를 랜덤하게 2개 뽑기.
		for(int i=0;i<300;i++){
			int a = (int) (Math.random() * 45);
			int b = (int) (Math.random() * 45);

			temp = m[a];
			m[a] = m[b];
			m[b] = temp;
		}
		for(int i=0;i<6;i++)
		{
			System.out.print(m[i] + "\t");
			n[i] = m[i];
		}
		System.out.println();
		Arrays.sort(n);
		for(int i=0;i<6;i++)
			System.out.print(n[i] + "\t");
			
	}
}
