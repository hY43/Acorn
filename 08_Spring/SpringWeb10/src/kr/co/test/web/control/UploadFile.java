package kr.co.test.web.control;

import org.springframework.web.multipart.MultipartFile;

// dto
public class UploadFile {
	/*Member Variable*/
	private MultipartFile file;

	/*Constructor*/
	public UploadFile(){}
	
	public UploadFile(MultipartFile file) {
		super();
		this.file = file;
	}

	/*Get/Set Method*/
	public MultipartFile getFile() {
		return file;
	}

	public void setFile(MultipartFile file) {
		this.file = file;
	}
	
}
