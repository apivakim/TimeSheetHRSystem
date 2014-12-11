package com.aug.actions;

import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.Result;
import org.apache.struts2.convention.annotation.ResultPath;
import org.springframework.beans.factory.annotation.Autowired;

import com.aug.entities.EmployeeforRegister;
import com.aug.services.LoginService;
import com.opensymphony.xwork2.ActionSupport;

@SuppressWarnings("serial")
@ResultPath(value = "/")
public class LoginnAction extends ActionSupport {

	public EmployeeforRegister em;
	
	@Autowired
	LoginService logser;
	
	public EmployeeforRegister getEm() {
		return em;
	}


	public void setEm(EmployeeforRegister em) {
		this.em = em;
	}


	public void setLogser(LoginService logser) {
		this.logser = logser;
	}


	@Action(value = "loginn", results = {
			@Result(name = "success", type="tiles", location = "showmenu.tiles"),
			@Result(name = "failuer", location = "pages/login.jsp") })
	@Override
	public String execute() throws Exception {
		if(logser.isLogin(em)==true){
		return SUCCESS;
		}else{
			addActionError("User Name/E-mail or Password not match");
			return "failuer";
		}
	}
	
	
	@Action(value = "initlogin", results = { @Result(name = "input", location = "pages/login.jsp") })
	public String initLogin() throws Exception {
		return "input";
	}
}
