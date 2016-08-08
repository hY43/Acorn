package control;

import java.io.IOException;
import java.io.UnsupportedEncodingException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Action.Action;
import Action.DetailAction;
import Action.ListAction;
import Action.WriteFormAction;
import Action.WriteOkAction;

@WebServlet("/board.do")
public class MyController extends HttpServlet{
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		doProcess(req, resp);
	}
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		doProcess(req, resp);
	}
	private void doProcess(HttpServletRequest req, HttpServletResponse resp) throws UnsupportedEncodingException {
		// 한글처리
		req.setCharacterEncoding("UTF-8");
		resp.setContentType("text/html;charset=UTF-8");
		String cmd = req.getParameter("cmd");
		String bno = req.getParameter("bno");
		String url = "";
		Action action = null;
		
		if(cmd == null || cmd.equals("list")){
			action = new ListAction();
			// board/list.jsp 로 이동(pram: 목록페이지)
		}else if(cmd.equals("writeForm")){
			action = new WriteFormAction();
		}else if(cmd.equals("writeOk")){
			action = new WriteOkAction();
		}else if(cmd.equals("detail")){
			action = new DetailAction();
		}
			
		url = action.execute(req, resp);
		// 이동
		RequestDispatcher rd = req.getRequestDispatcher(url);
		try {
			rd.forward(req, resp);
		} catch (ServletException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
}
