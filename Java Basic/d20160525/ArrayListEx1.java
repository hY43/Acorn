package d20160525;

import java.util.ArrayList;

public class ArrayListEx1 {
	public static void main(String[] args) {
		ArrayList al = new ArrayList();
		al.add("����");
		al.add("�ٳ���");
		al.add("����");
		al.add("����");
		al.add("����");
		al.add("�ٳ���");
		al.add("����");
		al.add("����");
		
		System.out.println("ArrayList: " + al);
		System.out.println(al.size());
		for(int i=0;i<al.size();i++)
			System.out.println(al.get(i));
	}
}
