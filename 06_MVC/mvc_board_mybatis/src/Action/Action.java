package Action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public interface Action {
	// 각 Model 객체의 excute Method를 추상화 하는 Interface.
	String execute(HttpServletRequest req, HttpServletResponse resp);
}
