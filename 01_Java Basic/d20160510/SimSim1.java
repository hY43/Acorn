package d20160510;
import java.util.Scanner; // ����ڷκ��� ���� �Է� �ޱ� ���� Library import.

// Quiz, ABC �Է½� DEF�� ��µǵ��� �ڵ带 �����Ͻÿ�.
// SimSim1 Class Start.
public class SimSim1 {
	// Main Method Start.
	public static void main(String[] args) {
		System.out.print("�Է�: ");
		Scanner sc = new Scanner(System.in); // ����ڷκ��� ������ �Է¹���.
		String str = sc.nextLine(); // ������� �Է� ���� nextLine�� ���� String ���� str�� ����.
		char[] alp = str.toCharArray(); // ���ڿ� �迭 alp�� ������ ��, toCharArray Method�� ����Ͽ� str�� ����� ���ڿ��� �ѱ��ڴ����� �߶� �迭�� �� ��ҿ� ����.
		
		for (int i = 0; i < str.length(); i++) // str�� ����� ���ڿ��� ���̸�ŭ �ݺ��� ����.
			System.out.print((char)(alp[i]+3)); // �Է��� �� ������ �ƽ�Ű �ڵ� ���� 3�� ���� ��, ���.
	}
	// Main Method End.
}
//SimSim1 Class End.