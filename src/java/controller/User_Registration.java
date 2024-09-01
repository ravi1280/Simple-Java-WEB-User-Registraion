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

@WebServlet(name = "User_Registration", urlPatterns = {"/registration"})
public class User_Registration extends HttpServlet {
    
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String mobile = request.getParameter("mobile");
        String name = request.getParameter("name");
        String password = request.getParameter("password");
        String gender = request.getParameter("gender");
        String country = request.getParameter("country");
        
        HashMap<String, User> userMap = (HashMap<String, User>) request.getServletContext().getAttribute("userMap");
        
        if (userMap.containsKey(mobile)) {
            response.sendRedirect("userRegistration.jsp?msg=error1");
        } else {
            User u1 = new User(mobile, name, password, gender, country);
            userMap.put(mobile, u1);
            response.sendRedirect("userLogin.jsp");
        }

//        System.out.println(mobile);
//        System.out.println(name);
//        System.out.println(password);
//        System.out.println(gender);
//        System.out.println(country);
    }
    
}
