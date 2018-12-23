package com.dogshow.servlets;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import com.dogshow.beans.Doggy;
import com.dogshow.dao.DAO;


@WebServlet("/GetDogs")
public class GetDog extends HttpServlet {
	private static final long serialVersionUID = 1L;
 
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		ArrayList<Doggy> dogs = (ArrayList<Doggy>) request.getAttribute("dogs");
		
		DAO c = new DAO();
		
		dogs = c.getDog();
		
		request.setAttribute("dogs", dogs);
		
		//Request Dispatch to View JSP
		request.getRequestDispatcher("view.jsp").forward(request, response);
	}
}
