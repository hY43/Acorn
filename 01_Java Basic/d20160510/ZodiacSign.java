package d20160510;

import java.util.Scanner;

// ZodiacSign Class Start.
public class ZodiacSign {
	// Main Method Start.
	public static void main(String[] args) {
		// 태어난 년도를 입력 받아 어떤 띠인지를 출력하는 코드 작성.
		System.out.println("년도 입력(4자리): ");
		Scanner sc = new Scanner(System.in);
		int year = sc.nextInt();

		// System.out.println(2016/12); // 0 -> 원숭이가 0
		// 자 축 임 묘 진 사 오 미 신 유 술 해
		// 4 5 6 7 8 9 10 11 0 1 2 3

		switch (year % 12) // 각 띠에 해당하는 값을 찾아 띠를 출력하기 위한 switch 문.
		{
		case 4:
			System.out.println("당신은 쥐 띠입니다.");
			break;
		case 5:
			System.out.println("당신은 소 띠입니다.");
			break;
		case 6:
			System.out.println("당신은 호랑이 띠입니다.");
			break;
		case 7:
			System.out.println("당신은 토끼 띠입니다.");
			break;
		case 8:
			System.out.println("당신은 용 띠입니다.");
			break;
		case 9:
			System.out.println("당신은 뱀 띠입니다.");
			break;
		case 10:
			System.out.println("당신은 말 띠입니다.");
			break;
		case 11:
			System.out.println("당신은 양 띠입니다.");
			break;
		case 0:
			System.out.println("당신은 원숭이 띠입니다.");
			break;
		case 1:
			System.out.println("당신은 닭 띠입니다.");
			break;
		case 2:
			System.out.println("당신은 개 띠입니다.");
			break;
		case 3:
			System.out.println("당신은 돼지 띠입니다.");
			break;
		}
	}
	// Main Method End.
}
// ZodiacSign Class End.