package action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.MemoDAO;

public class ModyfyOkAction implements Action {

	@Override
	public String execute(HttpServletRequest req, HttpServletResponse resp) {
		MemoDAO dao = new MemoDAO();
		String password = req.getParameter("pw");
		String contents = req.getParameter("contents");
		int no = Integer.parseInt(req.getParameter("no"));
		
		String pw = dao.searchPw(no);
		if(password.equals(pw)){
			dao.updateOne(no, contents);
		}
		return "memo.do?cmd=list";
	}

}
