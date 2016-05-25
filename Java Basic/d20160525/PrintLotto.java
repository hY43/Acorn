package d20160525;

import java.util.HashSet;
import java.util.Iterator;

public class PrintLotto {
	public static void main(String[] args) {
		// 1. 6ĭ¥�� �迭 ����.
		// 2. �����ϰ� 1���� 45 ������ ���ڸ� �̾Ƽ� �迭�� ��´�.		
		// 3. �ߺ� ����.
		// 4. ���� ��Ų��.
		// 5. ���.
		
		int rNum;
		int[] lArr = new int[6]; // lotto ��ȣ�� ������ �迭.
		int lCnt = 0;
		int aCnt = 0;
		HashSet<Integer> lotto = new HashSet<Integer>();
		
		// 1~45 ������ ������ ���� �޾Ƽ� HashSet�� �����Ͽ� �ߺ��� ������.
		for(int i=0;i<lArr.length;i++)
		{	
			lotto.add((int)(Math.random()*45+1)); // ������ �� �޾Ƽ� HashSet�� ����. 
			lCnt=lotto.size(); // �ߺ��� ���ŵ� ����� ���� ���ϱ� ���� HashSet�� size Method �̿�.
			aCnt++;
			if(lCnt < 6 && aCnt == lArr.length)
				i = i-lCnt-1;
		}
		
		// HashSet ���� ���� �迭�� �����ϱ� ���� Iterator Class ���.
		Iterator<Integer> iLotto = lotto.iterator();
		// �ߺ��� ���ŵ� hash set�� lArr �迭�� ����.
		for(int i=0;i<lArr.length;i++)
			lArr[i] = iLotto.next();
	
		// Selection Sort.
		int min;
		for(int i=0;i<lArr.length;i++)
		{
			min = i;
			for(int j=i+1;j<lArr.length;j++)
			{
				if(lArr[min] > lArr[j])
					min = j;
			}
			int temp = lArr[i];
			lArr[i] = lArr[min];
			lArr[min] = temp;
		}
		
		// �迭 ��� ���.
		for(int i=0;i<lArr.length;i++)
		{
			System.out.print(lArr[i] + " ");
		}		
	}
}
