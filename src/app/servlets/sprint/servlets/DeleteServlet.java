package app.servlets.sprint.servlets;

import app.servlets.sprint.domain.DbManagers;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/Sprint1/tasks/delete")
public class DeleteServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        Long id = Long.valueOf(req.getParameter("task_id"));
        DbManagers.deleteTask(id);

        resp.sendRedirect("/Sprint1/tasks");

    }
}
