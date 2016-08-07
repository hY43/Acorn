package hw20160519;

public class Triangle {
	/* Member Variable */
	private int width;
	private int height;
	
	/* Getter/Setter Method */
	public int getWidth() {return width;}
	public void setWidth(int width) {this.width = width;}
	public int getHeight() {return height;}
	public void setHeight(int height) {this.height = height;}
	
	/* Member Method */
	int getCalArea()
	{
		return ((width * height)/2);
	}
	
}
