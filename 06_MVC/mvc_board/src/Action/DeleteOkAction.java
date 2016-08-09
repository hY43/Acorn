package Action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.BoardDAO;

public class DeleteOkAction implements Action {

	@Override
	public String execute(HttpServletRequest req, HttpServletResponse resp) {
		String no = req.getParameter("bno");
		if(no != null){
			int bno = Integer.parseInt(no);
			BoardDAO dao = new BoardDAO();
			dao.deleteOne(bno);
		}
		return "board.do?cmd=list";
	}

}
