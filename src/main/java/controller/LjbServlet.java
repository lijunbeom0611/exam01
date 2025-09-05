package controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

import dao.LjbDao;
import dto.LjbDto;

@WebServlet("/insertRental")
public class LjbServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;
  
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        request.setCharacterEncoding("utf-8");
        
        String rentalNo = request.getParameter("rental_no");
        String studentNo = request.getParameter("student_no");
        String rentalDate = request.getParameter("rental_date");
        String uniformSize = request.getParameter("uniform_size");
        
        LjbDao rentalDao = new LjbDao();
        LjbDto rentalDto = new LjbDto(rentalNo, studentNo, rentalDate, uniformSize);
        rentalDao.insertRental(rentalDto);
        
        response.sendRedirect("rentalList");
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        doPost(request, response);
    }
}