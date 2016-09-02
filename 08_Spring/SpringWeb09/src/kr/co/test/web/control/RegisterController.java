package kr.co.test.web.control;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import kr.co.test.web.dao.MemberDAO;
import kr.co.test.web.dto.MemberDTO;

@Controller
public class RegisterController {
	// jsp와는 달리 RequestMapping은 절대 경로로 적어주어야 한다.
	@RequestMapping("/reg/registerOk.do")
	public String registerOk(@ModelAttribute("dto")MemberDTO dto){
		MemberDAO dao = new MemberDAO();
		dao.insertOne(dto);
		
		// 페이지 이동 방식(forward/redirect) 중, 스프링에서 redirect 방식을 사용하는 방식은 아래와 같다.
		return "redirect:/login.do";		
	}
}
