package kr.co.test.web.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import kr.co.test.web.dao.Dao;
import kr.co.test.web.dto.EmpDTO;

@Controller
public class EmpController{
	@Autowired
	Dao dao;
	@RequestMapping("/empList.do")
	public ModelAndView list(){
		
		return new ModelAndView("list", "list", dao.selectAll());
	}
	
	@RequestMapping(value="/add.do", method=RequestMethod.GET)
	public String insertForm(){
		return "insertForm";
	}
	
	@RequestMapping(value="/add.do", method=RequestMethod.POST)
	public String insertOk(HttpServletRequest req, @ModelAttribute("EmpDTO")EmpDTO dto){
		/*EmpDTO dto = new EmpDTO(Integer.parseInt(req.getParameter("empno")), req.getParameter("ename"), Integer.parseInt(req.getParameter("deptno")));*/
		dao.insertOne(dto);
		return "redirect:/empList.do";
	}
}
