package d20160517;
//Quiz5 : Medic 객체를  모델링하여 Medic 클래스로 작성하고
//			이 클래스로   객체를 생성한다. 
//			(단 다양한 매개변수를 갖는 생성자를 포함해야한다)

public class Medic 
{
	// 멤버 변수 선언.
	int 공격속도, HP, MP, 이동속도, 사거리, x, y;
	String 성별, 이름;
	boolean isHeal;
	
	// 생성자.
	// 기본 생성자.
	Medic()
	{
		이름 = "모랄레스";
		공격속도 = 3;
		성별 = "여";
		HP = 80;
		MP = 80;
		이동속도 = 4;
		사거리 = 2;
		x = 0;
		y = 0;
	}
	
	// HP, MP, 사거리를 매개 변수로 갖는 생성자.
	Medic(int HP, int MP, int 사거리)
	{
		// 기본 생성자를 호출해서 초기화하고 변동 값만 바꿔주면 편하겠지?
		this();
		this.HP = HP;
		this.MP = MP;
		this.사거리 = 사거리;
	}

	// HP, MP, 사거리, 이름을 매개 변수로 갖는 생성자.
	Medic(int HP, int 사거리, String 이름, int MP)
	{
		this(HP, MP, 사거리); // 코드의 간결함을 위해 다른 생성자 역시 함께 이용해서 초기화 한다.
		this.이름 = 이름;
	}
	
	// Method
	void 힐() 
	{
		if(MP>10)
		{
			MP -= 10;
			System.out.println("치료중입니다.");
		} else 
		{
			System.out.println("마나가..부족해..");
		}
		
	}
	
	void 상태정보()
	{
		System.out.println("===상태정보===");
		System.out.println("이름 = "+ 이름);
		System.out.println("HP = " + HP);
		System.out.println("MP = " + MP);
		System.out.println("성별 = "+ 성별);
		System.out.println("이동 속도 = " + 이동속도);
		System.out.println("사거리 = " + 사거리);	
		System.out.println("==========");
	}
}
