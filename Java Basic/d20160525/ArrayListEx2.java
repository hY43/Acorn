package d20160525;

public class ArrayListEx2 {
	// �ڹٴ� ��ü ���� ��� �Դϴ�.
	// ������ primitive ������ C���� �����Ա� ������ ���� Ŭ������ ����.
	// �̷� Ÿ���� �������� Wrapper Class�� Primitive ������ ���μ� ��ü�� ���� �� �ִ�.
	// Ex) int => Integer
	//     byte => Byte
	//     short => Short
	//     char => Character
	// int�� char�� ������ ��� Primitive Type�� ù���ڸ� �빮�ڷ� �ٲٸ� Wrapper Class �̴�.
	public static void main(String[] args) {
		byte b = 20;
		Byte by = new Byte(b);
		System.out.println(Byte.MAX_VALUE);
		System.out.println(Byte.MIN_VALUE);
		
		int c = 30;
		Integer it = new Integer(c);
		System.out.println(Integer.MAX_VALUE);
		System.out.println(Integer.MIN_VALUE);
		// �Էµ� ������ ������ ���
		System.out.println(Integer.toBinaryString(30));
		
		// float Type���� ����
		System.out.println(it.floatValue());
		
		// Primitive <-> Wrapper Class �����Ӱ� ��ȯ �����ϴ�.
		Integer it2 = c; // Auto-Boxing
		Integer it3 = 30; // Auto-Boxing
		int it4 = it2; // UnBoxing
	}
}
