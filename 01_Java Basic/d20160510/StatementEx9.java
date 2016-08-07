package d20160510;

public class StatementEx9 {
	public static void main(String[] args)
	{
		// 학생의 총점과 평균을 출력
		int kor = 55;
		int eng = 90;
		int mat = 70;
		
		// 총점과 평균을 출력
		int total = kor + eng + mat; // 위에서 받은 kor, eng, mat의 값을 더하여 int Type 변수 total에 대입.
		float avg = total/3; // total 값을 과목 수인 3으로 나누어 평균을 계산하는데 평균은 소수점이 존재하기 때문에 float Type 변수 avg에 대입한다.
		
		System.out.println("총점 : " + total);
		System.out.println("총점 : " + avg);
		// 이때 평균이 60이상이면 합격 아니면 불합격 메세지 출력.
		
		if(avg >= 60) // 분기 조건인 평균 60이상을 만족하면 합격을 불만족하면 불합격을 출력하도록 하는 분기문.
			System.out.println("합격");
		else
			System.out.println("불합격");
	}
}
