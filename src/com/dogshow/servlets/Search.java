package com.dogshow.servlets;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.Statement;
import java.util.ArrayList;
import java.lang.StringBuilder;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import com.dogshow.beans.Doggy;


@WebServlet("/Search")
public class Search extends HttpServlet {
	private static final long serialVersionUID = 1L;
 
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		ArrayList<Doggy> dogs = new ArrayList<Doggy>();
		
		try {	
			String number = request.getParameter("number");
			String dogname = request.getParameter("dogname");
			String ownername = request.getParameter("ownername");
			String breed = request.getParameter("breed");
			String group = request.getParameter("group");
			
			Class.forName("com.mysql.jdbc.Driver");
			Connection conn = null;
				
			conn = DriverManager.getConnection("jdbc:mysql://localhost/dogshow", "root", "root");
			
			String q = "SELECT * FROM dogs"; 
					
		
			StringBuilder stringBuilder = new StringBuilder();
			
			stringBuilder.append("SELECT * FROM dogs WHERE ");
			
			if(!number.equals("")){
				if(!stringBuilder.toString().contains("AND ") && (!stringBuilder.toString().contains("Number") && !stringBuilder.toString().contains("Name") && 
						!stringBuilder.toString().contains("Owner_name") && !stringBuilder.toString().contains("Breed") && !stringBuilder.toString().contains("GroupNo"))) {
					stringBuilder.append("Number= '" + number + "'");
				} else {
					stringBuilder.append(" AND Number= '" + number + "'");
				}
			} 
			
			if(!dogname.equals("")){
				if(!stringBuilder.toString().contains("AND ") && (!stringBuilder.toString().contains("Number") && !stringBuilder.toString().contains("Name") && 
						!stringBuilder.toString().contains("Owner_name") && !stringBuilder.toString().contains("Breed") && !stringBuilder.toString().contains("GroupNo"))) {
					stringBuilder.append("Name= '" + dogname + "'");
				} else {
					stringBuilder.append(" AND Name= '" + dogname + "'");
				}
			} 
			
			if(!ownername.equals("")){
				if(!stringBuilder.toString().contains("AND ") && (!stringBuilder.toString().contains("Number") && !stringBuilder.toString().contains("Name") && 
						!stringBuilder.toString().contains("Owner_name") && !stringBuilder.toString().contains("Breed") && !stringBuilder.toString().contains("GroupNo"))) {
					stringBuilder.append("Owner_name= '" + ownername + "'");
				} else {
					stringBuilder.append(" AND Owner_name= '" + ownername + "'");
				}
			}  
			
			if(!breed.equals("")){
				if(!stringBuilder.toString().contains("AND ") && (!stringBuilder.toString().contains("Number") && !stringBuilder.toString().contains("Name") && 
						!stringBuilder.toString().contains("Owner_name") && !stringBuilder.toString().contains("Breed") && !stringBuilder.toString().contains("GroupNo"))) {
					stringBuilder.append("Breed= '" + breed + "'");
				} else {
					stringBuilder.append(" AND Breed= '" + breed + "'");
				}
			}
			
			if(!group.equals("")){
				if(!stringBuilder.toString().contains("AND ") && (!stringBuilder.toString().contains("Number") && !stringBuilder.toString().contains("Name") && 
						!stringBuilder.toString().contains("Owner_name") && !stringBuilder.toString().contains("Breed") && !stringBuilder.toString().contains("GroupNo"))) {
					stringBuilder.append("GroupNo= '" + group  + "'");
				} else {
					stringBuilder.append(" AND GroupNo= '" + group  + "'");
				}
			} 
			
			if(number.equals("") && dogname.equals("") && ownername.equals("") && breed.equals("") && group.equals("")) {
				stringBuilder.delete(0, stringBuilder.length());
				stringBuilder.append("SELECT * FROM dogs");
			}
			
			
			q = stringBuilder.toString();
			
			System.out.println(q);
			
			Statement st = conn.createStatement();
				
			ResultSet rs = st.executeQuery(q);
			ResultSetMetaData rsmd = rs.getMetaData();		
			
			while(rs.next()) {
				Doggy c = new Doggy();
				c.setNumber(rs.getString(1));
				c.setDogname(rs.getString(2));
				c.setOwnername(rs.getString(3));
				c.setBreed(rs.getString(4));
				c.setGroup(rs.getString(5));
				c.setGender(rs.getString(6));
				c.setDogclass(rs.getString(7));
				
				dogs.add(c);
			}
			
			request.setAttribute("dogs", dogs);
			
			//Request Dispatch to Search JSP
			request.getRequestDispatcher("search2.jsp").forward(request, response);
			
		System.out.println("Connection Success");
		conn.close();
	} catch (Exception e) {
		System.out.println("Connection Failed");
		System.out.println(e);
	}
	
	}
}

