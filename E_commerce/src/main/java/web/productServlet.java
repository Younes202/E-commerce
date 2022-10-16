package web;

import jakarta.servlet.ServletException;



import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import Models.product;
import Models.operation;


/**
 * Servlet implementation class productServlet
 */
public class productServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	

	private 	operation op ;

	@Override
	public void init() throws ServletException {
		// TODO Auto-generated method stub
		op = new operation();
		
	}
    /**
     * @see HttpServlet#HttpServlet()
     */
    public productServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		this.getServletContext().getRequestDispatcher("/index.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
	
		
		String name = request.getParameter("name");
		request.setAttribute("name", name);
		String desc = request.getParameter("desc");
		request.setAttribute("desc", desc);

		String price = request.getParameter("price");
		request.setAttribute("price", price);

		String etat = request.getParameter("etat");
		request.setAttribute("etat", etat);
		product product = new product(1L,name,desc,Float.parseFloat(price),Integer.parseInt(etat));
		op.adding(product);
		productBeans prb = new productBeans();
		request.setAttribute("prb", prb);

		
		this.getServletContext().getRequestDispatcher("/index.jsp").forward(request, response);


		

	}

}
