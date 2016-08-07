package d20160527;

public class ATM {
	/* Member Variable */
	private String account;
	private int balance;
	
	/* Constructor */
	public ATM(){}
	public ATM(String account, int balance){
		this.account = account;
		this.balance = balance;
	}
	/* Get/Set Method */
	public String getAccount(){return account;}
	public void setAccount(String account){this.account = account;}
	public int getBalance(){return balance;}
	public void setBalance(int balance){this.balance = balance;}
	
	/* Member Method */
	// T, ���ÿ� ���� ���� �۾��ϴ� ���� �߻��Ǵ� ���� (DB) lock => (JAVA) synchronized
	// �Ѱ� ��ü�� ���� Thread�� �Ѳ����� �����ϸ� ������ �߸� ����� ���ִµ� �̶� ����ȭ(Synchronized) Method�� �����ϸ�
	// �Ѱ� Thread�� �� Method�� �����ϸ� �ٸ� Thread�� �ش� Thread�� �۾��� ���� ������ �� Method�� ������ �� ����.
	// �ٸ� Thread�� Wait ����.
	public synchronized void deposit(int money)
	{
		this.balance += money;
		System.out.println(money + "�� �Ա��մϴ�.");
		System.out.println("�ܾ� : " + this.balance);
	}
	
	public synchronized void withDraw(int money)
	{
		if(this.balance >= money){
			this.balance -= money;
			System.out.println(money + "�� ����մϴ�.");
		}else{
			System.out.println("�ܾ��� �����մϴ�.");
		}
		System.out.println("�ܾ� : " + this.balance);
	}
}
