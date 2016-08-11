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
import Action.DeleteAllOkAction;
import Action.DeleteOkAction;
import Action.DetailAction;
import Action.ListAction;
import Action.ModifyFormAction;
import Action.ModifyOkAction;
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
		
		// 사용자 요청 처리를 위한 cmd parameter 저장.
		String cmd = req.getParameter("cmd");
		// 사용자에게 보여줄 view의 url
		String url = "";
		// Model을 통합할 Action Interface 선언.
		Action action = null;
		
		if(cmd == null || cmd.equals("list")){
			// 최초 접근이거나(null), 게시판의 목록을 보고자 할때(list) 생성할 ListAction 객체를 위한 분기문.
			action = new ListAction();
			// board/list.jsp 로 이동(pram: 목록페이지)
		}else if(cmd.equals("writeForm")){
			// 글 작성 로직을 가진 WriteFormAction 객체 생성을 위한 분기문.
			action = new WriteFormAction();
		}else if(cmd.equals("writeOk")){
			// WriteFormAction을 통해 작성된 값을 실제 Database에 저장하는 로직을 가진 WriteOkAction 객체 생성을 위한 분기문.
			action = new WriteOkAction();
		}else if(cmd.equals("detail")){
			// list에서 특정 게시물을 상세보기 로직을 가진 DetailAction 객체 생성을 위한 분기문. 
			action = new DetailAction();
		}else if(cmd.equals("modifyForm")){
			// 게시물 수정의 로직을 가진 ModifyFormAction 객체 생성을 위한 분기문.
			action = new ModifyFormAction();
		}else if(cmd.equals("modifyOk")){
			// 게시물 수정 후, 실제 데이터베이스에 데이터를 입력하는 로직을 가진 modifyOkAction 객체 생성을 위한 분기문.
			action = new ModifyOkAction();
		}else if(cmd.equals("deleteOk")){
			// 게시물에 대한 삭제 로직을 가진 deleteOkAction 객체 생성을 위한 분기문.
			action = new DeleteOkAction();
		}else if(cmd.equals("deleteAll")){
			// 체크 박스에 의해 선택된 게시물 삭제에 대한 로직을 가진 deleteAllAction 객체 생성을 위한 분기문.
			action = new DeleteAllOkAction();
		}
		// 각 로직에 해당되는 객체 생성 후, 그 객체의 execute Method 호출
		url = action.execute(req, resp);
		// 각 Model 객체에서 반환되는 url로 이동.
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
