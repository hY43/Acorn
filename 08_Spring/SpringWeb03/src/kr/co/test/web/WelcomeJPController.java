package kr.co.test.web;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

public class WelcomeJPController implements Hello, Controller{
	private String name;
	
	public void setName(String name) {
		this.name = name;
	}

	@Override
	public ModelAndView handleRequest(HttpServletRequest arg0, HttpServletResponse arg1) throws Exception {
		ModelAndView mav = new ModelAndView();
		mav.addObject("msg", sayHello());
		mav.setViewName("jpwelcome");
		return mav;
	}

	@Override
	public String sayHello() {
		return (name + " こんにちは。");
	}

}
