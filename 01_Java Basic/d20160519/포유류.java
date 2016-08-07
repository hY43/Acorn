package d20160519;

public abstract class 포유류 {
	int 눈;
	int 코;
	int 입;
	
	포유류()
	{
		눈 = 2;
		코 = 1;
		입 = 1;
	}
	
	public abstract void 먹기(); // 이 Method는 반드시 Override해서 써야해!!
	public abstract void 자기();
}
