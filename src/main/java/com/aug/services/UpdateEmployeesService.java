package com.aug.services;


import com.aug.dao.daoimpl.UpdateEmpDaoImpl;
import com.aug.entities.EmployeeMem;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * Created by littleTearsCoder on 12/16/2014.
 */
@Component
public class UpdateEmployeesService {

    @Autowired
    UpdateEmpDaoImpl updateEmpDao;

    public void setUpdateEmpDao(UpdateEmpDaoImpl updateEmpDao) {
        this.updateEmpDao = updateEmpDao;
    }


    public EmployeeMem getId(int id){
        return updateEmpDao.getById(id);
    }


    public boolean updateEmp(EmployeeMem empmem){
        try {
            updateEmpDao.updateEmployee(empmem);
          return true;
        }catch (Exception e){
            return false;
        }

    }
}
