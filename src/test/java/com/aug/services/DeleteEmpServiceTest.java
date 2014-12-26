package com.aug.services;

import com.aug.dao.daoimpl.DeleteEmpImpl;
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
import static org.mockito.Matchers.isNull;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.junit.Assert.*;
import static org.mockito.Mockito.when;

/**
 * Created by littleTearsCoder on 12/18/2014.
 */

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "classpath:spring-test.xml" })
public class DeleteEmpServiceTest {

    @Autowired
    DeleteEmpSevice deleteEmpSevice;

    @Mock
    DeleteEmpImpl deleteEmpDao;

    @Before
    public void setUp() {
        MockitoAnnotations.initMocks(this);
        deleteEmpSevice.setDeleteEmpDao(deleteEmpDao);

    }

    @Test
    public void shouldBeDeleteSuccess() {
        EmployeeMem e = new EmployeeMem();
        System.out.println(e.getId());
        e = deleteEmpSevice.getByIdDelete(e.getId());
        deleteEmpSevice.deleteEmp(e);
        assertNull(e);
        verify(deleteEmpDao, times(1)).deleteEmp(e);
    }



}
