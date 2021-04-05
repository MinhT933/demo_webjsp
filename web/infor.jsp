<%-- 
    Document   : infor
    Created on : Mar 10, 2021, 7:42:06 AM
    Author     : MinhT
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <form name="information" action="btnAction" method="post"s>
            <table border="1">
                <thead>
                    <tr>
                        <th>id</th>
                        <th>name</th>
                        <th>description</th>
                        <th>price</th>
                        <th>cookingTime</th>
                        <th>createDate</th>
                    </tr>
                </thead>

                <c:forEach items="${tblfood}" var="x">
                    <tr>
                        <td name="id">${x.id}</td>
                        <td>${x.name}</td>
                        <td>${x.description}</td>
                        <td>${x.price}</td>
                        <td>${x.cookingTime}</td>
                        <td>${x.datetime}</td>
                        <td>
                            <a href="MainController?btnAction=load&id=${x.id}">update</a>
                            <a href="MainController?btnAction=delete&id=${x.id}">delete</a>
                        </td>
                    </tr>
                </c:forEach>
                 
            </table>
            
        </form>
    </body>
</html>
