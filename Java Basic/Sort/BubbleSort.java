package Sort;

// BubbleSort Class Start.
public class BubbleSort {
	
	// b_sort Method Start.
	static void b_sort(int[] target)
	{

		for(int i=0;i<target.length;i++) // ������ �� ȸ������ �����ϴ� ���� i�� ���� for ��.
		{
			for(int j=0;j<(target.length-i)-1; j++) // ���� �ѹ����� ���� ���� for��.
													// target.length-i-1�� ������ ���� ������ ������ ������ ������ �Ϸ�Ǳ� ������
			{
				swap(target, j); // �� �� ��, ��ġ ��ȯ�� ���� swap Method ȣ��.
			}
		}
	}
	// b_sort Method End.
	
	
	
	// swap Method Start.
	static void swap(int[] input, int index)
	{
		int tmp; // ���� ��, �� ��ȯ�� ���� �ӽ� ����.
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
		// int Type �迭 input�� �ʱ� �׸��� ����ϱ� ���� for��.
		for(int i=0;i<input.length;i++)
			System.out.print(input[i] + " ");
		System.out.println();
		
		// input �迭�� ����Ͽ� ���� ������ ������ Method�� b_sort ����.
		b_sort(input);
		
		// ���ĿϷ��� ���� input �迭 ���� ���.
		for(int i=0;i<input.length;i++)
			System.out.print(input[i] + " ");
	}
	// Main Method End.
}
//BubbleSort Class End.