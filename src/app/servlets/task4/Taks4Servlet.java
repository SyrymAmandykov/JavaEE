package app.servlets.task4;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/task4")
public class Taks4Servlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html");
        PrintWriter printWriter = resp.getWriter();

        printWriter.println("<form action-\" \" method=\"POST\">" +

                "<label id = \"client_name_input\"> Client name: </label>" +
                "<input id=\"client_name_input\" type=\"text\" name=\"client_name\" required=true placeholder=\"Enter your name\"><br>" +

                "<label id = \"client_surname_input\"> Client surname: </label>" +
                "<input id=\"client_surname_input\" type=\"text\" name=\"client_surname\" required=true placeholder=\"Enter your surname\"><br>" +

                "<label id = \"client_food_name\"> Food: </label>" +
                "<select name = \"client_food_name\">"+
                "<option> Manty - 1000KZT</option>"+
                "<option> Plov - 1200KZT</option>"+
                "<option> Besh - 1500KZT</option>"+
                "</select><br>"+

                "<button>SUBMIT</button>" +

                "</form"
                );
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String name = req.getParameter("client_name");
        String surName = req.getParameter("client_surname");
        String food = req.getParameter("client_food_name");

        PrintWriter printWriter = resp.getWriter();
        printWriter.println(name + ' ' + surName + ' ' +  "ordered" + ' ' + food);
    }
}
