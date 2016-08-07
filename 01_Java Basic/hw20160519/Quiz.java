package hw20160519;

public class Quiz {
	static String mergeWord(String ... args)
	{
		String str = "";
		for(String x : args)
			str+=x;
		return str;
	}
	public static void main(String[] args) {
		int[] m = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
		int max;
		int temp = 0;
		for(int i=0;i<m.length;i++)
		{
			max=i;
			for(int j=i;j<m.length;j++)
			{
				if(m[max] < m[j])
					max = j;
			}
			
			temp = m[max];
			m[max] = m[i];
			m[i] = temp;
		}
		
		for(int i=0;i<m.length;i++)
			System.out.print(m[i] + " ");

	}
}
