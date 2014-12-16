package com.aug.services;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.aug.dao.daoimpl.RegisterDaoImpl;
import com.aug.entities.EmployeeforRegister;




@Component
public class RegisterService {
	
	
	@Autowired
    RegisterDaoImpl redaoimlp;

	
	public void setRedaoimlp(RegisterDaoImpl redaoimlp) {
		this.redaoimlp = redaoimlp;
	}





	public  boolean isRegister(EmployeeforRegister emr) {
		if((emr.getUser().isEmpty()&&emr.getEmail().isEmpty())||(emr.getPassword().isEmpty())){		
			return false;
		}else{
			redaoimlp.saveReg(emr);
			return true;
		}
    }
	
	
	

}
