package d20160525;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;

public class PrintLotto_NoHashSet {
	public static void main(String[] args) {
		// 1. 6ĭ¥�� �迭 ����.
		// 2. �����ϰ� 1���� 45 ������ ���ڸ� �̾Ƽ� �迭�� ��´�.		
		// 3. �ߺ� ����.
		// 4. ���� ��Ų��.
		// 5. ���.
		int[] m = new int[6];
		
		for(int i=0;i<m.length;i++)
		{
			m[i] = (int)(Math.random()*45+1);
			
			for(int j=0;j<i;j++)
			{
				if(m[i] == m[j])
				{
					i--;
					break;
				}
			}
		}
		
		Arrays.sort(m);
		
		for(int i=0;i<m.length;i++)
			System.out.print(m[i] + " ");
	}
}
