package RegularExpression;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegTest {
	public static void main(String[] args) {
		/*Pattern pattern = Pattern.compile("검색 패턴");
		Matcher matcher = pattern.matcher("검색 문자열");*/

		String searchData = "HONGGILDONG2 20 남원_한양 hong@gmail.com 02-1234-5678 KoSeong 20 HONG3 서울 Q3 dagda@hanafos.com 010-22-3333 이순신 20 부산 lee@gmail.com 080 333 4444";
		Pattern pattern = Pattern.compile("\\d"); // 숫자 한글자를 검색
		pattern = Pattern.compile("\\w"); // 문자 한글자를 검색(한글 제외)
		/*
		 	*: 0번 이상 반복 : 0, 1, n
			+: 1번 이상 반복 : 1, n
			?: 0 or 1
			{}: 횟수 표시
			
			^: 시작 문자
			$: 종료 문자
			[]: 문자열셋 ex) [a-z]
			[^]: 지정한 패턴을 제외한 문자
			/d: 숫자 ex) [0-9] 와 같은 의미
			/D: 숫자가 아닌 값 [^0-9] 와 같은 의미
			.: 뉴라인(\n)을 제외한 한문자
			-: 범위 지정 메타 문자
			/w: 영문자, _, 숫자를 포함하는 영문
			/W: 영문자, _, 숫자를 포함하지 않는 영문
			/s: 공백
			/S: 공백을 제외한 문자
			|: or, A|B: A 또는 B
			
			\\p{Alpha}: 대소문자 알파벳
			\\p{Digit}: 숫자
			\\p{Alnum}: 대소문자 알파벳, 숫자
			
			[가-힣]: 한글 검색
			
			예제 이메일 검색
			[a-zA-z0-9_\\-\\.]+@[a-zA-z0-9_\\-\\.]\\.[a-zA-z0-9]{2,}
			JavaScript라면
			[a-zA-z0-9_\-\.]+@[a-zA-z0-9_\-\.]\.[a-zA-z0-9]{2,}
		 */
		pattern = Pattern.compile("[a-zA-Z0-9_\\-\\.]+@[a-zA-Z0-9_\\-]+\\.[a-zA-Z0-9]{2,}");
		Matcher matcher = pattern.matcher(searchData);
		
		while(matcher.find()){
			System.out.println(matcher.group());
		}
	}
}
