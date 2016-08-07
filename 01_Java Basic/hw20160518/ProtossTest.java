package hw20160518;

public class ProtossTest {
	public static void main(String[] args)
	{
		DarkTempler d = new DarkTempler();
		Zealot z = new Zealot();
		Dragon dr = new Dragon();
		
		d.hide();
		z.attack(d);
		d.uInfo();
		z.uInfo();
		dr.uInfo();
	}
}
