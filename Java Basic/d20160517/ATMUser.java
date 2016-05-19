package d20160517;

public class ATMUser {
	public static void main(String[] args)
	{
		ATM a = new ATM();
		a.setAccount("394-02-224731");
		a.setBalance(9999);
		
		System.out.println("°èÁÂ ¹øÈ£: " + a.getAccount());
		System.out.println("ÀÜ     ¾×: " + a.getBalance());	
	}
}
