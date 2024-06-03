<%-- 
    Document   : index2
    Created on : 2 jun. 2024, 18:37:29
    Author     : Gabriel
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Iniciar sesión</title>
    </head>
    <body>
        <h1>Iniciar Sesión</h1>
        <form action="LoginServlet" method="post">
            <label for="username">Nombre de Usuario:</label>
            <input type="text" id="username" name="username"><br>
            <label for="password">Contraseña:</label>
            <input type="password" id="password" name="password"><br>
            <input type="submit" value="Iniciar Sesión">
        </form>
    </body>
</html>
