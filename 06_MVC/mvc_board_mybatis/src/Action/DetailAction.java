package Action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.BoardDAO;
import vo.BoardVO;

public class DetailAction implements Action {
	@Override
	public String execute(HttpServletRequest req, HttpServletResponse resp) {
		// 특정 게시물에 대한 상세 보기를 위한 로직 처리 Method
		String n = req.getParameter("bno");
		// 
		if(n != null){
			int bno = Integer.parseInt(n);
			BoardDAO dao = new BoardDAO();
			BoardVO vo = dao.selectOne(bno);
			dao.raiseHits(bno);
			req.setAttribute("vo", vo);
		}
		return "board/detail.jsp";
	}

}
