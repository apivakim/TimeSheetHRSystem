package com.aug.actions;

import java.util.ArrayList;
import java.util.List;

import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.Result;
import org.apache.struts2.convention.annotation.ResultPath;
import org.springframework.beans.factory.annotation.Autowired;

import com.aug.entities.EmployeeMem;
import com.aug.entities.EmployeeforRegister;
import com.aug.services.FindAllEmployeesService;
import com.opensymphony.xwork2.ActionSupport;

@SuppressWarnings("serial")
@ResultPath(value = "/")
public class FindAllEmployeesAction extends ActionSupport{

	public EmployeeMem emp;
	public List<EmployeeMem> e = new ArrayList<EmployeeMem>();
	@Autowired
    FindAllEmployeesService empService;

	public void setEmp(EmployeeMem emp) {
		this.emp = emp;
	}

	public EmployeeMem getEmp() {
		return this.emp;
	}
	

	public List<EmployeeMem> getE() {
		return e;
	}

	public void setE(List<EmployeeMem> e) {
		this.e = e;
	}

	@Action(value = "showallemp", results = {
			@Result(name = "success", location = "pages/showallemp.jsp") })
	@Override
	public String execute() throws Exception {
		// TODO Auto-generated method stub	
		e = empService.findAllEmployees();
		return SUCCESS;
	}
}
