package d20160510;
import java.util.Scanner;
/*
1. 사용자로부터 숫자를 입력받는다. 

	동전을입력하세요 : 50000

	1. 콜라       : 1200원
	2. 사이다     : 2500원
	3. 구공탄라면 : 120원

2. 메뉴를 선택하세요 :  2
3. 몇개? 3 
4. 사이다 3개 
   잔돈 : 42500입니다. 
   만원   : 4장
   천원   : 2장
   오백원 : 1개
*/
// VendingMachine Class Start.
public class VendingMachine {
	// Main Method Start.
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in); // 사용자로부터 값을 입력 받기 위한 터미널 개방.
		System.out.print("동전을 입력하세요: ");
		int input = sc.nextInt(); // 사용자로부터 임금된 동전을 int Type의 변수 input에 대입.
		
		System.out.println("1. 콜라         : 1200원");
		System.out.println("2. 사이다      : 2500원");
		System.out.println("3. 구공탄라면:  120원");
		System.out.print("메뉴를 선택하세요: ");
		int selMenu = sc.nextInt(); // 사용자로부터 메뉴에 대한 번호를 입력 받아 selMenu 변수에 저장.
		System.out.print("개수를 입력하세요:  ");
		int count = sc.nextInt(); // 사용자로부터 선택한 메뉴에 대한 개수를 입력 받아 count 변수에 저장.
		
		switch(selMenu) // 사용자가 선택한 메뉴에 따라 잔금을 계산하는 switch 문.
		{
		case 1:
			System.out.print("콜라 " + count + "개");
			input -= (1200*count);
			break;
		case 2:
			System.out.print("사이다 " + count + "개");
			input -= (2500*count);
			break;
		case 3:
			System.out.print("구공탄라면 " + count + "개");
			input -= (120*count);
			break;
		}
		System.out.println("잔돈: "+ input);
		System.out.println("만원: "+ input/10000); // 10000원의 개수 출력.
		System.out.println("천원: "+ (input%10000)/1000); // 1000원의 개수 출력.
		System.out.println("오백원: "+ ((input%10000)%1000)/500); // 500원의 개수 출력.
	}
	// Main Method End.
}
//VendingMachine Class End.