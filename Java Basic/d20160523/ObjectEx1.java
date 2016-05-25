package d20160523;

import d20160519.����;

// �ڹٿ��� ���� ������ ��
// 1. import java.lang.*
// 2. extends Object // �ڹٴ� �⺻������ ���� ����̱� ������ ��� �޴� Ŭ������ �θ� Ŭ������ ���ؼ� Object Class�� ����ϰ� �ȴ�.
// 3. �⺻ ������( ��, �Ű� ���� �ִ� �����ڰ� ���� ��� )
//		��� ������ ���� �⺻ ��, ���� 0 ������ null
// 4. ��� ������ ����Ű�� ���� ����: this
// 5. super, super()
// 6. ���� ������ default

public class ObjectEx1 {
	public static void main(String[] args) {
		Object obj1 = new Object();
		Object obj2 = new Object();
		
		obj1 = obj2;
		System.out.println("obj1: " + obj1);
		System.out.println("obj2: " + obj2);
		
		if(obj1 == obj2)
			System.out.println("���� ��ü");
		else
			System.out.println("�ٸ� ��ü");
		
		System.out.println("------------------------------------");
		
		if(obj1.equals(obj2)) // �� ��ü�� ���� ���� ������ true, �ٸ��� false
			System.out.println("���� ��ü");
		else
			System.out.println("�ٸ� ��ü");

		System.out.println("------------------------------------");
		Class cls = obj1.getClass();
		System.out.println("Ŭ������: " + cls.getClass());
		System.out.println("Ŭ������: " + cls.getName());
		
		System.out.println("------------------------------------");
		System.out.println(obj1 instanceof Object); // Object Class�� �ν��Ͻ��ΰ�?? �´ٸ� true, Ʋ���� false
		System.out.println(obj1 instanceof ����);
		
		System.out.println("------------------------------------");
		System.out.println("obj2 ������: " + obj2);
		System.out.println("obj2.toString(): " + obj2.toString());
		System.out.println("obj2 ������ ����� " + (
		obj2.getClass().getName() + '@' + Integer.toHexString(obj2.hashCode()))
				);
		System.out.println("------------------------------------");

	}
}
