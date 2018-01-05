<!DOCTYPE html>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<html lang="en">
<body>
<h1> this is our first App</h1>
<h2> ${message}</h2>
<a href="upsertStudent">Register New Student Profile </a>
<table>
    <thead>
    <tr>
        <th>Serial No:</th>
        <th>Name:</th>
        <th>Roll</th>
        <th>Dept</th>
    </tr>
    </thead>
    <tbody>
    <c:forEach items="${studentList}" var="std" varStatus="status">
        <tr>
            <td>${status.index+1}</td>
            <td>${std.name}</td>
            <td>${std.roll}</td>
            <td>${std.dept}</td>
        </tr>
    </c:forEach>
</tbody>
</table>
</body>
</html>