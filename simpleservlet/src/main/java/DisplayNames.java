import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/")
public class DisplayNames extends HttpServlet {

    @Override
    public void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        ArrayList<String> listOfNames = new ArrayList<>();
        listOfNames.add("Alexander");
        listOfNames.add("Anna");
        listOfNames.add("Konstantin");
        listOfNames.add("Daniil");
        listOfNames.add("Eugene");
        listOfNames.add("Ivan");
        listOfNames.add("Jaroslav");
        listOfNames.add("Michael");
        listOfNames.add("Ramzan");
        listOfNames.add("Valeria");
        listOfNames.add("Daniil");
        listOfNames.add("Eugene");
        listOfNames.add("Egor");
        listOfNames.add("Dmitri");
        listOfNames.add("Gleb");
        listOfNames.add("Mansur");
        listOfNames.add("Margarita");
        listOfNames.add("Maria");
        listOfNames.add("Olga");
        listOfNames.add("Ilya");

        req.setAttribute("names", listOfNames);

        req.getRequestDispatcher("page.jsp").forward(req, resp);
    }

}
