package d20160511;

// ArrayEx4 Class Start. 
public class ArrayEx4 {
	// Main Method Start.
	public static void main(String[] args)
	{
		// Main Method�� �迭 ����ϱ�.(���� ������ �ʴ´�.)
		// System.out.println("args[0]: " + args[0]); // run as - run configuration - argument
		// System.out.println("args[1]: " + args[1]);
		
		char[] ch = {'j', 'a', 'v', 'a', ' ', 'w', 'o', 'r', 'l', 'd'}; // char Type �迭 ch ���� ��, �� ��� �ʱ�ȭ.
		for(int i=0;i<ch.length;i++) // �迭�� �� ��Ҹ� ����ϱ� ���� for��.
			System.out.print(ch[i]);
		
		System.out.println("\n----------------");
		String str = "java world"; // String�� �ڷ����� �ƴ϶� Char �迭�� �����Ͽ� ������� Class�̴�.
		System.out.println(str);
		
	}
	// Main Method End.
}
// ArrayEx4 Class End.