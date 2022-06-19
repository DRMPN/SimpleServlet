<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
    <!DOCTYPE html>
    <html>

    <head>
        <title> Course </title>
    </head>

    <body>
        <h2> This course in audited by: </h2>
        <c:forEach var="name" items="${names}">
            <p>${name}</p>
        </c:forEach>
    </body>

    </html>