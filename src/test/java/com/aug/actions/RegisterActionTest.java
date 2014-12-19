package com.aug.actions;

import com.aug.entities.EmployeeforRegister;
import com.aug.services.RegisterService;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;
import static org.hamcrest.core.IsEqual.equalTo;
import static org.mockito.Matchers.any;
import static org.mockito.Mockito.when;

/**
 * Created by littleTearsCoder on 12/17/2014.
 */

@RunWith(MockitoJUnitRunner.class)
public class RegisterActionTest {

    private  RegisterAction regisaction;

    @Mock
    RegisterService registerService;

    @Before
    public void setUp() {
        regisaction = new RegisterAction();
        regisaction.setRes(registerService);
    }

    @Test
    public void RegisterSuccessShouldRedirectToOtherPage() throws Exception {
        EmployeeforRegister employee = new EmployeeforRegister();
        employee.setName("testva");
        employee.setEmail("test@test.com");
        employee.setPassword("123465");

        regisaction.setEmr(employee);
        System.out.println(""+regisaction.getEmr());

        when(registerService.isRegister(any(EmployeeforRegister.class))).thenReturn(true);
        assertThat(regisaction.execute(), is(equalTo("success")));
    }


    @Test
    public void RegisterFailShouldNotRedirectTopage() throws Exception {
        EmployeeforRegister employee = new EmployeeforRegister();
        employee.setName("testva");
        employee.setEmail("test@test.com");
        employee.setPassword("1234");

        regisaction.setEmr(employee);
        System.out.println(""+regisaction.getEmr());

        when(registerService.isRegister(any(EmployeeforRegister.class))).thenReturn(false);
        assertThat(regisaction.execute(), is(equalTo("failuer")));
    }



}
