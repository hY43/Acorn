package d20160509;

// 1
// 3
// 6
// 10
// 15

// StatementHw4 Class Start
public class StatementHw4 {
	// Main Method Start
	public static void main(String[] args) {
/*
		System.out.println(1); // 0+1
		System.out.println(3); // 0+1+2
		System.out.println(6); // 0+1+2+3
		System.out.println(10); // 0+1+2+3+4
		System.out.println(15); // 0+1+2+3+4+5				
*/ 		// �ó����� �ۼ��� ���� ��� �� �ܼ� ���.
		int sum = 0; // ���� ���� �����ϱ� ����, int Type�� ���� sum ���� ��, 0���� �ʱ�ȭ.

		for (int i = 1; i <= 5; i++) { // �־��� Line ����ŭ ����ϱ����� �ݺ���.
			sum += i; // �� ����.
			System.out.println(sum); // ������ �� ���
		}		
	}
	// Main Method End
}
//StatementHw4 Class End