<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script type="text/javascript" src = "http://ajax.aspnetcdn.com/ajax/jQuery/jquery-3.0.0.min.js"></script>
<script type="text/javascript" src = "../js/httpRequest.js"></script>
<script type="text/javascript">
	$(function() {
		// id가 btn인 버튼을 클릭하면 getMovie Method가 호출.
		$("#btn").on("click", getMovie);
	})

	function getMovie() {
		$.ajax({
			url : "server02.jsp", // 데이터를 전달할 url
			type : "get", // 데이터 전달 방식
			data : "txt="+$("#txt").val(), // QueryString 작성.
			dataType : "text", // 전달하는 데이터의 타입
			success : function(path) {
				// 데이터 전달을 주고 받음에 성공했을때 호출되는 Method
				$("img").attr("src",path); // img Tag의 속성 중에 src값을 전달받은 path값으로 바꿈.
			}
		} // JSON End
		) // $.ajax() End
	}
</script>
</head>
<body>
	<!-- server02.jsp -->
	<input type="text" name="txt" id="txt" />
	<input type="button" value="영화이미지 가져오기" id="btn"/>
	<div>
		<img src="../images/bo3.jpg" alt="박보영" />
	</div>
</body>
</html>