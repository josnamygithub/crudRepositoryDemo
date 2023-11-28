<!-- <html>
<head>
<title>Welcome Login Form</title>
</head>
<body>
<h2> Display User Information </h2>
${user}
</body>
</html>-->
<!DOCTYPE html>
<html>
<style>
table, th, td {
  border:1px solid black;
}
</style>
<body>

<h2> Display User Information </h2>

<table style="width:100%">

  <tr>
    <td>Id</td> <td>${user.id}</td> </tr>
  <tr> <td>Name</td><td>${user.name}</td></tr>
  <tr><td>email</td><td>${user.email}</td></tr>
</table>



</body>

<div  style ="width :100%;">
	<h2> Delete  User Information </h2>
	<form action="deleteUser">
	Enter User Id <input type="text" name="id" /><br>
	<input type="submit" /> <br>
	</form>		

	<h2> Update  User Information </h2>
	<form action="updateUser">
	Enter User Id <input type="text" name="id" /><br>
	<input type="submit" /> 
</div>
</html>

