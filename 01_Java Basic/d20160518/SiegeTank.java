package d20160518;

public class SiegeTank extends Terran{

	int ���ݷ�;

	public SiegeTank(){
		���ݷ�=50;
	}


	void ����(Terran st) {
		System.out.println("���� �Ű������� �ִ� �޼ҵ�");
		System.out.println("st : " + st);
		st.hp -= ���ݷ�;
		System.out.println("�εεεε�");
	}
}
