package d20160509;
// 6 ���� �� ������ : &&, ||, (���������� !�� 1���� �������̴�.)

// OperEx6 Class Start
public class OperEx6 {
	// Main Method Start
	public static void main(String[] args)
	{
		boolean b1 = true;
		boolean b2 = false;
		// boolean Type�� ���� b1, b2�� ������ ��, �ʱ�ȭ.
		System.out.println("b1 && b2 : " + (b1&&b2)); // �Ѵ� true �� ��쿡�� true ���.
		System.out.println("b1 || b2 : " + (b1||b2)); // �� �� �ϳ��� true�̸� true ���.
		
		/*
		byte b3 = 10;
		byte b4 = 20;
		System.out.println("b1 || b2 : " + (b3||b4)); // int ���̹Ƿ� �� ������ �Ұ����ϴ�. 
		*/		
		
		System.out.println(!b1); // true��� false��, false��� true�� ����Ѵ�.
	}
	// Main Method End
}
//OperEx6 Class End