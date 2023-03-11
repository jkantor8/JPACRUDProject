<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>FBS - Power 5 Team Lookup</title>
</head>
<body>
	<h1>Power 5 Teams</h1>

	<c:choose>
		<c:when test="${empty teams }">No Teams found</c:when>
		<c:otherwise>
			<c:forEach var="team" items="${teams }">
				<!-- Display in a nice table -->

				<li>${team.id } ${team.school }</li>
			</c:forEach>

		</c:otherwise>


	</c:choose>
</body>
</html>