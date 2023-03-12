<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">
<link rel="stylesheet" href="CSS/style.css">
<title>Team Details Display</title>
<jsp:include page="./bootstrapHead.jsp"/>
</head>
<body>
<jsp:include page="./navbar.jsp"/>

<div class="container">
<h2>${team.school} (${team.teamName})</h2>

  <p>${team.mascot } (${team.conference}) (${team.nationalChampionships})  </p>
  <blockquote>${team.logo}</blockquote>
  </div>
  <jsp:include page="./bootstrapFoot.jsp"/>
</body>
</html>