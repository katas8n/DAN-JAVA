<%@ page language="java" contentType="text/html;charset=UTF-8" %>
<!DOCTYPE html>
<html lang="en">
    <head>
        <title>Search Form</title>
         <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/static/style.css">
    </head>

    <body>
        <form method="get" action="/player-details">
            <fieldset>
                <label for="form">Search:</label>
                <input type="text" placeholder="Enter players name to search" name="playerName" id="form">
            </fieldset>

            <div class="btn-wrapper">
                <input type="submit" value="Search">
            </div>
        </form>
    </body>
</html>