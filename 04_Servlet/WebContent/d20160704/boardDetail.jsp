
<%@page import="vo.BoardVO"%>
<%@page import="dao.BoardDAO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style type="text/css">
table, td {
	border: 1px solid black;
}

img {
	width: 40px;
	height: 40px;
}

table {
	width: 800px;
	text-align: center;
}
</style>
<!-- smartEditor 사용을 위한 JQuery CDN 선언 -->
<script type="text/javascript" src="../se2/js/HuskyEZCreator.js" charset="utf-8"></script>
</head>
<body>
	<table>
		<%
			int bno = Integer.parseInt(request.getParameter("bno")); // bno를 name으로 갖는 값을 불러와서 int 형으로 변환하고 bno 변수에 저장.
			BoardDAO dao = new BoardDAO(); // selectOne Method 사용을 위해 BoardDAO 객체 생성
			BoardVO vo = dao.selectOne(bno); // selectOne Method를 호출하고 그 반환값을 BoardVO 객체에 생성.
			dao.raiseHits(bno); // 조회 수 증가.
		%>

		<tr>
			<td>작성자</td>
			<td colspan=4><%=vo.getWriter()%></td>
		</tr>
		<tr>
			<td>제목</td>
			<td colspan=4><%=vo.getTitle()%></td>
		</tr>
		<tr>
			<td>내용</td>
			<!-- 내용을 입력하는데 Multi-Line 작성을 위해 TextArea로 작성 -->
			<td><textarea name="ir1" id="ir1" cols="30" rows="10" style="width:766px; height:410px; display:none;">
			<%=vo.getContents() %>
			</textarea></td>
		</tr>
		<tr>
			<td colspan=4>
			<!-- cry.png Image를 클릭하면 modifyForm.jsp로 이동하는데 매개변수로 bno를 가져간다. -->
			<a href="modifyForm.jsp?bno=<%=vo.getBno()%>"><img src="../images/cry.png" alt="modify" /></a>
			<!-- jiwoogae.png Image를 클릭하면 deleteOk.jsp로 이동하는데 매개변수로 bno를 가져간다. --> 
			<a href="deleteOk.jsp?bno=<%=vo.getBno()%>"><img src="../images/jiwoogae.png" alt="del" /></a>
			<!-- docu.png Image를 클릭하면 boardList.jsp로 이동 --> 
			<a href="boardList.jsp"><img src="../images/docu.png" alt="docList" /></a>
			</td>
		</tr>
	</table>
	
	<!-- Smart Editor를 사용하기 위해 smarteditor2.js 파일의 Script 부분을 가져옴. -->
	<script type="text/javascript">
		var oEditors = [];

		// 추가 글꼴 목록
		//var aAdditionalFontSet = [["MS UI Gothic", "MS UI Gothic"], ["Comic Sans MS", "Comic Sans MS"],["TEST","TEST"]];

		nhn.husky.EZCreator.createInIFrame({
			oAppRef : oEditors,
			elPlaceHolder : "ir1",
			sSkinURI : "../se2/SmartEditor2Skin.html",
			htParams : {
				bUseToolbar : true, // 툴바 사용 여부 (true:사용/ false:사용하지 않음)
				bUseVerticalResizer : true, // 입력창 크기 조절바 사용 여부 (true:사용/ false:사용하지 않음)
				bUseModeChanger : true, // 모드 탭(Editor | HTML | TEXT) 사용 여부 (true:사용/ false:사용하지 않음)
				//aAdditionalFontList : aAdditionalFontSet,		// 추가 글꼴 목록
				fOnBeforeUnload : function() {
					//alert("완료!");
				}
			}, //boolean
			fOnAppLoad : function() {
				//예제 코드
				//oEditors.getById["ir1"].exec("PASTE_HTML", ["로딩이 완료된 후에 본문에 삽입되는 text입니다."]);
			},
			fCreator : "createSEditor2"
		});

		function pasteHTML() {
			var sHTML = "<span style='color:#FF0000;'>이미지도 같은 방식으로 삽입합니다.<\/span>";
			oEditors.getById["ir1"].exec("PASTE_HTML", [ sHTML ]);
		}

		function showHTML() {
			var sHTML = oEditors.getById["ir1"].getIR();
			alert(sHTML);
		}

		function submitContents(elClickedObj) {
			oEditors.getById["ir1"].exec("UPDATE_CONTENTS_FIELD", []); // 에디터의 내용이 textarea에 적용됩니다.

			// 에디터의 내용에 대한 값 검증은 이곳에서 document.getElementById("ir1").value를 이용해서 처리하면 됩니다.

			try {
				elClickedObj.form.submit();
			} catch (e) {
			}
		}

		function setDefaultFont() {
			var sDefaultFont = '궁서';
			var nFontSize = 24;
			oEditors.getById["ir1"].setDefaultFont(sDefaultFont, nFontSize);
		}
	</script>
</body>
</html>