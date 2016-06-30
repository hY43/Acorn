package vo;

public class ProductVO {
	/* Member Variable */
	private int pNo; // primary key
	private String pName;
	private int price;
	private int quantity;
	private String imgFile;
	private String pDesc;
	
	/* Constructor */
	public ProductVO(int pno, String pname, int price, int quantity, String imgfile, String pdesc) {
		super();
		this.pNo = pno;
		this.pName = pname;
		this.price = price;
		this.quantity = quantity;
		this.imgFile = imgfile;
		this.pDesc = pdesc;
	}

	/* Get/Set Method */
	public int getPno(){return pNo;}
	public void setPno(int pno){this.pNo = pno;}
	public String getPname(){return pName;}
	public void setPname(String pname){this.pName = pname;}
	public int getPrice(){return price;}
	public void setPrice(int price){this.price = price;}
	public int getQuantity(){return quantity;}
	public void setQuantity(int quantity){this.quantity = quantity;}
	public String getImgfile(){return imgFile;}
	public void setImgfile(String imgfile){this.imgFile = imgfile;}
	public String getPDesc(){return pDesc;}
	public void setPDesc(String pDesc){this.pDesc = pDesc;}

}
