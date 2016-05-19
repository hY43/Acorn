package d20160517;

// 마린 Class Start.
public class 마린 {
	// Member variable, Global variable.
	int hp;
	int x;
	int y;
	int 공격력;
	int 공격속도;
	int 이동속도;
	int 방어력;
	int 사정거리;
	int 단가;
	boolean isSteamPack;
	
	// Default Constructor.
	public 마린(){
		// 생성자
		// 1. Class 명과 동일.
		// 2. 목적: 멤버 변수의 초기화.
		// 3. 리턴 값 x, void x
		// 4. 클래스 명 ==> 첫글자 대문자, 생성자 명 ==> 첫글자 대문자.
		hp = 100; 
		x = 252;
		y = 466;
		공격력 = 14;
		공격속도 = 140;
		단가 = 34;
		방어력 = 10;
		사정거리 = 50;
		이동속도 = 15;
	}
	
	public 마린(int hp) // Constructor Overloading.
	{
		this.hp = hp; // 전역 변수를 가리키는 this keyword를 이용하여 생성자 내의 지역 변수 hp가 아닌 전역 변수 hp에 전달 받은 매개 변수 값을 대입한다.
		// this: 자기 자신을 가리키는 참조 변수.
		// 다른 속성 값은 그대로 두고 hp만 다른 값으로 하고자 한다.
		
		// 이 이하의 변수는 원래 this가 다 붙어있는 전역 변수이나, 같은 변수 명이 없어서 혼동이 되지 않는 경우에는 this는 생략해도 무방하다.
		x = 252;
		y = 466;
		공격력 = 14;
		공격속도 = 140;
		단가 = 34;
		방어력 = 10;
		사정거리 = 50;
		이동속도 = 15;
		
		// 위와 같은 방법으로 매 생성자마다 적어주면 아주 번거롭다.
		// 때문에 기본 생성자를 호출하여(this()) 전체를 초기화 시키고, 변경하고자 하는 값만 따로 초기화 시키는 것이 좋다.
	}
	// Member Method.
	void 공격()
	{
		System.out.println("마린 매개 변수가 없는 method");
		System.out.println("두두두두두두두두");
	}

	void 공격(마린 m)// 공격 대상을 마린으로 줬을 때 사용될 공격 Method
	{
		System.out.println("마린 매개 변수가 있는 method");
		System.out.println("m: " + m);
		m.hp -= this.공격력;
		System.out.println("두두두두두두두두");
	}
	
	void 공격(Medic m)// 공격 대상을 메딕으로 줬을때 사용될 공격 Method
	{
		System.out.println("메딕 매개 변수가 있는 method");
		System.out.println("m: " + m);
		m.HP -= this.공격력;
		System.out.println("두두두두두두두두");
	}

	
	void 이동(){System.out.println("고고고");}
	void 패트롤(){System.out.println("와리가리");}
	void 스팀팩()
	{
		if (isSteamPack == false && hp >= 5) 
		{
			System.out.println("뿅");
			공격력 += 3;
			공격속도 += 3;
			hp -= 5;
			isSteamPack = true;
		}
	}
	void 홀드(){System.out.println("얼어라");}
	void 상태정보()
	{
		System.out.println("====================");
		System.out.println("체력: " + hp);
		System.out.println("공격력: " + 공격력);
		System.out.println("공격속도: " + 공격속도);
		System.out.println("x: " + x);
		System.out.println("y: " + y);
	}
}
// 마린 Class End.