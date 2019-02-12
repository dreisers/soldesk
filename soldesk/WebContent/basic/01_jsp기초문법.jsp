<%@ page contentType="text/html; charset=UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>01_jsp기초문법.jsp</title>
</head>
<body>
	<!--  .jsp -> HTML tag
					   CSS			<style></style>
					   JavaScript	<script></script>
					   JSP				<% 	%> Scriptlet
	-->
	<h1>JSP 기본문법</h1>
	<hr>
	대한민국
	<hr>
<%
	// JSP 코드 작성 영역 (Scriptlet)
	/* 여러줄 주석 */
	// 본문영역에 출력 out.print()
	// 종결문자 ; 
	out.print("무궁화");
	out.print(123);
	out.print(5.6);
	out.print('R');
	
	//HTML 태그를 사용하는 경우 ""안에서 작성한다
	out.print("<hr>");
	out.print("서울<br>");
	out.print("<img src='../images/k1.png'>");
	%>
	<hr>
	<img src="../images/k2.png">
	
<%-- <%
	out.print("<style> .txt{color:red;} </style>");
	out.print("<h1 class=txt>오필승코리아</h1>");
	
%> --%>
</body>
</html>