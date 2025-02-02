<%@ page language="java" contentType="text/html;charset=UTF-8" %>
<!DOCTYPE html>
<html lang="en">
    <head>
        <title>Player details</title>
          <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/static/style.css">
    </head>

    <body>
        <h2>Player info: </h2>

        <hr />

        <br />

        <div class="player">
            <p>Player name is: ${name} </p>
            <p>Player is: ${age} years old</p>
            <p>Date of birth is: ${dateOfBirth}</p>
        </div>
    </body>
</html>
