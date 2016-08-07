package d20160525;

import java.util.HashSet;
import java.util.Iterator;

public class PrintLotto {
	public static void main(String[] args) {
		// 1. 6칸짜리 배열 선언.
		// 2. 랜덤하게 1부터 45 사이의 숫자를 뽑아서 배열에 담는다.		
		// 3. 중복 제거.
		// 4. 정렬 시킨다.
		// 5. 출력.
		
		int rNum;
		int[] lArr = new int[6]; // lotto 번호를 대입할 배열.
		int lCnt = 0;
		int aCnt = 0;
		HashSet<Integer> lotto = new HashSet<Integer>();
		
		// 1~45 사이의 무작위 값을 받아서 HashSet에 대입하여 중복을 제거함.
		for(int i=0;i<lArr.length;i++)
		{	
			lotto.add((int)(Math.random()*45+1)); // 무작위 값 받아서 HashSet에 대입. 
			lCnt=lotto.size(); // 중복이 제거된 요소의 수를 구하기 위해 HashSet의 size Method 이용.
			aCnt++;
			if(lCnt < 6 && aCnt == lArr.length)
				i = i-lCnt-1;
		}
		
		// HashSet 내의 값을 배열에 대입하기 위해 Iterator Class 사용.
		Iterator<Integer> iLotto = lotto.iterator();
		// 중복이 제거된 hash set을 lArr 배열에 대입.
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
		
		// 배열 요소 출력.
		for(int i=0;i<lArr.length;i++)
		{
			System.out.print(lArr[i] + " ");
		}		
	}
}
