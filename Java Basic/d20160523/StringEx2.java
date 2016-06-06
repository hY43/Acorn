package d20160523;

public class StringEx2 {
	public static void main(String[] args) {
		String str = "java oracle";
		// X번째 문자를 가져와.
		char ch = str.charAt(3);
		System.out.println(ch); // 배열은 index가 0번 부터 있으므로 a가 출력된다.
		
		String str2 = "월요일";
		System.out.println(str.concat(str2)); // str의 문자열과 str2의 문자열을 이어 붙인 후, 출력한다.
		
		String s1 = "월 ";
		String s2 = "화 ";
		String s3 = "수 ";
		String s4 = "목 ";
		String s5 = "금 ";
		String s6 = "토 ";
		String s7 = "일 ";
		
		// Method Chain
		// 월 화 수 목 금 토 일
		System.out.println(s1.concat(s2.concat(s3.concat(s4.concat(s5.concat(s6.concat(s7)))))));
		System.out.println(
					s1.concat(s2)
					  .concat(s3)
					  .concat(s4)
					  .concat(s5)
					  .concat(s6)
					  .concat(s7)
				);
		
		String t = str.concat(str2);
		System.out.println("t: " + t);
		System.out.println(t.contains("java")); // 문자열 포함 여부를 boolean Type으로 반환, 존재하면 true, 아니면 false 반환.
		if(str.equals("JAVA ORACLE")) // 대소문자를 구분한다.
			System.out.println("같은 문자열");
		else
			System.out.println("다른 문자열");
		
		if(str.equalsIgnoreCase("JAVA ORACLE")) // 대소문자 구분 안함.
			System.out.println("같은 문자열");
		else
			System.out.println("다른 문자열");
		
		System.out.println("-----------------------------------");
		// r이라는 문자가 몇번째에 위치해 있는지 반환하는 메소드.
		System.out.println(str.indexOf('r'));
		
		System.out.println("-----------------------------------");
		// 문자열의 부분: 2번째 문자부터 6번째 문자 전까지 잘라서 보여줌.
		// java oracle
		System.out.println(str.substring(2,6));
		
		System.out.println("-----------------------------------");
		char[] chArray = str.toCharArray(); // 문자열의 각 문자를 문자 타입의 배열의 요소로 각각 대입한다.
		// 향상된 for문을 사용해서 위의 배열을 하나씩 출력.
		for(char chA : chArray)
			System.out.print(chA);
		System.out.println();
		
		System.out.println("-----------------------------------");
		int a = 20;
		String value = String.valueOf(a); // 다른 자료형을 String Type으로 형변환해주는 Method.
		System.out.println(value); // 문자 20 출력.
		
		System.out.println("-----------------------------------");
		String email = "dagda@hanafos.com";
		
		// id 추출해서 출력하기.
		System.out.println(email.substring(0, email.indexOf('@'))); // @가 몇 번째 index에 있는지 찾아서 @앞까지 잘라서 String Type 변수에 저장.
		
		System.out.println("-----------------------------------");
		String txt = "오늘은,월요일,내일은,화요일";
		// ,를 기준으로 쪼개서 출력
		// 오늘은
		// 월요일
		// 내일은
		// 화요일
		String[] d = txt.split(","); // , 문자를 기준으로 문자열을 자른 후 문자열 배열로 전달한다.
		for(String x : d)
			System.out.print(x + " ");	
	}	
}