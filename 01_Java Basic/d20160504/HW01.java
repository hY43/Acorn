package d20160504;

public class HW01 {
	public static void main(String[] args)
	{
		int m1 = 100;
		byte b1 = 20;
		short sh1 = 200;
		int k = m1 + b1; // ��������� ����� int ���̱� ������ k�� int ������ ����Ǿ�� �Ѵ�.
		System.out.println("k : " + (m1+b1));

		byte b2 = (byte)k; // k�� int ���̳� b2�� �׺��� ���� byte ���̱� ������ int ������ ���� ����ȯ ��Ų��.

		short b3 = 300; // byte�� �ִ� +127���� �����ϹǷ� short���̳� int������ �����ϸ� �ȴ�.
		k = k + 1; // k�� ������ ����Ǿ��� �����̱� ������ �ڷ����� �����Ѵ�.
		System.out.println("k : " + k);
	}
}
