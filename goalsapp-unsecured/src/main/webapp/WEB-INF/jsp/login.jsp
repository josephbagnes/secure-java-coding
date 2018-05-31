<%@include file="header.jsp"%>

<h1>Login</h1>

<form action="./login-submit" method="POST">
	Username<br>
	<input type="text" name="username">
	<br><br>
	Password<br>
	<input type="text" name="password">
	<br><br>
	<input type="submit" value="Sign In">
</form>
<br><br>
<span>${message}</span>

<%@include file="footer.jsp"%>