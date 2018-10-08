<%--
  Created by IntelliJ IDEA.
  User: java
  Date: 09.07.2018
  Time: 20:06
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<html>
<head>
    <title>База файлов</title>
    <link rel="stylesheet" href="/css/styleTable.css">
</head>
<body>
<form action="/jsp_storage" enctype="multipart/form-data" method="post" name="uploadForm">
    <div class="form">
        <fieldset>
            <h3 align="center">Выберите файл для загрузки на сервер.</h3>
            <p>
                <textarea name="fileDescription" cols="47" rows="4" placeholder="Введите описание файла"
                          required></textarea>
            </p>
            <input type="file" name="uploadFile" required>
            <input type="submit" value="Загрузить">
        </fieldset>
    </div>
</form>
<br>

<div class="table">
    <table>
        <tr>
            <th width="5%">№</th>
            <th width="40%">Имя файла</th>
            <th>Описание</th>
            <th width="80px">Скачать</th>
        </tr>

        <c:forEach var="entry" items="${storageList}">
            <tr>
                <td><c:out value="${entry.key}"/></td>
                <td><c:out value="${entry.value.getFileName()}"/></td>
                <td><c:out value="${entry.value.getFileDescription()}"/></td>
                <td>
                    <form action="/downloadFile" name="downloadForm" style="margin-bottom: 0;">
                        <input name="keyDownloadFile" value="${entry.key}" hidden>
                        <input type="submit" value="Скачать">
                    </form>
                </td>
            </tr>
        </c:forEach>
    </table>
</div>

</body>
</html>
