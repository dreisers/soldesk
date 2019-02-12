<%@ page contentType="text/html; charset=UTF-8"%>
<!DOCTYPE html>
<html>
<head>
  <meta charset="UTF-8">
  <title>sungjuk/sungjukForm.jsp</title>
    <link rel="stylesheet" type="text/css" href="../css/sungjuk.css">
  <script src="../js/myscript.js"></script>
</head>
<body>
* 성적 입력 폼 *<br>
<p><a href="sungjukList.jsp">[성적목록]</a></p>

<form method="post"
      action="sungjukIns.jsp"
      onsubmit="return sungjukCheck(this)">
<table border="1">
<tr>
  <th>이  름</th>
  <td><input type="text" name="uname" maxlength="10" required autofocus></td>
</tr>  
<tr>
  <th>국  어</th>
  <td><input type="number" name="kor" size="5" min="0" max="100" placeholder="숫자입력"></td>
</tr>  
<tr>
  <th>영  어</th>
  <td><input type="number" name="eng" size="5" min="0" max="100" placeholder="숫자입력"></td>
</tr>  
<tr>
  <th>수  학</th>
  <td><input type="number" name="mat" size="5" min="0" max="100" placeholder="숫자입력"></td>
</tr>  
<tr>
  <th>주  소</th>
  <td>
      <select name="addr">
            <option value="Seoul">서울</option>
            <option value="Jeju">제주</option>
            <option value="Suwon">수원</option>
            <option value="Busan">부산</option>
      </select>  
  </td>
</tr>  
<tr>
  <td colspan="2" align="center">
     <input type="submit" value="전송">
     <input type="reset"  value="취소">
  </td>
</tr>
</table>
</form>

</body>
</html>