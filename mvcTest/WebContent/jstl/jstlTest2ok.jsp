<%@ page contentType="text/html; charset=UTF-8"%>
<%@ page import="java.util.*" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"  %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>

<!DOCTYPE html>
<html lang="ko">
<head>
  <meta charset="UTF-8">
  <title>jstl/jstlTest2ok.jsp</title>
</head>
<body>
 <h3> * 결과 페이지(JSP) * </h3>
<%
  //1) 이름, 나이를 변수에 대입후 출력
		String name = request.getParameter("name");
  		int age = Integer.parseInt(request.getParameter("age"));
  		out.print("이름 : " + name);
  		out.print(" 나이 : " + age);
  		out.print("<hr>");
  /*2) 나이가 10미만 "어린이"
			  20미만 "청소년"
			  나머지 "성인" 출력 */
		
		if(age<10){
			out.print("어린이");
		}else if(age<20){
			out.print("청소년");
		}else{
			out.print("성인" + "<br>");
		}
 
  //3) 1~나이까지 홀수는 빨강색, 짝수는 파랑색으로 출력
		for(int idx=1; idx<=age; idx++) {
			if(idx%2==0){
				out.print("<span style='color:blue'>" + idx + "</span>");
			}else {
				out.print("<span style='color:red'>" + idx + "</span>");
			}
		}//for end
%>

</body>
</html>