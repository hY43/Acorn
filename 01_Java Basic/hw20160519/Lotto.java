package hw20160519;

public class Lotto {
	public static void main(String[] args)
	{
		int[] loNum = {
				1,2,3,4,5,6,7,8,9,10,
				11,12,13,14,15,16,17,18,19,20,
				21,22,23,24,25,26,27,28,29,30,
				31,32,33,34,35,36,37,38,39,40,
				41,42,43,44,45				
		};
		int[] getLotto = new int[6];
		for(int i=0;i<3000;i++)
		{
			int num1 = (int)(Math.random()*45);
			int num2 = (int)(Math.random()*45);
			int temp = loNum[num1];
			loNum[num1] = loNum[num2];
			loNum[num2] = temp;
		}
		
		for(int i=0;i<getLotto.length;i++)
			getLotto[i] = loNum[i];
		
		
		for(int i=0;i<getLotto.length;i++)
		{
			for(int j=i;j<getLotto.length;j++)
			{
				int min = j;
				if(getLotto[min] > getLotto[i])
					min = i;
				int temp = getLotto[min];
				getLotto[min] = getLotto[i];
				getLotto[i] = temp;
			}
		}

		for(int i=0;i<getLotto.length;i++)
			System.out.print(getLotto[i] + " ");
	}
}
