package RegularExpression;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TestMain {
	public static void main(String[] args) {
		String[] strArray = {"Hello", "World", "H1o", "H2o"};
		String[] strArray2 = {"ABC", "Hipo", "Helo", "H2o", "$5,000.50"};
		
		// Hxo라는 문자열을 갖고 있다면 화면에 출력.
		for(String str : strArray){
			if(str.length() == 3 && str.indexOf('H')==0 && str.lastIndexOf('o')==str.length()-1){
				System.out.println(str);
			}
		}
		System.out.println("================================");
		// 정규 표현식을 활용한 출력		
		String regularExpressionSample = "^H.o$";
		for(String str : strArray){
			if(str.matches(regularExpressionSample)){
				System.out.println(str);
			}
		}
		System.out.println("================================");
		Pattern pattern = Pattern.compile("H..o");
		Matcher matcher;
		for(String str : strArray2){
			 matcher = pattern.matcher(str);
			if (matcher.find()) {
				System.out.println(matcher.group());
			}
		}
		System.out.println("================================");
		pattern = Pattern.compile("\\$[0-9,.]+");
		for(String str : strArray2){
			 matcher = pattern.matcher(str);
			if (matcher.find()) {
				System.out.println(matcher.group());
			}
		}

	}
}
