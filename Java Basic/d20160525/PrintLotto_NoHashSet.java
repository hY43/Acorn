package d20160525;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;

public class PrintLotto_NoHashSet {
	public static void main(String[] args) {
		// 1. 6칸짜리 배열 선언.
		// 2. 랜덤하게 1부터 45 사이의 숫자를 뽑아서 배열에 담는다.		
		// 3. 중복 제거.
		// 4. 정렬 시킨다.
		// 5. 출력.
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
