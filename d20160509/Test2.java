package d20160509;
// Quiz, Test2 Class�� �ۼ��ϰ� ������ ����� ����ϼ���

// byte b1 = 20;
// byte b2 = 32;
// b1 | b2 �����?? 52

// Test2 Class Start
public class Test2 {
	// Main Method Start
	public static void main(String[] args) {
		byte b1 = 20; // 0001 0100
		byte b2 = 32; // 0010 0000
		System.out.println("b1 | b2 : " + (b1 | b2)); // 0011 0100: 52
	}
	// Main Method End
}
// Test2 Class End