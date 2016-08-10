package action;

import java.util.ArrayList;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.MemoDAO;
import vo.MemoVO;

public class ListAction implements Action {

	@Override
	public String execute(HttpServletRequest req, HttpServletResponse resp) {
		MemoDAO dao = new MemoDAO();
		ArrayList<MemoVO> list = dao.selectAll();
		req.setAttribute("list", list);
		return "memo/list.jsp";
	}

}
