<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Team Deleted</title>
</head>
<body>
<c:choose>
<c:when test = "${ success }">
Team Deleted!
</c:when>
 <c:otherwise>
      <p>Unable to delete team</p>
    </c:otherwise>
</c:choose>
<br>
<a href = "home.do">Return Home</a>

</body>
</html>