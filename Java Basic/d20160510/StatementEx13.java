package d20160510;


// break: 가장 가까운 반복문을 탈출해.
// continue: 이번만 생략.
// break Label: Label이 붙은 반복문을 탈출.
// continue Label: Label 명이 붙은 반복문에서 이번만 생략.
public class StatementEx13 {
	public static void main(String[] args) {
		outer: // Label: 바깥쪽 반복문에 이름을 붙임.
		for (int j = 1; j <= 3; j++) {
			for (int i = 1; i <= 4; i++) {
				//if(i==j) break; // i에 대한 반복문 탈출.
				//if(i==j) continue; // i에 대한 반복문 이번만 생략후 다음 카운트 진행.
				//if(i==j) continue outer; // j에 대한 반복문을 탈출해서 outer Label 위치로 이동.
				if(i==j) break outer;
				System.out.println("i: " + i + " j: " + j);
			}
		}
		
		System.out.println("---------------------------------------------------");
		
		for(int j=1;j<=4;j++)
		{
			for(int i=1;i<=4;i++)
			{
				System.out.print("*"); // * 문자 출력.
				if(i>=j) break; // 한개의 j당 i는 1~4까지 변화하며 *문자를 찍는데 i>=j라는 조건을 두어 매 Line마다 한개의 *문자가 늘어나도록 한다.
			}
			System.out.println();
		}
	}
}
