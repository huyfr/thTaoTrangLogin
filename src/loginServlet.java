import java.io.IOException;
import java.io.PrintWriter;


@javax.servlet.annotation.WebServlet(name = "loginServlet", urlPatterns = "/login")
public class loginServlet extends javax.servlet.http.HttpServlet {

    public static final String USERNAME_ADMIN = "admin";
    public static final String PASSWORD_ADMIN = "admin";

    protected void doPost(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {

        String username = request.getParameter("username");
        String password = request.getParameter("password");

        PrintWriter pw = response.getWriter();
        pw.println("<html>");

        if (username.equals(USERNAME_ADMIN) && password.equals(PASSWORD_ADMIN)) {
            pw.println("<h1>Welcome "+username+" to website</h1>");
        } else {
            pw.println("<h1>Login error</h1>");
        }
        pw.println("</html>");
    }

    protected void doGet(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {

    }
}
