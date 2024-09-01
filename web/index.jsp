<%-- 
    Document   : index
    Created on : Aug 31, 2024, 12:52:08 PM
    Author     : ravis
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Home</title>
    </head>
    <body>
        <h1>Home Page</h1>
        <form action="User_LogOut" method="POST"> 
            <button>Log Out</button>
        </form>

        <div>
            <div class="margin">Mobile :${sessionScope.user.mobile}</div>
        </div>
        <div>
            <div class="margin">Name :${sessionScope.user.name}</div>
        </div>
        <div>
            <div class="margin">Password :${sessionScope.user.password}</div>
        </div>
        <div>
            <div class="margin">Country :${sessionScope.user.country}</div>
        </div>
        <div>
            <div class="margin">gender :${sessionScope.user.gender}</div>
        </div>

    </body>
</html>
