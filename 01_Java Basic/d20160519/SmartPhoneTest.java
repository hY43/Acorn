package d20160519;

public class SmartPhoneTest {
	// public: ����, ������ ���� ������
	// static: instance ���� ���̵� ���� ������
	// void: Return ���� ����
	// main: �Լ� ��
	// String[] args: �Ű� ������ args��� String �迭�� ���´�.
	public static void main(String[] args)
	{
		SmartPhone.������ = "LG";
		SmartPhone sp1 = new SmartPhone("Android", "010-1111-1111", "SKT", "Samsung", "LTE", 11111111, 11141111);
		SmartPhone sp2 = new SmartPhone("Android", "010-2222-2222", "KTF", "Samsung", "LTE", 22222222, 22242222);
		SmartPhone sp3 = new SmartPhone("Android", "010-3333-3333", "LG", "LG", "LTE", 33333333, 33343333);
		
		System.out.println(sp1.������);
		System.out.println(sp2.������);
		System.out.println("-------------------");
		System.out.println("�μ��պ�");
		
		sp1.������ = "�ҹ�";
		
		System.out.println(sp1.������);
		System.out.println(sp2.������);
		
		System.out.println(Math.random()); // random Method ���� ���� ��ü�� �������� �ʰ� Class ������ ȣ���Ͽ��� ������ Static Method �̴�.
	}
}
