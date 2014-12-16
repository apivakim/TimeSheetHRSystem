package com.aug.actions;

import com.aug.entities.Employee;
import com.aug.services.EmployeeService;

public class LoginAction {

    private EmployeeService employeeBo;
    private Employee employee;

    public void setEmployeeBo(EmployeeService employeeBo) {
        this.employeeBo = employeeBo;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }

    public String execute() {
        if(employeeBo.isLogin(employee))
            return "welcome";
        return "input";
    }
}
