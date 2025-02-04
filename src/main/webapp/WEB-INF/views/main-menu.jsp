<%@ page language="java" contentType="text/html;charset=UTF-8" %>
<!DOCTYPE html>
<html lang="en">
    <head>
        <title>Football players</title>
        <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/static/style.css">
    </head>
    <body>
        <header>
            <img class="logo" src="${pageContext.request.contextPath}/static/images/logo.png" alt="Something went wrong" />
        </header>
        <h2>Player info: </h2>
        <hr />

        <br />
            <a href="search-form">Search form</a>
            <br>
            <a href="players-info">All players</a>
            <br>
            <a href="club/add_club_form">Add club form</a>
        <br />

        Players name is :

        <script src="${pageContext.request.contextPath}/static/script.js"></script>
    </body>
</html>
