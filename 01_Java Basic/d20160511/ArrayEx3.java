package d20160511;

// Quiz, c �迭�� �����ϰ� �Ʒ��� ���� ������ ��, ����Ͽ���.
// c[0]: 11
// c[1]: 22
// c[2]: 33
// c[3]: 44
// c[4]: 55
// c[5]: 66

// ArrayEx3 Class Start.
public class ArrayEx3 {
	// Main Method Start.
	public static void main(String[] args)
	{
		int[] c = new int[6]; // int Type ���� 6���� ��ҷ� ���� �迭 c ����.

		for(int i=0;i<c.length;i++) // �� �迭�� ��� ���� �� ���.
		{
			c[i] = (i+1)*11; // �� ��ҿ� 11,22 ��� ���� x*11�� ���¸� �����ϱ� ���� ���Թ�.
			System.out.println("c[" + i + "]: " + c[i]);
		}
		
		System.out.println("-----------------------------------------"); 
		
		// ��Ģ�� ���� �����͸� �����ؾ��ϴ� ���.
		int[] k = new int[4]; // int Type�� ���� 4���� ��ҷ� ���� �迭 k ����.
		k[0] = 20; // k �迭�� �� ��� �ʱ�ȭ.
		k[1] = 10;
		k[2] = 90;
		k[3] = 110;
		
		// �Ʒ��� ���� ������� ������ �����ϴ�.
		int[] m = {20,10,90,110}; // int Type�� ���� 4���� ���� �迭 m ���� ��, �߰�ȣ�� �̿��Ͽ� �� ��ҿ� ���� �ʱ�ȭ.
		for(int i=0;i<m.length;i++) // �迭 m�� �� ��Ҹ� ����ϱ� ���� for ��.
			System.out.println("m[" + i +"]: "+ m[i]);
	}
	// Main Method End.
}
//ArrayEx3 Class End.