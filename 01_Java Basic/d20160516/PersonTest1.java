package d20160516;

// PersonTest Class Start.
public class PersonTest1 {
	// Person Class�� ���� Test�� ���� Class.
	// Main Method Start.
	public static void main(String[] args)
	{
		// Person ��ü ����.
		// [Ŭ������] [�������� ��] = new ������();
		// ������: ��ü�� �ʱ�ȭ�� �������� ��� ������ �ʱ� ���� �������ִ� Ư���� �ɷ��� �ִ� �޼���.
		// Ŭ���� ��� ������ �̸��� ���� �ִ� Method
		// ��ü ���� �� 1ȸ�� ����Ǵ� Method
		
		Person p1 = new Person();
		Person p2 = new Person();
		Person p3 = new Person();
		// Person ��ü �ʱ�ȭ.
		p1.���� = 19;
		p1.���� = "��";
		p1.�̸� = "������";
		p1.������ = "B";
		p1.Ű = 180.0f;
		p1.������ = 41.0f;
		p1.�� = 2;
		p1.�ٸ� = 2;
		p1.�Ӹ� = 1;
		p1.�� = 1;
		p1.�� = 1;
		p1.�� = 2;
		
		p2.���� = 20;
		p2.���� = "��";
		p2.�̸� = "��ö��";
		p2.������ = "B";
		p2.Ű = 180.0f;
		p2.������ = 70.0f;
		p2.�� = 2;
		p2.�ٸ� = 2;
		p2.�Ӹ� = 1;
		p2.�� = 1;
		p2.�� = 1;
		p2.�� = 2;
		// Q, ���� �ʱ�ȭ�� ���� ���� �� �� �ִ� ����� ������??
		// A, �⺻������ �����ϴ� ������ Templete�� �����صΰ� �ʱ�ȭ ��Ű�� �� ������ ������?
		
		// ��ü ��� ���.
		System.out.println(p3.�̸�); // Templete���� �Է��� �⺻ ���� ��µǴ� ���� Ȯ���� �� �ִ�.
	}
	// Main Method End.
}
// PersonTest Class End.