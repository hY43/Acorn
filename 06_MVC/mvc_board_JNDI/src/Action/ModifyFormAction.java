package Action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.BoardDAO;
import vo.BoardVO;

public class ModifyFormAction implements Action {

	@Override
	public String execute(HttpServletRequest req, HttpServletResponse resp) {
		String n = req.getParameter("bno");
		
		if(n!=null || !n.equals("")){
			int bno = Integer.parseInt(n);
			BoardDAO dao = new BoardDAO();
			BoardVO vo = dao.selectOne(bno);
			req.setAttribute("vo", vo);
		}
		return "board/modifyForm.jsp";
	}

}
