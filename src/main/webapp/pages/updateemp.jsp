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


			<script type="text/javascript">
				    function actionupdate(){
						document.forms[0].action = "updateemp";
			            document.forms[0].submit();
						}

					function list(){
						document.forms[0].action = "showallemp";
			            document.forms[0].submit();
						}
			</script>

</head>
<body>

  <s:actionerror theme="bootstrap"/>
  <s:actionmessage theme="bootstrap"/>
  <s:fielderror theme="bootstrap"/>

  
  <s:form action="updateemp" method="post" theme="bootstrap" cssClass="form-horizontal"
                   label="Create Employee" >

				 <br>
            	 <br>

                <s:hidden name="emp.id" id="id"></s:hidden>

                <fieldset>
				<legend>Employee Information</legend>    
				
				
 				<s:textfield
                        label="Id Card"
                        name="emp.idcard"
                        id="idcard"
                        tooltip="Enter your Id Card here"/>
				
				
				 <s:textfield
                        label="Name"
                        name="emp.name"
                        id="name"
                        tooltip="Enter your Name here"/>
                        
                        
                 <s:textfield
                        label="Surname"
                        name="emp.surname"
                        id="surname"
                        tooltip="Enter your Surname here"/>
                 
               
                        
                <sj:datepicker id="dateofbirth" name="emp.dateofbirth" displayFormat="dd-mm-yy" label="Date of Birth"/>
                
                
 
                <s:textarea
                        tooltip="Enter your address"
                        label="address"
                        name="emp.address"
                        cols="20"
                        rows="3"/>
                        
  
                <s:radio
                        tooltip="Choose your gender"
                        label="Gender"
                        list="{'Male', 'Female'}"
                        name="emp.gender"
                        id="gender"/>
                        
                        
				<s:textfield
                        label="Email"
                        name="emp.email"
                        id="email"
                        tooltip="Enter your Email here"/>
                        
                        
                        
                <s:textfield
                        label="Mobile"
                        name="emp.mobile"
                        id="mobile"
                        tooltip="Enter your Mobile here"/>
                        
				
               	</fieldset>
				
				
				<fieldset>
				<legend> </legend>
 			    <div align="center">
            				     <button cssClass="btn" type="submit" onclick="actionupdate()">Update</button>
            				     <button cssClass="btn" onclick="list()">Cancle</button>
            	</div>
	            </fieldset>
   </s:form>
</body>
</html>