package com.aug.dao;

import com.aug.dao.daoimpl.CreateEmpDaoImpl;
import com.aug.dao.daoimpl.DeleteEmpImpl;
import com.aug.entities.EmployeeMem;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.internal.matchers.Null;
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
public class DeleteEmpDaoImplTest {

    @Autowired
    DeleteEmpImpl deleteEmpDao;
    @Autowired
    CreateEmpDaoImpl mockCreateEmp;



    @Test
    public void shouldDeleteDataIntoDB(){
        EmployeeMem employeeMem=new EmployeeMem();
        employeeMem.setIdcard("123465");
        mockCreateEmp.saveEmployees(employeeMem);
        employeeMem = deleteEmpDao.getByIdDelete(employeeMem.getId());
        assertThat(employeeMem.getId(),is(1));
        System.out.println(employeeMem.getId());
        deleteEmpDao.deleteEmp(employeeMem);
        assertNull(deleteEmpDao.getByIdDelete(employeeMem.getId()));
    }
}
