package d20160516;

// MethodEx9 Class Start.
public class MethodEx9 {
	// mergeWorld Method Start.
	static String mergeWorld(String ... arrs)
	{
		// �Է� ���� ���ڿ����� �ϳ��� ���ڿ��� ���ϴ� Method
		String str = ""; // ���ڿ��� ������ ���� �ƹ� ���� ������� ���� String Type ���� str ���� �� �ʱ�ȭ.
		/* ******************************
		for(int i=0;i<arrs.length;i++)
		{
			str += arrs[i];
		}
		******************************* */
		// ���� for��, ������ for��
		// for([�ڷ���] [������] : �迭��){}
		// �迭�� �� ��Ұ� �� ���� ������ ���� for�� �� �ڵ带 ����.
		for(String x : arrs) // arrs �迭�� �� ��Ұ� ���������� String Type ���� x�� ���ԵǾ� for�� �� �ڵ尡 ����ȴ�.
			str += x;
		
		return str; // ������ ���ڿ� ��ȯ.
	}
	// mergeWorld Method End.
	
	// Main Method Start.
	public static void main(String[] args)
	{
		String str = mergeWorld("������ ", "������");
		System.out.println("str: " + str); // "������ ������" ���.
		System.out.println(mergeWorld("����", "�α�", "����")); // "���ѹα�����" ���.
		System.out.println(
				mergeWorld("�ڹ�", "����", "�μ�", "�޼���")); // �ڹٰ����μ��޼���
	}
	// Main Method End.
}
// MethodEx9 Class End.
