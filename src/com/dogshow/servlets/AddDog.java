package com.dogshow.servlets;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.dogshow.beans.Doggy;
import com.dogshow.dao.DAO;


@WebServlet("/AddDogs")
public class AddDog extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String number = "NULL";
		String dogname = request.getParameter("dogname");
		String ownername = request.getParameter("ownername");
		String breed = request.getParameter("breed");
		String group = request.getParameter("group");
		String gender = request.getParameter("gender");
		String dogclass = request.getParameter("dogclass");
		
		
		Doggy userinfo = new Doggy(number, dogname, ownername, breed, group, gender, dogclass);
		
		DAO dogs = new DAO();
		
		dogs.addDog(userinfo);
		
		response.sendRedirect("index.jsp");
	}

}
