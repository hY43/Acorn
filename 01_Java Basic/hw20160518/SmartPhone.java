package hw20160518;

public class SmartPhone extends Phone{
	/* Member Variable */
	boolean hold; // ������ true, ������ false
	boolean sButton; // ������ true, ������ false
	
	/* Constructor */
	SmartPhone()
	{
		super.button = 1;
		hold = true;
		sButton = true;
	}
	
	/* Member Method */
	void drag()
	{
		System.out.println("draaaaaaaaag");
	}
	void katalk()
	{
		System.out.println("ī��!");
	}
}
