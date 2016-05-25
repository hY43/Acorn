package d20160525;

public class FloatArray {
	float[] fArr;
	
	public void setArray(float[] fArr)
	{
		this.fArr = fArr;
	}
	
	public void print()
	{
		for(float x : fArr)
			System.out.println(x);
	}
}
