package kr.co.test.web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import kr.co.test.web.dao.Dao;
import kr.co.test.web.dto.BoardDTO;

@Controller
public class BoardController {
	@Autowired
	Dao dao;
	@RequestMapping("/list.do")
	public ModelAndView boardList(@RequestParam(value="currentPage", defaultValue="1")int currentPage){
		// 총데이터의 개수
		int total = dao.getTotal();
		int startNo = (currentPage-1)*10+1;
		int endNo = currentPage*10;
		int totalPage = total/10;
		int startPage = (currentPage-5<=0) ? 1 : currentPage-5;
		int endPage = (startPage+10 >= totalPage) ? totalPage : startPage+10;

		return new ModelAndView("list","list", dao.selectList(startNo, endNo));
	}
		
	@RequestMapping("/writeForm.do")
	public String writeForm(){
		return "writeForm";
	}
	@RequestMapping("/writeOk.do")
	public String writeOk(@ModelAttribute("dto")BoardDTO dto){
		dao.insertOne(dto);
		return "redirect:/list.do";
	}
	@RequestMapping("/detail.do")
	public ModelAndView detail(@RequestParam("no")int no) {
		return new ModelAndView("detail","dto", dao.selectOne(no));
	}
	@RequestMapping("/modify.do")
	public ModelAndView modifyForm(@RequestParam("no")int no){
		BoardDTO dto = dao.selectOne(no);
		return new ModelAndView("modifyForm", "dto", dto);
	}
	@RequestMapping("/modifyOk.do")
	public String modifyOk(@ModelAttribute("dto")BoardDTO dto){
		dao.updateOne(dto);
		return "redirect:/list.do";
	}
	@RequestMapping("/deleteAll.do")
	public String deleteAll(@RequestParam("no")int[] no){
		for(int i : no){
			dao.deleteOne(i);
		}
		return "redirect:list.do";
	}
	@RequestMapping("/delete.do")
	public String deleteOk(int no){
		dao.deleteOne(no);
		return "redirect:/list.do";
	}
}