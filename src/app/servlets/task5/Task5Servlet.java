package app.servlets.task5;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/task5")
public class Task5Servlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html");
        PrintWriter printWriter = resp.getWriter();

        printWriter.println("<form action-\" \" method=\"POST\">" +

                "<label id = \"client_fulName_input\"> Full Name: </label>" +
                "<input id=\"client_fulName_input\" type=\"text\" name=\"fullName\" required=true placeholder=\"Enter your fullName\"><br>" +

                "<label id = \"client_age_input\"> Age: </label>" +
                "<input id=\"client_age_input\" type=\"number\" name=\"age\" required=true placeholder=\"Enter your age\"><br>" +

                "<label id = \"client_gender\"> Gender: </label>" +
                "<input name = \"gender\" value = \"Male\" type = \"checkbox\"> Male" + "<br>" +
                "<input name = \"gender\" value = \"Female\" type = \"checkbox\"> Female" + "<br>" +

                "<button>SUBMIT</button>" +

                "</form"
        );
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html");
        String fullName = req.getParameter("fullName");
        int age = Integer.parseInt(req.getParameter("age"));
        String gender = req.getParameter("gender");

//Решение первоклассников
//        PrintWriter printWriter = resp.getWriter();
//        if (gender.equals("Male") && age > 18) {
//            printWriter.println("Hello Dear Mister " + fullName);
//        }
//        if (gender.equals("Male") && age < 18) {
//            printWriter.println("Hello Dude Mister " + fullName);
//        }
//        if (gender.equals("Female") && age > 18) {
//            printWriter.println("Hello Dear Miss " + fullName);
//        }
//        if (gender.equals("Female") && age < 18) {
//            printWriter.println("Hello Dude Miss " + fullName);
//        }


// более оптимальное решение через StringBuilder

        StringBuilder stringBuilder = new StringBuilder("Hello");
        String dearOrDude = (age > 18 ? "Dear" : "Dude");
        String misterOrMiss =  (gender.equals("Male") ? "Mister" : "Miss");

        stringBuilder.append(dearOrDude).append(misterOrMiss).append(fullName);

        PrintWriter printWriter = resp.getWriter();
        printWriter.println(stringBuilder);
    }
}
