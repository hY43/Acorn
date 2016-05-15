package d20160513;

// MethodEx7 Class Start.
public class MethodEx7 {
	// max Method Start.
	static int max(int[] m)
	{
		int max = m[0];
		for(int i=1;i<m.length;i++)
		{
			if(max < m[i])
				max = m[i];
		}
		return max;
	}
	// max Method End.
	
	// Main Method Start.
	public static void main(String[] args)
	{
		int[] m = {200,900,500,140,299,2000};
		System.out.println("가장 큰 값: " + max(m));
	}
	// Main Method End.
}
// MethodEx7 Class End.
