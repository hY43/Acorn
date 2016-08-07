package Sort;

// SelectionSort Class Start.
public class SelectionSort {
	
	// s_sort Method Start.
	static void s_sort(int[] target) 
	{
		// Selection Sort�� ���� Method
		int minIdx; // �ּ� ���� index�� ���� ����.
		int temp; // �� ��ȯ�� ���� �ӽ� ����.
		
		for(int i=0;i<target.length-1;i++) // ������ �� ȸ������ �����ϴ� ���� i�� ���� for ��.
		{
			minIdx = i; // minIdx�� �ش� ȸ�� ���� �˻� ����� �迭�� ���� ���ʿ� �ִ� index ����.
			for(int j=i+1;j<target.length;j++)
			{
				if(target[minIdx] > target[j]) // ���� �迭 ����� ���� ���� ���� �� �׸��� ���Ͽ� �ּ� ���� ���� index�� minIdx�� ����.
					minIdx = j;				
			}
			
			// �� ��ȯ.
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
		// int Type �迭 input�� �ʱ� �׸��� ����ϱ� ���� for��.
		for(int i=0;i<input.length;i++)
			System.out.print(input[i] + " ");
		System.out.println();
		
		// input �迭�� ����Ͽ� ���� ������ ������ Method�� b_sort ����.
		s_sort(input);
		
		// ���ĿϷ��� ���� input �迭 ���� ���.
		for(int i=0;i<input.length;i++)
			System.out.print(input[i] + " ");
	}
	// Main Method End.
}
//SelectionSort Class End.