package com.aug.actions;

import com.aug.entities.EmployeeMem;
import com.aug.services.UpdateEmployeesService;
import com.opensymphony.xwork2.ActionSupport;
import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.Result;
import org.apache.struts2.convention.annotation.ResultPath;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * Created by littleTearsCoder on 12/16/2014.
 */

@ResultPath(value = "/")
public class UpdateEmpAction extends ActionSupport{

    @Autowired
    UpdateEmployeesService updateservice;




    private int id;
    private EmployeeMem emp;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public EmployeeMem getEmp() {
        return emp;
    }

    public void setEmp(EmployeeMem emp) {
        this.emp = emp;
    }

    @Action(value = "updateemp", results = {
            @Result(name = "success",type ="redirect",location = "showallemp") ,
            @Result(name = "failuer",location = "pages/updateemp.jsp") })
    @Override
    public String execute() throws Exception {
        // TODO Auto-generated method stub
        EmployeeMem empmem = updateservice.getId(emp.getId());
        empmem.setIdcard(this.emp.getIdcard());
        empmem.setName(this.emp.getName());
        empmem.setSurname(this.emp.getSurname());
        empmem.setAddress(this.emp.getAddress());
        empmem.setDateofbirth(this.emp.getDateofbirth());
        empmem.setGender(this.emp.getGender());
        empmem.setMobile(this.emp.getMobile());
        empmem.setEmail(this.emp.getEmail());
        if( updateservice.updateEmp(empmem)==true){
            return  SUCCESS;
        }else {
            addActionError("Can't update");
            return "failuer";
        }
    }


    @Action(value = "initupdateemp", results = { @Result(name = "input", location = "pages/updateemp.jsp") })
    public String init() throws Exception {
        emp=updateservice.getId(id);
        return INPUT;
    }
}
