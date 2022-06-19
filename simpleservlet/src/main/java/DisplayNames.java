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
        listOfNames.add("cat");
        listOfNames.add("dog");
        listOfNames.add("cow");

        req.setAttribute("names", listOfNames);

        req.getRequestDispatcher("page.jsp").forward(req, resp);
    }

}
