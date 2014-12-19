package com.aug.services;

import com.aug.dao.daoimpl.CreateEmpDaoImpl;
import com.aug.entities.EmployeeMem;
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
public class CreateEmpServiceTest {

    @Autowired
    CreateEmpService createEmpService;

    @Mock
    CreateEmpDaoImpl mockCreateEmpDao;

    @Before
    public void setUp() {
        MockitoAnnotations.initMocks(this);
        createEmpService.setCreateEmpImpl(mockCreateEmpDao);
    }


    @Test
    public void shouldBeTrueWhenCanCreateEmp() {
        EmployeeMem empmem = new EmployeeMem();
        empmem.setName("vatest");
        assertThat(createEmpService.createEmp(empmem), is(true));
        verify(mockCreateEmpDao, times(1)).saveEmployees(any(EmployeeMem.class));
    }

}
