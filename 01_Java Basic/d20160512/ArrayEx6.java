package d20160512;

// ArrayEx6 Class Start.
public class ArrayEx6 {
	// Main Method Start.
	public static void main(String[] args) {
		int[] a = new int[3]; // int Type ���� 3���� ���� �迭 ����.
		int[] b = {3,9,2};
		System.out.println("a: " + a); // a ���� ��.

		// �迭�� ũ��.
		System.out.println("����: " + a.length); // length ������ ����� �迭 a�� ���� ���.

		// �迭�� �� ��ҿ� �� ���.
		// �迭 ��� ���
		// �ݺ��� ����ؼ� ���
		for(int i=0;i<a.length;i++) // length ������ �̿��� a ��� ���.
									// length ������ �̿��ϸ� �߸��� �ε����� �����ϴ� ���� ������ �� �ִ�.
		{
			a[i] = (i+1)*10;
			System.out.println(a[i]);
		}
	}
	// Main Method End.
}
// ArrayEx6 Class End.