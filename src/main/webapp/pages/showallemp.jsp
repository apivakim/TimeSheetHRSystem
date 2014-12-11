<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<%@ taglib prefix="sb" uri="/struts-bootstrap-tags" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<sb:head />
</head>
<body>
	  <s:actionerror theme="bootstrap"/>
	  <s:actionmessage theme="bootstrap"/>
	  <s:fielderror theme="bootstrap"/>
	  
	  <br>
	  <br>
	  <s:form action="showallemp" method="post" theme="bootstrap" cssClass="well form-horizontal">
		 <div align="center">
			<s:iterator value="e">
				<s:property value="idcard"/> ,
				<s:property value="name"/> 
				<s:property value="surname"/> ,
				<s:property value="mobile"/> ,
				<s:property value="email"/><br/>
			</s:iterator>
		</div>
	  </s:form>
</body>
</html>