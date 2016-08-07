<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script type="text/javascript">
	var xhr = null;
	function getXMLHttpRequest(){
		// MS 브라우저 라면
		if(window.ActiveXObject){
			try{
				return new ActiveObject("MsMXL2.XMLHTTP");
			}catch(e){
				try{
					return new ActiveXObject("Microsoft.XMLHTTP");	
				}catch(e){
					return null;
				}
				
			}
		}else if(window.XMLHttpRequest){
			// 그 외의 브라우저라면
			return new XMLHttpRequest();
		}else{
			return null;
		}
	}// getXMLHttpRequest Method End
	
	function load(){
		// 1. XMLHttpRequest 객체 얻어오기
		xhr = getXMLHttpRequest();
		console.dir(xhr);
		// 2. callback 함수 정의 : 대기하고 있다가 특정 상황에 자동으로 호출되는 함수
		xhr.onreadystatechange = callback;
		// 3. opne("방식", 접근 주소, 비동기화 여부)
		xhr.open("GET", "test.jsp", true);
		// 4. send(); GET 방식일때는 별다른 행동하지 않아도 됨.
		xhr.send(null);
	}
	
	function callback(){
		console.log("콜백함수 호출됨");
		// 요청이 성공적으로 수행되었다면 응답텍스트가 전달
		// xhr 응답상태 0~4
		// 완료:4
		// 정상페이지 호출 status: 200
		if(xhr.readyState==4 && xhr.status==200){
			/* console.log(xhr.responseText); */
			var div = document.getElementById("div");
			div.innerHTML = "<h2>" + xhr.responseText+"</h2>"
		}
	}
</script>
</head>
<body>
	<!-- AJAX(Asynchronous JavaScript and XML -->
	<!-- 브라우저<=========================>웹서버
			   비동기 방식으로 통신
			 XMLHttpRequest 객체 사용 -->
	<!-- 동기화 방식: 서버 측에 데이터를 전달하면 서버가 데이터를 처리해서 응답 줄때까지 대기하고 있다가 응답이 오면 정해진 이벤트를 발생시키는 방식 -->
	<!-- 비동기화 방식: 서버 측에 데이터를 전달하고 서버가 데이터를 처리하는 동안 다른 작업을 하다가 응답이 오면 그 응답에 대한 이벤트를 발생시키는 방식 -->
			 <!-- 비동기화 방식 -->
			 <input type="button" value="데이터 가져오기" onclick="load()"/>
			 <div id="div"></div>
			 <!-- 동기화 방식 -->
			 <textarea name="aaa" id="" cols="30" rows="10"></textarea>
			 <a href="test.jsp">데이터 보러가기</a>
</body>
</html>