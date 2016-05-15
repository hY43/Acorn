package d20160512;

// ArrayEx7 Class Start.
public class ArrayEx7 {
	// Main Method Start.
	public static void main(String[] args) {
		int[][] m = new int[3][4]; // 3행 4열로 구성된 2차원 배열 선언.
									// 별다른 초기화를 하지 않으면 int의 기본 값인 0으로 초기화된다.
		// 출력.
		for(int i = 0;i<m.length;i++) // m이 가리키는 주소값은 3행, 즉 3개의 요소를 갖기 때문에 length 변수를 사용하여 길이를 지정할 수 있다.
		{
			for (int j = 0; j < m[i].length; j++) // m[i]가 가리키는 주소값은 4열, 즉 4개의 요소를 갖기 때문에 length 변수를 사용하여 길이를 지정할 수 있다.
				System.out.println("m[" + i + "][" + j + "] = " + m[i][j] + " "); // 요소 출력.
		}
	}
	// Main Method End.
}
// ArrayEx7 Class End.