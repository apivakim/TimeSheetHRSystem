package com.aug.services;

import java.util.ArrayList;
import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.aug.dao.daoimpl.LoginDaoImpl;
import com.aug.dao.daoimpl.RegisterDaoImpl;
import com.aug.entities.EmployeeforRegister;

import static org.hamcrest.core.IsEqual.equalTo;
import static org.hamcrest.core.Is.is;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.mockito.Mockito.times;
import static org.mockito.Matchers.any;
import static org.mockito.Mockito.when;
import static org.mockito.Mockito.verify;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "classpath:spring-test.xml" })
public class LoginnServiceTest {

	@Autowired
	private LoginService loginSevice;
	
	@Mock
	private LoginDaoImpl mockLoginDao;

	private EmployeeforRegister employee;
	private List<EmployeeforRegister> employees;

	@Before
	public void setUp() {
		MockitoAnnotations.initMocks(this);
		loginSevice.setLdi(mockLoginDao);

		employee = new EmployeeforRegister();
		employees = new ArrayList<>();

	}
	
	@Test
	public void shouldBeFalseWhenUserLoginNotExistInDB() {
		employee.setUser("a");
		System.out.println(employees.size());
		when(mockLoginDao.findUserPassforLogin(any(EmployeeforRegister.class)))
				.thenReturn(employees);
		assertThat(loginSevice.isLogin(employee), is(false));
		verify(mockLoginDao, times(1)).findUserPassforLogin(any(EmployeeforRegister.class));
	}
	
	@Test
	public void shouldBeFalseWhenEmailLoginNotExistInDB() {
		employee.setUser("apiva01@hotmail.com");
		System.out.println(employees.size());
		when(mockLoginDao.findEmailPassforLogin(any(EmployeeforRegister.class)))
				.thenReturn(employees);
		assertThat(loginSevice.isLogin(employee), is(false));
		verify(mockLoginDao, times(1)).findEmailPassforLogin(any(EmployeeforRegister.class));
	}
	
	
	@Test
	public void shouldBeTrueWhenEmailLoginExistInDB() {
		employee.setUser("apiva@hotmail.com");
		employees.add(employee);
		when(mockLoginDao.findEmailPassforLogin(any(EmployeeforRegister.class)))
				.thenReturn(employees);
		assertThat(loginSevice.isLogin(employee), is(true));
		verify(mockLoginDao, times(1)).findEmailPassforLogin(any(EmployeeforRegister.class));
	}

	@Test
	public void shouldBeTrueWhenUserLoginExistInDB() {
		employee.setUser("va");
		employees.add(employee);
		System.out.println(employees.size());
		when(mockLoginDao.findUserPassforLogin(any(EmployeeforRegister.class)))
				.thenReturn(employees);
		assertThat(loginSevice.isLogin(employee), is(true));
		verify(mockLoginDao, times(1)).findUserPassforLogin(any(EmployeeforRegister.class));
	}
	


}
