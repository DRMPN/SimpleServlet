<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
    <!DOCTYPE html>
    <html>

    <head>
        <title> Course </title>
    </head>

    <body>
        <h2> This course is audited by: </h2>
        <ul>
            <c:forEach var="name" items="${names}">
                <li>
                    <c:out value="${name}" />
                </li>
            </c:forEach>
        </ul>
    </body>

    </html>