<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">
<link rel="stylesheet" href="CSS/style.css">
<title>Add a Team</title>
</head>
<body>
<h1>Add a New FBS Team</h1>
<form action="addTeam.do" method = "POST">
	<label for= "school">School</label>
	<input type= "text" id= "school" name= "school"><br><br>
	
	<label for= "teamName">Team Name</label>
	<input type= "text" id= "teamName" name= "teamName"><br><br>
	
	<label for= "mascot">Mascot</label>
	<input type= "text" id= "mascot" name= "mascot"><br><br>
	
	<label for= "conference">Conference</label>
	<input type= "text" id= "conference" name= "conference"><br><br>

	
	<label for= "nationalChampionships">National Championships</label>
	<input type= "text" id= "nationalChampionships" name= "nationalChampionships"><br><br>
	
	<input type= "submit" value ="Add Team">
	
	
	
	
	












</form>
</body>
</html>