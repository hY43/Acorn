package Sort;

// SelectionSort Class Start.
public class SelectionSort {
	
	// s_sort Method Start.
	static void s_sort(int[] target) 
	{
		// Selection Sort을 위한 Method
		int minIdx; // 최소 값의 index를 담을 변수.
		int temp; // 값 교환을 위한 임시 변수.
		
		for(int i=0;i<target.length-1;i++) // 정렬의 총 회전수를 결정하는 변수 i에 대한 for 문.
		{
			minIdx = i; // minIdx에 해당 회전 시의 검색 대상중 배열의 가장 앞쪽에 있는 index 저장.
			for(int j=i+1;j<target.length;j++)
			{
				if(target[minIdx] > target[j]) // 현재 배열 대상중 가장 앞쪽 값과 각 항목을 비교하여 최소 값을 갖는 index를 minIdx에 저장.
					minIdx = j;				
			}
			
			// 값 교환.
			temp = target[minIdx];
			target[minIdx] = target[i];
			target[i] = temp;
		}
	}
	// s_sort Method End.
	
	// Main Method Start.
	public static void main(String[] args)
	{
		int[] input = { 5,4,3,1,7,8,9,2,6 };
		// int Type 배열 input의 초기 항목을 출력하기 위한 for문.
		for(int i=0;i<input.length;i++)
			System.out.print(input[i] + " ");
		System.out.println();
		
		// input 배열을 사용하여 버블 정렬을 구현한 Method인 b_sort 실행.
		s_sort(input);
		
		// 정렬완료한 후의 input 배열 내용 출력.
		for(int i=0;i<input.length;i++)
			System.out.print(input[i] + " ");
	}
	// Main Method End.
}
//SelectionSort Class End.