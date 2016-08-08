package Action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
// 뭔가를 실행하고 결과를 request 객체에 속성으로 담고 url에 리턴.
public interface Action {
	public String execute(HttpServletRequest req, HttpServletResponse resp);
}
