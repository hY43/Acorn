package d20160513;

// int[]  m = { 2, 3  , 9 };
// int[]  n = { 9, 11, 3 };
// int[]  k = new int[3];
// k �迭��  m+n�� ����� ��� ����ϼ��� 

public class Hw2 {
	public static void main(String[] args)
	{
		int[] m = {2, 3, 9};
		int[] n = {9, 11, 3};
		int [] k = new int[3];
		for (int i = 0; i < k.length; i++) {
			k[i] = m[i]+n[i];
			System.out.println(k[i]);
		}
	}
}
