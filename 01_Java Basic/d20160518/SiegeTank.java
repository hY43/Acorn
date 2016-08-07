package d20160518;

public class SiegeTank extends Terran{

	int 공격력;

	public SiegeTank(){
		공격력=50;
	}


	void 공격(Terran st) {
		System.out.println("마린 매개변수가 있는 메소드");
		System.out.println("st : " + st);
		st.hp -= 공격력;
		System.out.println("두두두두두");
	}
}
