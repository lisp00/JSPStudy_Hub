<%@ page language="java" contentType="text/html; charset=UTF-8" %>
<html>
<head>
<title>구구단</title>
</head>
<body>
	<%
		for(int i=2;i<10;i++) {
			for(int j=1;j<10;j++) {
				out.print(i+"*"+"="+(i*j)); %><br>
				
		<%	}%> <br>
	<%	}%>

</body>
</html>