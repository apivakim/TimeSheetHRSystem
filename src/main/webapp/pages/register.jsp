<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="s" uri="/struts-tags" %>    
<%@ taglib prefix="sj" uri="/struts-jquery-tags" %>
<%@ taglib prefix="sb" uri="/struts-bootstrap-tags" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
 
<sj:head />
<sb:head />
	
	
	<script type="text/javascript">
		function validate(){
			var username = document.getElementById("user");
			var password = document.getElementById("password");
			var email = document.getElementById("email");
			
			if((username.value === ""&&email.value==="")||password.value ===""){
				alert("Please fill in username or password");
				username.focus(); //set cursor
				return false;
			}else{
				document.forms[0].submit();
			}
			
			
		}
	
	
	
	</script>
	
<title>Insert title here</title>
</head>
<body>

  <br>

  <s:actionerror theme="bootstrap"/>
  <s:actionmessage theme="bootstrap"/>
  <s:fielderror theme="bootstrap"/>

  
  <s:form action="register" method="post" theme="bootstrap" cssClass="form-horizontal"
                   label="Register Form" >
             
             <br>
             <br>
             
             <fieldset>
				<legend>Employee Information</legend>    
				
                    
                <s:textfield
                        label="Name"
                        name="emr.name"
                        id="name"
                        tooltip="Enter your Name here"/>
                        
                        
                 <s:textfield
                        label="Surname"
                        name="emr.surname"
                        id="surname"
                        tooltip="Enter your Surname here"/>
                 
                        
                <sj:datepicker id="dateofbirth" name="emr.dateofbirth" displayFormat="dd-mm-yy" label="Date of Birth"/>
                
                
 
                <s:textarea
                        tooltip="Enter your address"
                        label="address"
                        name="emr.address"
                        cols="20"
                        rows="3"/>
                        
  
                <s:radio
                        tooltip="Choose your gender"
                        label="Gender"
                        list="{'Male', 'Female'}"
                        name="emr.gender"
                        id="gender"/>
                        
                        
				<s:textfield
                        label="Email"
                        name="emr.email"
                        id="email"
                        tooltip="Enter your Email here"/>
				
               	</fieldset>
               

				<fieldset>
				<legend>For Log in</legend>  
				<s:textfield
                        label="User"
                        name="emr.user"
                        id="user"
                        tooltip="Enter your Username here"/>
				            
				 <s:password 
				 		label="Password" 
				 		id="password" 
				 		name="emr.password"
				 		tooltip="Enter your Password here"/>           
				             
				</fieldset>

                <div align="center"> <s:submit cssClass="btn" onclick="return validate();"/>  <s:reset cssClass="btn"></s:reset></div>
              
            </s:form>


        

</body>
</html>