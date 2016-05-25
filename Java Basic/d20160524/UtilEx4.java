package d20160524;

import java.util.Calendar;

public class UtilEx4{
	public static void main(String[] args) {
			Calendar cal = Calendar.getInstance();
			cal.set(2016, 2, 1);
			System.out.println(cal);
			
			// 일~토
			// 1~7
			int d = cal.get(Calendar.DAY_OF_MONTH);
			System.out.println(d);
			
			System.out.println("일\t월\t화\t수\t목\t금\t토\t");
			int count=0;
			for(int j=1;j<d;j++)
			{
				System.out.println("\t");
				count++;
			}
			for(int i=1;i<=31;i++)
			{
				count++;
				System.out.print(i+"\t");
				if(count%7==0)
					System.out.println();
			}
	}
}
