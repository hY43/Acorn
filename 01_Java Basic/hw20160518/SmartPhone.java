package hw20160518;

public class SmartPhone extends Phone{
	/* Member Variable */
	boolean hold; // 있으면 true, 없으면 false
	boolean sButton; // 있으면 true, 없으면 false
	
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
		System.out.println("카톡!");
	}
}
