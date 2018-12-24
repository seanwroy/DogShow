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
<link rel="stylesheet" type="text/css" href="rsc/style.css"/>
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
		
         <tr> 
          <th><b>Number</b></th> 
          <th><b>Name</b></th> 
          <th><b>Owner</b></th> 
          <th><b>Breed</b></th> 
          <th><b>Group</b></th>
          <th><b>Gender</b></th>
          <th><b>Class</b></th>
         </tr> 
      

        <%ArrayList<Doggy> dogs = (ArrayList<Doggy>) request.getAttribute("dogs");
        for(Doggy s:dogs) {%> 	
             
             <tbody class="table-hover">
            <tr>
                <td><%=s.getNumber()%></td>
                <td><%=s.getDogname()%></td>
                <td><%=s.getOwnername()%></td> 
                <td><%=s.getBreed()%></td>
                <td><%=s.getGroup()%></td>
                <td><%=s.getGender()%></td>
                <td><%=s.getDogclass()%></td>
            <%}
           %> 
            </tr>
        </table>
        <br>
        <a href="index.jsp" id="view">Go Back</a>
        </div>
        
</body>
</html>