package com.dogshow.servlets;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.Statement;
import java.util.ArrayList;


import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import com.dogshow.beans.Show;


@WebServlet("/ShowList")
public class ShowList extends HttpServlet {
	private static final long serialVersionUID = 1L;
 
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		ArrayList<Show> one = new ArrayList<Show>();
		ArrayList<Show> two = new ArrayList<Show>();
		ArrayList<Show> three = new ArrayList<Show>();
		ArrayList<Show> four = new ArrayList<Show>();
		ArrayList<Show> five = new ArrayList<Show>();
		ArrayList<Show> six = new ArrayList<Show>();
		ArrayList<Show> seven = new ArrayList<Show>();
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection conn = null;
				
			conn = DriverManager.getConnection("jdbc:mysql://localhost/dogshow", "root", "root");
			
			for(int i = 0; i <= 7; i++) {
					String group = ""; 
					
				    if(i == 1) {
				    	group = "Group 1: Sporting Dogs";
				    } else if(i == 2) {
				    	group = "Group 2: Hounds";
				    } else if(i == 3) {
				    	group = "Group 3: Working Dogs";
				    } else if(i == 4) {
				    	group = "Group 4: Terriers";
				    } else if(i == 5) {
				    	group = "Group 5: Toys";
				    } else if(i == 6) {
				    	group = "Group 6: Non-sporting Dogs";
				    } else if(i == 7) {
				    	group = "Group 7: Herding";
				    }
				    
					String q = "SELECT Count(*) as '#', breed as 'Breed', " + 
					"Count(CASE WHEN gender = 'Male' AND Class = 'Class Dog' THEN number END) as 'Male Class Dog'," + 
					"Count(CASE WHEN gender = 'Female' AND Class = 'Class Dog' THEN number END) as 'Female Class Dog'," + 
					"Count(CASE WHEN gender = 'Male' AND Class = 'Specialty Dog' THEN number END) as 'Male Specialty Dog'," + 
					"Count(CASE WHEN gender = 'Female' AND Class = 'Specialty Dog' THEN number END) as 'Female Specialty Dog'" + 
					"FROM dogs WHERE GroupName ='" + group + "' GROUP BY breed;";
					
					Statement st = conn.createStatement();
						
					ResultSet rs = st.executeQuery(q);
					ResultSetMetaData rsmd = rs.getMetaData();		
					
					if(i == 1) {
						
						while(rs.next()) {
							Show c = new Show();
							c.setGroupName(group);
							c.setBreedCount(rs.getString(1));
							c.setBreed(rs.getString(2));
							c.setMaleCount(rs.getString(3));
							c.setFemaleCount(rs.getString(4));
							c.setMaleSpecialCount(rs.getString(5));
							c.setFemaleSpecialCount(rs.getString(6));
							
							one.add(c);
						}
						
				    } else if(i == 2) {
						
						while(rs.next()) {
							Show c = new Show();
							c.setGroupName(group);
							c.setBreedCount(rs.getString(1));
							c.setBreed(rs.getString(2));
							c.setMaleCount(rs.getString(3));
							c.setFemaleCount(rs.getString(4));
							c.setMaleSpecialCount(rs.getString(5));
							c.setFemaleSpecialCount(rs.getString(6));
							
							two.add(c);
						}
				    } else if(i == 3) {
						
						while(rs.next()) {
							Show c = new Show();
							c.setGroupName(group);
							c.setBreedCount(rs.getString(1));
							c.setBreed(rs.getString(2));
							c.setMaleCount(rs.getString(3));
							c.setFemaleCount(rs.getString(4));
							c.setMaleSpecialCount(rs.getString(5));
							c.setFemaleSpecialCount(rs.getString(6));
							
							three.add(c);
						}
				    } else if(i == 4) {
						
						while(rs.next()) {
							Show c = new Show();
							c.setGroupName(group);
							c.setBreedCount(rs.getString(1));
							c.setBreed(rs.getString(2));
							c.setMaleCount(rs.getString(3));
							c.setFemaleCount(rs.getString(4));
							c.setMaleSpecialCount(rs.getString(5));
							c.setFemaleSpecialCount(rs.getString(6));
							
							four.add(c);
						}
				    } else if(i == 5) {
						
						while(rs.next()) {
							Show c = new Show();
							c.setGroupName(group);
							c.setBreedCount(rs.getString(1));
							c.setBreed(rs.getString(2));
							c.setMaleCount(rs.getString(3));
							c.setFemaleCount(rs.getString(4));
							c.setMaleSpecialCount(rs.getString(5));
							c.setFemaleSpecialCount(rs.getString(6));
							
							five.add(c);
						}
				    } else if(i == 6) {
						
						while(rs.next()) {
							Show c = new Show();
							c.setGroupName(group);
							c.setBreedCount(rs.getString(1));
							c.setBreed(rs.getString(2));
							c.setMaleCount(rs.getString(3));
							c.setFemaleCount(rs.getString(4));
							c.setMaleSpecialCount(rs.getString(5));
							c.setFemaleSpecialCount(rs.getString(6));
							
							six.add(c);
						}
				    } else if(i == 7) {
						
						while(rs.next()) {
							Show c = new Show();
							c.setGroupName(group);
							c.setBreedCount(rs.getString(1));
							c.setBreed(rs.getString(2));
							c.setMaleCount(rs.getString(3));
							c.setFemaleCount(rs.getString(4));
							c.setMaleSpecialCount(rs.getString(5));
							c.setFemaleSpecialCount(rs.getString(6));
							
							seven.add(c);
						}
				    }			
			}
			
			request.setAttribute("one", one);
			request.setAttribute("two", two);
			request.setAttribute("three", three);
			request.setAttribute("four", four);
			request.setAttribute("five", five);
			request.setAttribute("six", six);
			request.setAttribute("seven", seven);

			//Request Dispatch to ShowList JSP
			request.getRequestDispatcher("showlist.jsp").forward(request, response);
			
		System.out.println("Connection Success");
		conn.close();
	} catch (Exception e) {
		System.out.println("Connection Failed");
		System.out.println(e);
	}	
		
	}
	
}