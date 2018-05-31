<%@include file="header.jsp"%>

<h1>My Goals</h1>
<table border="1">
	<thead>
		<tr>
			<th>ID</th>
			<th>Title</th>
			<th>Target Date</th>
			<th>Description</th>
			<th></th>
		</tr>
	</thead>
	<tbody>
		<c:forEach var="goal" items="${myGoals}">
			<tr>
				<td>${goal.id}</td>
				<td>${goal.title}</td>
				<td>${goal.target}</td>
				<td><c:out value="${goal.description}"/></td>
				<td>
					<a href="./edit-goal?id=${goal.id}">Edit</a>
					<a href="./delete-goal?id=${goal.id}">Delete</a>
				</td>
			</tr>
		</c:forEach>
	</tbody>
</table>

<%@include file="footer.jsp"%>