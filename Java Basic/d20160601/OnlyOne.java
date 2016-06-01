package d20160601;

// + Singleton Design Pattern
// 1. �ϳ��� ��ü���� �����ϱ� ���� ����
// 2. ���� ���迡�� �����ϴ� ��ü�� ������ ��ü�� �ֵ���, ���� ���迡���� ������ ��ü�� �����ؼ� ����� �������� ����.
// + ���
// 1. �������� ���� �����ڸ� private
// 2. Ŭ���� �ȿ��� �ڽ��� ��ü�� �����Ѵ�.
// 3. �ܺο��� OnlyOne ��ü�� �����ϴ� �޼��带 �����Ѵ�.

public class OnlyOne {
	static OnlyOne oo = new OnlyOne();
	private OnlyOne(){}
	public static OnlyOne getInstance(){
		return oo;
	}
}
