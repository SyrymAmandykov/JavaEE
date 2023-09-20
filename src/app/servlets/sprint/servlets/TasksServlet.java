package app.servlets.sprint.servlets;

import app.servlets.sprint.domain.DbManagers;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.time.LocalDate;

@WebServlet("/Sprint1/tasks")
public class TasksServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setAttribute("tasksList", DbManagers.getAllTasks()); // здесь мы храним список всех наших тасков
        req.getRequestDispatcher("/sprintTask.jsp").forward(req, resp);  // отвечает на какое именно jsp старницу перекидывать после завершения запроса
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String name = req.getParameter("task_name");
        String description = req.getParameter("task_description");
        LocalDate deadlinedate = LocalDate.parse(req.getParameter("task_deadlinedate"));

        DbManagers.addTask(name,description,deadlinedate);
        resp.sendRedirect("/Sprint1/tasks");
    }
}


