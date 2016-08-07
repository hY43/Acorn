package d20160511;

// Quiz, c 배열을 선언하고 아래의 값을 대입한 후, 출력하여라.
// c[0]: 11
// c[1]: 22
// c[2]: 33
// c[3]: 44
// c[4]: 55
// c[5]: 66

// ArrayEx3 Class Start.
public class ArrayEx3 {
	// Main Method Start.
	public static void main(String[] args)
	{
		int[] c = new int[6]; // int Type 변수 6개를 요소로 갖는 배열 c 선언.

		for(int i=0;i<c.length;i++) // 각 배열의 요소 대입 및 출력.
		{
			c[i] = (i+1)*11; // 각 요소에 11,22 등과 같이 x*11의 형태를 대입하기 위한 대입문.
			System.out.println("c[" + i + "]: " + c[i]);
		}
		
		System.out.println("-----------------------------------------"); 
		
		// 규칙이 없는 데이터를 대입해야하는 경우.
		int[] k = new int[4]; // int Type의 변수 4개를 요소로 갖는 배열 k 선언.
		k[0] = 20; // k 배열의 각 요소 초기화.
		k[1] = 10;
		k[2] = 90;
		k[3] = 110;
		
		// 아래와 같은 방식으로 대입이 가능하다.
		int[] m = {20,10,90,110}; // int Type의 변수 4개를 갖는 배열 m 선언 후, 중괄호를 이용하여 각 요소에 대한 초기화.
		for(int i=0;i<m.length;i++) // 배열 m의 각 요소를 출력하기 위한 for 문.
			System.out.println("m[" + i +"]: "+ m[i]);
	}
	// Main Method End.
}
//ArrayEx3 Class End.