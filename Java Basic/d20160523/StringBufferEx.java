package d20160523;

public class StringBufferEx {
	public static void main(String[] args)
	{
		String str = "Hello java World";
		// �Ųٷ� ����� ��
		// dlroW avaj olleH
		
		char[] ch = str.toCharArray(); // String ���� ���� �迭�� ��ȯ�Ͽ� �Ѱ��ش�.
		for(int i = ch.length-1;i>=0;i--)
			System.out.print(ch[i]); // �Էµ� ���ڿ��� �������� ���.
		
		System.out.println();
		// StringBuffer Class�� �̿��� ���� ���.
		StringBuffer sb1 = new StringBuffer(str); // StringBuffer Class�� ��ü ����
		System.out.println(sb1.reverse()); // ���ڿ��� ���� ��� Method�� reverse ���.
		
		System.out.println("--------------------------");
		StringBuffer sb = new StringBuffer();
		// ���ڿ� �߰�, ���� �����ϴ� ���� �ƴ϶� ������ ���� �����Ѵ�.
		sb.append("SELECT empno, ename, sal "); // ���ڿ��� �Է��� ���ڿ��� ���� �߰��Ѵ�.
		sb.append("FROM emp ");
		sb.append("WHERE empno = 7788");
		// ���� ���ڿ� ���.
		System.out.println(sb);
		// ���ڿ� �������� ���
		System.out.println(sb.reverse());
	}
}
