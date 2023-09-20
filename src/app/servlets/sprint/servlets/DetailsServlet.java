package app.servlets.sprint.servlets;

import app.servlets.sprint.domain.DbManagers;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.time.LocalDate;

@WebServlet("/Sprint1/tasks/details")
public class DetailsServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        Long id = Long.valueOf(req.getParameter("id"));
        req.setAttribute("taskDetails", DbManagers.getTask(id));
        req.getRequestDispatcher("/details.jsp").forward(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        Long id = Long.valueOf(req.getParameter("task_id"));
        String name = req.getParameter("task_name");
        String description = req.getParameter("task_description");
        LocalDate deadlinedate = LocalDate.parse(req.getParameter("task_deadlinedate"));

//        DbManagers.updateTasks(id,name,description,deadlinedate);
//        resp.sendRedirect("/Sprint1/tasks");
    }
}
