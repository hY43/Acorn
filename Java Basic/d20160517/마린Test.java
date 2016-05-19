
package d20160517;

public class 마린Test {
	public static void main(String[] args)
	{
		마린 m1 = new 마린();
		마린 m2 = new 마린();
		Medic me1 = new Medic();
		
		/*
		System.out.println("m2의 hp: " + m2.hp);
		m2 = m1; // m1의 참조 값을 참조 변수 m2에 대입. 
		m1.hp = 50; // m1의 hp 변경.
		System.out.println("m2의 hp: " + m2.hp);
		*/
		System.out.println("공격 전 m2의 상태");
		m2.상태정보();
		System.out.println("m2: " + m2);
		m1.공격(m2); // Call by Reference 방식의 Method 호출.
		System.out.println("공격 후 m2의 상태");
		m2.상태정보();
	}
}
