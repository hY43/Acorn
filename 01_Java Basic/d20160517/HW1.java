package d20160517;

public class HW1 {
	public static void main(String[] args) {
		Medic me1 = new Medic();
		���� m1 = new ����();
		������ũ s1 = new ������ũ();
		������ũ s2 = new ������ũ();
		
		// HW1, ������ �޵��� ������ �� �ֵ��� �ڵ� �ۼ�.
		System.out.println("���� �� me1�� ����");
		me1.��������();
		m1.����(me1);
		System.out.println("���� �� me1�� ����");
		me1.��������();

		// HW2, ���� ��ũ ��ü�� �����ϰ� �� ��ũ�� ������ ���� ��ũ�� ������ �� �ֵ��� Ŭ������ �ۼ��ϼ���.
		s1.����(m1);
		
		System.out.println("���� �� s1�� ����");
		s2.��������();
		s1.����(s2);
		System.out.println("���� �� s1�� ����");
		s2.��������();
	}
}
