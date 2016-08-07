package d20160519;

public class Gun implements Weapon{
	/* Member Variable */
	int MAX_BULLET;
	int CUR_BULLET;
		
	/* Constructor */
	
	Gun()
	{
		MAX_BULLET = 8;
		CUR_BULLET = 8;
	}
	
	/* Member Method */
	@Override
	public void use() {
		// Weapon Interface¿« √ﬂªÛ ∏ﬁº≠µÂ¿Œ use∏¶ ±∏«ˆ.
		if(CUR_BULLET > 0)
		{
			System.out.println("≈¡≈¡");
			this.CUR_BULLET -= 1;
		}
		else
			System.out.println("∆Ω!");
	}
	@Override
	public void reuse() {
		System.out.println("reload ");
		this.CUR_BULLET = this.MAX_BULLET;
	}
	@Override
	public void drop() {
		// TODO Auto-generated method stub
		
	}
	
	
}
