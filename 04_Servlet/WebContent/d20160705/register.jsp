<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script src="http://dmaps.daum.net/map_js_init/postcode.v2.js"></script>
<script type="text/javascript">
    function openDaumPostcode(){
    	new daum.Postcode({
    		oncomplete: function(data){
    			// 팝업에서 검색 결과 항목을 클릭했을 때, 실행할 코드를 작성하는 부분
    			// 우편번호와 주소 정보를 해당 필드에 넣고 커서를 상세 주소 필드로 이동한다.
    			document.getElementById('post1').value = data.postcode1;
    			document.getElementById('post2').value = data.postcode2;
    			document.getElementById('addr').value = data.address;
    		}
    	}).open();
    }
</script>
</head>
<body>
	<!-- 우편번호 가져와서 사용하기 위한 api -->
	<!-- postcode.map.daum.net/guide -->
	<p>우편번호 </p>
	<input type="text" name="" id="post1" />
	<input type="text" name="" id="post2" />
	<input type="button" value="우편번호 찾기" onclick="openDaumPostcode();"/><br />
	<input type="text" name="" id="addr" />
	<input type="text" name="" id="addr2" />
</body>
</html>