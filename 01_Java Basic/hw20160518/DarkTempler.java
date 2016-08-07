package hw20160518;

public class DarkTempler extends Protoss{
	/* Member Variable */

	/* Constructor */
	public DarkTempler()
	{
		hp = 40;
		mp = 0;
		shield = 40;
		aSpeed = 1.69f;
		mSpeed = 2.81f;
		def = 1;
		atk = 40;
		reqMoney = 125;
	}
	
	/* Member Method */
	public void hide(){
		hFlag = true;
		System.out.println("¾Èº¸ÀÌÁö·Õ");
	}
	public void summon(){
		System.out.println("ÇÕÃ¼!!");
		
	}
	public void uInfo()
	{
		System.out.println("=== À¯´Ö Á¤º¸ ===");
		System.out.println("Ã¼·Â: " + hp);
		System.out.println("¼û±è: " + hFlag);
	}
}
