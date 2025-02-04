<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<!DOCTYPE html>
<html lang="en">
    <head>
        <title>Search Form</title>
         <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/static/style.css">
    </head>

    <body>
        <h2>The form for a new club!</h2>

        <hr />

        <br />
        <br />

        <form:form action="processing_club_form" modelAttribute="club">
            <fieldset>
                <form:input type="text" placeholder="Enter the name of the new club" path="clubName" />
                Country : <form:select path="country">
                    <form:option value="Hungary">Hungary</form:option>
                    <form:option value="Poland">Poland</form:option>
                    <form:option value="England">England</form:option>
                </form:select>

                Has been a champion: <form:checkbox path="isChampion" />

                <br />

                <div class="btn-wrapper">
                    <input type="submit" value="Submit" />
                </div>
            </fieldset>

            <br />
            <p class="front-error">
                There must be more than 4 symbols in the input.
            </p>

        </form:form>

        <script src="${pageContext.request.contextPath}/static/script.js"></script>
    </body>
</html>
