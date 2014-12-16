package com.aug.actions;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;
import static org.hamcrest.core.IsEqual.equalTo;
import static org.mockito.Matchers.any;
import static org.mockito.Mockito.when;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

import com.aug.entities.EmployeeforRegister;
import com.aug.services.LoginService;

@RunWith(MockitoJUnitRunner.class)
public class LoginnActionTest {

		private LoginnAction loginnAction;
		
		@Mock
		LoginService mockLoginService;
		
		@Before
		public void setUp() {
			loginnAction = new LoginnAction();
			loginnAction.setLogser(mockLoginService);
		}
		
		
		@Test
		public void loginSuccessShouldRedirectToWelcomePage() throws Exception {
			EmployeeforRegister employee = new EmployeeforRegister();
			employee.setEmail("test@test.com");
			loginnAction.setEm(employee);

			when(mockLoginService.isLogin(any(EmployeeforRegister.class))).thenReturn(true);
	        assertThat(loginnAction.execute(), is(equalTo("success")));
		}
		
		
		@Test
		public void loginNotSuccessShouldNotRedirectToWelcomePage() throws Exception {
		
			when(mockLoginService.isLogin(any(EmployeeforRegister.class))).thenReturn(false);
	        assertThat(loginnAction.execute(), is(equalTo("failuer")));
		}

}
