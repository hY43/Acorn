package Action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.BoardDAO;

public class DeleteAllOkAction implements Action {

	@Override
	public String execute(HttpServletRequest req, HttpServletResponse resp) {
		String[] list = req.getParameterValues("selCheck");
		BoardDAO dao = new BoardDAO();
		
		for(String no : list){
			int bno = Integer.parseInt(no);
			dao.deleteOne(bno);
		}
		return "board.do?cmd=list";
	}

}
