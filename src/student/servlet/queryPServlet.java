package student.servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import student.inform.Pay;
import student.service.IPayService;
import student.service.impl.PayServiceImpl;



public class queryPServlet extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

			request.setCharacterEncoding("utf-8");
			
			IPayService  service = new PayServiceImpl ();
			List<Pay> pays = service.queryPays();
			request.setAttribute("pays", pays);
			
			request.getRequestDispatcher("pay.jsp").forward(request, response);
				
		}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
