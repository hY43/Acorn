package d20160523;

public class StringBufferEx {
	public static void main(String[] args)
	{
		String str = "Hello java World";
		// �Ųٷ� ����� ��
		// dlroW avaj olleH
		
		char[] ch = str.toCharArray();
		for(int i = ch.length-1;i>=0;i--)
			System.out.print(ch[i]);
		
		System.out.println();
		// StringBuffer Class�� �̿��� ���� ���.
		StringBuffer sb1 = new StringBuffer(str);
		System.out.println(sb1.reverse());
		
		System.out.println("--------------------------");
		StringBuffer sb = new StringBuffer();
		// ���ڿ� �߰�, ���� �����ϴ� ���� �ƴ϶� ������ ���� �����Ѵ�.
		sb.append("SELECT empno, ename, sal ");
		sb.append("FROM emp ");
		sb.append("WHERE empno = 7788");
		// ���� ���ڿ� ���.
		System.out.println(sb);
		// ���ڿ� �������� ���
		System.out.println(sb.reverse());
	}
}
