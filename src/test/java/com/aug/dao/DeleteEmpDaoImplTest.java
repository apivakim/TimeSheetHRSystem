package com.aug.dao;

import com.aug.dao.daoimpl.CreateEmpDaoImpl;
import com.aug.dao.daoimpl.DeleteEmpImpl;
import com.aug.entities.EmployeeMem;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * Created by littleTearsCoder on 12/18/2014.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:spring-test.xml"})
public class DeleteEmpDaoImplTest {

    @Autowired
    DeleteEmpImpl deleteEmpDao;
    @Autowired
    CreateEmpDaoImpl mockCreateEmp;


   private EmployeeMem employeeMem;

    @Test
    public void shouldDeleteDataIntoDB(){
        employeeMem=new EmployeeMem();
      //  employeeMem.setId(1);
        employeeMem.setIdcard("123465");
        mockCreateEmp.saveEmployees(employeeMem);
        deleteEmpDao.deleteEmp(employeeMem);
    }
}
