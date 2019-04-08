<%@ page pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<table border="1" width="80%">
		<c:forEach items="${students}" var="s">
		<tr>
			<td>${s.id}</td>
			<td>${s.name}</td>
			<td>${s.sex}</td>
			<td>${s.birthday}</td>
			<td>${s.addr}</td>
		</tr>	
		</c:forEach>
	</table>
</body>
</html>