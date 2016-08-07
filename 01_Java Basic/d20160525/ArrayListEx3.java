package d20160525;

import java.util.ArrayList;

public class ArrayListEx3 {
	public static void main(String[] args) {
		// String 객체만 담을 수 있는 전용 ArrayList
		// 제네릭: 일반화.
		ArrayList<String> list = new ArrayList();
		list.add("딸기");
		int a =30;
		Integer it = a;
		// list.add(it); // Integer Type이므로 String ArrayList에는 담을 수 없다.
		list.add("우유");
		
		System.out.println(list);
		// ArrayList 안에 있는 값 꺼내서 출력하기
		for(int i=0;i<list.size();i++)
		{
			String str = list.get(i);
			System.out.println(str.substring(0, 1));
		}
		
	}
}
