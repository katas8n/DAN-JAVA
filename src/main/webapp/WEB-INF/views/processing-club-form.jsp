<%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>
<!DOCTYPE html>
<html lang="en">
    <head>
        <title>Search Form</title>
         <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/static/style.css">
    </head>

    <body>
        <h3>Club name is a ${club.clubName}</h3>
        <h3>Country: ${club.country}</h3>

        <c:if test="${club.isChampion}">
            <h3>It is a champion</h3>
        </c:if>

        <h2>Thanks for submitting the form!</h2>
    </body>
</html>
