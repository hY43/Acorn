package Sort;

// BubbleSort Class Start.
public class BubbleSort {
	
	// b_sort Method Start.
	static void b_sort(int[] target)
	{

		for(int i=0;i<target.length;i++) // 정렬의 총 회전수를 결정하는 변수 i에 대한 for 문.
		{
			for(int j=0;j<(target.length-i)-1; j++) // 정렬 한바퀴를 돌기 위한 for문.
													// target.length-i-1인 이유는 버블 정렬이 오른쪽 끝부터 정렬이 완료되기 때문에
			{
				swap(target, j); // 값 비교 후, 위치 교환을 위한 swap Method 호출.
			}
		}
	}
	// b_sort Method End.
	
	
	
	// swap Method Start.
	static void swap(int[] input, int index)
	{
		int tmp; // 정렬 시, 값 교환을 위한 임시 변수.
		if(input[index] > input[index+1])
		{
			tmp = input[index];
			input[index] = input[index+1];
			input[index+1] = tmp; 
		}
	}
	// swap Method End.
	
	// Main Method Start.
	public static void main(String[] args)
	{
		int[] input = { 5,4,3,1,7,8,9,2,6 };
		// int Type 배열 input의 초기 항목을 출력하기 위한 for문.
		for(int i=0;i<input.length;i++)
			System.out.print(input[i] + " ");
		System.out.println();
		
		// input 배열을 사용하여 버블 정렬을 구현한 Method인 b_sort 실행.
		b_sort(input);
		
		// 정렬완료한 후의 input 배열 내용 출력.
		for(int i=0;i<input.length;i++)
			System.out.print(input[i] + " ");
	}
	// Main Method End.
}
//BubbleSort Class End.