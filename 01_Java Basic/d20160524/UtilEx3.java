package d20160524;

import java.util.Calendar;

public class UtilEx3{
	public static void main(String[] args) {
		// Calendar Class�� Protected �����ڸ� ���� �����Ƿ� new�� ��ü�� ������ �� ����.
		Calendar cal = Calendar.getInstance();
		System.out.println(cal);
		int year = cal.get(Calendar.YEAR);
		System.out.println("���ش� " + year + "�� �Դϴ�.");
		
		// 0������ �����ϵ��� ��������־, ���� ��� �� �� +1�ؼ� ����ؾ��Ѵ�.
		int month = cal.get(Calendar.MONTH)+1;
		int day = cal.get(Calendar.DAY_OF_MONTH);		
	}
}
