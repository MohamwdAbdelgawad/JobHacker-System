package com;


import java.io.IOException;
import java.io.PrintWriter;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class NumbersFactorial extends HttpServlet {
    protected void service(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
    	int number = Integer.parseInt(request.getParameter("number"));
    	if(number>20) {
    		response.sendRedirect("factorial.jsp");
    	}
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        out.println("<html>");
        out.println("<head>");
        out.println("<title>Factorial Tables</title>");
        out.println("</head>");
        out.println("<body>");
        out.println("<h1>Factorial Tables</h1>");
        out.println("<table border='1' style='float:left; margin-right: 20px;'>");
        out.println("<tr><th>Number</th></tr>");

        for (int i = 0; i <= number; i++) {
            out.println("<tr><td>" + i + "</td></tr>");
        }

        out.println("</table>");

        out.println("<table border='1' style='float:left;'>");
        out.println("<tr><th>Factorial</th></tr>");

        for (int i = 0; i <= number; i++) {
            long factorial = calculateFactorial(i);
            out.println("<tr><td>" + factorial + "</td></tr>");
        }

        out.println("</table>");
        out.println("</body>");
        out.println("</html>");
    }

    private long calculateFactorial(int n) {
        if (n == 0 || n == 1) {
            return 1;
        } else {
            long result = 1;
            for (int i = 2; i <= n; i++) {
                result *= i;
            }
            return result;
        }
    }
}
