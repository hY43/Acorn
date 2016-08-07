package d20160518;

public class TerranTest {
	public static void main(String[] args)
	{
		마린 m1 = new 마린();
		마린 m2 = new 마린();
		SiegeTank st = new SiegeTank();
		Medic me1 = new Medic();
		
		m1.공격(m2);
		m1.공격(st);
		me1.힐(m2);
		
	}
}
