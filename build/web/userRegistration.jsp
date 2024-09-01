
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>User Registration</title>
        <link rel="stylesheet" href="css/style.css"/>
    </head>
    <body>
        <h1>User Registration</h1>
        <c:if test="${param.msg=='error1'}">
            <p class="paragraph">This NUmber Already Used !!</p>

        </c:if>
        <form action="registration" method="POST">
            <div class="margin">
                <div class="submargin">Mobile</div>
                <input type="text" name="mobile"/>
            </div>
            <div class="margin">
                <div class="submargin">Name</div>
                <input type="text" name="name"/>
            </div>
            <div class="margin">
                <div class="submargin">Gender</div>
                <input type="radio" name="gender" value="male"/> <span>Male</span>
                <input type="radio" name="gender" value="female"/> <span>Female</span>
            </div>
            <div class="margin">
                <div class="submargin">Country</div>
                <select name="country">
                    <option >Sri Lanka</option>
                    <option >Japan</option>
                    <option >Australia</option>
                    <option >Italy</option>
                    <option>Germany</option>
                </select>
            </div>
            <div class="margin">
                <div class="submargin">Password</div>
                <input type="password" name="password"/>
            </div>
            <button class="margin" type="submit">Create Account</button>
        </form>
            <br/>
        <form action="userLogin.jsp" >

            <button class="margin" type="submit">Go to Login</button>
        </form>

    </body>
</html>
