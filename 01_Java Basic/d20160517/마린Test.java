
package d20160517;

public class ����Test {
	public static void main(String[] args)
	{
		���� m1 = new ����();
		���� m2 = new ����();
		Medic me1 = new Medic();
		
		/*
		System.out.println("m2�� hp: " + m2.hp);
		m2 = m1; // m1�� ���� ���� ���� ���� m2�� ����. 
		m1.hp = 50; // m1�� hp ����.
		System.out.println("m2�� hp: " + m2.hp);
		*/
		System.out.println("���� �� m2�� ����");
		m2.��������();
		System.out.println("m2: " + m2);
		m1.����(m2); // Call by Reference ����� Method ȣ��.
		System.out.println("���� �� m2�� ����");
		m2.��������();
	}
}
