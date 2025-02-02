<%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>
<%@ page language="java" contentType="text/html;charset=UTF-8" %>
<!DOCTYPE html>
<html lang="en">
    <head>
        <title>Search Form</title>
         <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/static/style.css">
    </head>

    <body>
        <h2>Players info section: </h2>

        <section class="players-info">
            <table border=1>
                <tr>
                    <th>Name</th>
                    <th>Club</th>
                    <th>Date of birth</th>
                </tr>

                <c:forEach var="player" items="${players}">
                    <tr>
                        <td>${player.name}</td>
                        <td>${player.club}</td>
                        <td>${player.birthDate}</td>
                    </tr>
                </c:forEach>
            </table>
        </section>
    </body>
</html>