package d20160518;

public class ���� extends Terran {

	// �������,��������
	int ���ݷ�;
	boolean isSteamPack;

	public ����() {
		hp = 200;
		x = 0;
		y = 0;
		���ݷ� = 50;
		���� = 30;
		�ܰ� = 50;
	}

	public ����(int hp) {
		this.hp = hp;
		this.x = 0;
		y = 0;
		���ݷ� = 50;
		���� = 30;
		�ܰ� = 50;
	}

	void ����(Terran st) {
		System.out.println("���� �Ű������� �ִ� �޼ҵ�");
		System.out.println("st : " + st);
		st.hp -= ���ݷ�;
		System.out.println("�εεεε�");
	}
	
	void ������() {
		if (isSteamPack == false && hp > 5) {
			isSteamPack = true;
			System.out.println("��~~~~");
			���ݷ� += 3;
			���ݼӵ� += 3;
			hp -= 5;
		}
	}

}
