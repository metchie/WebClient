<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Forgot Password</title>
</head>
<body>
<script language="javascript">
function isEmailEmpty( ){
	
	if( document.forms['forgot_form'].forgot_email.value == ""){
		document.getElementById("forgot_email_alert").style.visibility = 'visible';
		return false;
	}else
		return true;	
}
</script>
	Type your email into the text box below and the reset link will be sent to you email if you are registered.
	If you are not a registered member of our application use the register field in our <a href="login.jsp">login page</a>.
	
	<form id="forgot_form" name="forgot_form" action="LoginRegister" method="post">
		E-mail:<input id="forgot_email" type="text" name="forgot_email"><label style="visibility: hidden" id="forgot_email_alert"> Email field cannot be empty</label>
		<br/><input id="forgot_submit" type="submit" name="forgot_submit" onClick="return isEmailEmpty();" value="Send Email">
	</form>
</body>
</html>