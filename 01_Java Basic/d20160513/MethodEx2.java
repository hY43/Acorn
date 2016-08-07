package d20160513;

// MethodEx2 Class Start.
public class MethodEx2 {
	// printGuGuDan Method에서 값을 전달하는 int Type 변수 dan을 매개변수, 파라미터, 인자, 인수 등으로 부른다.
	// printGuGuDan Method Start.
	static void printGuGuDan(int dan) // 구구단을 출력하는 Method
	{
		System.out.println("전달 받은 값: " + dan);
		for(int i=1;i<=9;i++)
			System.out.println(dan+ " * " + i + " = " + (dan*i));
	}
	// printGuGuDan Method End.
	
	// gauss Method Start.
	static void gauss(int val)
	{
		int sum = 0;
		for(int i=1;i<=val;i++)
			sum += i;
		System.out.println("1부터 " + val + "까지의 합은 " + sum + "입니다.");
	}
	// gauss Method End.
	
	// Main Method Start.
	public static void main(String[] args)
	{
		printGuGuDan(3);
		
		gauss(100);
		// 1부터 100까지의 합은 5050입니다.
		
		gauss(1000);
		// 1부터 1000까지의 합은 500500입니다.
	}
	// Main Method End.
}
//MethodEx2 Class Start.