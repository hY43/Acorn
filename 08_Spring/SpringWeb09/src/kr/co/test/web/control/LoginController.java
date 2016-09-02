package kr.co.test.web.control;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import kr.co.test.web.dto.MemberDTO;

@Controller
public class LoginController {
	@RequestMapping("/loginOk.do")
	public ModelAndView loginOk(@ModelAttribute("dto")MemberDTO dto){
		// DB 연결
		// 로그인 성공
		
		return new ModelAndView("index", "dto", dto);
	}
}
