package controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

import dao.LjbDao;
import dto.LjbDto;

@WebServlet("/rentalDetail")
public class SearchServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;
   
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String rentalNo = request.getParameter("rental_no");
        
        LjbDao dao = new LjbDao();
        LjbDto dto = dao.selectRentalByNo(rentalNo);
        
        request.setAttribute("dto", dto);
        request.getRequestDispatcher("search.jsp").forward(request, response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request, response);
    }
}
