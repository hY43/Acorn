package d20160511;

// ArrayEx1 Class Start.
public class ArrayEx1 {
	// Array(�迭): apt ����
	// ������ ����� ���ӵ� ������ �Ҵ�Ǵ� ����.
	
	// Main Method Start.
	public static void main(String[] args)
	{
		// int a; // �Ϲ� ����, int Type(Size)�� ���� ����.
		// int a[]; // �迭 ����.
		int[] a;
		a = new int[3]; // int Type�� ���� 3���� ���� �迭 ����.
		// a[X] ���� X�� ÷�� Ȥ�� �ε������ �θ���.
		
		a[0] = 10; // �迭�� ù��° ��ҿ� int Type�� ��� 10 ����.
		a[1] = 20; // �迭�� �ι�° ��ҿ� int Type�� ��� 20 ����.
		a[2] = 30; // �迭�� ����° ��ҿ� int Type�� ��� 30 ����.
		
		// �迭�� �� ��� ���.
		System.out.println("a[0]: " + a[0]);
		System.out.println("a[1]: " + a[1]);
		System.out.println("a[2]: " + a[2]);
		

		// ------------------------------------------------------
		// int ũ���̰� ��Ұ� 10���� �迭 ���� b�� �����ϰ�, �� ������ 10,20,30,40,50,60,70,80,90,100�� �����ϰ� ����Ͻÿ�.
		int[] b = new int[10]; // int ũ���� 10���� ��Ҹ� ���� �迭 b ����.
		int value = 10; // �迭 ��� �� �ʱ�ȭ.
		
		for(int i=0;i<10;i++) // b �迭�� ���� �����ϱ� ���� for��.
			b[i] = (i+1)*10; // �迭�� �� ��� ����. 10 20 30 40 ... 100
		
		for(int i=0;i<10;i++) // b �迭�� �� ��Ҹ� ����ϱ� ���� for��.
			System.out.println("b["+i+"]: " + b[i] ); // �� ��� ���.
		
		// System.out.println(b[10]); // Runtime Error!! �����ϴ� ���߿� Error�� �߻��Ѵ�.
									  // b[10], �� �迭�� ������ ��ҿ��� ������ �� ����.
	}
	// Main Method End.
}
// ArrayEx1 Class End.