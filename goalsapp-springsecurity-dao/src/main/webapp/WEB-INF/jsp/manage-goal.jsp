<%@include file="header.jsp"%>

<h1>Manage Goal</h1>

<form action="./save-goal" method="POST">
	<input type="hidden" name="id" value="${goal.id}">

	Title<br>
	<input type="text" name="title" value="${goal.title}">
	<br><br>
	Target Date<br>
	<input type="text" name="target" value="${goal.target}">
	<br><br>
	Description<br>
	<input type="text" name="description" value="${goal.description}">
	
	<br><br>
	<input type="submit" value="Submit">
</form>
<br><br>
<span>${message}</span>

<%@include file="footer.jsp"%>