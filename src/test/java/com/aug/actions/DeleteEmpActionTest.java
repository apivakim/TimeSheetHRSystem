package com.aug.actions;

import com.aug.dao.daoimpl.CreateEmpDaoImpl;
import com.aug.entities.EmployeeMem;
import com.aug.services.DeleteEmpSevice;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;
import static org.hamcrest.core.IsEqual.equalTo;
import static org.mockito.Mockito.when;

/**
 * Created by littleTearsCoder on 12/18/2014.
 */
@RunWith(MockitoJUnitRunner.class)
public class DeleteEmpActionTest {

    DeleteEmpAction deleteEmpAction;
    @Mock
    DeleteEmpSevice mockdeleteEmpSevice;
    @Mock
    CreateEmpDaoImpl mockCreateEmpDao;
    private EmployeeMem employeeMem;


    @Before
    public void setUp() {
        //MockitoAnnotations.initMocks(this);
        deleteEmpAction = new DeleteEmpAction();
        deleteEmpAction.setDeleteEmpSevice(mockdeleteEmpSevice);
        // mockUpdateEmployeesService.setUpdateEmpDao(updateEmpDao);
        deleteEmpAction.setId(1);
        employeeMem = new EmployeeMem();
        employeeMem.setId(1);
        employeeMem.setIdcard("1100500491990");
        employeeMem.setName("va_test");
        deleteEmpAction.setEmployeeMem(employeeMem);
    }


    @Test
    public void deleteSuccessShouldRedirectToOtherPage() throws Exception {
        mockCreateEmpDao.saveEmployees(employeeMem);
        when(mockdeleteEmpSevice.getByIdDelete(employeeMem.getId())).thenReturn(employeeMem);
        mockdeleteEmpSevice.deleteEmp(employeeMem);
        assertThat(deleteEmpAction.execute(), is(equalTo("success")));

    }
}
