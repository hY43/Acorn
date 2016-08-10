package action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.MemoDAO;

public class WriteOkAction implements Action {

	@Override
	public String execute(HttpServletRequest req, HttpServletResponse resp) {
		MemoDAO dao = new MemoDAO();
		String writer = req.getParameter("writer");
		String pw = req.getParameter("pw");
		String contents = req.getParameter("contents");
		dao.insertOne(writer, contents, pw);
		
		return "memo.do?cmd=list";
	}

}
