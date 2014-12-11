<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="s" uri="/struts-tags" %>    
<%@ taglib prefix="sj" uri="/struts-jquery-tags" %>
<%@ taglib prefix="sb" uri="/struts-bootstrap-tags" %>
    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<sj:head />
<sb:head />
</head>
<body>

  <s:actionerror theme="bootstrap"/>
  <s:actionmessage theme="bootstrap"/>
  <s:fielderror theme="bootstrap"/>

  
  <s:form action="createemp" method="post" theme="bootstrap" cssClass="form-horizontal"
                   label="Create Employee" >

				 <br>
            	 <br>
             
                <fieldset>
				<legend>Employee Information</legend>    
				
				
 				<s:textfield
                        label="Id Card"
                        name="em.idcard"
                        id="idcard"
                        tooltip="Enter your Id Card here"/>
				
				
				 <s:textfield
                        label="Name"
                        name="em.name"
                        id="name"
                        tooltip="Enter your Name here"/>
                        
                        
                 <s:textfield
                        label="Surname"
                        name="em.surname"
                        id="surname"
                        tooltip="Enter your Surname here"/>
                 
               
                        
                <sj:datepicker id="dateofbirth" name="em.dateofbirth" displayFormat="dd-mm-yy" label="Date of Birth"/>
                
                
 
                <s:textarea
                        tooltip="Enter your address"
                        label="address"
                        name="em.address"
                        cols="20"
                        rows="3"/>
                        
  
                <s:radio
                        tooltip="Choose your gender"
                        label="Gender"
                        list="{'Male', 'Female'}"
                        name="em.gender"
                        id="gender"/>
                        
                        
				<s:textfield
                        label="Email"
                        name="em.email"
                        id="email"
                        tooltip="Enter your Email here"/>
                        
                        
                        
                <s:textfield
                        label="Mobile"
                        name="em.mobile"
                        id="mobile"
                        tooltip="Enter your Mobile here"/>
                        
				
               	</fieldset>
				
				
				<fieldset>
				<legend> </legend>
 				<div align="center"> 
	                	<s:submit cssClass="btn"/>  
	                	<s:reset  cssClass="btn"></s:reset>
	            </div>
	            </fieldset>
   </s:form>
</body>
</html>