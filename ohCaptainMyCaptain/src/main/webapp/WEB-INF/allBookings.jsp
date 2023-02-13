<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %> 
<%@ page isErrorPage="true" %> 
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
<title>All of your bookings!</title>
</head>
<body>
			<table class="table table-hover col-3">
			<thead>
			<tr>
			<th>Index</th>
			<th>Group Name</th>
			<th>Number of Guests</th>
			<th>Date</th>
			</tr>
			</thead>
			<c:forEach var="allBookings" items="${allBookings}">
				<tr>
					<td>${allBookings.id}</td>
					<td>${allBookings.groupName}</td>
					<td>${allBookings.numOfGuests}</td>
					<td>${allBookings.bookingDate}</td>
				</tr>
			</c:forEach>
		</table>
</body>
</html>