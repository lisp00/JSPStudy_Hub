<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8" isErrorPage="true"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h4> 다음과 같은 에러가 발생하셨습니다.</h4>
	에러타입 : 
	<%=exception.getClass().getName() %>
	<br> 에러메시지 : 
	<%=exception.getMessage() %>
</body>
</html>