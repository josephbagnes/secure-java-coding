<%@include file="header.jsp"%>

<h1>Home Page</h1>

Welcome, <sec:authentication property="name"/>
<br>
<br>
<form action="/logout" method="post">
	<input type="submit" value="Logout" />
</form>

<%@include file="footer.jsp"%>