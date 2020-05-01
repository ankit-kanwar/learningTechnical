<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<body>
<h2>CSRF POC</h2>
<form action="csrfaction" method="post">
	<b>Username</b>&nbsp; <input type="text" name=username/><br>
	<b>Password</b>&nbsp;
	<input type="password" name="password" /><br>
    <input type="hidden" name="csrfPreventionSalt" value="<c:out value='${csrfPreventionSalt}'/>"/>
    <input type="submit" name="submit" value="Hit Server"/>
</form>
</body>
</html>
