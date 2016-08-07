package d20160516;

// MethodEx9 Class Start.
public class MethodEx9 {
	// mergeWorld Method Start.
	static String mergeWorld(String ... arrs)
	{
		// 입력 받은 문자열들을 하나의 문자열로 합하는 Method
		String str = ""; // 문자열의 누적을 위해 아무 값도 들어있지 않은 String Type 변수 str 선언 및 초기화.
		/* ******************************
		for(int i=0;i<arrs.length;i++)
		{
			str += arrs[i];
		}
		******************************* */
		// 향상된 for문, 개선된 for문
		// for([자료형] [변수명] : 배열명){}
		// 배열의 각 요소가 한 개씩 변수에 들어가서 for문 내 코드를 수행.
		for(String x : arrs) // arrs 배열의 각 요소가 순차적으로 String Type 변수 x에 대입되어 for문 내 코드가 수행된다.
			str += x;
		
		return str; // 합쳐진 문자열 반환.
	}
	// mergeWorld Method End.
	
	// Main Method Start.
	public static void main(String[] args)
	{
		String str = mergeWorld("오늘은 ", "월요일");
		System.out.println("str: " + str); // "오늘은 월요일" 출력.
		System.out.println(mergeWorld("대한", "민국", "만세")); // "대한민국만세" 출력.
		System.out.println(
				mergeWorld("자바", "가변", "인수", "메서드")); // 자바가변인수메서드
	}
	// Main Method End.
}
// MethodEx9 Class End.
