package com.aug.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.aug.dao.daoimpl.CreateEmpDaoImpl;
import com.aug.entities.EmployeeMem;

@Component
public class CreateEmpService {
	
	@Autowired
	CreateEmpDaoImpl createEmpImpl;

	public void setCreateEmpImpl(CreateEmpDaoImpl createEmpImpl) {
		this.createEmpImpl = createEmpImpl;
	}
	
	
	public boolean createEmp(EmployeeMem em){

				try{
				createEmpImpl.saveEmployees(em);
				return true;
				}catch(Exception exception){
				return false;
			}
	}

}
