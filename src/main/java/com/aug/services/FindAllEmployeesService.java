package com.aug.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.aug.dao.daoimpl.FindAllEmployeeDaoImpl;
import com.aug.entities.EmployeeMem;
import com.aug.entities.EmployeeforRegister;

@Component

public class FindAllEmployeesService {

	@Autowired
	FindAllEmployeeDaoImpl findAllDao;
	List<EmployeeMem> e;
	

	
	public void setFindAllDao(FindAllEmployeeDaoImpl findAllDao) {
		this.findAllDao = findAllDao;
	}





	public List<EmployeeMem> findAllEmployees(){
		
		e = findAllDao.findAllEmp();
		return e;
		
	}
	
	
}
