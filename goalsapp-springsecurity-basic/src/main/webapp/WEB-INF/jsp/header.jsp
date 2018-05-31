<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<%@ taglib uri="http://www.springframework.org/security/tags" prefix="sec"%>

<!DOCTYPE html>
<html>
<head>
<title>Spring Application</title>
</head>
<body>

	<table>
		<tr>
			<td><a href="./">Home</a></td>
			<td><a href="./manage-goal">Manage Goal</a></td>
			<td><a href="./list-goals">My Goals</a></td>
			<sec:authorize access="hasAnyRole('ADMIN')">
				<td><a href="#">Administration</a></td>
			</sec:authorize>
		</tr>
	</table>
	<hr>