package com.aug.dao.daoimpl;

import com.aug.entities.EmployeeMem;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.transaction.Transactional;

/**
 * Created by littleTearsCoder on 12/16/2014.
 */

@Component
@Transactional
public class DeleteEmpImpl {

    @Autowired
    SessionFactory sessionFactory;

    public final Session getCurrentSession() {
        return sessionFactory.getCurrentSession();
    }

    public void setSessionFactory(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }

    public EmployeeMem getByIdDelete(final Integer id) {
        if(id != null)
            return (EmployeeMem) getCurrentSession().get(EmployeeMem.class, id);
        else
            return null;
    }

    public void deleteEmp(EmployeeMem empmem){
        getCurrentSession().delete(empmem);
    }
}
