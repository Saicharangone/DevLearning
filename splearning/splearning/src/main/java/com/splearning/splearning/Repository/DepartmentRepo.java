package com.splearning.splearning.Repository;

import com.splearning.splearning.entity.Department;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface DepartmentRepo extends JpaRepository<Department,Long> {

    public List<Department> findByDepartmentName(String departmentName);
}
