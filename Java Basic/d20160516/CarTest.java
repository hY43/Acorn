package d20160516;

// CarTest Class Start.
public class CarTest {
	// Car Class�� Test�ϱ� ���� Test Class
	// Main Method Start.
	public static void main(String[] args)
	{
		Car c; // Car Class�� ��ü c ����
		c = new Car(); // Heap ������ Car ��ü�� ������ ��, ���� ���� c�� ����.
		// Car c = new Car(); �� ���� �ۼ��ص� ��� ����.
		Car c2 = new Car();
		
		// c
		System.out.println("c�� ���� ��: " + c);
		c.����(); // ��ü c�� ���� Method ȣ��.
		System.out.println(c.����);
		c.������ = "�ƹݶ�";
		c.���� = 4;
		c.�ڵ� = 1;
		
		System.out.println("c�� ������: " + c.������);
		System.out.println("c2�� ���� ����: " + c.����);
		System.out.println("c2�� �ڵ� ����: " + c.�ڵ�);
		
		System.out.println("=============================");
		
		// c2�� ������ �?
		System.out.println("c2�� ���� ���� "+ c2.���� + "�Դϴ�."); // ������ �ʱ�ȭ�� ���� �ʾұ� ������ int�� �⺻ ���� 0���� �ʱ�ȭ �ȴ�.
		c2.������ = "�ҳ�Ÿ";
		c2.���� = 4;
		c2.�ڵ� = 1;

		System.out.println("c2�� ������: " + c2.������);
		System.out.println("c2�� ���� ����: " + c2.����);
		System.out.println("c2�� �ڵ� ����: " + c2.�ڵ�);
	}
	// Main Method End.
}
// CarTest Class End.