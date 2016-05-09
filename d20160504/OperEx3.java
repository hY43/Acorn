package d20160504;
// 3 순위: 비트 연산자
// >>>: 빈 공간을 0이 아닌 부호 자리로 채운다.
public class OperEx3 {
	public static void main(String[] args) {
		int b = 20; // 0001 0100
		b = b>>2;
		System.out.println(b);
		b = 20;
		b = b<<2;
		System.out.println(b);
		
		// 사람과는 달리 컴퓨터는 비트 연산으로 곱하고 나누는 것이 더 빠르다.
	}
}
