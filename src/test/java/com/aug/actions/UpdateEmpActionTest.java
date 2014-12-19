package com.aug.actions;

import com.aug.dao.daoimpl.CreateEmpDaoImpl;
import com.aug.dao.daoimpl.UpdateEmpDaoImpl;
import com.aug.entities.EmployeeMem;
import com.aug.services.CreateEmpService;
import com.aug.services.UpdateEmployeesService;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.mockito.runners.MockitoJUnitRunner;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;
import static org.hamcrest.core.IsEqual.equalTo;
import static org.mockito.Matchers.any;
import static org.mockito.Mockito.when;

/**
 * Created by littleTearsCoder on 12/17/2014.
 */


@RunWith(MockitoJUnitRunner.class)
//@RunWith(SpringJUnit4ClassRunner.class)
//@ContextConfiguration(locations = {"classpath:spring-test.xml"})
public class UpdateEmpActionTest {

    private UpdateEmpAction updateEmpAction;



    @Mock
    UpdateEmployeesService mockUpdateEmployeesService;
    @Mock
    CreateEmpDaoImpl mockCreateEmpDao;
    private EmployeeMem employeeMem;
    @Mock
    UpdateEmpDaoImpl updateEmpDao;





    @Before
    public void setUp() {
        //MockitoAnnotations.initMocks(this);
        updateEmpAction = new UpdateEmpAction();
        updateEmpAction.setUpdateservice(mockUpdateEmployeesService);
       // mockUpdateEmployeesService.setUpdateEmpDao(updateEmpDao);
        updateEmpAction.setId(1);
        employeeMem = new EmployeeMem();
        employeeMem.setId(1);
        employeeMem.setIdcard("1100500491990");
        employeeMem.setName("va_test");
        updateEmpAction.setEmp(employeeMem);


    }


    @Test
    public void updateDontSuccesShouldNotRedirectToOtherPage() throws Exception {

        when(mockUpdateEmployeesService.getId(employeeMem.getId())).thenReturn(employeeMem);
        when(mockUpdateEmployeesService.updateEmp(employeeMem)).thenReturn(false);
        assertThat(updateEmpAction.execute(), is(equalTo("failuer")));

    }


    @Test
     public void updateSuccessShouldRedirectToOtherPage() throws Exception {
        System.out.println("=============> " + updateEmpAction.getId());
        mockCreateEmpDao.saveEmployees(employeeMem);
        employeeMem.setId(1);
        employeeMem.setIdcard("1100500491991");
        employeeMem.setName("test");
        updateEmpAction.setEmp(employeeMem);
        when(mockUpdateEmployeesService.getId(employeeMem.getId())).thenReturn(employeeMem);
        when(mockUpdateEmployeesService.updateEmp(employeeMem)).thenReturn(true);
        assertThat(updateEmpAction.execute(), is(equalTo("success")));

    }
}
