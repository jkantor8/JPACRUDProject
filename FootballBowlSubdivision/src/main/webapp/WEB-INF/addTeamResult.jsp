<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<c:choose>
		<c:when test="${! empty team }">
			<h2>Team Created!</h2>
			<ul>
				<li>${team.id }</li>
				<li>${team.school }</li>
				<li>${team.teamName }</li>
				<li>${team.mascot }</li>
				<li>${team.conference }</li>
				<li>${team.nationalChampionships }</li>
			</ul>
		</c:when>
		<c:otherwise>
			<p>Unable to create team</p>
		</c:otherwise>
	</c:choose>
	<br>

	<a href="home.do">Return Home</a>


</body>
</html>