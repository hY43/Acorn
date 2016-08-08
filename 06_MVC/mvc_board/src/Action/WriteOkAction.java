package Action;

import java.io.UnsupportedEncodingException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.BoardDAO;

public class WriteOkAction implements Action {

	@Override
	public String execute(HttpServletRequest req, HttpServletResponse resp) {
		try {
			req.setCharacterEncoding("UTF-8");
		} catch (UnsupportedEncodingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		resp.setContentType("text/html;charset=UTF-8");
		String writer = req.getParameter("writer");
		String contents = req.getParameter("contents");
		String title = req.getParameter("title");
		BoardDAO dao = new BoardDAO();
		dao.insertOne(writer, title, contents);
		return "board.do?cmd=list";
	}

}
