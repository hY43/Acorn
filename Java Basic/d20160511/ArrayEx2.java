package d20160511;

// �迭: ������ ũ�⸦ ���� ���ӵ� ������ �Ҵ�� ����
//	1. ���ټӵ��� ���.
//	2. �ε���(÷��)�� �̿��� �ݺ����� ��� ����.

// ******�迭�� ������ ������ ����.
// int[] a = new int[5];
// ���� �ڵ带 �Է��ϸ� �켱 Heap ������ int Type�� 5���� ���ӵ� ������ ���(new) �ش� �ڷ����� �⺻ ������ �ʱ�ȭ ��Ų��.
// �� ��, ���Կ�����(=)�� ���� �����Ͱ� ��� Heap ������ �ּҸ� ���� a�� �����ϰ� �ȴ�.
// ��, ���� ���� ��� Primitive Type �����ʹ� �޸�, �ּ� ���� ��� ������ Reference Type ������� �Ѵ�. 

// ArrayEx2 Class Start.
public class ArrayEx2 {
	// Main Method Start.
	public static void main(String[] args) {
		int[] a;
		a = new int[5];
		// �迭�� �����ϸ� �� �� �������� �� �ڷ����� �⺻ ���� ����ִ�.
		// Ex) int: 0, float: 0.0f, boolean: false(0)

		System.out.println("a: " + a); // a���� ���� ������ ����� ������ �ּҰ� ����Ǿ� �ִ�.
		
		System.out.println("a �迭�� ũ��: "+ a.length); // length ������ �̿��Ͽ� �迭�� ���̸� ���.
		for (int i = 0; i < a.length; i++) // �迭�� ���̸� �ǹ��ϴ� length ������ �̿��Ͽ� for���� ���� ������ ���´�.
			System.out.println("a[" + i + "]: " + a[i]);
	}
	// Main Method End.
}
// ArrayEx2 Class End.