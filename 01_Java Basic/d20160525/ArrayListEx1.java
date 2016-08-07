package d20160525;

import java.util.ArrayList;

public class ArrayListEx1 {
	public static void main(String[] args) {
		ArrayList al = new ArrayList(); // ArrayList 선언 및 초기화.
		al.add("딸기");
		al.add("바나나");
		al.add("수박");
		al.add("망고");
		al.add("딸기");
		al.add("바나나");
		al.add("수박");
		al.add("망고");
		// 순서가 있기 때문에 중복된 값이 와도 입력이 된다.
		
		System.out.println("ArrayList: " + al);
		System.out.println(al.size()); // 현재 몇개의 요소가 입력되었는지 확인하기 위한 size Method
		for(int i=0;i<al.size();i++)
			System.out.println(al.get(i)); // get Method를 이용한 요소 확인.
	}
}
