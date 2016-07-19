package Parse;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

import net.htmlparser.jericho.Element;
import net.htmlparser.jericho.HTMLElementName;
import net.htmlparser.jericho.Source;

public class HtmlParser {
	public static void main(String[] args) throws MalformedURLException, IOException {
		/*
		 * http://jericho.htmlparser.net/docs/index.html
		 * https://sourceforge.net/projects/jerichohtml/files/jericho-html/3.4/
		 * jericho-html-3.4.zip/download dist/jericho-html-3.4.jar 복사해서 가져올것
		 */
		String url = "http://movie.naver.com/movie/search/result.nhn?query=%EB%B6%80%EC%82%B0%ED%96%89&section=all&ie=utf8";
		// 해당 사이트에서 웹 문서를 가져온다.
		Source source = new Source(new URL(url));
		// System.out.println(source);

		// img 엘리먼트만 찾기.
		List<Element> list = source.getAllElements(HTMLElementName.IMG);
		for (int i = 0; i < list.size(); i++) {
			Element img = list.get(i);
			String src = img.getAttributeValue("src");
			// System.out.println(i + ": " + src);
		}
		System.out.println(list.get(3).getAttributeValue("src"));
	}
}
