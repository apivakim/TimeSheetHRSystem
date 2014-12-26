package com.aug.dao;

import com.aug.dao.daoimpl.CreateEmpDaoImpl;
import com.aug.entities.EmployeeMem;
import com.aug.entities.EmployeeforRegister;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import static org.junit.Assert.*;

/**
 * Created by littleTearsCoder on 12/17/2014.
 */

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:spring-test.xml"})
public class CreateEmpDaoImplTest {
    @Autowired
    CreateEmpDaoImpl createEmpDao;

    private EmployeeMem employeeMem;

    @Before
    public void setUp() {
        employeeMem = new EmployeeMem();
        employeeMem.setName("apiva_test");
    }

    @Test
    public void shouldInsertDataIntoDB(){
        createEmpDao.saveEmployees(employeeMem);
        assertNotNull(employeeMem.getId());
    }

}
