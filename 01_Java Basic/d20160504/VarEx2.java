package d20160504;

// VarEx2 Class Start
public class VarEx2 {
	// Main Method Start
	public static void main(String[] args)
	{
		// �ڹ��� ��� ������ �ݵ�� �ʱ�ȭ�ؼ� ����ؾ� �մϴ�.
		// ������ �����ϸ鼭 ���� ��� ���� �ʱ�ȭ�� �Ѵ�.
		byte b1 = 1; // byte Type�� ���� b1�� �����ϰ� 10�� ����.
		byte b2 = 20; // byte Type�� ���� b2�� �����ϰ� 20�� ����.
		
		System.out.println(b1 + b2); // ���� b1�� b2�� ����ִ� ���� + ������ ��, �� ����� ���.
		
		short sh1 = 100; // short Type�� ���� sh1�� �����ϰ� 100�� ����.
		
		sh1 = b1; // b1�� ���� sh1�� �����Ѵ�. sh1�� b1���� ū �ڷ����̱� ������ �ƹ� ���� ���� ����.(�Ͻ��� ����ȯ)
		b1 = (byte)sh1; // sh1�� ���� b1�� �����ϴµ�, sh1�� �ڷ����� �� ũ�� ������ ������ ���� �ڷ������� ����ȯ ��Ŵ.(����� ����ȯ)
	}
	// Main Method End
}
// VarEx2 Class End