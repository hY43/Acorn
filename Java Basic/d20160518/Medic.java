package d20160518;

public class Medic extends Terran {
	String ����, �̸�;
	int mp;
	boolean isHeal;

	Medic() {
		�̸� = "�������";
		���ݼӵ� = 3;
		���� = "��";
		�̵��ӵ� = 4;
		x = 0;
		y = 0;
	}

	Medic(int HP, int MP, int ��Ÿ�) {
		this();
		this.�����Ÿ� = ��Ÿ�;
	}

	Medic(int HP, int MP, int ��Ÿ�, String �̸�) {
		this(HP, MP, ��Ÿ�);
		this.�̸� = �̸�;
	}

	void ��(Terran te) {
		if (mp > 10) {
			mp -= 10;
			System.out.println("ġ�����Դϴ�.");
		} else {
			System.out.println("������..������..");
		}

	}

}
