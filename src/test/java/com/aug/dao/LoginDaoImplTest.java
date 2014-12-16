package com.aug.dao;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.runners.MockitoJUnitRunner;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.aug.dao.daoimpl.LoginDaoImpl;
import com.aug.dao.daoimpl.RegisterDaoImpl;
import com.aug.entities.EmployeeforRegister;

import static org.hamcrest.core.IsEqual.equalTo;
import static org.hamcrest.core.Is.is;
import static org.hamcrest.MatcherAssert.assertThat;


@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:spring-test.xml"})
public class LoginDaoImplTest {


       @Autowired
	   RegisterDaoImpl regisDao;
	   @Autowired
	    LoginDaoImpl loginDao;


		private EmployeeforRegister employee;

		@Before
		public void setUp() {
			employee = new EmployeeforRegister();
			employee.setUser("admin@hotmail.com");
	        employee.setEmail("admin@hotmail.com");
	        employee.setPassword("va123465");
		}
		
		
		@Test
		public void shouldNotReturnUserListWhenEmailAndPasswordNotExistInDB(){
			//regisDao.saveReg(employee);
			assertThat(loginDao.findEmailPassforLogin(employee).size(), is(equalTo(0)));
		}
		
		@Test
		public void shouldNotReturnUserListWhenUserAndPasswordNotExistInDB(){
			//regisDao.saveReg(employee);
			assertThat(loginDao.findUserPassforLogin(employee).size(), is(equalTo(0)));
		}

		@Test
		public void shouldReturnUserListWhenEmailAndPasswordExistInDB(){
			regisDao.saveReg(employee);
			assertThat(loginDao.findEmailPassforLogin(employee).size(), is(equalTo(1)));
		}
		
		
		@Test
		public void shouldReturnUserListWhenUserAndPasswordExistInDB(){
			employee.setUser("admin");
	        employee.setPassword("123465");
			regisDao.saveReg(employee);
			assertThat(loginDao.findUserPassforLogin(employee).size(), is(equalTo(1)));
		}

}
