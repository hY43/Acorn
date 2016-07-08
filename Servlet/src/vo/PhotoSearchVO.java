package vo;

public class PhotoSearchVO {
	private String name;
	private String imgPath;
	
	public PhotoSearchVO(){}
	public PhotoSearchVO(String name, String imgPath) {
		super();
		this.name = name;
		this.imgPath = imgPath;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getImgPath() {
		return imgPath;
	}
	public void setImgPath(String imgPath) {
		this.imgPath = imgPath;
	}
	
	
}
