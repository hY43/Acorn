package d20160513;

// int[]  m = { 2, 3  , 9 };
// int[]  n = { 9, 11, 3 };
// int[]  k = new int[3];
// k 배열에  m+n의 결과를 담고 출력하세요 

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
