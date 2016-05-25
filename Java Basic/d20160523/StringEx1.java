package d20160523;

public class StringEx1 {
	public static void main(String[] args)
	{
		String str1 = new String("java");
		String str2 = new String("java");
		// String Class�� toString()
		// Object Ŭ������ toString()�� ���� ���� ��������� �̸� �������̵��Ͽ� ����ϴ� String Class�� toString�� ����, �� ���ڿ��� ����Ѵ�.
		System.out.println(str1.getClass().getName() + '@' + Integer.toHexString(str1.hashCode()));
		System.out.println(str2.toString());
		
		if(str1 == str2)
			System.out.println("���� ��ü");
		else
			System.out.println("�ٸ� ��ü");
		
		// Object Class�� equals Method: ���� �� �� Method
		// String Class�� equals Method: Object Class�� equals Method�� override�Ͽ� ���� �񱳷� ���ȴ�.
		// �׷��� ���� ����� �Ʒ��� ����� �ٸ� ���̴�.
		if(str1.equals(str2)) 
			System.out.println("O");
		else
			System.out.println("X");
		
		System.out.println("--------------------------");
		// String Class�� new�� �����ϸ� �ٸ� Class�� �����ϰ� ���� �ٸ� ��ü�� �����������
		String str3 = "JAVA";
		String str4 = "JAVA";
		// ���� ���� ������� ������ ���� ��ü�� ����� �Ǹ� �Ѱ� ��ü�� �����Ͽ� �޸� ���� ���δ�.
		if(str3 == str4)
			System.out.println("���� ��ü");
		else
			System.out.println("�ٸ� ��ü");
		
		System.out.println("--------------------------");
		// ������ ������ �����ϰ� �Ǹ� �ٸ� ��ü�� �ν��Ͽ� ���ο� ��ü�� ����� �ȴ�.
		str3 = "ORACLE";
		if(str3 == str4)
			System.out.println("���� ��ü");
		else
			System.out.println("�ٸ� ��ü");
		System.out.println("str3 : " + str3 + ", str4: " + str4);
	}
}
