package d20160525;

public class IntArray {
	int[] arr;
	
	public void setArray(int[] arr)
	{
		this.arr = arr;
	}
	public void print()
	{
		for(int x : arr)
			System.out.println(x);
	}
}
