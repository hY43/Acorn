package d20160513;

public class MethodEx5 {
	// 전역 변수: Class 전체에서 사용할 수 있는 변수. 하지만 전역 변수의 경우 java의 장점을 버리는 것과 마찬가지이므로...why??
	static int a = 100; // 전역 변수.
	static int b = 200; // 전역 변수.
	
	static int add(int c, int d)
	{
		// c 지역 변수.
		// d 지역 변수.
		return c+d;
	}
	public static void main(String[] args)
	{
		int c = add(a,b);
		System.out.println("c: " + c);
	}
}
