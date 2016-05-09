package d20160504;

public class HW01 {
	public static void main(String[] args)
	{
		int m1 = 100;
		byte b1 = 20;
		short sh1 = 200;
		int k = m1 + b1; // 산술연산의 결과는 int 형이기 때문에 k는 int 형으로 선언되어야 한다.
		System.out.println("k : " + (m1+b1));

		byte b2 = (byte)k; // k는 int 형이나 b2는 그보다 작은 byte 형이기 때문에 int 형으로 강제 형변환 시킨다.

		short b3 = 300; // byte는 최대 +127까지 지원하므로 short형이나 int형으로 선언하면 된다.
		k = k + 1; // k는 이전에 선언되었던 변수이기 때문에 자료형은 생략한다.
		System.out.println("k : " + k);
	}
}
