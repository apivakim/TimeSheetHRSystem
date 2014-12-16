package com.aug.dao.daoimpl;

import javax.transaction.Transactional;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.aug.entities.EmployeeforRegister;

@Component
@Transactional
public class RegisterDaoImpl {

	@Autowired
	SessionFactory sessionFactory;

	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

	public final Session getCurrentSession() {
		return sessionFactory.getCurrentSession();
	}


	public void saveReg(EmployeeforRegister em) {
		// TODO Auto-generated method stub
		
		//getCurrentSession().persist(em);
		getCurrentSession().save(em);
		
		

	}

}
