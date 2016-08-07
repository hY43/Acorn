package d20160519;

public class PoliceGunTest {
	public static void main(String[] args)
	{
		Gun g1 = new Gun();
		FlameThrower f1 = new FlameThrower();
		Police p1 = new Police(g1);
		Police p2 = new Police(f1);
		
		p1.fire();
		p1.reload();
		p2.fire();
		p2.reload();
	}
}
