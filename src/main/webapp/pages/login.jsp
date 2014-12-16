<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<%@ taglib prefix="sj" uri="/struts-jquery-tags"%>
<%@ taglib prefix="sb" uri="/struts-bootstrap-tags"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<sj:head />
<sb:head />


<script type="text/javascript">
	function validate() {
		var username = document.getElementById("user");
		var password = document.getElementById("password");

		if (username.value === "" || password.value === "") {
			alert("Please fill in username or password");
			username.focus(); //set cursor
			return false;
		} else {
			document.forms[0].submit();
		}

	}
</script>
</head>
<body>

	<br>

	<s:actionerror theme="bootstrap" />
	<s:actionmessage theme="bootstrap" />
	<s:fielderror theme="bootstrap" />

	<div align="center">

		<s:form action="loginn" method="post" theme="bootstrap"
			cssClass="form-horizontal" label="Login">

			<br>
			<br>


			<div class="col-sm-10">
				<s:textfield label="User" name="em.user" id="user"
					tooltip="Enter your Username here" />

				<s:password label="Password" id="password" name="em.password"
					tooltip="Enter your Password here" />

			</div>
			<div align="center">
				<s:submit cssClass="btn" label="submit" onclick="return validate();" />
				<s:reset cssClass="btn" label="cancle" />
			</div>
			<br>
			<s:a href="initRegist">Register</s:a>


		</s:form>

	</div>



</body>
</html>