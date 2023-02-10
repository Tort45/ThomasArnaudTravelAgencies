<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Agence choisi</title>
</head>
<body> 
	<h1>Detail de l'agence</h1>
	<h2>Name: ${agence.name}</h2>
	<ul>
		<c:forEach items="${travels}" var="travel">
			<c:url value="/agencies/${travel.id}" var="travelUrl"></c:url> 
			<li><a href="${travelUrl}">(${travel.id}) ${travel.name}</a></li>
		</c:forEach>
	</ul>
</body>
</html>