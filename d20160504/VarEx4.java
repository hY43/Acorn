package d20160504;
// ctrl + shift + 'F': �ڵ� ����
// VarEx4 Class Start
public class VarEx4 {
	// Main Method Start
	public static void main(String[] args) {
		char c = 'a'; // char Type�� ���� c�� ������ ��, ���� 'a'�� ����.
		System.out.println("c : "+ c); // char Type�� ���� c�� ���� ���.
		
		char d1 = 'J';
		char d2 = 'A';
		char d3 = 'V';
		char d4 = 'A';
		System.out.println(""+d1+d2+d3+d4); // ����+���ڴ� ASCII Code ������ ��� ������ �ϱ� ������ ���ڿ� + ������ ���·� �ٲ�� ���������� "JAVA"�� ��µȴ�.
	
		String str = "Hello Java World";
		System.out.println(str);
		
		char c1 = 'A';
		//char c2 = 'AB';
		String s1 = "A";
		String s2 = "AB";
		
		char ch1 = 'a'; // ����
		char ch2 = 97; // ASCII Code 97 => 'a'
		char ch3 = '\u0061'; // unicode
		System.out.println("ch1: " + ch1);
		System.out.println("ch2: " + ch2);
		System.out.println("ch3: " + ch3);
	}
	// Main Method End
}
// VarEx4 Class End