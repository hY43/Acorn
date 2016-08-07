package d20160519;

public class FlameThrower implements Weapon {
	int 연료;
	
	FlameThrower()
	{
		연료 = 100;
	}
	
	@Override
	public void use() {
		if(연료 > 10)
		{
			System.out.println("불불불불불불");
			연료 -= 10;
		}
		else
			System.out.println("치익");
	}

	@Override
	public void reuse() {
		System.out.println("연료 리필중..");
		this.연료 = 100;
	}

	@Override
	public void drop() {
		
	}
	
}
