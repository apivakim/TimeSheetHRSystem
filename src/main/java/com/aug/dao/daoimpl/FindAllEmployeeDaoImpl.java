package com.aug.dao.daoimpl;

import java.util.List;

import javax.transaction.Transactional;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.aug.entities.EmployeeMem;
import com.aug.entities.EmployeeforRegister;

@Component
@Transactional
public class FindAllEmployeeDaoImpl {

	@Autowired
	SessionFactory sessionFactory;

	
	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}


	public final Session getCurrentSession() {
		return sessionFactory.getCurrentSession();
	}

	
	public List<EmployeeMem> findAllEmp(){
	    Query query = getCurrentSession().createQuery("From EmployeeMem");
		@SuppressWarnings("unchecked")
		List<EmployeeMem> empl = query.list();
		
		return empl;
	}
	
	
	
	
}
