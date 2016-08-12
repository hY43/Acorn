package action;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


import dao.MemoDAO;

import vo.MemoVO;
import vo.PageVO;

public class ListAction implements Action {

	@Override
	public String execute(HttpServletRequest req, HttpServletResponse resp) {
		MemoDAO dao = new MemoDAO();
		String cp = req.getParameter("currentPage");
		String cpp = req.getParameter("countPerPage");
		int countPerPage = 5;
		int currentPage = 1;
		if(cp != null){
			currentPage = Integer.parseInt(cp);
		}
		if(cpp != null){
			countPerPage = Integer.parseInt(cpp);
		}
		int totalCount = dao.getTotal();

		PageVO vo = new PageVO(currentPage, totalCount, countPerPage);
		List<MemoVO> list = dao.selectAll(vo.getStartNo(),vo.getEndNo());
		req.setAttribute("list", list);
		req.setAttribute("pageVO", vo);
		return "memo/list.jsp";

	}

}
