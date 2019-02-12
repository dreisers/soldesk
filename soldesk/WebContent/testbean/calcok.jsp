<%@page import="net.testbean.CalcBean"%>
<%@ page contentType="text/html; charset=UTF-8"%>
 <%-- Java Bean 객체 생성
  <jsp:useBean id="객체명" 
  					  class="패키지명.클래스명"
  					  scope="">
  	 </jsp:useBean>
  	주의사항 : id가 제대로 생성안될수도 있으니
  	해당 프로젝트를 Refresh, Validate, Project->Clean후에 테스트 할것
  	--%>
<jsp:useBean id="calc" class="net.testbean.CalcBean" scope="page"></jsp:useBean>

<%--
scope="page"				현재페이지에서만 사용 생략시 기본값
scope="request"			다른 페이지에서 공유
scope="session"			다른 페이지에서 공유
scope="application"	다른 페이지에서 공유
 --%>

<!DOCTYPE html>
<html lang="ko">
<head>
<meta charset="UTF-8">
<title>testbean/calcok.jsp</title>
</head>
<body>
<h1> * 계산 결과 *</h1>
<h2> 2) Java Bean을 이용해서 객체 생성후 메소드 호출 </h2>
<%
	int num1 = Integer.parseInt(request.getParameter("num1"));
	int num2 = Integer.parseInt(request.getParameter("num2"));
	
	out.print(num1 + " 의 절대값 " + calc.abs(num1));
	out.print("<hr>");
	out.print(num2 + "의 팩토리얼 값 " + calc.fact(num2));
%>
</body>
</html>