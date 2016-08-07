package hw20160518;

public class Zealot extends Protoss {
	/* Member Variable */
	
	/* Constructor */
	public Zealot()
	{
		hp = 100;
		mp = 0;
		shield = 50;
		aSpeed = 1.2f;
		mSpeed = 2.25f;
		def = 1;
		atk = 8;
		reqMoney = 100;
	}
	/* Member Method */
	public void rush(Protoss p){
		System.out.println("rush!!!");
		hp -= 60;
	}
}
