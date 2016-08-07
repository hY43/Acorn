package d20160510;
import java.util.Scanner;

// Quiz, 화폐 교환기
// 입력: 67429
// 5만원: 1장
// 1만원: 1장
// 5천원: 1장
// 1천원: 2장
// 5백원: 0개
// 1백원: 4개
// 5십원: 0개
// 1십원: 2개
// 1원 : 9개

// StatementHw14 Class Start.
public class StatementHw14 {
	// Main Method Start.
	public static void main(String[] args)
	{
		System.out.println("입력: ");
		Scanner sc = new Scanner(System.in);
		int money = sc.nextInt(); // 사용자의 입력 값을 int Type 변수 money을 선언 후, 대입.
		
		int fMan = money/50000; // 50000원 개수 계산.
		int oMan = (money%50000)/10000; // 10000원 개수 계산.
		int fChun = ((money%50000)%10000)/5000; // 5000원 개수 계산.
		int oChun = (((money%50000)%10000)%5000)/1000; // 1000원 개수 계산.
		int fBaek = ((((money%50000)%10000)%5000)%1000)/500; // 500원 개수 계산.
		int oBaek = (((((money%50000)%10000)%5000)%1000)%500)/100; // 100원 개수 계산.
		int fShip = ((((((money%50000)%10000)%5000)%1000)%500)%100)/50; // 50원 개수 계산.
		int oShip = (((((((money%50000)%10000)%5000)%1000)%500)%100)%50)/10; // 10원 개수 계산.
		int oWon = (((((((money%50000)%10000)%5000)%1000)%500)%100)%50)%10; // 1원 개수 계산.
		
		// 결과 출력.
		System.out.println("5만원: "+ fMan + "장");
		System.out.println("1만원: "+ oMan + "장");
		System.out.println("5천원: "+ fChun + "장");
		System.out.println("1천원: "+ oChun + "장");
		System.out.println("5백원: "+ fBaek + "개");
		System.out.println("1백원: "+ oBaek + "개");
		System.out.println("5십원: "+ fShip + "개");
		System.out.println("1십원: "+ oShip + "개");
		System.out.println("1원: "+ oWon + "개");
	}
	// Main Method End.
}
//StatementHw14 Class End.