package com.aug.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.aug.dao.daoimpl.LoginDaoImpl;
import com.aug.entities.EmployeeforRegister;



@Component
public class LoginService {
	
	@Autowired
	LoginDaoImpl ldi;
	List<EmployeeforRegister> ee;
	

	public void setLdi(LoginDaoImpl ldi) {
		this.ldi = ldi;
	}


	
	public boolean isLogin(EmployeeforRegister e){
		
		if(e.getUser().contains("@")){	
				
			ee = ldi.findEmailPassforLogin(e);
		
		}else if(!e.getUser().contains("@")){
			ee = ldi.findUserPassforLogin(e);
		}
		
			if(ee.size()!=0){
				for(EmployeeforRegister em:ee){
					System.out.println("password: "+em.getPassword());			
				}
				return true;
			}else{
				return false;
			}
	}
}
