<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ page import="com.dogshow.beans.*" %>
<%@ page import="com.dogshow.dao.*" %>
<%@ page import="com.dogshow.servlets.*" %>
<%@ page import="java.util.ArrayList" %>
<!DOCTYPE html>
<html>
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet" href="https://www.w3schools.com/w3css/4/w3.css">
<link rel="stylesheet" type="text/css" href="rsc/viewstyle.css"/>
<head>
<title>View Entrants</title>

<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
<script
  src="https://code.jquery.com/ui/1.12.1/jquery-ui.js"
  integrity="sha256-T0Vest3yCU7pafRw9r+settMBX6JkKN06dqBnpQ8d30="
  crossorigin="anonymous"></script>
<script src="rsc/script.js"></script>

</head>
<body>
	 <h1>Entrants</h1>
	 
	 <div class="w3-container" style="width: 1100px; margin-left: auto; margin-right: auto;">
	 <a href="index.jsp" style="margin-left: 1000px; color: red;">Go Back</a>
     <table class="w3-table w3-bordered">
		

        <thead>
          <tr> 
	          <th colspan="6"><b>Group 1: Sporting Dogs</b></th>
       	  </tr>
       	  </thead>
       	  <%ArrayList<Show> one = (ArrayList<Show>) request.getAttribute("one");
        for(Show s:one) {%> 	
       	  <tbody>
            <tr>
                <td><%=s.getBreedCount()%></td>
                <td><%=s.getBreed()%></td>
                <td><%=s.getMaleCount()%></td>
                <td><%=s.getFemaleCount()%></td> 
                <td><%=s.getMaleSpecialCount()%></td>
                <td><%=s.getFemaleSpecialCount()%></td>
            <%}
           %> 
            </tr>
            </tbody>
        </table>
        <br>
        <br>
        <table class="w3-table w3-bordered">
		

       <thead>
          <tr> 
	          <th colspan="6"><b>Group 2: Hounds</b></th>
       	  </tr>
       	  </thead>
       	  <%ArrayList<Show> two = (ArrayList<Show>) request.getAttribute("two");
        for(Show s:two) {%> 	
       	  <tbody>
            <tr>
                <td><%=s.getBreedCount()%></td>
                <td><%=s.getBreed()%></td>
                <td><%=s.getMaleCount()%></td>
                <td><%=s.getFemaleCount()%></td> 
                <td><%=s.getMaleSpecialCount()%></td>
                <td><%=s.getFemaleSpecialCount()%></td>
            <%}
           %> 
            </tr>
            </tbody>
        </table>
        <br>
        <br>
        <table class="w3-table w3-bordered">
		

         <thead>
          <tr> 
	          <th colspan="6"><b>Group 3: Working Dogs</b></th>
       	  </tr>
       	  </thead>
       	  <%ArrayList<Show> three = (ArrayList<Show>) request.getAttribute("three");
        for(Show s:three) {%> 	
       	  <tbody>
            <tr>
                <td><%=s.getBreedCount()%></td>
                <td><%=s.getBreed()%></td>
                <td><%=s.getMaleCount()%></td>
                <td><%=s.getFemaleCount()%></td> 
                <td><%=s.getMaleSpecialCount()%></td>
                <td><%=s.getFemaleSpecialCount()%></td>
            <%}
           %> 
            </tr>
            </tbody>
        </table>
        <br>
        <br>
        <table class="w3-table w3-bordered">
		

       <thead>
          <tr> 
	          <th colspan="6"><b>Group 4: Terriers</b></th>
       	  </tr>
       	  </thead>
       	  <%ArrayList<Show> four = (ArrayList<Show>) request.getAttribute("four");
        for(Show s:four) {%> 	
       	  <tbody>
            <tr>
                <td><%=s.getBreedCount()%></td>
                <td><%=s.getBreed()%></td>
                <td><%=s.getMaleCount()%></td>
                <td><%=s.getFemaleCount()%></td> 
                <td><%=s.getMaleSpecialCount()%></td>
                <td><%=s.getFemaleSpecialCount()%></td>
            <%}
           %> 
            </tr>
            </tbody>
        </table>
        <br>
        <br>

        <table class="w3-table w3-bordered">   
          <thead>
          <tr> 
	          <th colspan="6"><b>Group 5: Toys</b></th>
       	  </tr>
       	  </thead>
       	  <%ArrayList<Show> five = (ArrayList<Show>) request.getAttribute("five");
        for(Show s:five) {%> 	
       	  <tbody>
            <tr>
                <td><%=s.getBreedCount()%></td>
                <td><%=s.getBreed()%></td>
                <td><%=s.getMaleCount()%></td>
                <td><%=s.getFemaleCount()%></td> 
                <td><%=s.getMaleSpecialCount()%></td>
                <td><%=s.getFemaleSpecialCount()%></td>
            <%}
           %> 
            </tr>
            </tbody>
        </table>
        <br>
        <br>
        <table class="w3-table w3-bordered">
             
         <thead>
          <tr> 
	          <th colspan="6"><b>Group 6: Non-sporting Dogs</b></th>
       	  </tr>
       	  </thead>
             <%ArrayList<Show> six = (ArrayList<Show>) request.getAttribute("six");
        for(Show s:six) {%> 	
             <tbody class="table-hover">
            <tr>
                <td><%=s.getBreedCount()%></td>
                <td><%=s.getBreed()%></td>
                <td><%=s.getMaleCount()%></td>
                <td><%=s.getFemaleCount()%></td> 
                <td><%=s.getMaleSpecialCount()%></td>
                <td><%=s.getFemaleSpecialCount()%></td>
            <%}
           %> 
            </tr>
        </table>
        <br>
        <br>
        <table class="w3-table w3-bordered">
		         
          <thead>
          <tr> 
	          <th colspan="6"><b>Group 7: Herding</b></th>
       	  </tr>
       	  </thead>
             <%ArrayList<Show> seven = (ArrayList<Show>) request.getAttribute("seven");
        for(Show s:seven) {%> 
             <tbody class="table-hover">
            <tr>
                <td><%=s.getBreedCount()%></td>
                <td><%=s.getBreed()%></td>
                <td><%=s.getMaleCount()%></td>
                <td><%=s.getFemaleCount()%></td> 
                <td><%=s.getMaleSpecialCount()%></td>
                <td><%=s.getFemaleSpecialCount()%></td>
            <%}
           %> 
            </tr>
        </table>
        <br>
        <a href="index.jsp" id="view" style="text-decoration: none;">Go Back</a>
        </div>

</body>
</html>