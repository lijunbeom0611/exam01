package controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.LjbDao;
import dto.LjbDto;

@WebServlet("/insert")
public class LjbServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	  protected void doPost(HttpServletRequest request, HttpServletResponse response)
	            throws ServletException, IOException {
	        request.setCharacterEncoding("utf-8");
	        String resvNo = request.getParameter("resv_no");
	        String custNo = request.getParameter("cust_no");
	        String resvDate = request.getParameter("resv_date");
	        String courtNo = request.getParameter("court_no");
	        
	        LjbDao badmintonDao = new LjbDao();
	        LjbDto resvDto = new LjbDto(resvNo, custNo, resvDate, courtNo);
	        badmintonDao.insertReservation(resvDto);
	        response.sendRedirect("list");
//	        ResvationDTO resvDto = new ResvationDTO(resvNo, custNo, resvDate, courtNo);

//	        request.setAttribute("resvDto", resvDto);
//	        request.getRequestDispatcher("result.jsp").forward(request, response);
	    }

	    protected void doGet(HttpServletRequest request, HttpServletResponse response)
	            throws ServletException, IOException {
	        doPost(request, response);
	    }
}