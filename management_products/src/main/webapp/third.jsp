<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
              <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<p>

<form action="" method="post" >
<p>Write the name : <input type="text" name="name" /> </p>
<p>Write the desc : <input type="text" name="desc" /> </p>
<p>Write the price : <input type="number" name="price" /> </p>
<p>Write the etat : <input type="number" name="etat" /> </p>
<p> <button type="submit" >Ok</button> </p>
</form>
<c:out value="${name}"/>

</body>
</html>