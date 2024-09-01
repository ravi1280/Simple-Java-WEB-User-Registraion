package model;

import java.util.HashMap;
import javax.servlet.ServletContextEvent;
import javax.servlet.annotation.WebListener;

@WebListener
public class Listener1 implements javax.servlet.ServletContextListener {

    @Override
    public void contextInitialized(ServletContextEvent sce) {
        HashMap<String, User> userMap = new HashMap<String, User>();
        sce.getServletContext().setAttribute("userMap", userMap);
    }

    @Override
    public void contextDestroyed(ServletContextEvent sce) {

    }

}
