<%@ page contentType="text/html; charset=UTF-8"%>
<!DOCTYPE html>
<html>
<head>
  <meta charset="UTF-8">
  <title>calcok.jsp</title>
</head>
<body>
  <h1>계산 결과</h1>
<%
  
  
  // 사용자가 입력한 요청 정보를 가져오기
  //   request.getParameter()
	int num1 = Integer.parseInt(request.getParameter("num1").trim()); 
	int num2 = Integer.parseInt(request.getParameter("num2").trim()); 
    String op   = request.getParameter("op").trim();
  
    int result1 = 0;
    double result2 = 0.0;
    
    if(op.equals("+")){
    	result1 = num1 + num2;
    }else if(op.equals("-")){
    	result1 = num1 - num2;
    }else if(op.equals("*")){
    	result1 = num1 * num2;
    }else if(op.equals("/")){
    	result2 = (double)num1 * num2;
    }else if(op.equals("%")){
        	result1 = num1 % num2;
    }//if end
 %>
<!--  출력 -->    
    <table border="1">
    	<tr>
    	<td><%=num1 %></td>
    	<td><%=op %></td>
    	<td><%=num2 %></td>
    	<td>=</td>
    	<td>
<%
		if(op.equals("/")){
			out.println(result2);
		}else{
				out.println(result1);
				}
%>
    	</td>
    	</tr>
    </table>
</body>
</html>







