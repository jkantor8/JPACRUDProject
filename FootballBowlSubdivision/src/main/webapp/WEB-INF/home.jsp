<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">
<link rel="stylesheet" href="CSS/style.css">
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
	
<h2> Menu</h2>
<a href = "addTeamForm.do"> Add a team</a>

<form action="getTeamById.do" method="GET">
			Find Team by Id <input type="text" name="id" /> 
			<input type="submit" value="Find Team" />
		</form><br>



<form action="deleteTeam.do" method="GET">
			Delete Team by Id <input type="text" name="id" /> 
			<input type="submit" value="Delete Team" />
		</form><br>
		
<form action="updateTeamForm.do" method="GET">
			Update Team by Id <input type="text" name="id" /> 
			<input type="submit" value="Update Team" />
		</form><br>

<form action="deleteTeam.do" method="GET">
			Delete Team by Id <input type="text" name="id" /> 
			<input type="submit" value="Delete Team" />
		</form><br>

</body>
</html>