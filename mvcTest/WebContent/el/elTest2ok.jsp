<%@ page contentType="text/html; charset=UTF-8"%>
<!DOCTYPE html>
<html lang="ko">
<head>
  <meta charset="UTF-8">
  <title>el/elTest2ok.jsp</title>
</head>
<body>
 <h3> * EL 파라미터 결과 * </h3>
 1) JSP방식<br> 
 	아이디 : <%=request.getParameter("id") %><br>
  	비  번 : <%=request.getParameter("pw") %><br>
 2) EL방식<br>
 	아이디 : ${param.id }<br>
 	비  번 : ${param.pw }<br>
 
 
  
</body>
</html>