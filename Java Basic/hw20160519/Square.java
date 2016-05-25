package hw20160519;

public class Square extends Figure {
	private int width;
	private int height;

	public int getWidth() {return width;}
	public void setWidth(int width) {this.width = width;}
	public int getHeight() {return height;}
	public void setHeight(int height) {this.height = height;}

	public int getCalArea() {
		return width * height;
	}
}
