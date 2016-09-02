package kr.co.test.web.control;

import org.springframework.stereotype.Service;
import org.springframework.validation.Errors;
import org.springframework.validation.Validator;
import org.springframework.web.multipart.MultipartFile;

// 올바른 파일인지 검사(유효성 검사), validate
@Service("fileValidator")
public class FileValidator implements Validator {

	@Override
	public boolean supports(Class<?> clazz) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void validate(Object target, Errors errors) {
		// 검사 대상: target
		// 이때 발생하는 에러 : errors
		UploadFile file = (UploadFile)target;
		MultipartFile mf = file.getFile();
		
		if(mf.getSize() == 0){
			// 파일의 사이즈 0 x
			errors.rejectValue("file", null, "파일을 선택해주세요");
		}else if(mf.getSize() >= 104857600){
			// 너무 크면 x
			errors.rejectValue("file", null, "100MB 이하의 파일만 전송 가능합니다.");
		}
	}
}
