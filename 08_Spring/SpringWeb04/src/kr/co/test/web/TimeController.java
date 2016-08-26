package kr.co.test.web;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

public class TimeController implements Controller{

	@Override
	public ModelAndView handleRequest(HttpServletRequest arg0, HttpServletResponse arg1) throws Exception {
		ModelAndView mav = new ModelAndView();
		mav.addObject("msg", getTime());
		mav.setViewName("time");
		return mav;
	}

	private String getTime() {
		Date d = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("YYYY-MM-dd, HH:mm:ss");
		
		return sdf.format(d);
	}
	
}
