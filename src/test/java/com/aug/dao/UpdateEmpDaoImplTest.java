package com.aug.dao;

import com.aug.dao.daoimpl.CreateEmpDaoImpl;
import com.aug.dao.daoimpl.UpdateEmpDaoImpl;
import com.aug.entities.EmployeeMem;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;
/**
 * Created by littleTearsCoder on 12/18/2014.
 */

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:spring-test.xml"})
public class UpdateEmpDaoImplTest {
    @Autowired
    UpdateEmpDaoImpl updateEmpDao;
    @Autowired
    CreateEmpDaoImpl mockCreateEmp;

    private EmployeeMem employeeMem;

    @Before
    public void setUp() {
        employeeMem = new EmployeeMem();
       // employeeMem.setId(1);
        employeeMem.setName("test");
        employeeMem.setIdcard("1100500491990");
        employeeMem.setEmail("admin@hotmail.com");
    }

    @Test
    public void shouldUpdateDataIntoDB(){
        EmployeeMem empmem;
        System.out.println(employeeMem.getId());
        mockCreateEmp.saveEmployees(employeeMem);
        updateEmpDao.getById(employeeMem.getId());
        employeeMem.setName("va");
        updateEmpDao.updateEmployee(employeeMem);
        empmem =  updateEmpDao.getById(employeeMem.getId());
        assertThat(empmem.getName(),is("va"));
    }
}
