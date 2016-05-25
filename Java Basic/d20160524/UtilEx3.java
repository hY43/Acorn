package d20160524;

import java.util.Calendar;

public class UtilEx3{
	public static void main(String[] args) {
		// Calendar Class는 Protected 생성자를 갖고 있으므로 new로 객체를 생성할 수 없다.
		Calendar cal = Calendar.getInstance();
		System.out.println(cal);
		int year = cal.get(Calendar.YEAR);
		System.out.println("올해는 " + year + "년 입니다.");
		
		// 0월부터 시작하도록 만들어져있어서, 월은 출력 시 꼭 +1해서 사용해야한다.
		int month = cal.get(Calendar.MONTH)+1;
		int day = cal.get(Calendar.DAY_OF_MONTH);		
	}
}
