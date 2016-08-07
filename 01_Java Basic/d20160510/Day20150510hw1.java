package d20160510;
// 숙제1. 구구단 옆으로 출력하기 (이중for문 사용) 
// 2* 1 = 2   2 * 2 = 4    2 * 3 = 6        2 * 9  = 18
// 3 * 1 = 3   3 * 2 = 6   3 * 3 = 9 ...   3 * 9 = 27 

// Day20150510hw1 Class Start.
public class Day20150510hw1 {
	// Main Method Start.
	public static void main(String[] args)
	{
		for(int i=2;i<=9;i++) // 각 단의 숫자를 의미하는 i에 대한 반복문.
		{
			for(int j=1;j<=9;j++) // 각 단에서의 1~9까지의 곱을 위한 j에 대한 반복문.
			{
				System.out.print(i + " * " + j + " = " + (i*j) +" ");
				// i단의 곱을 j의 변화에 따라 곱하여 출력.
			}
			System.out.println();
		}
	}
	// Main Method End.
}
//Day20150510hw1 Class End.