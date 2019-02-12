<%@ page contentType="text/html; charset=UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>03_배열.jsp</title>
</head>
<body>
	<h1>성적프로그램(배열)</h1>
<%
String[] name = {"홍길동","무궁화","라일락","진달래","개나리"};
int[] kor = {100, 97, 71, 39, 40};
int[] eng = {100, 90, 80, 92, 67};
int[] mat = {95, 100, 85, 90, 35};
int[] aver = new int[5];
int[] rank = {1, 1, 1, 1, 1};
int size = name.length;

//평균
for(int idx=0; idx<size; idx++) {
	aver[idx] = (kor[idx]+eng[idx]+mat[idx])/3;
}//for end

//등수
for(int a=0; a<size; a++) {
	for(int b=0; b<size; b++)
	if(aver[a]<aver[b]) {
		 rank[a] = rank[a] + 1;
	}
}//for end
%>
<!-- 출력 -->
	<table border='1'>
	<tr>
		<th>이름</th>
		<th>국어</th>
		<th>영어</th>
		<th>수학</th>
		<th>평균</th>
		<th>등수</th>
		<th>결과</th>
	</tr>
<%
	for(int idx=0; idx<size; idx++){
%>
	<tr>
		<td><%=name[idx] %></td>
		<td><%=kor[idx] %></td>
		<td><%=eng[idx] %></td>
		<td><%=mat[idx] %></td>
		<td><%=aver[idx] %></td>
		<td><%=rank[idx] %></td>
		<td>
<%
// 과락(합격 재시험 불합격) 
if(aver[idx]>=70) {
	if(kor[idx]< 40 || eng[idx]< 40 || mat[idx]< 40) {
		out.print("재시험");
	}else  {
		out.print("합격");
		}
	}else {
	out.print("불합격");
		}

//문) 평균 10점당 * 한개씩
	for(int n=1; n<=aver[idx]/10; n++) {
		out.print("*");
}

//문) 평균 95이상 장학생 
if(aver[idx]>=95) {
	out.print(" " +  "장학생");
	}
%>
</td>
	</tr>
<%		
	}//for end
%>
	</table>
</body>
</html>