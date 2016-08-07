package d20160513;

// 매개 변수 전달 방식에 따른 Method 분류.
// 1) Call by value: 값을 매개 변수로 전달하여 호출.
// 2) Call by name: 매개 변수 없이 Method의 이름만으로 호출.
// MethodEx6 Class Start.
public class MethodEx6 {
	// printMsg Method Start.
	static void printMsg(String str)
	{
		System.out.println(str + "자바!!");
	}
	// printMsg Method End.

	// sayHello Method Start.
	static void sayHello()
	{
		System.out.println("곤니찌와.");
	}
	// sayHello Method End.
	
	// maxInt Method Start.
	static void maxInt(int a, int b)
	{
		if(a>b) System.out.println("큰 값은 " + a + "입니다.");
		else if(a<b) System.out.println("큰 값은 " + b + "입니다.");
		else System.out.println("두 수는 같은 수 입니다.");
	}
	// maxInt Method End.

	// getNumber Method Start.
	static int getNumber(int a, int b, int c,int d, int index)
	{
		int[] arr = { a,b,c,d };
		return arr[index-1];
	}
	// getNumber Method End.
	
	// getInt Method Start.
	static int getInt(int[] temp, int index)
	{
		temp[index-1] = -100;
		return temp[index-1];
	}
	// getInt Method End.
	
	// Main Method Start.
	public static void main(String[] args)
	{
		printMsg("Hello"); // Call by value 방식의 Method 호출.
		sayHello(); // Call by Name 방식의 Method 호출.
		
		int a = 200;
		int b = 100;
		
		maxInt(a,b);
		
		int[] m = {200, 3000, 1000, 2400};

		int k = getNumber(200,3000,1000,240, 3);
		if(k==-1)
			System.out.println("index 값을 잘못입력하셨습니다");
		else
			System.out.println(k);
				
		int[] t = new int[3];
		t = m; // 둘다 참조 값을 갖는 "변수" 이기 때문에 대입이 가능한다.
		System.out.println(m);
		System.out.println(t);
		System.out.println(m[0]);
		System.out.println(t[0]);
		
		System.out.println("배열의 3번째 값: " + getInt(t,3));
		System.out.println("배열의 3번째 값: " + m[2]);
		// 참조값을 쫓아가서 값을 수정하였기 때문에 원본인 배열 m의 값 역시 바뀜.
	}
	// Main Method End.
}
// MethodEx6 Class End.
