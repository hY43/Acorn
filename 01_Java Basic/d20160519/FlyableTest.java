package d20160519;

public class FlyableTest {
	public static void main(String[] args)
	{
		�� h1 = new ��();
		�� h2 = new ��();
		�� h3 = new ��();
		�� h4 = new ��();
		�� h5 = new ��();
		���� m1 = new ����();
		���� m2 = new ����();
		���� m3 = new ����();
		���� m4 = new ����();
		
		Flyable[] f = {m1, m2, m3, m4, h1, h2, h3, h4, h5 };
		// Flyable Interface�� ���� instanceȭ�� �� �� ������ 
		// ������ ���� Flyable Interface�� �ڽ� Class�̹Ƿ� ���� �����μ� ���� ���� ���� �� �ִ�. 
		for(Flyable fy: f)
			fy.����();		
	}
}
