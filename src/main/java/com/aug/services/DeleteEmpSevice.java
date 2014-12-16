package com.aug.services;

import com.aug.dao.daoimpl.DeleteEmpImpl;
import com.aug.entities.EmployeeMem;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * Created by littleTearsCoder on 12/16/2014.
 */
@Component
public class DeleteEmpSevice {

    @Autowired
    DeleteEmpImpl deleteEmpDao;

    public void setDeleteEmpDao(DeleteEmpImpl deleteEmpDao) {
        this.deleteEmpDao = deleteEmpDao;
    }

    public EmployeeMem getByIdDelete(int id){
       return deleteEmpDao.getByIdDelete(id);
    }

    public  void deleteEmp(EmployeeMem empmem){
        deleteEmpDao.deleteEmp(empmem);
    }
}
