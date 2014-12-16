package com.aug.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.aug.entities.EmployeeforRegister;


public interface LoginDao {
	
	public List<EmployeeforRegister> findUserPassforLogin(EmployeeforRegister e);
	public List<EmployeeforRegister> findEmailPassforLogin(EmployeeforRegister e);


}
