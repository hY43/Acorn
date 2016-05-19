package d20160516;

public class 원숭이 {
	int 나이;
	int 꼬리;
	int 귀;
	int 눈;
	int 코;
	int 입;
	String 성별;
	String 종류;
	
	원숭이()
	{
		성별 = "숫컷";
		나이 = 10;
	}
	
	원숭이(int a, String str1, String str2)
	{
		나이 = a;
		성별 = str1;
		종류 = str2;
	}

	void 나무타기(){}
	void 먹기() { System.out.println("바나나 먹는다."); }
	void 걷기() {}
	void 자기() {}
}
