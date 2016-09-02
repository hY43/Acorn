package kr.co.test.web.control;

import java.io.File;
import java.io.IOException;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class FileUploadController {
/*	// 1. upload/upload.do라는 요청이 오면
	@RequestMapping("upload/upload.do")
	public String uploadForm(){
		// 2. /WEB-INF/view/upload/form.jsp로 가
		return "upload/form";
	}*/
	@Autowired
	FileValidator fileValidator;
	
	@RequestMapping(value="/upload/upload.do", method=RequestMethod.GET)
	public String uploadForm(){
		return "upload/form";
	}
	
	@RequestMapping(value="/upload/upload.do", method=RequestMethod.POST)
	public ModelAndView uploading(@ModelAttribute("uploadFile")UploadFile uploadfile, HttpServletRequest req, BindingResult result){
		// 업로드한 파일 객체 가져오기
		// 내부적으로 임의의 경로에 파일을 보관해둔다.
		MultipartFile file = uploadfile.getFile();
		System.out.println("file: " + file);
		// 어디에 저장?
		HttpSession hs = req.getSession();
		/*servlet의 내장 객체 application*/
		ServletContext application = hs.getServletContext();
		String filePath = application.getRealPath("/WEB-INF/data");
		System.out.println("진짜 파일이 저장될 OS 경로: " + filePath);
		
		// 파일 유효성 검사 후, 성공하면 작업 계속하고 실패하면 중단.
		fileValidator.validate(uploadfile, result);
		if(result.hasErrors()){
			// 다시 돌아가...
			return new ModelAndView("upload/form");
		}
		// 파일의 원본 이름
		String fileName = file.getOriginalFilename();
		File f = new File(filePath + "/" + fileName);
		// 임시 저장소에 보관한 파일을 저장하고자 하는 경로에 복사
		try {
			file.transferTo(f);
		} catch (IllegalStateException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return new ModelAndView("upload/uploadFile", "fileName", f.getName());
	}

}
