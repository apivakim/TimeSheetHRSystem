package com.aug.actions;

import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.Result;
import org.apache.struts2.convention.annotation.ResultPath;
import org.springframework.beans.factory.annotation.Autowired;

import com.aug.entities.EmployeeMem;
import com.aug.services.CreateEmpService;
import com.opensymphony.xwork2.ActionSupport;

@SuppressWarnings("serial")
@ResultPath(value = "/")
public class CreateEmpAction extends ActionSupport{

	
    EmployeeMem em;
	
	@Autowired
	CreateEmpService createEmpService;
	


	public EmployeeMem getEm() {
		return em;
	}


	public void setEm(EmployeeMem em) {
		this.em = em;
	}


	@Action(value = "createemp", results = {
			@Result(name = "success", location = "pages/insertemp.jsp"),
			@Result(name = "failuer", location = "initemp") })
	@Override
	public String execute() throws Exception {
		// TODO Auto-generated method stub
		if(createEmpService.createEmp(em)==true){
		addActionMessage("Create Success");
		return  SUCCESS;
		}else{
			//System.out.println(e.getCritizenid());
			return "failuer";
		}
	}
	
	
	@Action(value = "initemp", results = { @Result(name = "input", location = "pages/insertemp.jsp") })
	public String init() throws Exception {
		return INPUT;
	}

}
