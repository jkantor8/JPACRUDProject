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
			<h3>Update ${team.school }</h3>

			<form action="updateTeam.do" method="POST">
				<label for= "school">School</label>
	<input type= "hidden" name="id" value="${team.id }">			
				
	<input type= "text" id= "school" name= "school"><br>
	
	<label for= "teamName">Team Name</label>
	<input type= "text" id= "teamName" name= "teamName"><br>
	
	<label for= "mascot">Mascot</label>
	<input type= "text" id= "mascot" name= "mascot"><br>
	
	<label for= "conference">Conference</label>
	<input type= "text" id= "conference" name= "conference"><br>
	
	<label for= "logo">Logo</label>
	<input type= "text" id= "logo" name= "logo"><br>
	
	<label for= "nationalChampionships">National Championships</label>
	<input type= "text" id= "nationalChampionships" name= "nationalChampionships"><br>
	 <input type="submit" value="Update Team">
			</form>
			</c:when>
			<c:otherwise>
			No School with that ID found!
			</c:otherwise>
			</c:choose>
			
			<br>
			<a href="home.do">Return Home</a>
</body>
</html>