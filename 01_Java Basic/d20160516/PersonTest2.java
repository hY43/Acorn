package d20160516;

// PersonTest2 Class Start.
public class PersonTest2 {
	// Person Class�� Test�ϱ� ���� Class.
	// Main Method Start.
	public static void main(String[] args)
	{
		Person p = new Person(); // �⺻ �����ڸ� ����Ͽ� Person ��ü p ����.
		System.out.println(p.�̸�); // �⺻ �����ڷ� �ʱ�ȭ�� �̸��� ���.
		// �����ڴ� ó�� ��ü�� ������ �� �� �ѹ� ȣ��ȴ�.
		// �����ڸ� ���� �ʱ�ȭ �Ǵ� �������� �ٸ� �κи� ���� �ʱ�ȭ.
		p.�̸� = "������";
		p.���� = 19;
		p.Ű = 180.0f;
		p.������ = 41.0f;

		System.out.println("============================");
		Person p2 = new Person(900, "���");
		System.out.println(p2.����);
		System.out.println(p2.�̸�);
		System.out.println(p2.����);
		
	}
	// Main Method End.
}
// PersonTest2 Class End.