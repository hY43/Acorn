package Sort;

// QuickSort Class Start.
public class QuickSort {
	
	static void swap(int[] arr, int index1, int index2)
	{
		int temp = arr[index1];
		arr[index1] = arr[index2];
		arr[index2] = temp;
	}
	
	static int partition(int[] arr, int left, int right)
	{
		int pivot = arr[left]; // 초기 값으로 pivot 을 배열 가장 왼쪽 값으로 넣어준다.
		int low = left+1;
		int high = right;
		
		while(low <= high) // 교차 점을 찾기 위해 low와 high의 위치가 바뀔때까지 진행
		{
			// low 의 이동: pivot보다 큰 값 탐색
			while(pivot >= arr[low] && low <= right)
				low++;
			// high 의 이동: pivot보다 작은 값 탐색
			while(pivot <= arr[high] && high >= (left+1))
				high--;
			
			// 위치 교환
			if(low <= high)
			{
				swap(arr, low, high);
			}
		}
		
		// while 문을 빠져나왔으므로 현재의 high 가 갖는 값과 pivot 값을 교환
		swap(arr, left, high);
		
		// 교환된 pivot 위치를 반환
		return high;		
	}
	
	// s_sort Method Start.
	static void q_sort(int[] target, int left, int right) 
	{
		// Quick Sort을 위한 Method
		
		// left 값과 right 위치가 바뀌기 전까지 진행한다.
		if(left <= right)
		{
			int pivot = partition(target, left, right); // pivot의 오른쪽과 왼쪽의 영역을 분리한다.
			q_sort(target, left, pivot-1); // pivot의 왼쪽 영역에 대한 정렬
			q_sort(target, pivot+1, right); // pivot의 오른쪽 영역에 대한 정렬
		}
	}
	// q_sort Method End.
	
	// Main Method Start.
	public static void main(String[] args)
	{
		int[] input = { 5,4,3,1,7,8,9,2,6 };
		// int Type 배열 input의 초기 항목을 출력하기 위한 for문.
		for(int i=0;i<input.length;i++)
			System.out.print(input[i] + " ");
		System.out.println();
		
		// input 배열을 사용하여 퀵 정렬을 구현한 Method인 q_sort 실행.
		q_sort(input, 0, input.length-1);
		
		// 정렬완료한 후의 input 배열 내용 출력.
		for(int i=0;i<input.length;i++)
			System.out.print(input[i] + " ");
	}
	// Main Method End.
}
//QuickSort Class End.