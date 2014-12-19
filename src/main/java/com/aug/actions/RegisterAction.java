package com.aug.actions;

import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.Result;
import org.apache.struts2.convention.annotation.ResultPath;
import org.springframework.beans.factory.annotation.Autowired;

import com.aug.entities.EmployeeforRegister;
import com.aug.services.RegisterService;
import com.opensymphony.xwork2.ActionSupport;

@SuppressWarnings("serial")
@ResultPath(value = "/")
public class RegisterAction extends ActionSupport {

	public EmployeeforRegister emr;

	@Autowired
	RegisterService res;

	public RegisterService getRes() {
		return res;
	}

	public void setRes(RegisterService res) {
		this.res = res;
	}

	public void setEmr(EmployeeforRegister emr) {
		this.emr = emr;
	}

	public EmployeeforRegister getEmr() {
		return this.emr;
	}

	@Action(value = "register", results = {
			@Result(name = "success",type="redirect", location = "initlogin"),
			@Result(name = "failuer", location = "pages/register.jsp") })
	@Override
	public String execute() throws Exception {
	 	System.out.println(emr.getUser()); 
		
		if(res==null||res.isRegister(emr)==false||emr.getPassword().length()<=4
				||(emr.getEmail().isEmpty()==false&&emr.getEmail().contains("@")==false)){
							
			if(emr.getEmail().isEmpty()==false&&emr.getEmail().contains("@")==false){
				addActionError("Email must be contains @");		
			}if(emr.getPassword().length()<=4){
				addActionError("Password must be more than 4 digit");	
			}
	   
			return "failuer";
	}else{
		return SUCCESS;
	}
	
}

	@Action(value = "initRegist", results = { @Result(name = "input", location = "pages/register.jsp") })
	public String init() throws Exception {
		return INPUT;
	}

}
