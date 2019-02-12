<%@ page contentType="text/html; charset=UTF-8"%>
<%@ include file="ssi.jsp" %>

<!DOCTYPE html>
<html>
<head>
  <meta charset="UTF-8">
  <title>sungjukRead.jsp</title>
  <link rel="stylesheet" type="text/css" href="../css/css1.css?after">
  <script src="../js/myscript.js"></script>
</head>
<body>
  <h1>* 성적 삭제 *</h1>
  <p><a href="sungjukList.jsp">[성적목록]</a></p>
  <p><a href="sungjukForm.jsp">[성적쓰기]</a></p>
  
<%
	int sno = Integer.parseInt(request.getParameter("sno"));
 	int res = dao.delete(sno);
 	 if(res==0){
	        out.println("<p>성적 삭제 실패</p>");
	        out.println("<p><a href='javascript:history.back()'>[다시시도]</a></p>");
	      }else{
	        out.println("<script>");
	        out.println("   alert('성적 삭제 성공');");        
	        out.println("   location.href='sungjukList.jsp';");//페이지 이동      
	        out.println("</script>");        
	      }//if end
%>  
  
</body>
</html>