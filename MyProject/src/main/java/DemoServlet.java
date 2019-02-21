import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;


@WebServlet("/DemoServlet")
public class DemoServlet extends HttpServlet {

    static  List<Person> people = AddPerson.add();
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {


        String name = request.getParameter("name");
        String surname = request.getParameter("surname");
        String answer = "";
        int count = 0;
        for (Person person: people) {
            if (person.getName().equals(name) && person.getSname().equals(surname)) {
                answer = "info: " + person;

                count++;
            }
        }
        if (count == 0) {
            answer = "oops :( wrong input";
        }

        PrintWriter printWriter = response.getWriter();
        printWriter.println(answer);


        request.getSession().setAttribute("answer",answer);


        request.getRequestDispatcher("index.jsp").forward(request,response);

    }
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {



        String password = request.getParameter("password");

        String answer = "";
        int count = 0;
        for (Person person: people) {
            if (person.getAddress().equals(password)) {
                answer = "info: " + person;

                count++;
            }
        }
        if (count == 0) {
            answer = "oops :( wrong input";
        }
        request.getSession().setAttribute("answer",answer);


        request.getRequestDispatcher("index.jsp").forward(request,response);
    }


}
