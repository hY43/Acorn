<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script type="text/javascript" src = "http://ajax.aspnetcdn.com/ajax/jQuery/jquery-3.0.0.min.js"></script>
<script type="text/javascript">
var dan = 0;

	$(function() {
		$("select").change(function() {
			for(var i=0;i<9;i++){
			if($("form")[0][0][i].selected==true)
				dan = i+1;
			}
			console.log(dan);
			console.log($("form"));
			$("form").action("printGuGuDan.jsp");
			$("form").method("get");
			$("form").submit();
		});
	});
</script>
</head>
<body>
	<form action="printGuGuDan.jsp">
		<select name="gugudan" id="gugudan">
			<option value="0">-</option>
			<option value="2">2단</option>
			<option value="3">3단</option>
			<option value="4">4단</option>
			<option value="5">5단</option>
			<option value="6">6단</option>
			<option value="7">7단</option>
			<option value="8">8단</option>
			<option value="9">9단</option>
		</select> 
	</form>
</body>
</html>