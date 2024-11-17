<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Registration Page</title>
</head>
<body>
<div>
<form action="regData">


<label>Student Name</label>
<input type="text" name="name"> <br> <br>

<label>Student Age</label>
<input type="number" name="number"> <br> <br>

<label>Student Email</label>
<input type="text" name="email"> <br> <br>

<label>Student Contact Number</label>
<input type="number" name="cnumber"> <br> <br>

<label>Student Address</label>
<input type="text" name="address"> <br> <br>

<label>Student Gender</label>
<input type="radio" name="gender" value="Male">Male
<input type="radio" name="gender" value="FeMale">FeMale <br> <br>

<input type="submit">

</form>
</div>

</body>
</html>