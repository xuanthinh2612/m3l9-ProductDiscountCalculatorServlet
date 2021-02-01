package controller;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "ProductDiscountCalculatorServlet", urlPatterns = "/display-discount")
public class ProductDiscountCalculatorServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        PrintWriter writer = response.getWriter();

        writer.println("<html>");

        String mt = request.getParameter("description");
        String gia = request.getParameter("price");
        String ck = request.getParameter("discount");
        writer.println("<br> mo ta san pham: "+ mt);
        writer.println("<br> gia niem yet: "+gia);
        writer.println("<br> ty le chiet khau: "+ck);

        double gia1 = Double.parseDouble(gia);
        double ck1 = Double.parseDouble(ck);
        double tongCK = (gia1*ck1*0.01);

        writer.println("<br> luong chiet khau "+tongCK);
        writer.println("<br> gia sau chiet khau: "+ (gia1-tongCK));
        writer.println("</html>");



    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
