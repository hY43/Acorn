package d20160519;

public class Åä³¢ extends Æ÷À¯·ù{
	/* Member Variable */
	int ±Í;
	String Á¾; 
	
	/* Constructor */
	Åä³¢()
	{
		±Í = 2;
		Á¾ = "¾Ó°í¶ó";
	}
	
	/* Member Method */
	public void Á¡ÇÁ(){
		System.out.println("±øÃÑ±øÃÑ ¶Ù¾î¿ä");
	}
	@Override
	public void ¸Ô±â(){
		System.out.println("Ç®À» ¸Ô¾î¿ä");
	}
	@Override
	public void ÀÚ±â(){
		System.out.println("µéÆÇ¿¡¼­ ÀÚ¿ä");
	}
}
