package d20160523;

import d20160519.마린;

// 자바에서 생략 가능한 것
// 1. import java.lang.*
// 2. extends Object // 자바는 기본적으로 단일 상속이기 때문에 상속 받는 클래스는 부모 클래스에 의해서 Object Class를 상속하게 된다.
// 3. 기본 생성자( 단, 매개 변수 있는 생성자가 없을 경우 )
//		멤버 변수의 값을 기본 값, 숫자 0 참조값 null
// 4. 멤버 변수를 가리키는 참조 변수: this
// 5. super, super()
// 6. 접근 지정자 default

public class ObjectEx1 {
	public static void main(String[] args) {
		// Object Type의 변수 선언
		Object obj1 = new Object();
		Object obj2 = new Object();
		
		obj1 = obj2; // 참조 변수 obj2에 들은 참조 값을 참조 변수 obj1에 넣는다.
		System.out.println("obj1: " + obj1);
		System.out.println("obj2: " + obj2);
		// 참조 변수 obj1과 obj2의 참조 값이 같으므로 동일한 참조 값을 출력한다.
		
		if(obj1 == obj2) // 참조 값이 같으므로 동일 객체가 출력된다.
			System.out.println("동일 객체");
		else
			System.out.println("다른 객체");
		
		System.out.println("------------------------------------");
		
		if(obj1.equals(obj2)) // 두 객체의 참조 값이 같으면 true, 다르면 false
			System.out.println("동일 객체");
		else
			System.out.println("다른 객체");
		// Object Class의 equals는 참조 값에 대한 비교를 진행한다.

		System.out.println("------------------------------------");
		Class cls = obj1.getClass();
		System.out.println("클래스명: " + cls.getClass());
		System.out.println("클래스명: " + cls.getName());
		
		System.out.println("------------------------------------");
		System.out.println(obj1 instanceof Object); // Object Class의 인스턴스인가?? 맞다면 true, 틀리면 false
		System.out.println(obj1 instanceof 마린);
		
		System.out.println("------------------------------------");
		System.out.println("obj2 참조값: " + obj2); // 참조 변수 obj2에 들은 참조 값 출력.
		System.out.println("obj2.toString(): " + obj2.toString()); // Object Class의 toString은 참조 값을 출력한다.
		System.out.println("obj2 참조값 만들기 " + (
		obj2.getClass().getName() + '@' + Integer.toHexString(obj2.hashCode())) // Object Class의 toString은 이와 같은 형식을 출력하는 것이다.
				);
		System.out.println("------------------------------------");

	}
}
