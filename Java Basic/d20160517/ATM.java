package d20160517;

// Class�� ����Ϸ��� ���� ���̹Ƿ� private�� �� �� ����.
public class ATM {
	// Member Variable
	private String account; // ���¹�ȣ
	private int balance; // �ܰ�, �ܺο��� �ܰ� ���� ������ �� ������ private keyword�� ����
	// ���⿡�� private�� ���� keyword�� ���� ������, ����������, ���� ������ ���̶� �θ���.
	// private: ���� class �������� ��� ����.
	// default: ���� package �������� ��� ����, �ƹ� �͵� ���� ������ default�� ����ȴ�.
	// protected: ��� ���迡 ������ ��� ����.
	// public: ����.
	// ����: private < default < protected < public
	// => ĸ��ȭ.
	
	// Member Method
	public void setAccount(String account)
	{
		this.account = account;
	}
	
	public String getAccount()
	{
		return this.account;
	}
	
	public void setBalance(int balance)
	{
		// ���� �����ϴ� Method.
		
		this.balance = balance;
	}
	public int getBalance()
	{
		// ���� ����ϱ� ���� �������µ� ���Ǵ� Method.
		return balance;
	}
	void deposit(int money)
	{
		// �Ա��� ���� Method.
		this.balance += money; // �ܰ� �Աݵ� �ݾ��� �����ش�.
		// �Ա� ���� �� �ܾ� Ȯ��.
		System.out.println(money + "�� �ԱݵǾ����ϴ�.");
		System.out.println("���� �ܾ��� " + this.balance + "���Դϴ�.");		
	}
	
	void withDraw(int money)
	{
		// ����� ���� Method.
		if(this.balance > money)
		{
			this.balance -= money; // �ܰ��� ��ݵ� �ݾ��� ���ش�.
			// ��� ���� �� �ܾ� Ȯ��.
			System.out.println(money + "�� ��ݵǾ����ϴ�.");
			System.out.println("���� �ܾ��� " + this.balance + "���Դϴ�.");
		}
		else // ��� ���� �ܾ��� ������ ���� �ʵ��� �ϱ� �� ����.
		{
			System.out.println("�ܾ��� �����մϴ�.");
		}
	}
}
