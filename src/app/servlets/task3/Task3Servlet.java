package app.servlets.task3;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/task3")
public class Task3Servlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html");
        PrintWriter printWriter = resp.getWriter();

        printWriter.println("<form action-\"\" method=\"GET\">" +
                "<label id=\"client_name_input\">Client name:</label>" +
                "<input id=\"client_name_input\" type=\"text\" name=\"client_name\" required=true placeholder=\"Enter your name\"><br>" +
                "<label id=\"client_surname_input\">Client surname:</label>" +
                "<input id=\"client_surname_input\" type=\"text\" name=\"client_surname\" required=true placeholder=\"Enter your surname\"><br>" +
                "<button>SUBMIT</button>" +
                "</form");
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String name = req.getParameter("client_name");
        String surname = req.getParameter("client_surname");

        PrintWriter printWriter = resp.getWriter();
        printWriter.println("My name is " + name + " and surname is " + surname);
    }
}
