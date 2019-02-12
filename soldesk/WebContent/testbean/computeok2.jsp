<%@page import="net.testbean.Compute"%>
<%@ page contentType="text/html; charset=UTF-8"%>
<!DOCTYPE html>
<html lang="ko">
<head>
<meta charset="UTF-8">
<title>testbean/computeok2.jsp</title>
</head>
<body>
<h1> * 계산 결과 *</h1>
<h2> 2) new연산자를 이용해서 객체 생성 후 메소드 호출 </h2>
<%
	int num1 = Integer.parseInt(request.getParameter("num1"));
	int num2 = Integer.parseInt(request.getParameter("num2"));
	
	Compute comp = new Compute();
	out.print(num1 + " + " + num2 + " = " + comp.add(num1, num2));
	out.print("<hr>");
	out.print(num1 + " - " + num2 + " = " + comp.sub(num1, num2));
	out.print("<hr>");
	out.print(num1 + " * " + num2 + " = " + comp.mul(num1, num2));
	out.print("<hr>");
	out.print(num1 + " / " + num2 + " = " + comp.div(num1, num2));
	out.print("<hr>");
	out.print(num1 + " % " + num2 + " = " + comp.mod(num1, num2));
	out.print("<hr>");
%>
</body>
</html>