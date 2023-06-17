package com.splearning.splearning.service;


import com.splearning.splearning.Repository.DepartmentRepo;
import com.splearning.splearning.entity.Department;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Objects;
import java.util.Optional;

@Service
public class DepartmentService implements DepartmentServiceInt {

    @Autowired
    private DepartmentRepo departmentRepo;
    public Department saveDepartment(Department department) {
            return  departmentRepo.save(department);
    }

    @Override
    public List<Department> getAllDepartment() {
        return departmentRepo.findAll();
    }

    @Override
    public Optional<Department> getAllDepartmentId(Long departmentId) {
        return departmentRepo.findById(departmentId);
    }

    @Override
    public Department updateDepartmentById(Long departmentId, Department department) {
        Department DBdep= departmentRepo.findById(departmentId).get();

        if(Objects.nonNull(department.getDepartmentName()) && !"".equalsIgnoreCase(department.getDepartmentName())){
            DBdep.setDepartmentName(department.getDepartmentName());
        }
        if(Objects.nonNull(department.getDepartmentAddress()) && !"".equalsIgnoreCase(department.getDepartmentAddress())){
            DBdep.setDepartmentAddress(department.getDepartmentAddress());
        }
        if(Objects.nonNull(department.getDepartmentCode()) && !"".equalsIgnoreCase(department.getDepartmentCode())){
            DBdep.setDepartmentCode(department.getDepartmentCode());
        }

        return departmentRepo.save(DBdep);

    }

    @Override
    public List<Department> getAllDepartmentName(String departmentName) {
        return departmentRepo.findByDepartmentName(departmentName);
    }

    @Override
    public void deleteById(Long departmentId) {
        departmentRepo.deleteById(departmentId);
    }


}
