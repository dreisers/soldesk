<%@ page contentType="text/html; charset=UTF-8"%>
<!DOCTYPE html>
<html>
<head>
  <meta charset="UTF-8">
  <title>08_다양한컨트롤요소.jsp</title>
</head>
<body>
  <h1>다양한 폼 컨트롤 요소들</h1>
  <form action="ok.jsp">
  아이디 : <input type="text" name="uid"> <br>  
  비번 : <input type="password" name="upw"> <br>  
  이름 : <input type="text" name="uname"> <br>  
  내용 : <textarea rows="5" cols="10" name="message"></textarea> <br>
  <hr>
  
  숫자1 : <input type="text" name="num"> <br>
  숫자2 : <input type="text" name="num"> <br>
  숫자3 : <input type="text" name="num"> <br>
  <hr>
  
  약관동의 : <input type="checkbox" name="agree" value="y"> <br>
   성별 :  <input type="radio" name="gender" value="m"> 남
   		     <input type="radio" name="gender" value="f"> 여
  통신회사 : <select name="telecom">
  					<option value = "sk">SK
  					<option value = "lg">LG U+
  					<option value = "kt">KT
  					</select>
  					
  		<input type="hidden" name="page" value="3">
  		<hr>
  <input type="submit" value="전송">
  
  <!--  <from enctype="multipart/form-date"> -->
  첨부파일 : <input type="file" name="attach">
 
  <input type="submit" value="전송">
  </form>
  
</body>
</html>




