<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script type="text/javascript">
	function onlyUpper(){
		
		// keyboard의 ASCII Code
		console.dir(event.keyCode);
		
/* 		
		if(event.keyCode >= 97 && event.keyCode <= 122)
			document.getElementById("mytext2").value = event.keyCode-32; */
	}
</script>
</head>
<body>
	<input type="text" name="mytext1" id="" onkeypress="onlyUpper();"/>
	<input type="text" name="mytext2" id="" onkeypress=""/>
</body>
</html>