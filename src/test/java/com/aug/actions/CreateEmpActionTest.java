package com.aug.actions;

import com.aug.entities.EmployeeMem;
import com.aug.entities.EmployeeforRegister;
import com.aug.services.CreateEmpService;
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
public class CreateEmpActionTest {

    private CreateEmpAction empAction;
    @Mock
    CreateEmpService mockcreateEmpService;

    @Before
    public void setUp() {
        empAction = new CreateEmpAction();
        empAction.setCreateEmpService(mockcreateEmpService);
    }

    @Test
    public void loginFailuerShouldRedirectToLoginPage() throws Exception {
        when(mockcreateEmpService.createEmp(any(EmployeeMem.class))).thenReturn(false);
        assertThat(empAction.execute(), is(equalTo("failuer")));
    }

    @Test
    public void loginSuccessShouldRedirectToHomePage() throws Exception {
        EmployeeMem employeeMem = new EmployeeMem();
        employeeMem.setName("apiva");
        empAction.setEm(employeeMem);
        when(mockcreateEmpService.createEmp(any(EmployeeMem.class))).thenReturn(true);
        assertThat(empAction.execute(), is(equalTo("success")));
}
}
