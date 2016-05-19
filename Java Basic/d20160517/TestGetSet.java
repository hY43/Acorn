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
		// data 변수 Setter
		this.data = data;
	}

	public int getData() 
	{
		// data 변수 getter
		return this.data;
	}

	public void setStr(String str) 
	{
		// str 변수 setter
		this.str = str;
	}

	public String getStr() 
	{
		// str 변수 getter
		return this.str;
	}

	public void setValue(float value) 
	{
		// value 변수 setter
		this.value = value;
	}

	public float getValue() 
	{
		// value 변수 getter
		return this.value;
	}
}
