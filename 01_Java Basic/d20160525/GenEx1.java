package d20160525;
// ��Ȯ�� Ÿ��: T
public class GenEx1<T> {
	// Ŭ���� ���� ��ÿ� �ڷ����� Ȯ������ ���� ��Ȯ�� Ÿ������ ���⿡ ���߿� �ڷ����� ���� �ž߶�� ���� ����Ѵ�.
	// �׸��� ������ Ư���� ã�Ƽ� �Ϲ�ȭ ��Ų��.
	// �ϳ��� Class�� �������� �ڷ����� ��Ī�Ͽ� ����� �� �ְ� �ȴ�.
	// Generic: �ڷ����� ������ �ÿ� �����ϴ� ���� �ƴ϶� Runtime �������� �����ϵ��� �Ϲ�ȭ ��Ŵ. ���������� ���Ǽ�.
	
	T[] str;
	
	public void setArray(T[] str)
	{
		this.str = str;
	}
	public void print()
	{
		for(T x : str)
			System.out.println(x);
	}
}
