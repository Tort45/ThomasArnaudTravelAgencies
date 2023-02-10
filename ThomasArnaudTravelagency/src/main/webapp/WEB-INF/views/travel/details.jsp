<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>voyage choisi</title>
</head>
<body> 
	<h1>Detail du voyage</h1>
	
	<h2>Name: ${travel.name}</h2>
	<ul>
	<li>ID : ${travel.id}</li>
	<li>Destination : ${travel.destination}</li>
	<li>Duration : ${travel.duration}</li>
	<li>Price : ${travel}</li>
	</ul>
</body>
</html>