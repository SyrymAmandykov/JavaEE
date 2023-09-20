package app.servlets.task6;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/task6")
public class Task6Servlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html");
        PrintWriter printWriter = resp.getWriter();

        printWriter.println(

                "<form action = \"\" method = \"POST\"> " +

                        "<label id = \"client_fullName\"> FULL NAME : </label>" +
                        "<input id = \"client_fullName\" name = \"fullName\"> <br>" +

                        "<label id = \"client_examPoints\">  EXAM POINTS : </label>" +
                        "<input id = \"client_examPoints\" type = \"number\" name = \"examPoints\"> <br>" +

                        "<button> SUBMIT EXAM </button>" +

                        "</form>"

        );
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html");
        String fuName = req.getParameter("fullName");
        int ePoints = Integer.parseInt(req.getParameter("examPoints"));


        //PrintWriter printWriter = resp.getWriter();
        //String[] bally = {"A","B","C","D","F"};

//        if (ePoints >= 90){
//            printWriter.println(fuName + "got" + bally[0] + "for exam");
//        }
//        if (ePoints < 89 && ePoints > 75){
//            printWriter.println(fuName + "got" + bally[1] + "for exam");
//        }
//        if (ePoints < 74 && ePoints > 60){
//            printWriter.println(fuName + "got" + bally[] + "for exam");
//        }
//        if (ePoints < 59 && ePoints > 50){
//            printWriter.println(fuName + "got" + bally[0] + "for exam");
//        } else {
//            printWriter.println(fuName + "got" + bally[0] + "for exam");
//        }

        StringBuilder stringBuilder = new StringBuilder();
        String bally = (
                ePoints >= 90  ? "A" :
                ePoints < 89 && ePoints > 75  ? "B" :
                        "F"
                );


        stringBuilder.append(fuName).append(bally);

        PrintWriter printWriter = resp.getWriter();
        printWriter.println(stringBuilder);
    }
}
