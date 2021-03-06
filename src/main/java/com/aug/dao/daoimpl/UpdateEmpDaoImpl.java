package com.aug.dao.daoimpl;

import javax.transaction.Transactional;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.aug.entities.EmployeeMem;

@Component
@Transactional
public class UpdateEmpDaoImpl {

	@Autowired
	SessionFactory sessionFactory;

	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}
	
	public final Session getCurrentSession(){
		return sessionFactory.getCurrentSession();
	}

	public EmployeeMem getById(final Integer id) {
		if(id != null)
			return (EmployeeMem) getCurrentSession().get(EmployeeMem.class, id);
		else
			return null;
	}
	
	public void updateEmployee(EmployeeMem employeeMem){
		getCurrentSession().merge(employeeMem);
	}
	
	
	
}
