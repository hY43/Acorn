package d20160516;
// Hw1, int[] m = {200, 100, 300, 200, 400} �� ���� ���� ����ϼ���
// ��, ���� for���� ���.

// Hw1 Class Start.
public class Hw1 {
	public static void main(String[] args)
	{
		int[] m = {200, 100, 300, 200, 400};
		int sum = 0; // �� ������ ���� int Type ���� sum ���� ��, 0���� �ʱ�ȭ.
		
		// ���� for���� ����Ͽ� �迭�� �� ��ҿ� ���� �հ� ����.
		for(int x : m)
			sum += x; // ����.
		System.out.println("���� ���� " + sum + "�Դϴ�.");
	}
}
//Hw1 Class End.