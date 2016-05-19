package Algorithm;

// BubbleSort Class Start.
public class BubbleSort {
	
	// b_sort Method Start.
	static void b_sort(int[] target)
	{
		int tmp; // ���� ��, �� ��ȯ�� ���� �ӽ� ����.
		for(int i=0;i<target.length;i++) // 
		{
			for(int j=0;j<(target.length-i)-1; j++) // ���� �ѹ����� ���� ���� for��.
													// target.length-i-1�� ������ ���� ������ ������ ������ ������ �Ϸ�Ǳ� ������
			{
				if(target[j] > target[j+1])
				{
					tmp = target[j];
					target[j] = target[j+1];
					target[j+1] = tmp; 
				}
			}
		}
	}
	// b_sort Method End.
	
	// Main Method Start.
	public static void main(String[] args)
	{
		int[] input = { 5,4,3,1,7,8,9,2,6 };
		for(int i=0;i<input.length;i++)
			System.out.print(input[i] + " ");
		System.out.println();
		b_sort(input);
		for(int i=0;i<input.length;i++)
			System.out.print(input[i] + " ");
	}
	// Main Method End.
}
//BubbleSort Class End.