package com.aug.services;

import com.aug.dao.daoimpl.DeleteEmpImpl;
import com.aug.entities.EmployeeMem;
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
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;

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
        deleteEmpSevice.deleteEmp(e);
        verify(deleteEmpDao, times(1)).deleteEmp(e);
    }



}
