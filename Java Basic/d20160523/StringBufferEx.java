package d20160523;

public class StringBufferEx {
	public static void main(String[] args)
	{
		String str = "Hello java World";
		// 거꾸로 출력할 것
		// dlroW avaj olleH
		
		char[] ch = str.toCharArray(); // String 값을 문자 배열로 변환하여 넘겨준다.
		for(int i = ch.length-1;i>=0;i--)
			System.out.print(ch[i]); // 입력된 문자열을 역순으로 출력.
		
		System.out.println();
		// StringBuffer Class를 이용한 역순 출력.
		StringBuffer sb1 = new StringBuffer(str); // StringBuffer Class의 객체 생성
		System.out.println(sb1.reverse()); // 문자열의 역순 출력 Method인 reverse 사용.
		
		System.out.println("--------------------------");
		StringBuffer sb = new StringBuffer();
		// 문자열 추가, 새로 생성하는 것이 아니라 기존의 값을 수정한다.
		sb.append("SELECT empno, ename, sal "); // 문자열에 입력한 문자열을 새로 추가한다.
		sb.append("FROM emp ");
		sb.append("WHERE empno = 7788");
		// 최종 문자열 출력.
		System.out.println(sb);
		// 문자열 역순으로 출력
		System.out.println(sb.reverse());
	}
}
