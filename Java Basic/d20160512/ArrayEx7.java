package d20160512;

// ArrayEx7 Class Start.
public class ArrayEx7 {
	// Main Method Start.
	public static void main(String[] args) {
		int[][] m = new int[3][4]; // 3�� 4���� ������ 2���� �迭 ����.
									// ���ٸ� �ʱ�ȭ�� ���� ������ int�� �⺻ ���� 0���� �ʱ�ȭ�ȴ�.
		// ���.
		for(int i = 0;i<m.length;i++) // m�� ����Ű�� �ּҰ��� 3��, �� 3���� ��Ҹ� ���� ������ length ������ ����Ͽ� ���̸� ������ �� �ִ�.
		{
			for (int j = 0; j < m[i].length; j++) // m[i]�� ����Ű�� �ּҰ��� 4��, �� 4���� ��Ҹ� ���� ������ length ������ ����Ͽ� ���̸� ������ �� �ִ�.
				System.out.println("m[" + i + "][" + j + "] = " + m[i][j] + " "); // ��� ���.
		}
	}
	// Main Method End.
}
// ArrayEx7 Class End.