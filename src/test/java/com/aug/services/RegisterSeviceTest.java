package com.aug.services;

import com.aug.dao.daoimpl.RegisterDaoImpl;
import com.aug.entities.EmployeeforRegister;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.ArrayList;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;
import static org.mockito.Matchers.any;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

/**
 * Created by littleTearsCoder on 12/17/2014.
 */

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "classpath:spring-test.xml" })
public class RegisterSeviceTest {

    @Autowired
    private RegisterService registerService;

    @Mock
    RegisterDaoImpl mockRegiterDao;


    @Before
    public void setUp() {
        MockitoAnnotations.initMocks(this);
        registerService.setRedaoimlp(mockRegiterDao);

    }

    @Test
    public void shouldBefalseWhenVaridateIsnotCorrect() {
        EmployeeforRegister emp = new EmployeeforRegister();
        emp.setName("va");
        assertThat(registerService.isRegister(emp), is(false));

    }

    @Test
    public void shouldBeTrueWhenVaridateCorrect() {
        EmployeeforRegister e = new EmployeeforRegister();
        e.setPassword("123465");
        e.setUser("apivatest");
        e.setEmail("apiva@hotmail.com");

      //  mockRegiterDao.saveReg(any(EmployeeforRegister.class));
        assertThat(registerService.isRegister(e), is(true));
        verify(mockRegiterDao, times(1)).saveReg(any(EmployeeforRegister.class));
    }
}
