<%@include file="header.jsp"%>

<h1>Login</h1>

<form action="/login" method="POST">
	Username<br>
	<input type="text" name="username">
	<br><br>
	Password<br>
	<input type="password" name="password">
	<br><br>
	<input type="submit" value="Sign In">
</form>
<br><br>
<form action="/signin/facebook" method="POST">
    <input type="hidden" name="scope" value="public_profile" />
    <input type="submit" value="Login using Facebook"/>
</form>

<%@include file="footer.jsp"%>