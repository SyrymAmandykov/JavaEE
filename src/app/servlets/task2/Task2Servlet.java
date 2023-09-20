package app.servlets.task2;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/task2")
    public class Task2Servlet extends HttpServlet {

        @Override
        protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
            response.setContentType("text/html");
            PrintWriter printWriter = response.getWriter();

            printWriter.println("<table><thead><th>Name</th><th>Surname</th><th>Department</th><th>Salary</th></thead><tbody>");
            DataBase database = new DataBase();
            for (int i = 0; i < database.getDb().size(); i++) {
                printWriter.println(
                        "<tr>" +
                                "<td>" + database.getDb().get(i).getName() + "</td>" +
                                "<td>" + database.getDb().get(i).getSurname() + "</td>" +
                                "<td>" + database.getDb().get(i).getDepartment() + "</td>" +
                                "<td>" + database.getDb().get(i).getSalary() + "</td>" +
                                "</tr>");
            }

            printWriter.println("</tbody></table>");
    }
}
