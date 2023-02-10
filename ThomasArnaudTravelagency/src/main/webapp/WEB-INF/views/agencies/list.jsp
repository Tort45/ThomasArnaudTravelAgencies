<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Agencies</title>
</head>
<body> 
	<h1>Liste des agences</h1>
	<ul>
		<c:forEach items="${agencies}" var="agence">
		<li>(${agencies.id}) ${agencies.name}</li>
			<c:url value="/agencies/${agencies.id}" var="agenceUrl"></c:url> 
			<li><a href="${agenceUrl}">(${agencies.id}) ${agencies.name}</a></li>
		</c:forEach>
	</ul>
</body>
</html>