<%-- 
    Document   : login
    Created on : 20.03.2017, 23:47:23
    Author     : Серж
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Login Page</title>
    </head>
    <body>
        <h1 align = "center">
           <form name="LoginForm" method="POST" action="Controller">
           <input type="hidden" name="command" value="login" /><br>
           Login: <input type="text" name="login" value="" /><br>
           Password: <input type="password" name="password" value=""/><br>
           ${errorLoginMessage}<br/>
           ${wrongAction}<br/>
           ${nullPage}<br/>
           <input type="submit" value="Log in" />
         
        </form>
        </h1>
    </body>
</html>
