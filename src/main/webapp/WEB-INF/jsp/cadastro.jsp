<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
         pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="ISO-8859-1">
    <title>Oxente Sabor Do Nordeste</title>
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
</head>
<body>
    <div class="container">
        <form action="/usuarios" method="post">

            <div class="form-group">
                <label style = "font-size:x-large;">Nome:</label>
                <input type="text" class="form-control"  placeholder="Entre com seu nome" name="nome" value="Cesar de sena">
            </div>

            <div class="form-group">
                <label style = "font-size:x-large;">E-mail:</label>
                <input type="email" class="form-control"  placeholder="Entre com seu e-mail" name="email" value="bangjogos1@gmail.com">
            </div>

            <div class="form-group">
                <label style = "font-size:x-large;">Senha:</label>
                <input type="password" class="form-control"  placeholder="Entre com sua senha" name="senha" value="123">
            </div>

            <button type="submit" class="btn btn-primary">Salvar</button>
        </form>
    </div>
</body>
</html>