package d20160517;

public class GuGuDan {
// 구구단의 각 단을 출력하는 Class
	// Member Variable.
	int dan; // 단을 입력 받기 위한 int Type 멤버 변수 dan 선언.
	
	// constructor
	GuGuDan()
	{
		// 따로 단을 입력해주지 않으면 2단 입력.
		dan = 2;
	}
	
	GuGuDan(int dan)
	{
		// 단을 입력하면 해당 단 입력.
		this.dan = dan;
	}
	
	// Member Method.
	void print()
	{
		for(int i=1;i<=9;i++)
		{
			// System.out.printf("%d * %d = %d\n", dan, i, dan*i);
			System.out.println(this.dan + " * " + i + " = " + (this.dan * i));
		}

	}
}
