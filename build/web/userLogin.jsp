
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Login</title>
        <link rel="stylesheet" href="css/style.css"/>
    </head>
    <body>
        <h1>User Login!</h1>
        <c:if test="${param.msg=='error2'}">
            <p class="paragraph">Invalid user Mobile !!</p>
        </c:if>
        <form action="login" method="POST">
            <div class="margin">
                <div class="submargin">Mobile</div>
                <input type="text" name="mobile"/>
            </div> 
            <div class="margin">
                <div class="submargin">Password</div>
                <input type="password" name="password"/>
            </div>
            <button class="margin" type="submit">Create Account</button>
        </form>
            <br/>
        <form action="userRegistration.jsp" >
        
            <button class="margin" type="submit">Go to Registration</button>
        </form>
    </body>
</html>
