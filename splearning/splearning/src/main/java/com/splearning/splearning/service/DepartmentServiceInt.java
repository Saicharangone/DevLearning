package com.splearning.splearning.service;

import com.splearning.splearning.entity.Department;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public interface DepartmentServiceInt {
    public Department saveDepartment(Department department);
    public List<Department> getAllDepartment();

    public Optional<Department> getAllDepartmentId(Long departmentId);

    public Department updateDepartmentById(Long departmentId,Department department);
    public List<Department> getAllDepartmentName(String departmentName);
    public void deleteById(Long departmentId);
}
