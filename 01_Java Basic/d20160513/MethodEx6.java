package d20160513;

// �Ű� ���� ���� ��Ŀ� ���� Method �з�.
// 1) Call by value: ���� �Ű� ������ �����Ͽ� ȣ��.
// 2) Call by name: �Ű� ���� ���� Method�� �̸������� ȣ��.
// MethodEx6 Class Start.
public class MethodEx6 {
	// printMsg Method Start.
	static void printMsg(String str)
	{
		System.out.println(str + "�ڹ�!!");
	}
	// printMsg Method End.

	// sayHello Method Start.
	static void sayHello()
	{
		System.out.println("������.");
	}
	// sayHello Method End.
	
	// maxInt Method Start.
	static void maxInt(int a, int b)
	{
		if(a>b) System.out.println("ū ���� " + a + "�Դϴ�.");
		else if(a<b) System.out.println("ū ���� " + b + "�Դϴ�.");
		else System.out.println("�� ���� ���� �� �Դϴ�.");
	}
	// maxInt Method End.

	// getNumber Method Start.
	static int getNumber(int a, int b, int c,int d, int index)
	{
		int[] arr = { a,b,c,d };
		return arr[index-1];
	}
	// getNumber Method End.
	
	// getInt Method Start.
	static int getInt(int[] temp, int index)
	{
		temp[index-1] = -100;
		return temp[index-1];
	}
	// getInt Method End.
	
	// Main Method Start.
	public static void main(String[] args)
	{
		printMsg("Hello"); // Call by value ����� Method ȣ��.
		sayHello(); // Call by Name ����� Method ȣ��.
		
		int a = 200;
		int b = 100;
		
		maxInt(a,b);
		
		int[] m = {200, 3000, 1000, 2400};

		int k = getNumber(200,3000,1000,240, 3);
		if(k==-1)
			System.out.println("index ���� �߸��Է��ϼ̽��ϴ�");
		else
			System.out.println(k);
				
		int[] t = new int[3];
		t = m; // �Ѵ� ���� ���� ���� "����" �̱� ������ ������ �����Ѵ�.
		System.out.println(m);
		System.out.println(t);
		System.out.println(m[0]);
		System.out.println(t[0]);
		
		System.out.println("�迭�� 3��° ��: " + getInt(t,3));
		System.out.println("�迭�� 3��° ��: " + m[2]);
		// �������� �Ѿư��� ���� �����Ͽ��� ������ ������ �迭 m�� �� ���� �ٲ�.
	}
	// Main Method End.
}
// MethodEx6 Class End.
