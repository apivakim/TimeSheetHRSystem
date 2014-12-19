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

				<div class="row">
				<div class="col-xs-1"><label>No</label></div>
		 		<div class="col-xs-1"><label>Idcard</label></div>
		 		<div class="col-xs-1"><label>Gender</label></div>
                <div class="col-xs-1"><label>Name</label></div>
                <div class="col-xs-1"><label>Surname</label></div>
                <div class="col-xs-1"><label>Date of Birth</label></div>
                 <div class="col-xs-1"><label>Address</label></div>
                <div class="col-xs-1"><label>Mobile</label></div>
                <div class="col-xs-2"><label>Email</label></div>
				</div>

				<s:iterator value="e" status="eStatus">
				<div class="row">
					<div class="col-xs-1"><s:property value="#eStatus.index+1"/></div>
					<div class="col-xs-1"><s:property value="idcard"/></div>
					<div class="col-xs-1"><s:property value="gender"/></div>
					<div class="col-xs-1"><s:property value="name"/></div>
					<div class="col-xs-1"><s:property value="surname"/></div>
					<div class="col-xs-1"><s:property value="dateofbirth"/></div>
					<div class="col-xs-1"><s:property value="address"/></div>
					<div class="col-xs-1"><s:property value="mobile"/></div>
					<div class="col-xs-2"><s:property value="email"/></div>
					<div class="col-xs-1" align="center"><a href="initupdateemp?id=<s:property value="id"/>">edit</a></div>
					<div class="col-xs-1"><a href="deleteemp?id=<s:property value="id"/>">delete</a></div>
				</div>
				</s:iterator>


		</div>
	  </s:form>
</body>
</html>