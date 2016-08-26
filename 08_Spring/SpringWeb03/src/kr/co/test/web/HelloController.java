package kr.co.test.web;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

public class HelloController implements Controller{

	@Override
	public ModelAndView handleRequest(HttpServletRequest req, HttpServletResponse resp) throws Exception {
		ModelAndView mav = new ModelAndView();
		mav.addObject("msg", "아이스크림 먹은게 기억이 안나요");
		mav.setViewName("hello");
		return mav;
	}

}
