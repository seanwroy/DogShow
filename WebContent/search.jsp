<!DOCTYPE html>
<html>
<link rel="stylesheet" type="text/css" href="rsc/style.css"/>
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet" href="https://www.w3schools.com/w3css/4/w3.css">
<head>
<title>Search Entrants</title>

<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
<script
  src="https://code.jquery.com/ui/1.12.1/jquery-ui.js"
  integrity="sha256-T0Vest3yCU7pafRw9r+settMBX6JkKN06dqBnpQ8d30="
  crossorigin="anonymous"></script>
<script src="rsc/script.js"></script>


</head>
<body>
	 <h1>Entrants</h1>
	 
	 <div class="registrationbox">
	  
	  <form action="Search" method="get">
	  <p style="color: red; font-size: 10px; float: right;">*Search one or multiple parameters</p><br>
	  	
	  	<label for="number">Number</label>
	    <input type="text" id="number" name="number">
	  	
	    <label for="name">Dog name:</label>
	    <input type="text" id="dogname" name="dogname">
	
	    <label for="owner">Owner name:</label>
	    <input type="text" id="ownername" name="ownername">
	
	    <label for="breed">Breed:</label>
	    <input type="text" id="breed" name="breed">
	    
	    <label for="group">Group:</label><select name="group">
	      <option></option>
		  <option>Group 1: Sporting Dogs</option>
		  <option>Group 2: Hounds</option>
		  <option>Group 3: Working Dogs</option>
		  <option>Group 4: Terriers</option>
		  <option>Group 5: Toys</option>
		  <option>Group 6: Non-sporting Dogs</option>
		  <option>Group 7: Herding</option>
		</select>

	    <input type="submit" value="Search">
		<br>
		<br>
	    <a href="index.jsp" id="view" style="text-decoration: none;">Go Back</a>
	</form>
</div>

</body>
</html>