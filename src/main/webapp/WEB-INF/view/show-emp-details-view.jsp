<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>

<body>

<h2>Добро пожаловать, дорогой ${employee.name}!</h2>
<br>
Surname ${employee.surname}
<br>
Salary ${employee.salary}
<br>
Department ${employee.department}
<br>
Your car is ${employee.carBrand}!
<br>
Languages
<ul>
<c:forEach var="lang" items="${employee.languages}">
<li>${lang}</li>
</c:forEach>
</ul>
<br>
Phone ${employee.phoneNumber}
<br>
Email ${employee.email}
</body>
</html>