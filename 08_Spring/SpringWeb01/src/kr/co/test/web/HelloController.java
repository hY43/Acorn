package kr.co.test.web;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

public class HelloController implements Controller{

	@Override
	public ModelAndView handleRequest(HttpServletRequest req, HttpServletResponse resp) throws Exception {
		// Model: data
		// View: 찾아갈 View의 이름
		ModelAndView mav = new ModelAndView();
		mav.addObject("msg", "안녕하세요");
		// req.setAttribute("msg", "안녕하세요") 와 같은 기능을 하는 문장.
		mav.setViewName("hello");
		// /hello.jsp
		return mav;
	}

}
