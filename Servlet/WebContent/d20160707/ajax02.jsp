<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script type="text/javascript">
   // 비동기화 통신
   // 1. xhr
   var xhr = null;
   function getXMLHttpRequest(){
      // MS 브라우저라면
      if(window.ActiveXObject){ // 버젼에 따라 다르므로 나눠서 적용
         try{
            return new ActiveObject("MsXML2.XMLHTTP");
         }catch (e) {
            try{
               return new ActiveXObject("Microsoft.XMLHTTP");
            }catch (e) {
               return null;
            }
         }
         // 그 외의 브라우저라면
      }else if(window.XMLHttpRequest){
         return new XMLHttpRequest();
      }else{
         return null;
      }
   }// getXMLHttpRequest() end
   
   console.dir();

   function pickme(){
      if(xhr.readyState == 4 && xhr.status==200){
    	  console.log(xhr.responseText);
    	  document.getElementById("div").innerHTML = xhr.responseText;
      }
   }
   
   function load(url){
      
      xhr = getXMLHttpRequest();
      
      // 2. callback function
      xhr.onreadystatechange=pickme;
      
      // 3. open()
      xhr.open("GET", url, true);
      
      // 4. send()
      xhr.send();
   }


</script>
</head>
<body>
   <h2>Ajax</h2>
   
   <h4>Javascript를 통해서 웹서버와 비동기방식으로 데이터를 송수신하여 브라우저에 반영해주는 방식</h4>
   
   <input type="button" value="simple1.txt" onclick="load('simple1.txt')"/>
   <input type="button" value="simple1.jsp" onclick="load('simple1.jsp')"/>
   <input type="button" value="simple2.txt" onclick="load('simple2.txt')"/>
   <input type="button" value="simple2.jsp" onclick="load('simple2.jsp')"/>
   
   <!-- 여기에 가져온 값 출력 -->
   <div id="div"></div>

</body>
</html>