<%@ page contentType="text/html; charset=UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<%@ taglib prefix="sb" uri="/struts-bootstrap-tags" %>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<sb:head />
</head>
<body>

  <s:actionerror theme="bootstrap"/>
  <s:actionmessage theme="bootstrap"/>
  <s:fielderror theme="bootstrap"/>
  	<s:form action="showmenu" method="post" theme="bootstrap" cssClass="well form-horizontal">
		<h2>index</h2>
	</s:form>
</body>
</html>