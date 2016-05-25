package d20160523;

public class StringEx1 {
	public static void main(String[] args)
	{
		String str1 = new String("java");
		String str2 = new String("java");
		// String Class의 toString()
		// Object 클래스의 toString()은 참조 값을 출력하지만 이를 오버라이드하여 사용하는 String Class의 toString은 내용, 즉 문자열을 출력한다.
		System.out.println(str1.getClass().getName() + '@' + Integer.toHexString(str1.hashCode()));
		System.out.println(str2.toString());
		
		if(str1 == str2)
			System.out.println("같은 객체");
		else
			System.out.println("다른 객체");
		
		// Object Class의 equals Method: 참조 값 비교 Method
		// String Class의 equals Method: Object Class의 equals Method를 override하여 내용 비교로 사용된다.
		// 그래서 위의 결과와 아래의 결과가 다른 것이다.
		if(str1.equals(str2)) 
			System.out.println("O");
		else
			System.out.println("X");
		
		System.out.println("--------------------------");
		// String Class는 new로 생성하면 다른 Class와 동일하게 각각 다른 객체로 만들어지지만
		String str3 = "JAVA";
		String str4 = "JAVA";
		// 위와 같은 방식으로 내용이 같은 객체를 만들게 되면 한개 객체만 생성하여 메모리 낭비를 줄인다.
		if(str3 == str4)
			System.out.println("동일 객체");
		else
			System.out.println("다른 객체");
		
		System.out.println("--------------------------");
		// 하지만 내용을 수정하게 되면 다른 객체로 인식하여 새로운 객체를 만들게 된다.
		str3 = "ORACLE";
		if(str3 == str4)
			System.out.println("동일 객체");
		else
			System.out.println("다른 객체");
		System.out.println("str3 : " + str3 + ", str4: " + str4);
	}
}
