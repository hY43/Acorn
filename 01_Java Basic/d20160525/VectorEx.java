package d20160525;

import java.util.Vector;

// Vector: 동적 성장형 Object 배열
public class VectorEx {
	public static void main(String[] args) {
		Vector v = new Vector(); // 기본 생성자를 이용한 Vector 객체 v 생성.
		System.out.println("v의 수용량: " + v.capacity()); // 현재 v는 기본 생성자로 만들었기 때문에 10개의 요소를 가진 배열이 선언된다.
		System.out.println("v의 요소 수: "+ v.size()); // 현재 Vector v는 사용하지 않았기 때문에 0이 나온다.

		// Vector v에 요소 추가
		v.add("딸기");
		v.add("복숭아");
		v.add("사과");
		v.add("포도");
		v.add("배");
		
		System.out.println("v: " + v); // 현재 Vector v에 들어있는 요소 출력.
		System.out.println("v의 요소 수: " + v.size()); // 5개의 요소를 추가하였으므로 5가 출력.
		
		// 중복 값 추가.
		v.add("딸기");
		v.add("복숭아");
		v.add("사과");
		v.add("포도");
		v.add("배");
				
		System.out.println("v: " + v); // List Type의 특성상 순서가 있으므로 중복 여부와 관계 없이 입력할 수 있다.
		System.out.println("v의 요소 수: " + v.size()); // 5개의 요소를 추가하였으므로 10이 출력된다.
		
		// v의 허용치를 추가하도록 데이터 입력.
		v.add("딸기");
		v.add("딸기");
		v.add("딸기");
		
		System.out.println("v의 요소 수: " + v.size()); // 5개의 요소를 추가하였으므로 13이 출력된다.
		System.out.println("v의 수용량: " + v.capacity()); // v의 기본 허용량을 초과하였기 때문에 기본인 10개만큼 허용량이 증가된다.
		
		Object obj = v.get(0); // Vector v의 0번째 요소를 Object Type 변수 obj에 저장.
							   // get()은 Object를 반환.
		System.out.println(obj); // 원래 Object 변수를 그냥 출력하면 참조 값이 나와야하지만 실제로 입력한 값은 String 변수 이므로
								 // 자식 Class의 toString이 출력되어 문자열이 출력된다.
		// String str = "딸기";
		// Object o = str;
		// add(o);
		// 와 같은 방식으로 입력이 자동으로 이루어진다.
		Object obj2 = v.get(0);
		String str = (String)obj2; // Object 타입으로 반환이 되었기때문에 실제 문자열 변수로 사용하기 위해서는 객체 형변환을 해야 한다.
		
		for(int i = 0;i<v.size();i++)
		{
			Object obj3 = v.get(i);
			String str2 = (String)obj3;
			System.out.println(str2);
		}
	}
}
