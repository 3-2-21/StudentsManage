package student.servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import student.inform.Page;
import student.inform.Pay;
import student.service.IPayService;
import student.service.impl.PayServiceImpl;


public class queryPayByPage extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
  
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		IPayService payService = new PayServiceImpl();
		int count = payService.getTotalCount();
		//将分页所需的字段组装到Page对象中
		Page page =new Page();		
		String cPage = request.getParameter("currentPage");	
		if(cPage==null) {
			cPage="0";		
		}
		int currentPage = Integer.parseInt(cPage);
		page.setCurrentPage(currentPage);
		
		int totalCount = payService.getTotalCount();
		page.setTotalCount(totalCount);	
		//每页数据总数	
		int pageSize =8;
		page.setPageSize(pageSize);
	
		List<Pay> pays = payService.queryPayByPage(currentPage, pageSize);

		System.out.println(pays);
		System.out.println(count);			
		page.setPays(pays);
		request.setAttribute("p", page);
		request.getRequestDispatcher("pay.jsp").forward(request, response);
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
