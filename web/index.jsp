<%-- 
    Document   : index
    Created on : 1 dic. 2021, 08:55:58
    Author     : profl
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Hola JPA con herencia</h1>

        <form action="SVRClinica" method="POST">


            <label for="nos">Nro Obra Socuial:</label><br>
            <input type="text" id="fos" name="nos" value="1"><br>
            <label for="lname">Nombre Obra Social:</label><br>
            <input type="text" id="lname" name="lname" value="IOMA"><br><br>
            <input type="submit" value="Submit">


        </form>

        <%for (int i = 0; i < 10; i++) {%>
        <p>Hola !!!</p>
        <%}%>
    </body>
</html>
