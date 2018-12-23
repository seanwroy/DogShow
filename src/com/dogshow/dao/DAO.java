package com.dogshow.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.Statement;
import java.util.ArrayList;
import com.dogshow.beans.Doggy;



public class DAO {

	public static void addDog(Doggy userinput) {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection conn = null;
			
			conn = DriverManager.getConnection("jdbc:mysql://localhost/dogshow", "root", "root");
			String q = "INSERT INTO dogs VALUES(" + userinput.getNumber() + ", '" + userinput.getDogname() + "', '" + userinput.getOwnername()
					+ "', '" + userinput.getBreed() + "', '" + userinput.getGroup() + "', '" + userinput.getGender() 
					+ "', '" + userinput.getDogclass() +"')";
			
			Statement st = conn.createStatement();
			
			st.executeUpdate(q);
			
			System.out.println("Connection Success");
			conn.close();
		} catch (Exception e) {
			System.out.println("Connection Failed");
			System.out.println(e);
		}
	}
	
	public static ArrayList<Doggy> getDog() {
		ArrayList<Doggy> dogs = new ArrayList<Doggy>();
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection conn = null;
			
			conn = DriverManager.getConnection("jdbc:mysql://localhost/dogshow", "root", "root");
			String q = "SELECT * FROM dogs";
			
			Statement st = conn.createStatement();
			
			//st.executeUpdate(q);
			
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
	
			System.out.println("Connection Success");
			conn.close();
		} catch (Exception e) {
			System.out.println("Connection Failed");
			System.out.println(e);
		}
		
		return dogs;
	}
}
