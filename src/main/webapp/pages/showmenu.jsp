<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<%@ taglib prefix="sb" uri="/struts-bootstrap-tags" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<sb:head />

	<style type="text/css">
	
		.bodymenu{
		background-color: #FFCCCC;
		border: 1px solid #CC0000;
		width: 200px;
		margin-left:550px;
	 	margin-bottom:8px;
	 	filter: Alpha(Opacity=40);
		-moz-opacity: 0.4;
		opacity: 0.4;
		}

		.bodymenu li{
		   list-style:none;
		}
		
		
		</style>
	

</head>
<body>

  <s:actionerror theme="bootstrap"/>
  <s:actionmessage theme="bootstrap"/>
  <s:fielderror theme="bootstrap"/>

  
 	 <s:form action="showmenu" method="post" theme="bootstrap" cssClass="well form-horizontal">
         
        <div align="center">
      	  <s:label><h1>MENU</h1></s:label>
      	</div>
      
         <div align="center" >
	         <s:a href="showallemp">Show All Employees</s:a>
	         <br>
	         <s:a href="initemp">Create Employee</s:a>
	         <br>
         </div>
                 
 	</s:form>
</body>
</html>