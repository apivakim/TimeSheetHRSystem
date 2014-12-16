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
	  <s:form action="showallemp" method="post" theme="bootstrap" cssClass="well form-horizontal"
	  label="Employees">
		 <div align="center">

				<div class="row" align="center">
				<div class="col-xs-1"><label>no</label></div>
		 		<div class="col-xs-1"><label>idcard</label></div>
                <div class="col-xs-1"><label>name</label></div>
                <div class="col-xs-1"><label>surname</label></div>
                <div class="col-xs-1"><label>mobile</label></div>
                <div class="col-xs-2"><label>email</label></div>
				</div>

				<s:iterator value="e" status="eStatus">
				<div class="row" align="center">
					<div class="col-xs-1"><s:property value="#eStatus.index+1"/></div>
					<div class="col-xs-1"><s:property value="idcard"/></div>
					<div class="col-xs-1"><s:property value="name"/></div>
					<div class="col-xs-1"><s:property value="surname"/></div>
					<div class="col-xs-1"><s:property value="mobile"/></div>
					<div class="col-xs-2"><s:property value="email"/></div>
					<div class="col-xs-1"><a href="initupdateemp?id=<s:property value="id"/>">edit</a></div>
					<div class="col-xs-1"><a href="deleteemp?id=<s:property value="id"/>">delete</a></div>
				</div>
				</s:iterator>


		</div>
	  </s:form>
</body>
</html>