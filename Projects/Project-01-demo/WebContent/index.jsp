<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Register form</title>

<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.6.0/dist/css/bootstrap.min.css" integrity="sha384-B0vP5xmATw1+K9KRQjQERJvTumQW0nPEzvF6L/Z6nronJ3oUOFUFpCjEUQouq2+l" crossorigin="anonymous">


<style>

    body{
    background-color: gray;
    }
	.wrapper{
			
		width: 40%;
		border: 1px solid green;
		margin: 0 auto;
		padding: 20px;
		color: blue;	
		background-color: aqua;
	
	}
	a{
	color: black;
	
	}

</style>

</head>
<body>
	<div class="container">
		<h5 class="font-weight-bold">
			<a href="index.html">Add Employee </a> | |
			<a href="updateEmployee.html">Update Employee </a> | |
			<a href="delete.html">Delete Employee </a> | |
			<a href="ViewAllEmployees">View all employees</a>|
			<a href="employeeLogin.html">EmployeeLogin </a> |
		
			
			
		</h5>
		
	</div>
	<h1>Register page</h1>
	<br>
	<hr>
	
	<form action="addEmployee" method="post">
	<div class="wrapper">
		<div class="container">
			<div>
				<p>Name: 	<input type="text" name="name" required="required" placeholder="Enter Your Name" /> </p>
		
			</div>
			
			<div>
				<p>Email: 	 <input type="text" name="email" required="required" placeholder="Enter Your Email" /> </p>
		
			</div>
			
			<div>
				<p>Username: <input type="text" name="username" required="required" placeholder="Enter Your Username" /> </p>
		
			</div>
			
			<div>
				<p>Password: <input type="password" name="password" required="required" placeholder="Enter Your Password" /> </p>
		
			</div>
			
		
		<input type="submit" value="Submit"/>
		</div>
		
	</div>
	</form>
</body>
</html>