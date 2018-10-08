<%--
  Created by IntelliJ IDEA.
  User: java
  Date: 09.07.2018
  Time: 19:01
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Авторизация</title>
    <link rel="stylesheet" href="/css/style.css">
</head>
<body>

<section class="container">
    <div class="login">
        <h1>Войти в личный кабинет</h1>
        <form method="post" action="login">
            <p><input type="text" name="login" value="" placeholder="Логин или Email" required></p>
            <p><input type="password" name="password" value="" placeholder="Пароль" required></p>
            <p class="auth_error">${auth_error}</p>
            <p class="submit"><input type="submit" name="commit" value="Войти"></p>
        </form>
    </div>
</section>

</body>
</html>
