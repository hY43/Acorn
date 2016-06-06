package d20160523;

public class StringEx2 {
	public static void main(String[] args) {
		String str = "java oracle";
		// X��° ���ڸ� ������.
		char ch = str.charAt(3);
		System.out.println(ch); // �迭�� index�� 0�� ���� �����Ƿ� a�� ��µȴ�.
		
		String str2 = "������";
		System.out.println(str.concat(str2)); // str�� ���ڿ��� str2�� ���ڿ��� �̾� ���� ��, ����Ѵ�.
		
		String s1 = "�� ";
		String s2 = "ȭ ";
		String s3 = "�� ";
		String s4 = "�� ";
		String s5 = "�� ";
		String s6 = "�� ";
		String s7 = "�� ";
		
		// Method Chain
		// �� ȭ �� �� �� �� ��
		System.out.println(s1.concat(s2.concat(s3.concat(s4.concat(s5.concat(s6.concat(s7)))))));
		System.out.println(
					s1.concat(s2)
					  .concat(s3)
					  .concat(s4)
					  .concat(s5)
					  .concat(s6)
					  .concat(s7)
				);
		
		String t = str.concat(str2);
		System.out.println("t: " + t);
		System.out.println(t.contains("java")); // ���ڿ� ���� ���θ� boolean Type���� ��ȯ, �����ϸ� true, �ƴϸ� false ��ȯ.
		if(str.equals("JAVA ORACLE")) // ��ҹ��ڸ� �����Ѵ�.
			System.out.println("���� ���ڿ�");
		else
			System.out.println("�ٸ� ���ڿ�");
		
		if(str.equalsIgnoreCase("JAVA ORACLE")) // ��ҹ��� ���� ����.
			System.out.println("���� ���ڿ�");
		else
			System.out.println("�ٸ� ���ڿ�");
		
		System.out.println("-----------------------------------");
		// r�̶�� ���ڰ� ���°�� ��ġ�� �ִ��� ��ȯ�ϴ� �޼ҵ�.
		System.out.println(str.indexOf('r'));
		
		System.out.println("-----------------------------------");
		// ���ڿ��� �κ�: 2��° ���ں��� 6��° ���� ������ �߶� ������.
		// java oracle
		System.out.println(str.substring(2,6));
		
		System.out.println("-----------------------------------");
		char[] chArray = str.toCharArray(); // ���ڿ��� �� ���ڸ� ���� Ÿ���� �迭�� ��ҷ� ���� �����Ѵ�.
		// ���� for���� ����ؼ� ���� �迭�� �ϳ��� ���.
		for(char chA : chArray)
			System.out.print(chA);
		System.out.println();
		
		System.out.println("-----------------------------------");
		int a = 20;
		String value = String.valueOf(a); // �ٸ� �ڷ����� String Type���� ����ȯ���ִ� Method.
		System.out.println(value); // ���� 20 ���.
		
		System.out.println("-----------------------------------");
		String email = "dagda@hanafos.com";
		
		// id �����ؼ� ����ϱ�.
		System.out.println(email.substring(0, email.indexOf('@'))); // @�� �� ��° index�� �ִ��� ã�Ƽ� @�ձ��� �߶� String Type ������ ����.
		
		System.out.println("-----------------------------------");
		String txt = "������,������,������,ȭ����";
		// ,�� �������� �ɰ��� ���
		// ������
		// ������
		// ������
		// ȭ����
		String[] d = txt.split(","); // , ���ڸ� �������� ���ڿ��� �ڸ� �� ���ڿ� �迭�� �����Ѵ�.
		for(String x : d)
			System.out.print(x + " ");	
	}	
}