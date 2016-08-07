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
		$("input").on("click", getText);
	})
	
	function getText() {
		$.ajax({
			url : "server01.jsp", // 데이터를 전달할 파일 명
			type : "get", // 데이터 전달 방식
			data : "", // QueryString를 생성 
			dataType : "text", // 데이터의 형식
			beforeSend : function() {
				// URL 접근 전에 호출되는 콜백 함수
			},
			success : function(data) {
				// 데이터를 받는데 성공했을 시에 호출되는 콜백함수.
				// 입력 받은 데이터를 콤마(,) 단위로 분류해서 배열로 저장(공백을 제거하여).
				var dataArray = data.trim().split(',');
				for(var i=0;i<dataArray.length;i++){
					// for문을 사용하여 각 배열의 항목을 불러온다. 
					var str = dataArray[i];
					var txt = "<li>" + str + "</li>";
					// 생성한 li Tag를 ul Tag에 순차적으로 append한다.
					$("ul").append(txt);
				}
			},
			error : function() {
				// 에러 발생 시 호출될 콜백 함수
			},
			complete : function() {
				// 동작이 완료된 후, 성공 유무와 관계 없이 호출되는 콜백 함수
			}
		} // JSON End
		) // $.ajax() End
	}
</script>
</head>
<body>
	<!-- Q, server01.jsp 파일로 부터 값을 얻어와서 ul Tag의 li Tag로 추가 시켜라 -->
	<h2>부서 목록</h2>
	<input type="button" value="출력"/>
	<div>
		<ul>
			<li>
				<h2>부서</h2>
			</li>
		</ul>
	</div>
</body>
</html>