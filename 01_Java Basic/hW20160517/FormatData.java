package hW20160517;

public class FormatData {
	public void print(int[] arr)
	{
		System.out.print("[ ");
		for(int i=0;i<arr.length;i++)
			System.out.print(arr[i] + " ");
		System.out.println("]");
	}
	public void print(int num)
	{
		System.out.println(num);
	}
	public void print(float num)
	{
		System.out.println(num);
	}
}
