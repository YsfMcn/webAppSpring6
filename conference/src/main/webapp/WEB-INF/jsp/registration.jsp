<%@ page contentType="text/html; ISO-8859-1" language="java" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %> <!-- to be able to add form tag -->
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %> <!-- allows us to add structure for internationalization -->
<!DOCTYPE html>
<html>
    <head>
        <title>Registration</title>
    </head>
    <body>
        <h1>Registration</h1>
        <form:form modelAttribute="registration"> <!-- Binds the Registration object in controller -->
            <table>
                <tr>
                    <td>
                        <spring:message code="name" /> <!-- spring:message allows us to add internationalization -->
                    </td>
                    <td>
                        <form:input path="name"/> <!-- referring name field in Registration object -->
                    </td>
                </tr>
                <tr>
                    <td colspan="2">
                        <input type="submit" value="Add Registration" />
                    </td>
                </tr>
            </table>
        </form:form>
    </body>
</html>