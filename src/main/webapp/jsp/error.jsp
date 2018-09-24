<%-- 
    Document   : error
    Created on : 20.03.2017, 23:44:35
    Author     : Серж
--%>

<%@page isErrorPage="true" contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Error Page</title>
    </head>
    <body>
        <h3>Request from ${pageContext.errorData.requestURI} is failed<br/>
            Servlet name or type: ${pageContext.errorData.servletName}<br/>
            Status code: ${pageContext.errorData.statusCode}<br/>
            Exception: ${pageContext.errorData.throwable}<br/>
        </h3>
        <h2><a href="Controller">Goto start</a></h2>
    </body>
</html>
