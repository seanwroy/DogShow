<!DOCTYPE html>
<html>
<link rel="stylesheet" type="text/css" href="rsc/style.css"/>
<head>
<meta charset="ISO-8859-1">

<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
<script
  src="https://code.jquery.com/ui/1.12.1/jquery-ui.js"
  integrity="sha256-T0Vest3yCU7pafRw9r+settMBX6JkKN06dqBnpQ8d30="
  crossorigin="anonymous"></script>
<script src="rsc/script.js"></script>

<title>Burlington Kennel & Obedience Club Dog Show</title>
</head>
<body>
<h1>Burlington Kennel & Obedience Club</h1>

	<div id="dogs"></div>
	<br>
	
	<div class="registrationbox">
	  
	  <form action="AddDogs" method="get">
	  	
	    <label for="name">Dog name:</label>
	    <input type="text" id="dogname" name="dogname" required>
	
	    <label for="owner">Owner name:</label>
	    <input type="text" id="ownername" name="ownername" required>
	
	    <label for="breed">Breed:</label>
	    <input type="text" id="breed" name="breed" required>
	    
	    <label for="group">Group:</label><select name="group" required>
		  <option>Group 1: Sporting Dogs</option>
		  <option>Group 2: Hounds</option>
		  <option>Group 3: Working Dogs</option>
		  <option>Group 4: Terriers</option>
		  <option>Group 5: Toys</option>
		  <option>Group 6: Non-sporting Dogs</option>
		  <option>Group 7: Herding</option>
		</select>
	 
	   	<label for="gender">Gender:</label><select name="gender" required>
		  <option>Male</option>
		  <option>Female</option>
		</select>
	    
	    <label for="dogclass">Class or Specialty:</label><select name="dogclass" required>
		  <option>Class Dog</option>
		  <option>Specialty Dog</option>
		</select>
	  	
	    <input type="submit" value="Submit" onclick="alert('Your pet has been entered into the competition!\n\nPlease click View Entrants to view your pet and the rest of the competition!')">
		<br>
	    <a href="GetDogs" id="view" style="float: left; text-decoration: none;">View Entrants</a><a href="search.jsp" id="view" style="float: right; text-decoration: none;">Search Entrants</a>
	    <br>
	    <br>
	    <br>
	  </form>
	</div>

	<form action="DummyDogs" method="get">
	<input type="submit" value="Generate 100 Random Dogs (Debug)" style="width: 260px; display: block; margin-left: auto; margin-right: auto; background-color: #8B0000;" onclick="alert('100 Random Dog Records Generated!')">
	</form>
	
	<form action="ShowList" method="get">
	<input type="submit" value="Show List (Debug)" style="width: 200px; display: block; margin-left: auto; margin-right: auto; background-color: #8B0000;">
	</form>
	
</body>
</html>