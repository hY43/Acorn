package d20160516;

// MethodEx8 Class Start.
public class MethodEx8 {
	/* *********************************************
	// add Method Start.(���ڰ� �� ���� add Method)
	static int add(int num1, int num2)
	{
		// �Է� ���� �� ���� ������ ���Ͽ� ����� �����ϴ� Method.
		return num1 + num2; // ���� ����.
	}
	// add Method End.
	
	// add Method Start.(���ڰ� �� ���� add Method)
	static int add(int num1, int num2, int num3)
	{
		// �Է� ���� �� ���� ������ ���Ͽ� ����� �����ϴ� Method.
		return num1 + num2 + num3;
	}
	// add Method End.
	*********************************************** */
	// ���� add Method�� ���� �μ��� ����Ͽ�, �Ű� ������ �þ ���� ��Ȳ�� ����Ѵ�.
	static int add(int ... arrs)
	{
		int sum = 0; // ���� ������ ���� int Type ���� sum ���� �� 0���� �ʱ�ȭ.
		for(int i=0;i<arrs.length;i++) // �Ű� ������ ���� ���� arrs �迭�� �� ����� ���� ���ϴ� for��.
			sum += arrs[i]; // �հ� ����.
		return sum; // �� �հ� ��ȯ.
	}
	
	// Main Method Start.
	public static void main(String[] args)
	{
		int a = 10;
		int b = 20;
		int c = 30;
		
		// Method�� �� �̸��� ���� �� Method�� �����ϴ� ���� �ƴ϶�, ������ ����, Ÿ�� ��� ���� Method Signature�� Ȯ���Ͽ� �����Ѱ� �ȴ�.
		int k = add(a,b); // int Type ���� a�� b�� ���� ���ϴ� Method�� add()�� �����ϰ�, �� ����� k�� ����.
		int m = add(a,b,c);
		// Q, �Ű� ������ ���� �ٲ𶧸���....Method�� ��� �������־�� �ϳ�?
		// A, ���� �μ��� ����ϸ� �̷��� ������ �ذ��� �� �ִ�.
		
		System.out.println("k: "+ k); // ��� ���.
		System.out.println("m: "+ m);
	}
	// Main Method End.
}
// MethodEx8 Class End.
