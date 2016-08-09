package Action;

import java.util.ArrayList;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.BoardDAO;
import vo.BoardVO;

public class ListAction implements Action {

	@Override
	public String execute(HttpServletRequest req, HttpServletResponse resp) {
		// Board Table의 모든 데이터를 얻어오는 selectAll Method 호출 후, 그 결과를 ArrayList에 저장.
		BoardDAO dao = new BoardDAO();
		ArrayList<BoardVO> list = dao.selectAll();
		// 저장된 List를 setAttribute를 통해 전달.
		req.setAttribute("list", list);
		// 결과를 보여주기 위한 View의 url을 반환한다.
		return "board/list.jsp";

	}
}
