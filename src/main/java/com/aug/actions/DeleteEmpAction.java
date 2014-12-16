package com.aug.actions;

import com.aug.entities.EmployeeMem;
import com.aug.services.DeleteEmpSevice;
import com.opensymphony.xwork2.ActionSupport;
import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.Result;
import org.apache.struts2.convention.annotation.ResultPath;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * Created by littleTearsCoder on 12/16/2014.
 */

@ResultPath(value = "/")
public class DeleteEmpAction extends ActionSupport{

    @Autowired
    private DeleteEmpSevice deleteEmpSevice;
    private int id;
    private EmployeeMem employeeMem;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public EmployeeMem getEmployeeMem() {
        return employeeMem;
    }

    public void setEmployeeMem(EmployeeMem employeeMem) {
        this.employeeMem = employeeMem;
    }

    @Action(value = "deleteemp", results = { @Result(name = "success",type = "redirect",location = "showallemp") })
    public String init() throws Exception {
        employeeMem = deleteEmpSevice.getByIdDelete(id);
        deleteEmpSevice.deleteEmp(employeeMem);
        return SUCCESS;
    }
}
