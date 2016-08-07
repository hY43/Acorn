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
		int pivot = arr[left]; // �ʱ� ������ pivot �� �迭 ���� ���� ������ �־��ش�.
		int low = left+1;
		int high = right;
		
		while(low <= high) // ���� ���� ã�� ���� low�� high�� ��ġ�� �ٲ𶧱��� ����
		{
			// low �� �̵�: pivot���� ū �� Ž��
			while(pivot >= arr[low] && low <= right)
				low++;
			// high �� �̵�: pivot���� ���� �� Ž��
			while(pivot <= arr[high] && high >= (left+1))
				high--;
			
			// ��ġ ��ȯ
			if(low <= high)
			{
				swap(arr, low, high);
			}
		}
		
		// while ���� �����������Ƿ� ������ high �� ���� ���� pivot ���� ��ȯ
		swap(arr, left, high);
		
		// ��ȯ�� pivot ��ġ�� ��ȯ
		return high;		
	}
	
	// s_sort Method Start.
	static void q_sort(int[] target, int left, int right) 
	{
		// Quick Sort�� ���� Method
		
		// left ���� right ��ġ�� �ٲ�� ������ �����Ѵ�.
		if(left <= right)
		{
			int pivot = partition(target, left, right); // pivot�� �����ʰ� ������ ������ �и��Ѵ�.
			q_sort(target, left, pivot-1); // pivot�� ���� ������ ���� ����
			q_sort(target, pivot+1, right); // pivot�� ������ ������ ���� ����
		}
	}
	// q_sort Method End.
	
	// Main Method Start.
	public static void main(String[] args)
	{
		int[] input = { 5,4,3,1,7,8,9,2,6 };
		// int Type �迭 input�� �ʱ� �׸��� ����ϱ� ���� for��.
		for(int i=0;i<input.length;i++)
			System.out.print(input[i] + " ");
		System.out.println();
		
		// input �迭�� ����Ͽ� �� ������ ������ Method�� q_sort ����.
		q_sort(input, 0, input.length-1);
		
		// ���ĿϷ��� ���� input �迭 ���� ���.
		for(int i=0;i<input.length;i++)
			System.out.print(input[i] + " ");
	}
	// Main Method End.
}
//QuickSort Class End.