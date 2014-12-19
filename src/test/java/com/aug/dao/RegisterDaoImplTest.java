package com.aug.dao;

import com.aug.dao.daoimpl.RegisterDaoImpl;
import com.aug.entities.EmployeeforRegister;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;
import static org.hamcrest.core.IsEqual.equalTo;

/**
 * Created by littleTearsCoder on 12/17/2014.
 */

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:spring-test.xml"})
public class RegisterDaoImplTest {

    @Autowired
    RegisterDaoImpl registerDao;

    private EmployeeforRegister employee;

    @Before
    public void setUp() {
        employee = new EmployeeforRegister();
        employee.setUser("admin@hotmail.com");
        employee.setEmail("admin@hotmail.com");
        employee.setPassword("va123465");
    }



    @Test
    public void shouldInsertDataIntoDB(){
        System.out.println(employee.getUser());
        registerDao.saveReg(employee);
    }


}
