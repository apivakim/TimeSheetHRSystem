package com.aug.dao.daoimpl;

import java.util.List;

import javax.transaction.Transactional;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.aug.entities.EmployeeforRegister;

@Component
@Transactional
public class LoginDaoImpl {
	
	@Autowired
	SessionFactory sessionFactory;

	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

	public final Session getCurrentSession() {
		return sessionFactory.getCurrentSession();
	}


	

	//@Override
	@SuppressWarnings("unchecked")
	public List<EmployeeforRegister> findUserPassforLogin(EmployeeforRegister e) {
		// TODO Auto-generated method stub
		Criteria criteria = getCurrentSession().createCriteria(EmployeeforRegister.class);
		criteria.add(Restrictions.eq("user", e.getUser()));
		criteria.add(Restrictions.eq("password", e.getPassword()));
		List<EmployeeforRegister> em = criteria.list();
		
		return em;

	}

	
	//@Override
	@SuppressWarnings("unchecked")
	public List<EmployeeforRegister> findEmailPassforLogin(EmployeeforRegister e) {
		// TODO Auto-generated method stub
		Criteria criteria = getCurrentSession().createCriteria(EmployeeforRegister.class);
		criteria.add(Restrictions.eq("email", e.getUser()));
		//criteria.add(Restrictions.eq("email", e.getEmail()));
		criteria.add(Restrictions.eq("password", e.getPassword()));
		List<EmployeeforRegister> em = criteria.list();
		
		return em;

	}

	

	
}
