package com.aug.services;

import com.aug.dao.daoimpl.CreateEmpDaoImpl;
import com.aug.dao.daoimpl.UpdateEmpDaoImpl;
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

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;
import static org.mockito.Matchers.any;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;

/**
 * Created by littleTearsCoder on 12/18/2014.
 */

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "classpath:spring-test.xml" })
public class UpdateEmpServiceTest {

    @Autowired
    UpdateEmployeesService updateEmployeesService;

    @Mock
    UpdateEmpDaoImpl updateEmpDao;

    @Mock
    CreateEmpDaoImpl mockCreateEmpDao;

    private EmployeeMem e;


    @Before
    public void setUp() {
        MockitoAnnotations.initMocks(this);
        updateEmployeesService.setUpdateEmpDao(updateEmpDao);

    }

    @Test
    public void shouldBeTrueWhenUpdateCorrect() {
        EmployeeMem e = new EmployeeMem();
        //e.setId(1);
        e.setName("va");
        e.setEmail("apiva@hotmail.com");
       // updateEmployeesService.updateEmp(e);
       mockCreateEmpDao.saveEmployees(e);
        //  mockRegiterDao.saveReg(any(EmployeeforRegister.class));
        e.setId(1);
        e.setName("test");
        e.setEmail("apiva_test@hotmail.com");
        System.out.println(e.getId());
       // assertThat(updateEmployeesService.getId(e.getId()), is(e));
        assertThat(updateEmployeesService.updateEmp(e), is(true));
        // verify(updateEmpDao, times(1)).getById(e.getId());
        verify(updateEmpDao, times(1)).updateEmployee(e);
    }


}
