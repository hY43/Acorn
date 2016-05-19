package d20160517;

public class TestGetSet {
	// ------------------------- Member Variable
	private int data;
	private String str;
	private float value;

	// ------------------------- Constructor
	TestGetSet(){}
	TestGetSet(int data, String str, float value)
	{
		this.data = data;
		this.str = str;
		this.value = value;
	}
	
	// ------------------------- Member Method
	public void setData(int data) 
	{
		// data ���� Setter
		this.data = data;
	}

	public int getData() 
	{
		// data ���� getter
		return this.data;
	}

	public void setStr(String str) 
	{
		// str ���� setter
		this.str = str;
	}

	public String getStr() 
	{
		// str ���� getter
		return this.str;
	}

	public void setValue(float value) 
	{
		// value ���� setter
		this.value = value;
	}

	public float getValue() 
	{
		// value ���� getter
		return this.value;
	}
}
