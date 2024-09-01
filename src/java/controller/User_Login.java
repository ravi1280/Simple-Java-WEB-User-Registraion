package controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashMap;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import model.User;

@WebServlet(name = "User_Login", urlPatterns = {"/login"})
public class User_Login extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String mobile = request.getParameter("mobile");
        String password = request.getParameter("password");

        HashMap<String, User> userMap = (HashMap<String, User>) request.getServletContext().getAttribute("userMap");
        if (userMap.containsKey(mobile)) {
            User user = userMap.get(mobile);
            if (user.getPassword().equals(password)) {
                request.getSession().setAttribute("user", user);
                response.sendRedirect("index.jsp");
            }else{
                 response.sendRedirect("userLogin.jsp?msg=error2");
            }
        } else {
            response.sendRedirect("userLogin.jsp?msg=error2");
        }
    }

}
