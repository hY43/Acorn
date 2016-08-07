package d20160517;

// Class는 사용하려고 만든 것이므로 private이 될 수 없다.
public class ATM {
	// Member Variable
	private String account; // 계좌번호
	private int balance; // 잔고, 외부에서 잔고에 직접 접근할 수 없도록 private keyword를 붙임
	// 여기에서 private과 같은 keyword를 접근 지정자, 접근한정자, 접근 수정자 등이라 부른다.
	// private: 현재 class 내에서만 사용 가능.
	// default: 같은 package 내에서만 사용 가능, 아무 것도 쓰지 않으면 default로 선언된다.
	// protected: 상속 관계에 있으면 사용 가능.
	// public: 공용.
	// 범위: private < default < protected < public
	// => 캡슐화.
	
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
		// 값을 지정하는 Method.
		
		this.balance = balance;
	}
	public int getBalance()
	{
		// 값을 사용하기 위해 가져오는데 사용되는 Method.
		return balance;
	}
	void deposit(int money)
	{
		// 입금을 위한 Method.
		this.balance += money; // 잔고에 입금된 금액을 더해준다.
		// 입금 내역 및 잔액 확인.
		System.out.println(money + "원 입금되었습니다.");
		System.out.println("현재 잔액은 " + this.balance + "원입니다.");		
	}
	
	void withDraw(int money)
	{
		// 출금을 위한 Method.
		if(this.balance > money)
		{
			this.balance -= money; // 잔고에서 출금된 금액을 빼준다.
			// 출금 내역 및 잔액 확인.
			System.out.println(money + "원 출금되었습니다.");
			System.out.println("현재 잔액은 " + this.balance + "원입니다.");
		}
		else // 출금 후의 잔액이 음수가 되지 않도록 하기 한 조건.
		{
			System.out.println("잔액이 부족합니다.");
		}
	}
}
