<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ page isErrorPage="true"%>
<!DOCTYPE html>
<html>
<head>
<!-- for Bootstrap CSS -->
<link rel="stylesheet" href="/webjars/bootstrap/css/bootstrap.min.css"/>
<!-- YOUR own local CSS -->
<link rel="stylesheet" href="/css/style.css"/>
<!-- For any Bootstrap that uses JS or jQuery-->
<script src="/webjars/jquery/jquery.min.js"></script>
<script src="/webjars/bootstrap/js/bootstrap.min.js"></script>
<meta charset="ISO-8859-1">
<title>New Booking</title>
</head>
<body>
 	<div class="container d-flex">
		<div class="mx-auto">
			<h1>New Booking!</h1>
			<form:form action="/bookings/create" method="post" modelAttribute="booking">
				<p>
					<form:label path="groupName">Group Name</form:label>
					<form:errors path="groupName" />
					<form:input path="groupName" />
				</p>
				<p>
					<form:label path="numOfGuests">Number of Guests</form:label>
					<form:errors path="numOfGuests" />
					<form:input path="numOfGuests" />
				</p>
				<p>
					<form:label path="bookingDate">Date of Booking</form:label>
					<form:errors path="bookingDate" />
					<form:input type="date" value="2023-06-01" min="2023-01-06" max="2023-31-08" path="bookingDate"/>
				</p>
				<input type="submit" value="Submit" />
			</form:form>
			<a href="/">Home</a>
		</div>
	</div>
</body>
</html>